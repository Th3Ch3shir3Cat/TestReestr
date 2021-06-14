package com.liferay.docs.servicebuilder.model.impl;

import com.liferay.docs.servicebuilder.model.Worker;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Worker in entity cache.
 *
 * @author gerbe
 * @see Worker
 * @generated
 */
public class WorkerCacheModel implements CacheModel<Worker>, Externalizable {
    public long workerId;
    public String firstName;
    public String middleName;
    public String lastName;
    public String gender;
    public String dateOfBirth;
    public long positionId;
    public String employmentDate;
    public String salaryLevel;
    public String numberWorkPhone;
    public String numberHomePhone;
    public long bankId;
    public boolean archived;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{workerId=");
        sb.append(workerId);
        sb.append(", firstName=");
        sb.append(firstName);
        sb.append(", middleName=");
        sb.append(middleName);
        sb.append(", lastName=");
        sb.append(lastName);
        sb.append(", gender=");
        sb.append(gender);
        sb.append(", dateOfBirth=");
        sb.append(dateOfBirth);
        sb.append(", positionId=");
        sb.append(positionId);
        sb.append(", employmentDate=");
        sb.append(employmentDate);
        sb.append(", salaryLevel=");
        sb.append(salaryLevel);
        sb.append(", numberWorkPhone=");
        sb.append(numberWorkPhone);
        sb.append(", numberHomePhone=");
        sb.append(numberHomePhone);
        sb.append(", bankId=");
        sb.append(bankId);
        sb.append(", archived=");
        sb.append(archived);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Worker toEntityModel() {
        WorkerImpl workerImpl = new WorkerImpl();

        workerImpl.setWorkerId(workerId);

        if (firstName == null) {
            workerImpl.setFirstName(StringPool.BLANK);
        } else {
            workerImpl.setFirstName(firstName);
        }

        if (middleName == null) {
            workerImpl.setMiddleName(StringPool.BLANK);
        } else {
            workerImpl.setMiddleName(middleName);
        }

        if (lastName == null) {
            workerImpl.setLastName(StringPool.BLANK);
        } else {
            workerImpl.setLastName(lastName);
        }

        if (gender == null) {
            workerImpl.setGender(StringPool.BLANK);
        } else {
            workerImpl.setGender(gender);
        }

        if (dateOfBirth == null) {
            workerImpl.setDateOfBirth(StringPool.BLANK);
        } else {
            workerImpl.setDateOfBirth(dateOfBirth);
        }

        workerImpl.setPositionId(positionId);

        if (employmentDate == null) {
            workerImpl.setEmploymentDate(StringPool.BLANK);
        } else {
            workerImpl.setEmploymentDate(employmentDate);
        }

        if (salaryLevel == null) {
            workerImpl.setSalaryLevel(StringPool.BLANK);
        } else {
            workerImpl.setSalaryLevel(salaryLevel);
        }

        if (numberWorkPhone == null) {
            workerImpl.setNumberWorkPhone(StringPool.BLANK);
        } else {
            workerImpl.setNumberWorkPhone(numberWorkPhone);
        }

        if (numberHomePhone == null) {
            workerImpl.setNumberHomePhone(StringPool.BLANK);
        } else {
            workerImpl.setNumberHomePhone(numberHomePhone);
        }

        workerImpl.setBankId(bankId);
        workerImpl.setArchived(archived);

        workerImpl.resetOriginalValues();

        return workerImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        workerId = objectInput.readLong();
        firstName = objectInput.readUTF();
        middleName = objectInput.readUTF();
        lastName = objectInput.readUTF();
        gender = objectInput.readUTF();
        dateOfBirth = objectInput.readUTF();
        positionId = objectInput.readLong();
        employmentDate = objectInput.readUTF();
        salaryLevel = objectInput.readUTF();
        numberWorkPhone = objectInput.readUTF();
        numberHomePhone = objectInput.readUTF();
        bankId = objectInput.readLong();
        archived = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(workerId);

        if (firstName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(firstName);
        }

        if (middleName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(middleName);
        }

        if (lastName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(lastName);
        }

        if (gender == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(gender);
        }

        if (dateOfBirth == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dateOfBirth);
        }

        objectOutput.writeLong(positionId);

        if (employmentDate == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(employmentDate);
        }

        if (salaryLevel == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(salaryLevel);
        }

        if (numberWorkPhone == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(numberWorkPhone);
        }

        if (numberHomePhone == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(numberHomePhone);
        }

        objectOutput.writeLong(bankId);
        objectOutput.writeBoolean(archived);
    }
}
