package com.croky.postgres.dal.dao.extra;

import com.croky.postgres.dal.dao.AlertThresholdDAO;
import com.croky.postgres.dal.mapper.AlertThresholdSqlProvider;
import com.croky.postgres.dal.model.AlertThreshold;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2023/2/13 15:52 星期一
 * Description
 */
@Mapper
public interface AlertThresholdExtraDAO extends AlertThresholdDAO {

    @Delete("delete from alert_threshold")
    int deleteAll();

    @InsertProvider(type = AlertThresholdSqlProvider.class, method = "insertSelective")
    int insertSelective(AlertThreshold row);
}
