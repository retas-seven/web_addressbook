package com.tuyano.springboot.dao;

import com.tuyano.springboot.entity.Address;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao
public interface AddressDao {

    /**
     * @param id
     * @return the Address entity
     */
    @Select
    Address selectById(String id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Address entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Address entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Address entity);
}