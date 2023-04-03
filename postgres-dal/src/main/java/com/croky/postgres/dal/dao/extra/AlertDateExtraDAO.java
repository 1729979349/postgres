package com.croky.postgres.dal.dao.extra;

import com.croky.postgres.dal.dao.AlertDateDAO;
import com.croky.postgres.dal.mapper.AlertDateSqlProvider;
import com.croky.postgres.dal.model.AlertDate;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2023/2/13 15:54 星期一
 * Description
 */
@Mapper
public interface AlertDateExtraDAO extends AlertDateDAO {

    @Delete("delete from alert_date")
    int deleteAll();

    @InsertProvider(type = AlertDateSqlProvider.class, method = "insertSelective")
    int insertSelective(AlertDate row);
}
