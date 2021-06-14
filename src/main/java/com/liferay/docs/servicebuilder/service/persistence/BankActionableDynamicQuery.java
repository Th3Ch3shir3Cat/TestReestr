package com.liferay.docs.servicebuilder.service.persistence;

import com.liferay.docs.servicebuilder.model.Bank;
import com.liferay.docs.servicebuilder.service.BankLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author gerbe
 * @generated
 */
public abstract class BankActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BankActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BankLocalServiceUtil.getService());
        setClass(Bank.class);

        setClassLoader(com.liferay.docs.servicebuilder.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("bankId");
    }
}
