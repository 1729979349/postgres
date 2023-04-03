package com.croky.postgres.dal.dao.extra;

import com.croky.postgres.dal.dao.CompetitionMonitoringDAO;
import com.croky.postgres.dal.mapper.AlertDateSqlProvider;
import com.croky.postgres.dal.mapper.CompetitionMonitoringSqlProvider;
import com.croky.postgres.dal.model.AlertDate;
import com.croky.postgres.dal.model.CompetitionMonitoring;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2023/3/7 15:35 星期二
 * Description
 */
@Mapper
public interface CompetitionMonitoringExtraDAO extends CompetitionMonitoringDAO {

    @Delete("delete from competition_monitoring")
    int deleteAll();

    @InsertProvider(type = CompetitionMonitoringSqlProvider.class, method = "insertSelective")
    int insertSelective(CompetitionMonitoring row);
}
