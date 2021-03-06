package com.liferay.docs.servicebuilder.model;

import com.liferay.docs.servicebuilder.service.ClpSerializer;
import com.liferay.docs.servicebuilder.service.PositionLocalServiceUtil;

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


public class PositionClp extends BaseModelImpl<Position> implements Position {
    private long _positionId;
    private String _name;
    private Boolean _archived;
    private BaseModel<?> _positionRemoteModel;
    private Class<?> _clpSerializerClass = com.liferay.docs.servicebuilder.service.ClpSerializer.class;

    public PositionClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Position.class;
    }

    @Override
    public String getModelClassName() {
        return Position.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _positionId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setPositionId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _positionId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("positionId", getPositionId());
        attributes.put("name", getName());
        attributes.put("archived", getArchived());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long positionId = (Long) attributes.get("positionId");

        if (positionId != null) {
            setPositionId(positionId);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Boolean archived = (Boolean) attributes.get("archived");

        if (archived != null) {
            setArchived(archived);
        }
    }

    @Override
    public long getPositionId() {
        return _positionId;
    }

    @Override
    public void setPositionId(long positionId) {
        _positionId = positionId;

        if (_positionRemoteModel != null) {
            try {
                Class<?> clazz = _positionRemoteModel.getClass();

                Method method = clazz.getMethod("setPositionId", long.class);

                method.invoke(_positionRemoteModel, positionId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_positionRemoteModel != null) {
            try {
                Class<?> clazz = _positionRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_positionRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Boolean getArchived() {
        return _archived;
    }

    @Override
    public void setArchived(Boolean archived) {
        _archived = archived;

        if (_positionRemoteModel != null) {
            try {
                Class<?> clazz = _positionRemoteModel.getClass();

                Method method = clazz.getMethod("setArchived", Boolean.class);

                method.invoke(_positionRemoteModel, archived);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPositionRemoteModel() {
        return _positionRemoteModel;
    }

    public void setPositionRemoteModel(BaseModel<?> positionRemoteModel) {
        _positionRemoteModel = positionRemoteModel;
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

        Class<?> remoteModelClass = _positionRemoteModel.getClass();

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

        Object returnValue = method.invoke(_positionRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PositionLocalServiceUtil.addPosition(this);
        } else {
            PositionLocalServiceUtil.updatePosition(this);
        }
    }

    @Override
    public Position toEscapedModel() {
        return (Position) ProxyUtil.newProxyInstance(Position.class.getClassLoader(),
            new Class[] { Position.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PositionClp clone = new PositionClp();

        clone.setPositionId(getPositionId());
        clone.setName(getName());
        clone.setArchived(getArchived());

        return clone;
    }

    @Override
    public int compareTo(Position position) {
        int value = 0;

        value = getName().compareTo(position.getName());

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

        if (!(obj instanceof PositionClp)) {
            return false;
        }

        PositionClp position = (PositionClp) obj;

        long primaryKey = position.getPrimaryKey();

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
        StringBundler sb = new StringBundler(7);

        sb.append("{positionId=");
        sb.append(getPositionId());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", archived=");
        sb.append(getArchived());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.liferay.docs.servicebuilder.model.Position");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>positionId</column-name><column-value><![CDATA[");
        sb.append(getPositionId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>archived</column-name><column-value><![CDATA[");
        sb.append(getArchived());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
