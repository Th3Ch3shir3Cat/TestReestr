package view;

import com.liferay.counter.service.CounterLocalService;
import com.liferay.docs.servicebuilder.service.persistence.BankPersistence;
import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;

public class Bank {

    private long bankId;
    private String name;
    private String bik;
    private String address;

    public Bank(){

    }

    public Bank(ActionRequest request){
        if(ParamUtil.getLong(request, "bankId") != 0) {
            this.bankId = ParamUtil.getLong(request, "bankId");
        }
        this.name = ParamUtil.getString(request,"name");
        this.bik = ParamUtil.getString(request, "bik");
        this.address = ParamUtil.getString(request, "address");
    }

    public long getBankId() {
        return bankId;
    }

    public void setBankId(long bankId) {
        this.bankId = bankId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBik() {
        return bik;
    }

    public void setBik(String bik) {
        this.bik = bik;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public com.liferay.docs.servicebuilder.model.Bank getCreateBank(CounterLocalService counterLocalService, BankPersistence bankPersistence) throws SystemException {
        long bankId = counterLocalService.increment(com.liferay.docs.servicebuilder.model.Bank.class.getName());
        com.liferay.docs.servicebuilder.model.Bank bank = bankPersistence.create(bankId);
        setData(bank);
        return bank;
    }

    public com.liferay.docs.servicebuilder.model.Bank getUpdateBank(BankPersistence bankPersistence) throws SystemException, NoSuchModelException {
        com.liferay.docs.servicebuilder.model.Bank bank = bankPersistence.findByPrimaryKey(this.bankId);
        setData(bank);
        return bank;
    }

    private void setData(com.liferay.docs.servicebuilder.model.Bank bank) {
        bank.setName(name);
        bank.setBik(bik);
        bank.setAddress(address);
    }

}
