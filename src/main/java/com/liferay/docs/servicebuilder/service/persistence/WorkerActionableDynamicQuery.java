package com.liferay.docs.servicebuilder.service.persistence;

import com.liferay.docs.servicebuilder.model.Worker;
import com.liferay.docs.servicebuilder.service.WorkerLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author gerbe
 * @generated
 */
public abstract class WorkerActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public WorkerActionableDynamicQuery() throws SystemException {
        setBaseLocalService(WorkerLocalServiceUtil.getService());
        setClass(Worker.class);

        setClassLoader(com.liferay.docs.servicebuilder.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("workerId");
    }
}
