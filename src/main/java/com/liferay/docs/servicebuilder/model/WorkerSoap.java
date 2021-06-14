package com.liferay.docs.servicebuilder.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author gerbe
 * @generated
 */
public class WorkerSoap implements Serializable {
    private long _workerId;
    private String _firstName;
    private String _middleName;
    private String _lastName;
    private String _gender;
    private String _dateOfBirth;
    private long _positionId;
    private String _employmentDate;
    private String _salaryLevel;
    private String _numberWorkPhone;
    private String _numberHomePhone;
    private long _bankId;
    private boolean _archived;

    public WorkerSoap() {
    }

    public static WorkerSoap toSoapModel(Worker model) {
        WorkerSoap soapModel = new WorkerSoap();

        soapModel.setWorkerId(model.getWorkerId());
        soapModel.setFirstName(model.getFirstName());
        soapModel.setMiddleName(model.getMiddleName());
        soapModel.setLastName(model.getLastName());
        soapModel.setGender(model.getGender());
        soapModel.setDateOfBirth(model.getDateOfBirth());
        soapModel.setPositionId(model.getPositionId());
        soapModel.setEmploymentDate(model.getEmploymentDate());
        soapModel.setSalaryLevel(model.getSalaryLevel());
        soapModel.setNumberWorkPhone(model.getNumberWorkPhone());
        soapModel.setNumberHomePhone(model.getNumberHomePhone());
        soapModel.setBankId(model.getBankId());
        soapModel.setArchived(model.getArchived());

        return soapModel;
    }

    public static WorkerSoap[] toSoapModels(Worker[] models) {
        WorkerSoap[] soapModels = new WorkerSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static WorkerSoap[][] toSoapModels(Worker[][] models) {
        WorkerSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new WorkerSoap[models.length][models[0].length];
        } else {
            soapModels = new WorkerSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static WorkerSoap[] toSoapModels(List<Worker> models) {
        List<WorkerSoap> soapModels = new ArrayList<WorkerSoap>(models.size());

        for (Worker model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new WorkerSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _workerId;
    }

    public void setPrimaryKey(long pk) {
        setWorkerId(pk);
    }

    public long getWorkerId() {
        return _workerId;
    }

    public void setWorkerId(long workerId) {
        _workerId = workerId;
    }

    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String firstName) {
        _firstName = firstName;
    }

    public String getMiddleName() {
        return _middleName;
    }

    public void setMiddleName(String middleName) {
        _middleName = middleName;
    }

    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String lastName) {
        _lastName = lastName;
    }

    public String getGender() {
        return _gender;
    }

    public void setGender(String gender) {
        _gender = gender;
    }

    public String getDateOfBirth() {
        return _dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        _dateOfBirth = dateOfBirth;
    }

    public long getPositionId() {
        return _positionId;
    }

    public void setPositionId(long positionId) {
        _positionId = positionId;
    }

    public String getEmploymentDate() {
        return _employmentDate;
    }

    public void setEmploymentDate(String employmentDate) {
        _employmentDate = employmentDate;
    }

    public String getSalaryLevel() {
        return _salaryLevel;
    }

    public void setSalaryLevel(String salaryLevel) {
        _salaryLevel = salaryLevel;
    }

    public String getNumberWorkPhone() {
        return _numberWorkPhone;
    }

    public void setNumberWorkPhone(String numberWorkPhone) {
        _numberWorkPhone = numberWorkPhone;
    }

    public String getNumberHomePhone() {
        return _numberHomePhone;
    }

    public void setNumberHomePhone(String numberHomePhone) {
        _numberHomePhone = numberHomePhone;
    }

    public long getBankId() {
        return _bankId;
    }

    public void setBankId(long bankId) {
        _bankId = bankId;
    }

    public boolean getArchived() {
        return _archived;
    }

    public boolean isArchived() {
        return _archived;
    }

    public void setArchived(boolean archived) {
        _archived = archived;
    }
}
