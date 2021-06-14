package com.liferay.docs.servicebuilder.model;

import com.liferay.docs.servicebuilder.service.ClpSerializer;
import com.liferay.docs.servicebuilder.service.WorkerLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class WorkerClp extends BaseModelImpl<Worker> implements Worker {
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
    private BaseModel<?> _workerRemoteModel;
    private Class<?> _clpSerializerClass = com.liferay.docs.servicebuilder.service.ClpSerializer.class;

    public WorkerClp() {
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
    public long getPrimaryKey() {
        return _workerId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setWorkerId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _workerId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getWorkerId() {
        return _workerId;
    }

    @Override
    public void setWorkerId(long workerId) {
        _workerId = workerId;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setWorkerId", long.class);

                method.invoke(_workerRemoteModel, workerId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getFirstName() {
        return _firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        _firstName = firstName;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setFirstName", String.class);

                method.invoke(_workerRemoteModel, firstName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getMiddleName() {
        return _middleName;
    }

    @Override
    public void setMiddleName(String middleName) {
        _middleName = middleName;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setMiddleName", String.class);

                method.invoke(_workerRemoteModel, middleName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLastName() {
        return _lastName;
    }

    @Override
    public void setLastName(String lastName) {
        _lastName = lastName;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setLastName", String.class);

                method.invoke(_workerRemoteModel, lastName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getGender() {
        return _gender;
    }

    @Override
    public void setGender(String gender) {
        _gender = gender;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setGender", String.class);

                method.invoke(_workerRemoteModel, gender);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDateOfBirth() {
        return _dateOfBirth;
    }

    @Override
    public void setDateOfBirth(String dateOfBirth) {
        _dateOfBirth = dateOfBirth;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setDateOfBirth", String.class);

                method.invoke(_workerRemoteModel, dateOfBirth);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPositionId() {
        return _positionId;
    }

    @Override
    public void setPositionId(long positionId) {
        _positionId = positionId;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setPositionId", long.class);

                method.invoke(_workerRemoteModel, positionId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmploymentDate() {
        return _employmentDate;
    }

    @Override
    public void setEmploymentDate(String employmentDate) {
        _employmentDate = employmentDate;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setEmploymentDate",
                        String.class);

                method.invoke(_workerRemoteModel, employmentDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSalaryLevel() {
        return _salaryLevel;
    }

    @Override
    public void setSalaryLevel(String salaryLevel) {
        _salaryLevel = salaryLevel;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setSalaryLevel", String.class);

                method.invoke(_workerRemoteModel, salaryLevel);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNumberWorkPhone() {
        return _numberWorkPhone;
    }

    @Override
    public void setNumberWorkPhone(String numberWorkPhone) {
        _numberWorkPhone = numberWorkPhone;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setNumberWorkPhone",
                        String.class);

                method.invoke(_workerRemoteModel, numberWorkPhone);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNumberHomePhone() {
        return _numberHomePhone;
    }

    @Override
    public void setNumberHomePhone(String numberHomePhone) {
        _numberHomePhone = numberHomePhone;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setNumberHomePhone",
                        String.class);

                method.invoke(_workerRemoteModel, numberHomePhone);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getBankId() {
        return _bankId;
    }

    @Override
    public void setBankId(long bankId) {
        _bankId = bankId;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setBankId", long.class);

                method.invoke(_workerRemoteModel, bankId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getArchived() {
        return _archived;
    }

    @Override
    public boolean isArchived() {
        return _archived;
    }

    @Override
    public void setArchived(boolean archived) {
        _archived = archived;

        if (_workerRemoteModel != null) {
            try {
                Class<?> clazz = _workerRemoteModel.getClass();

                Method method = clazz.getMethod("setArchived", boolean.class);

                method.invoke(_workerRemoteModel, archived);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getWorkerRemoteModel() {
        return _workerRemoteModel;
    }

    public void setWorkerRemoteModel(BaseModel<?> workerRemoteModel) {
        _workerRemoteModel = workerRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _workerRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_workerRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            WorkerLocalServiceUtil.addWorker(this);
        } else {
            WorkerLocalServiceUtil.updateWorker(this);
        }
    }

    @Override
    public Worker toEscapedModel() {
        return (Worker) ProxyUtil.newProxyInstance(Worker.class.getClassLoader(),
            new Class[] { Worker.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        WorkerClp clone = new WorkerClp();

        clone.setWorkerId(getWorkerId());
        clone.setFirstName(getFirstName());
        clone.setMiddleName(getMiddleName());
        clone.setLastName(getLastName());
        clone.setGender(getGender());
        clone.setDateOfBirth(getDateOfBirth());
        clone.setPositionId(getPositionId());
        clone.setEmploymentDate(getEmploymentDate());
        clone.setSalaryLevel(getSalaryLevel());
        clone.setNumberWorkPhone(getNumberWorkPhone());
        clone.setNumberHomePhone(getNumberHomePhone());
        clone.setBankId(getBankId());
        clone.setArchived(getArchived());

        return clone;
    }

    @Override
    public int compareTo(Worker worker) {
        int value = 0;

        value = getFirstName().compareTo(worker.getFirstName());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof WorkerClp)) {
            return false;
        }

        WorkerClp worker = (WorkerClp) obj;

        long primaryKey = worker.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{workerId=");
        sb.append(getWorkerId());
        sb.append(", firstName=");
        sb.append(getFirstName());
        sb.append(", middleName=");
        sb.append(getMiddleName());
        sb.append(", lastName=");
        sb.append(getLastName());
        sb.append(", gender=");
        sb.append(getGender());
        sb.append(", dateOfBirth=");
        sb.append(getDateOfBirth());
        sb.append(", positionId=");
        sb.append(getPositionId());
        sb.append(", employmentDate=");
        sb.append(getEmploymentDate());
        sb.append(", salaryLevel=");
        sb.append(getSalaryLevel());
        sb.append(", numberWorkPhone=");
        sb.append(getNumberWorkPhone());
        sb.append(", numberHomePhone=");
        sb.append(getNumberHomePhone());
        sb.append(", bankId=");
        sb.append(getBankId());
        sb.append(", archived=");
        sb.append(getArchived());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(43);

        sb.append("<model><model-name>");
        sb.append("com.liferay.docs.servicebuilder.model.Worker");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>workerId</column-name><column-value><![CDATA[");
        sb.append(getWorkerId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>firstName</column-name><column-value><![CDATA[");
        sb.append(getFirstName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>middleName</column-name><column-value><![CDATA[");
        sb.append(getMiddleName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lastName</column-name><column-value><![CDATA[");
        sb.append(getLastName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>gender</column-name><column-value><![CDATA[");
        sb.append(getGender());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dateOfBirth</column-name><column-value><![CDATA[");
        sb.append(getDateOfBirth());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>positionId</column-name><column-value><![CDATA[");
        sb.append(getPositionId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>employmentDate</column-name><column-value><![CDATA[");
        sb.append(getEmploymentDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>salaryLevel</column-name><column-value><![CDATA[");
        sb.append(getSalaryLevel());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>numberWorkPhone</column-name><column-value><![CDATA[");
        sb.append(getNumberWorkPhone());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>numberHomePhone</column-name><column-value><![CDATA[");
        sb.append(getNumberHomePhone());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bankId</column-name><column-value><![CDATA[");
        sb.append(getBankId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>archived</column-name><column-value><![CDATA[");
        sb.append(getArchived());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
