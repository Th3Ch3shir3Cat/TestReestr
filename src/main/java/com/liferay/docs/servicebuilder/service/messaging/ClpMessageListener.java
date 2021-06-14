package com.liferay.docs.servicebuilder.service.messaging;

import com.liferay.docs.servicebuilder.service.BankLocalServiceUtil;
import com.liferay.docs.servicebuilder.service.ClpSerializer;
import com.liferay.docs.servicebuilder.service.PositionLocalServiceUtil;
import com.liferay.docs.servicebuilder.service.WorkerLocalServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            BankLocalServiceUtil.clearService();

            PositionLocalServiceUtil.clearService();

            WorkerLocalServiceUtil.clearService();
        }
    }
}
