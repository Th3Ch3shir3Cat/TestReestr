package com.liferay.docs.servicebuilder.service.impl;

import com.liferay.docs.servicebuilder.NoSuchBankException;
import com.liferay.docs.servicebuilder.NoSuchPositionException;
import com.liferay.docs.servicebuilder.model.Position;
import com.liferay.docs.servicebuilder.service.base.PositionLocalServiceBaseImpl;
import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.ArrayList;

/**
 * The implementation of the position local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.servicebuilder.service.PositionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author gerbe
 * @see com.liferay.docs.servicebuilder.service.base.PositionLocalServiceBaseImpl
 * @see com.liferay.docs.servicebuilder.service.PositionLocalServiceUtil
 */
public class PositionLocalServiceImpl extends PositionLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.liferay.docs.servicebuilder.service.PositionLocalServiceUtil} to access the position local service.
     */

    @Override
    public Position addPosition(view.Position dataPosition) throws SystemException {
        Position position = dataPosition.getCreatePosition(counterLocalService, positionPersistence);
        super.addPosition(position);
        return position;
    }

    @Override
    public ArrayList<Position> findAll() throws SystemException {
        return new ArrayList<Position>(positionPersistence.findAll());
    }

    @Override
    public Position findById(long PositionId) throws SystemException, NoSuchBankException, NoSuchPositionException {
        return positionPersistence.findByPrimaryKey(PositionId);
    }


    @Override
    public Position updatePosition(view.Position dataPosition) throws SystemException, NoSuchModelException {
        Position bank = dataPosition.getUpdatePosition(positionPersistence);
        super.updatePosition(bank);
        return bank;
    }

}
