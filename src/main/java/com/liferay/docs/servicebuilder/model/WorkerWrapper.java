package com.liferay.docs.servicebuilder.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Worker}.
 * </p>
 *
 * @author gerbe
 * @see Worker
 * @generated
 */
public class WorkerWrapper implements Worker, ModelWrapper<Worker> {
    private Worker _worker;

    public WorkerWrapper(Worker worker) {
        _worker = worker;
    }

    @Override
    public Class<?> getModelClass() {
        return Worker.class;
    }

    @Override
    public String getModelClassName() {
        return Worker.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("workerId", getWorkerId());
        attributes.put("firstName", getFirstName());
        attributes.put("middleName", getMiddleName());
        attributes.put("lastName", getLastName());
        attributes.put("gender", getGender());
        attributes.put("dateOfBirth", getDateOfBirth());
        attributes.put("positionId", getPositionId());
        attributes.put("employmentDate", getEmploymentDate());
        attributes.put("salaryLevel", getSalaryLevel());
        attributes.put("numberWorkPhone", getNumberWorkPhone());
        attributes.put("numberHomePhone", getNumberHomePhone());
        attributes.put("bankId", getBankId());
        attributes.put("archived", getArchived());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long workerId = (Long) attributes.get("workerId");

        if (workerId != null) {
            setWorkerId(workerId);
        }

        String firstName = (String) attributes.get("firstName");

        if (firstName != null) {
            setFirstName(firstName);
        }

        String middleName = (String) attributes.get("middleName");

        if (middleName != null) {
            setMiddleName(middleName);
        }

        String lastName = (String) attributes.get("lastName");

        if (lastName != null) {
            setLastName(lastName);
        }

        String gender = (String) attributes.get("gender");

        if (gender != null) {
            setGender(gender);
        }

        String dateOfBirth = (String) attributes.get("dateOfBirth");

        if (dateOfBirth != null) {
            setDateOfBirth(dateOfBirth);
        }

        Long positionId = (Long) attributes.get("positionId");

        if (positionId != null) {
            setPositionId(positionId);
        }

        String employmentDate = (String) attributes.get("employmentDate");

        if (employmentDate != null) {
            setEmploymentDate(employmentDate);
        }

        String salaryLevel = (String) attributes.get("salaryLevel");

        if (salaryLevel != null) {
            setSalaryLevel(salaryLevel);
        }

        String numberWorkPhone = (String) attributes.get("numberWorkPhone");

        if (numberWorkPhone != null) {
            setNumberWorkPhone(numberWorkPhone);
        }

        String numberHomePhone = (String) attributes.get("numberHomePhone");

        if (numberHomePhone != null) {
            setNumberHomePhone(numberHomePhone);
        }

        Long bankId = (Long) attributes.get("bankId");

        if (bankId != null) {
            setBankId(bankId);
        }

        Boolean archived = (Boolean) attributes.get("archived");

        if (archived != null) {
            setArchived(archived);
        }
    }

    /**
    * Returns the primary key of this worker.
    *
    * @return the primary key of this worker
    */
    @Override
    public long getPrimaryKey() {
        return _worker.getPrimaryKey();
    }

    /**
    * Sets the primary key of this worker.
    *
    * @param primaryKey the primary key of this worker
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _worker.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the worker ID of this worker.
    *
    * @return the worker ID of this worker
    */
    @Override
    public long getWorkerId() {
        return _worker.getWorkerId();
    }

    /**
    * Sets the worker ID of this worker.
    *
    * @param workerId the worker ID of this worker
    */
    @Override
    public void setWorkerId(long workerId) {
        _worker.setWorkerId(workerId);
    }

    /**
    * Returns the first name of this worker.
    *
    * @return the first name of this worker
    */
    @Override
    public java.lang.String getFirstName() {
        return _worker.getFirstName();
    }

    /**
    * Sets the first name of this worker.
    *
    * @param firstName the first name of this worker
    */
    @Override
    public void setFirstName(java.lang.String firstName) {
        _worker.setFirstName(firstName);
    }

    /**
    * Returns the middle name of this worker.
    *
    * @return the middle name of this worker
    */
    @Override
    public java.lang.String getMiddleName() {
        return _worker.getMiddleName();
    }

    /**
    * Sets the middle name of this worker.
    *
    * @param middleName the middle name of this worker
    */
    @Override
    public void setMiddleName(java.lang.String middleName) {
        _worker.setMiddleName(middleName);
    }

    /**
    * Returns the last name of this worker.
    *
    * @return the last name of this worker
    */
    @Override
    public java.lang.String getLastName() {
        return _worker.getLastName();
    }

    /**
    * Sets the last name of this worker.
    *
    * @param lastName the last name of this worker
    */
    @Override
    public void setLastName(java.lang.String lastName) {
        _worker.setLastName(lastName);
    }

    /**
    * Returns the gender of this worker.
    *
    * @return the gender of this worker
    */
    @Override
    public java.lang.String getGender() {
        return _worker.getGender();
    }

    /**
    * Sets the gender of this worker.
    *
    * @param gender the gender of this worker
    */
    @Override
    public void setGender(java.lang.String gender) {
        _worker.setGender(gender);
    }

