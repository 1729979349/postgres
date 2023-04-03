package com.croky.postgres.dal.dao.extra;

import com.croky.postgres.dal.dao.AlertStoreDAO;
import com.croky.postgres.dal.mapper.AlertStoreSqlProvider;
import com.croky.postgres.dal.model.AlertStore;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2023/2/13 15:48 星期一
 * Description
 */
@Mapper
public interface AlertStoreExtraDAO extends AlertStoreDAO {

    @Delete("delete from alert_store")
    int deleteAll();

    @InsertProvider(type = AlertStoreSqlProvider.class, method = "insertSelective")
    int insertSelective(AlertStore row);
}
