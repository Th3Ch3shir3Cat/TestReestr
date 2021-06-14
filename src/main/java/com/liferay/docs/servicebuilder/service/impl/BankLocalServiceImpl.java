package com.liferay.docs.servicebuilder.service.impl;

import com.liferay.docs.servicebuilder.NoSuchBankException;
import com.liferay.docs.servicebuilder.model.Bank;
import com.liferay.docs.servicebuilder.service.base.BankLocalServiceBaseImpl;
import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.ArrayList;

/**
 * The implementation of the bank local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.servicebuilder.service.BankLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author gerbe
 * @see com.liferay.docs.servicebuilder.service.base.BankLocalServiceBaseImpl
 * @see com.liferay.docs.servicebuilder.service.BankLocalServiceUtil
 */
public class BankLocalServiceImpl extends BankLocalServiceBaseImpl {

    @Override
    public Bank addBank(view.Bank dataBank) throws SystemException {
        Bank bank = dataBank.getCreateBank(counterLocalService, bankPersistence);
        super.addBank(bank);
        return bank;
    }

    @Override
    public ArrayList<Bank> findAll() throws SystemException {
        return new ArrayList<Bank>(bankPersistence.findAll());
    }

    @Override
    public Bank findById(long BankId) throws SystemException, NoSuchBankException {
        return bankPersistence.findByPrimaryKey(BankId);
    }


    @Override
    public Bank updateBank(view.Bank dataBank) throws SystemException, NoSuchModelException {
        Bank bank = dataBank.getUpdateBank(bankPersistence);
        super.updateBank(bank);
        return bank;
    }
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.liferay.docs.servicebuilder.service.BankLocalServiceUtil} to access the bank local service.
     */
}