    /**
    * Returns the date of birth of this worker.
    *
    * @return the date of birth of this worker
    */
    @Override
    public java.lang.String getDateOfBirth() {
        return _worker.getDateOfBirth();
    }

    /**
    * Sets the date of birth of this worker.
    *
    * @param dateOfBirth the date of birth of this worker
    */
    @Override
    public void setDateOfBirth(java.lang.String dateOfBirth) {
        _worker.setDateOfBirth(dateOfBirth);
    }

    /**
    * Returns the position ID of this worker.
    *
    * @return the position ID of this worker
    */
    @Override
    public long getPositionId() {
        return _worker.getPositionId();
    }

    /**
    * Sets the position ID of this worker.
    *
    * @param positionId the position ID of this worker
    */
    @Override
    public void setPositionId(long positionId) {
        _worker.setPositionId(positionId);
    }

    /**
    * Returns the employment date of this worker.
    *
    * @return the employment date of this worker
    */
    @Override
    public java.lang.String getEmploymentDate() {
        return _worker.getEmploymentDate();
    }

    /**
    * Sets the employment date of this worker.
    *
    * @param employmentDate the employment date of this worker
    */
    @Override
    public void setEmploymentDate(java.lang.String employmentDate) {
        _worker.setEmploymentDate(employmentDate);
    }

    /**
    * Returns the salary level of this worker.
    *
    * @return the salary level of this worker
    */
    @Override
    public java.lang.String getSalaryLevel() {
        return _worker.getSalaryLevel();
    }

    /**
    * Sets the salary level of this worker.
    *
    * @param salaryLevel the salary level of this worker
    */
    @Override
    public void setSalaryLevel(java.lang.String salaryLevel) {
        _worker.setSalaryLevel(salaryLevel);
    }

    /**
    * Returns the number work phone of this worker.
    *
    * @return the number work phone of this worker
    */
    @Override
    public java.lang.String getNumberWorkPhone() {
        return _worker.getNumberWorkPhone();
    }

    /**
    * Sets the number work phone of this worker.
    *
    * @param numberWorkPhone the number work phone of this worker
    */
    @Override
    public void setNumberWorkPhone(java.lang.String numberWorkPhone) {
        _worker.setNumberWorkPhone(numberWorkPhone);
    }

    /**
    * Returns the number home phone of this worker.
    *
    * @return the number home phone of this worker
    */
    @Override
    public java.lang.String getNumberHomePhone() {
        return _worker.getNumberHomePhone();
    }

    /**
    * Sets the number home phone of this worker.
    *
    * @param numberHomePhone the number home phone of this worker
    */
    @Override
    public void setNumberHomePhone(java.lang.String numberHomePhone) {
        _worker.setNumberHomePhone(numberHomePhone);
    }

    /**
    * Returns the bank ID of this worker.
    *
    * @return the bank ID of this worker
    */
    @Override
    public long getBankId() {
        return _worker.getBankId();
    }

    /**
    * Sets the bank ID of this worker.
    *
    * @param bankId the bank ID of this worker
    */
    @Override
    public void setBankId(long bankId) {
        _worker.setBankId(bankId);
    }

    /**
    * Returns the archived of this worker.
    *
    * @return the archived of this worker
    */
    @Override
    public boolean getArchived() {
        return _worker.getArchived();
    }

    /**
    * Returns <code>true</code> if this worker is archived.
    *
    * @return <code>true</code> if this worker is archived; <code>false</code> otherwise
    */
    @Override
    public boolean isArchived() {
        return _worker.isArchived();
    }

    /**
    * Sets whether this worker is archived.
    *
    * @param archived the archived of this worker
    */
    @Override
    public void setArchived(boolean archived) {
        _worker.setArchived(archived);
    }

    @Override
    public boolean isNew() {
        return _worker.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _worker.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _worker.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _worker.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _worker.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _worker.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _worker.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _worker.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _worker.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _worker.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _worker.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new WorkerWrapper((Worker) _worker.clone());
    }

    @Override
    public int compareTo(com.liferay.docs.servicebuilder.model.Worker worker) {
        return _worker.compareTo(worker);
    }

    @Override
    public int hashCode() {
        return _worker.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.liferay.docs.servicebuilder.model.Worker> toCacheModel() {
        return _worker.toCacheModel();
    }

    @Override
    public com.liferay.docs.servicebuilder.model.Worker toEscapedModel() {
        return new WorkerWrapper(_worker.toEscapedModel());
    }

    @Override
    public com.liferay.docs.servicebuilder.model.Worker toUnescapedModel() {
        return new WorkerWrapper(_worker.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _worker.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _worker.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _worker.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof WorkerWrapper)) {
            return false;
        }

        WorkerWrapper workerWrapper = (WorkerWrapper) obj;

        if (Validator.equals(_worker, workerWrapper._worker)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Worker getWrappedWorker() {
        return _worker;
    }

    @Override
    public Worker getWrappedModel() {
        return _worker;
    }

    @Override
    public void resetOriginalValues() {
        _worker.resetOriginalValues();
    }
}
