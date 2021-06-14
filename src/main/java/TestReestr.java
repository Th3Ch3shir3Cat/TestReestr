import com.liferay.docs.servicebuilder.service.BankLocalServiceUtil;
import com.liferay.docs.servicebuilder.service.PositionLocalServiceUtil;
import com.liferay.docs.servicebuilder.service.WorkerLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import view.Bank;
import view.Position;
import view.Worker;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.text.ParseException;

public class TestReestr extends MVCPortlet {

    public void actionAddPosition(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Position position = new Position(request);
        PositionLocalServiceUtil.addPosition(position);
        response.setRenderParameter("jspPage","/view/list/positions.jsp");
    }

    public void actionEditPosition(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Position position = new Position(request);
        PositionLocalServiceUtil.updatePosition(position);
        response.setRenderParameter("jspPage","/view/list/positions.jsp");
    }

    public void actionAddBank(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Bank bank = new Bank(request);
        BankLocalServiceUtil.addBank(bank);
        response.setRenderParameter("jspPage","/view/list/banks.jsp");
    }

    public void actionEditBank(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Bank bank = new Bank(request);
        BankLocalServiceUtil.updateBank(bank);
        response.setRenderParameter("jspPage","/view/list/banks.jsp");
    }

    public void actionAddWorker(ActionRequest request, ActionResponse response) throws SystemException, PortalException, ParseException {
        Worker worker = new Worker(request);
        WorkerLocalServiceUtil.addWorker(worker);
        response.setRenderParameter("jspPage","/view/list/workers.jsp");
    }

    public void actionEditWorker(ActionRequest request, ActionResponse response) throws SystemException, PortalException, ParseException {
        Worker worker = new Worker(request);
        WorkerLocalServiceUtil.updateWorker(worker);
        response.setRenderParameter("jspPage","/view/list/workers.jsp");
    }

}
