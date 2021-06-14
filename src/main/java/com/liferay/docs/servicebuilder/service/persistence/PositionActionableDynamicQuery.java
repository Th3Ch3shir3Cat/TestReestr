package com.liferay.docs.servicebuilder.service.persistence;

import com.liferay.docs.servicebuilder.model.Position;
import com.liferay.docs.servicebuilder.service.PositionLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author gerbe
 * @generated
 */
public abstract class PositionActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PositionActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PositionLocalServiceUtil.getService());
        setClass(Position.class);

        setClassLoader(com.liferay.docs.servicebuilder.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("positionId");
    }
}
