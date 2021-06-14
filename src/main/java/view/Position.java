package view;

import com.liferay.counter.service.CounterLocalService;
import com.liferay.docs.servicebuilder.service.persistence.PositionPersistence;
import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;


import javax.portlet.ActionRequest;

public class Position {
    private Long positionId;
    private String name;
    private boolean archived;

    public Position(){}

    public Position(ActionRequest request){
        if(ParamUtil.getLong(request, "positionId") != 0) {
            this.positionId = ParamUtil.getLong(request, "positionId");
        }
        this.name = ParamUtil.getString(request, "name");
        this.archived = ParamUtil.getBoolean(request, "archived");
    }

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public com.liferay.docs.servicebuilder.model.Position getCreatePosition(
            CounterLocalService counterLocalService,
            PositionPersistence positionPersistence
    ) throws SystemException {
        long positionId = counterLocalService.increment(com.liferay.docs.servicebuilder.model.Position.class.getName());
        com.liferay.docs.servicebuilder.model.Position position
                = positionPersistence.create(positionId);

        setDataIn(position);

        return position;
    }

    public com.liferay.docs.servicebuilder.model.Position getUpdatePosition(PositionPersistence positionPersistence) throws SystemException, NoSuchModelException {
        com.liferay.docs.servicebuilder.model.Position position
                = positionPersistence.findByPrimaryKey(this.positionId);
        setDataIn(position);
        return position;
    }

    private void setDataIn(com.liferay.docs.servicebuilder.model.Position position) {
        position.setName(name);
        position.setArchived(archived);
    }


}
