package serviceUtil;

import com.liferay.docs.servicebuilder.NoSuchBankException;
import com.liferay.docs.servicebuilder.service.BankLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import view.Bank;

public class BankUtil {

    public static Bank getBankFromDatabase(Long bankId) throws SystemException, NoSuchBankException {
        com.liferay.docs.servicebuilder.model.Bank bankFromDatabase = BankLocalServiceUtil.findById(bankId);
        if(bankFromDatabase != null) {
            Bank bank = new Bank();
            bank.setBankId(bankFromDatabase.getBankId());
            bank.setBik(bankFromDatabase.getBik());
            bank.setAddress(bankFromDatabase.getAddress());
            bank.setName(bankFromDatabase.getName());
            return bank;
        }
        return null;
    }
}
