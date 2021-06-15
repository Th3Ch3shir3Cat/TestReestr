import com.liferay.docs.servicebuilder.service.BankLocalServiceUtil;
import com.liferay.docs.servicebuilder.service.PositionLocalServiceUtil;
import com.liferay.docs.servicebuilder.service.WorkerLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.util.bridges.mvc.MVCPortlet;
import serviceUtil.WorkUtil;
import view.Bank;
import view.Position;
import view.Worker;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.text.ParseException;
import java.util.List;

public class TestReestr extends MVCPortlet {

    /**
     * Add position
     * @param request
     * @param response
     * @throws SystemException
     * @throws PortalException
     */
    public void actionAddPosition(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Position position = new Position(request);
        PositionLocalServiceUtil.addPosition(position);
        response.setRenderParameter("jspPage","/view/list/positions.jsp");
    }

    /**
     * Edit position
     * @param request
     * @param response
     * @throws SystemException
     * @throws PortalException
     */
    public void actionEditPosition(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Position position = new Position(request);
        PositionLocalServiceUtil.updatePosition(position);
        response.setRenderParameter("jspPage","/view/list/positions.jsp");
    }

    /**
     * Add new Bank
     * @param request
     * @param response
     * @throws SystemException
     * @throws PortalException
     */
    public void actionAddBank(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Bank bank = new Bank(request);
        BankLocalServiceUtil.addBank(bank);
        response.setRenderParameter("jspPage","/view/list/banks.jsp");
    }

    /**
     * Edit bank
     * @param request
     * @param response
     * @throws SystemException
     * @throws PortalException
     */
    public void actionEditBank(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Bank bank = new Bank(request);
        BankLocalServiceUtil.updateBank(bank);
        response.setRenderParameter("jspPage","/view/list/banks.jsp");
    }

    /**
     * Add new worker
     * @param request
     * @param response
     * @throws SystemException
     * @throws PortalException
     * @throws ParseException
     */
    public void actionAddWorker(ActionRequest request, ActionResponse response) throws SystemException, PortalException, ParseException {
        Worker worker = new Worker(request);
        WorkerLocalServiceUtil.addWorker(worker);
        response.setRenderParameter("jspPage","/view/list/workers.jsp");
    }

    /**
     * Edit worker
     * @param request
     * @param response
     * @throws SystemException
     * @throws PortalException
     * @throws ParseException
     */
    public void actionEditWorker(ActionRequest request, ActionResponse response) throws SystemException, PortalException, ParseException {
        Worker worker = new Worker(request);
        WorkerLocalServiceUtil.updateWorker(worker);
        response.setRenderParameter("jspPage","/view/list/workers.jsp");
    }

    /**
     * Search with parameters
     * @param request
     * @param response
     * @throws SystemException
     */
    public void searchWorker(ActionRequest request, ActionResponse response) throws SystemException {
        DynamicQuery dynamicQuery = WorkUtil.getDynamicQueryForSearch(request);
        List<com.liferay.docs.servicebuilder.model.Worker> workers = WorkerLocalServiceUtil.dynamicQuery(dynamicQuery);
        request.setAttribute("workers", workers);
        response.setRenderParameter("jspPage", "/view/list/workers.jsp");
    }

}
