package view;

import com.liferay.counter.service.CounterLocalService;
import com.liferay.docs.servicebuilder.NoSuchBankException;
import com.liferay.docs.servicebuilder.NoSuchPositionException;
import com.liferay.docs.servicebuilder.service.persistence.PositionPersistence;
import com.liferay.docs.servicebuilder.service.persistence.WorkerPersistence;
import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import serviceUtil.BankUtil;
import serviceUtil.PositionUtil;
import serviceUtil.WorkUtil;

import javax.portlet.ActionRequest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Worker {

    private Long workerId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String dateOfBirth;
    private Position position;
    private String gender;
    private String employmentDate;
    private String salaryLevel;
    private String numberWorkPhone;
    private String numberHomePhone;
    private Bank bank;
    private boolean is_archived;

    public Worker(){}

    public Worker(ActionRequest request) throws SystemException, NoSuchBankException, NoSuchPositionException, ParseException {
        if(ParamUtil.getLong(request, "workerId") != 0) {
            this.workerId = ParamUtil.getLong(request, "workerId");
        }
        setFio(ParamUtil.getString(request,"fio"));
        this.position = PositionUtil.getPositionFromDatabase(ParamUtil.getLong(request,"positionId"));
        this.dateOfBirth = WorkUtil.getDateStringWithPattern(ParamUtil.getString(request, "dateOfBirth"));
        this.gender = ParamUtil.getString(request,"male");
        this.employmentDate = WorkUtil.getDateStringWithPattern(ParamUtil.getString(request, "employmentDate"));
        this.salaryLevel = ParamUtil.getString(request,"salaryLevel");
        this.numberWorkPhone = ParamUtil.getString(request, "numberWorkPhone");
        this.numberHomePhone = ParamUtil.getString(request, "numberHomePhone");
        this.bank = BankUtil.getBankFromDatabase(ParamUtil.getLong(request,"bankId"));
        this.is_archived = ParamUtil.getBoolean(request, "is_archived");
    }

    public Long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Long workerId) {
        this.workerId = workerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    public String getSalaryLevel() {
        return salaryLevel;
    }

    public void setSalaryLevel(String salaryLevel) {
        this.salaryLevel = salaryLevel;
    }

    public String getNumberWorkPhone() {
        return numberWorkPhone;
    }

    public void setNumberWorkPhone(String numberWorkPhone) {
        this.numberWorkPhone = numberWorkPhone;
    }

    public String getNumberHomePhone() {
        return numberHomePhone;
    }

    public void setNumberHomePhone(String numberHomePhone) {
        this.numberHomePhone = numberHomePhone;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public boolean isIs_archived() {
        return is_archived;
    }

    public void setIs_archived(boolean is_archived) {
        this.is_archived = is_archived;
    }


    public com.liferay.docs.servicebuilder.model.Worker getCreateWorker(
            CounterLocalService counterLocalService,
            WorkerPersistence workerPersistence
    ) throws SystemException {
        long workerId = counterLocalService.increment(com.liferay.docs.servicebuilder.model.Position.class.getName());
        com.liferay.docs.servicebuilder.model.Worker worker
                = workerPersistence.create(workerId);

        setDataIn(worker);

        return worker;
    }

    public com.liferay.docs.servicebuilder.model.Worker getUpdateWorker(WorkerPersistence workerPersistence) throws SystemException, NoSuchModelException {
        com.liferay.docs.servicebuilder.model.Worker worker
                = workerPersistence.findByPrimaryKey(this.workerId);
        setDataIn(worker);
        return worker;
    }

    private void setDataIn(com.liferay.docs.servicebuilder.model.Worker worker) {
        worker.setFirstName(firstName);
        worker.setMiddleName(middleName);
        worker.setLastName(lastName);
        worker.setDateOfBirth(dateOfBirth);
        worker.setPositionId(position.getPositionId());
        worker.setEmploymentDate(employmentDate);
        worker.setSalaryLevel(salaryLevel);
        worker.setNumberHomePhone(numberHomePhone);
        worker.setNumberWorkPhone(numberWorkPhone);
        worker.setBankId(bank.getBankId());
        worker.setArchived(is_archived);
    }

    private void setFio(String fio){
        String[] fioMas = fio.split(" ");
        if(fioMas.length > 0){
            this.firstName = fioMas[0];
        }
        if(fioMas.length > 1){
            this.middleName = fioMas[1];
        }
        if(fioMas.length > 2){
            this.lastName = fioMas[2];
        }
    }
}
