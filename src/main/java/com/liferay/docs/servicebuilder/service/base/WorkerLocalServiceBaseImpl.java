package com.liferay.docs.servicebuilder.service.base;

import com.liferay.docs.servicebuilder.model.Worker;
import com.liferay.docs.servicebuilder.service.WorkerLocalService;
import com.liferay.docs.servicebuilder.service.persistence.BankPersistence;
import com.liferay.docs.servicebuilder.service.persistence.PositionPersistence;
import com.liferay.docs.servicebuilder.service.persistence.WorkerPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the worker local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.docs.servicebuilder.service.impl.WorkerLocalServiceImpl}.
 * </p>
 *
 * @author gerbe
 * @see com.liferay.docs.servicebuilder.service.impl.WorkerLocalServiceImpl
 * @see com.liferay.docs.servicebuilder.service.WorkerLocalServiceUtil
 * @generated
 */
public abstract class WorkerLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements WorkerLocalService, IdentifiableBean {
    @BeanReference(type = com.liferay.docs.servicebuilder.service.BankLocalService.class)
    protected com.liferay.docs.servicebuilder.service.BankLocalService bankLocalService;
    @BeanReference(type = BankPersistence.class)
    protected BankPersistence bankPersistence;
    @BeanReference(type = com.liferay.docs.servicebuilder.service.PositionLocalService.class)
    protected com.liferay.docs.servicebuilder.service.PositionLocalService positionLocalService;
    @BeanReference(type = PositionPersistence.class)
    protected PositionPersistence positionPersistence;
    @BeanReference(type = com.liferay.docs.servicebuilder.service.WorkerLocalService.class)
    protected com.liferay.docs.servicebuilder.service.WorkerLocalService workerLocalService;
    @BeanReference(type = WorkerPersistence.class)
    protected WorkerPersistence workerPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private WorkerLocalServiceClpInvoker _clpInvoker = new WorkerLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.liferay.docs.servicebuilder.service.WorkerLocalServiceUtil} to access the worker local service.
     */

    /**
     * Adds the worker to the database. Also notifies the appropriate model listeners.
     *
     * @param worker the worker
     * @return the worker that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Worker addWorker(Worker worker) throws SystemException {
        worker.setNew(true);

        return workerPersistence.update(worker);
    }

    /**
     * Creates a new worker with the primary key. Does not add the worker to the database.
     *
     * @param workerId the primary key for the new worker
     * @return the new worker
     */
    @Override
    public Worker createWorker(long workerId) {
        return workerPersistence.create(workerId);
    }

    /**
     * Deletes the worker with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param workerId the primary key of the worker
     * @return the worker that was removed
     * @throws PortalException if a worker with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Worker deleteWorker(long workerId)
        throws PortalException, SystemException {
        return workerPersistence.remove(workerId);
    }

    /**
     * Deletes the worker from the database. Also notifies the appropriate model listeners.
     *
     * @param worker the worker
     * @return the worker that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Worker deleteWorker(Worker worker) throws SystemException {
        return workerPersistence.remove(worker);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(Worker.class,
            clazz.getClassLoader());
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return workerPersistence.findWithDynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.servicebuilder.model.impl.WorkerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @return the range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return workerPersistence.findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.servicebuilder.model.impl.WorkerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return workerPersistence.findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return workerPersistence.countWithDynamicQuery(dynamicQuery);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @param projection the projection to apply to the query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return workerPersistence.countWithDynamicQuery(dynamicQuery, projection);
    }

    @Override
    public Worker fetchWorker(long workerId) throws SystemException {
        return workerPersistence.fetchByPrimaryKey(workerId);
    }

    /**
     * Returns the worker with the primary key.
     *
     * @param workerId the primary key of the worker
     * @return the worker
     * @throws PortalException if a worker with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Worker getWorker(long workerId)
        throws PortalException, SystemException {
        return workerPersistence.findByPrimaryKey(workerId);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return workerPersistence.findByPrimaryKey(primaryKeyObj);
    }

    /**
     * Returns a range of all the workers.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.servicebuilder.model.impl.WorkerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of workers
     * @param end the upper bound of the range of workers (not inclusive)
     * @return the range of workers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Worker> getWorkers(int start, int end)
        throws SystemException {
        return workerPersistence.findAll(start, end);
    }

    /**
     * Returns the number of workers.
     *
     * @return the number of workers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getWorkersCount() throws SystemException {
        return workerPersistence.countAll();
    }

    /**
     * Updates the worker in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param worker the worker
     * @return the worker that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Worker updateWorker(Worker worker) throws SystemException {
        return workerPersistence.update(worker);
    }

    /**
     * Returns the bank local service.
     *
     * @return the bank local service
     */
    public com.liferay.docs.servicebuilder.service.BankLocalService getBankLocalService() {
        return bankLocalService;
    }

    /**
     * Sets the bank local service.
     *
     * @param bankLocalService the bank local service
     */
    public void setBankLocalService(
        com.liferay.docs.servicebuilder.service.BankLocalService bankLocalService) {
        this.bankLocalService = bankLocalService;
    }

    /**
     * Returns the bank persistence.
     *
     * @return the bank persistence
     */
    public BankPersistence getBankPersistence() {
        return bankPersistence;
    }

    /**
     * Sets the bank persistence.
     *
     * @param bankPersistence the bank persistence
     */
    public void setBankPersistence(BankPersistence bankPersistence) {
        this.bankPersistence = bankPersistence;
    }

    /**
     * Returns the position local service.
     *
     * @return the position local service
     */
    public com.liferay.docs.servicebuilder.service.PositionLocalService getPositionLocalService() {
        return positionLocalService;
    }

    /**
     * Sets the position local service.
     *
     * @param positionLocalService the position local service
     */
    public void setPositionLocalService(
        com.liferay.docs.servicebuilder.service.PositionLocalService positionLocalService) {
        this.positionLocalService = positionLocalService;
    }

    /**
     * Returns the position persistence.
     *
     * @return the position persistence
     */
    public PositionPersistence getPositionPersistence() {
        return positionPersistence;
    }

    /**
     * Sets the position persistence.
     *
     * @param positionPersistence the position persistence
     */
    public void setPositionPersistence(PositionPersistence positionPersistence) {
        this.positionPersistence = positionPersistence;
    }

    /**
     * Returns the worker local service.
     *
     * @return the worker local service
     */
    public com.liferay.docs.servicebuilder.service.WorkerLocalService getWorkerLocalService() {
        return workerLocalService;
    }

    /**
     * Sets the worker local service.
     *
     * @param workerLocalService the worker local service
     */
    public void setWorkerLocalService(
        com.liferay.docs.servicebuilder.service.WorkerLocalService workerLocalService) {
        this.workerLocalService = workerLocalService;
    }

    /**
     * Returns the worker persistence.
     *
     * @return the worker persistence
     */
    public WorkerPersistence getWorkerPersistence() {
        return workerPersistence;
    }

    /**
     * Sets the worker persistence.
     *
     * @param workerPersistence the worker persistence
     */
    public void setWorkerPersistence(WorkerPersistence workerPersistence) {
        this.workerPersistence = workerPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("com.liferay.docs.servicebuilder.model.Worker",
            workerLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "com.liferay.docs.servicebuilder.model.Worker");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Worker.class;
    }

    protected String getModelClassName() {
        return Worker.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = workerPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
