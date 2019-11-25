package com.sheva.dao;

import java.util.List;

/**
 * @author Sheva
 * @date 2019/11/25  下午3:27
 * @Version 1.0
 */
public interface BaseDao<T> {

    /**
     * 插入一个数据
     * @param entity
     * @throws Exception
     */
    void insert(T entity) throws Exception;

    /**
     * 批量插入数据
     * @param entityList
     * @return
     * @throws Exception
     */

    int insertBatch(List<T> entityList) throws Exception;

    /**
     * 更新数据
     * @param entity
     * @throws Exception
     */

    void update(T entity) throws Exception;

    /**
     * 根据主键山此处
     * @param id
     * @throws Exception
     */
    void deleteByPrimaryKey(int id) throws Exception;
    /**
     * 删除数据
     * @param entity
     * @throws Exception
     */
    void delete(T entity) throws Exception;

    /**
     * 根据主键查找
     * @param id
     * @return
     */
    T findByPrimaryKey(int id);

    /**
     * 根据实体查找
     * @param entity
     * @return
     */
    T findByEntity(T entity);

    /**
     * 根据对象查询多条记录
     * @param entity
     * @return
     */
    List<T> findByListEntity(T entity);

    /**
     * 查询所有记录
     * @return
     */
    List<T> findAll();

    /**
     * 根据对象查询信息
     * @param obj
     * @return
     */
    Object findByObject(Object obj);
}
