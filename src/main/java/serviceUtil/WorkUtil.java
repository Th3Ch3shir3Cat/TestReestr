package serviceUtil;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import view.Worker;

import javax.portlet.ActionRequest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WorkUtil {

    public static String getDateStringWithPattern(String dateString) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse(dateString);
        dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return dateFormat.format(date);
    }


    public static DynamicQuery getDynamicQueryForSearch(ActionRequest request){
        String startDate = ParamUtil.getString(request,"startDate");
        String finishDate = ParamUtil.getString(request, "finishDate");
        String fio = ParamUtil.getString(request, "fio");
        DynamicQuery dynamicQuery = null;
        /**
         * At first we search with date
         */
        if(!startDate.equals("") && !finishDate.equals("")) {
            dynamicQuery = DynamicQueryFactoryUtil.forClass(com.liferay.docs.servicebuilder.model.Worker.class).add(
                    RestrictionsFactoryUtil.between("dateOfBirth", startDate, finishDate));
        }
        else if(!startDate.equals("")){
            dynamicQuery = DynamicQueryFactoryUtil.forClass(com.liferay.docs.servicebuilder.model.Worker.class).add(
                    RestrictionsFactoryUtil.ge("dateOfBirth", startDate));
        }
        else if(!finishDate.equals("")){
            dynamicQuery = DynamicQueryFactoryUtil.forClass(com.liferay.docs.servicebuilder.model.Worker.class).add(
                    RestrictionsFactoryUtil.le("dateOfBirth", finishDate));
        }
        /**
         * Then we search with fio
         */
        if(dynamicQuery == null){
            dynamicQuery = DynamicQueryFactoryUtil.forClass(com.liferay.docs.servicebuilder.model.Worker.class);
        }
        Worker worker = new Worker();
        worker.setFio(fio);
        if(worker.getFirstName() != null) {
            dynamicQuery.add(RestrictionsFactoryUtil.eq("firstName", worker.getFirstName()));
        }
        if(worker.getMiddleName() != null){
            dynamicQuery.add(RestrictionsFactoryUtil.eq("middleName", worker.getMiddleName()));
        }
        if(worker.getLastName() != null){
            dynamicQuery.add(RestrictionsFactoryUtil.eq("lastName", worker.getLastName()));
        }
        return dynamicQuery;
    }

}
