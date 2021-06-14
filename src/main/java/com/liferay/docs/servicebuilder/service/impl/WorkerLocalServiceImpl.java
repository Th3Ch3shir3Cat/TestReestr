package com.liferay.docs.servicebuilder.service.impl;

import com.liferay.docs.servicebuilder.NoSuchBankException;
import com.liferay.docs.servicebuilder.NoSuchPositionException;
import com.liferay.docs.servicebuilder.NoSuchWorkerException;
import com.liferay.docs.servicebuilder.model.Worker;
import com.liferay.docs.servicebuilder.service.base.WorkerLocalServiceBaseImpl;
import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.ArrayList;

/**
 * The implementation of the worker local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.servicebuilder.service.WorkerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author gerbe
 * @see com.liferay.docs.servicebuilder.service.base.WorkerLocalServiceBaseImpl
 * @see com.liferay.docs.servicebuilder.service.WorkerLocalServiceUtil
 */
public class WorkerLocalServiceImpl extends WorkerLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.liferay.docs.servicebuilder.service.WorkerLocalServiceUtil} to access the worker local service.
     */

    @Override
    public Worker addWorker(view.Worker dataWorker) throws SystemException {
        Worker worker = dataWorker.getCreateWorker(counterLocalService, workerPersistence);
        super.addWorker(worker);
        return worker;
    }


    @Override
    public ArrayList<Worker> findAll() throws SystemException {
        return new ArrayList<Worker>(workerPersistence.findAll());
    }

    @Override
    public Worker findById(long WorkerId) throws SystemException, NoSuchBankException, NoSuchPositionException, NoSuchWorkerException {
        return workerPersistence.findByPrimaryKey(WorkerId);
    }

    @Override
    public Worker updateWorker(view.Worker dataWorker) throws SystemException, NoSuchModelException {
        Worker bank = dataWorker.getUpdateWorker(workerPersistence);
        super.updateWorker(bank);
        return bank;
    }

}
