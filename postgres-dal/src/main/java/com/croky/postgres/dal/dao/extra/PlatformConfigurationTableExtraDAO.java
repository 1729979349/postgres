package com.croky.postgres.dal.dao.extra;

import com.croky.postgres.dal.dao.PlatformConfigurationTableDAO;
import com.croky.postgres.dal.mapper.PlatformConfigurationTableSqlProvider;
import com.croky.postgres.dal.model.PlatformConfigurationTable;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2022/12/7 16:30 星期三
 * Description
 */
@Mapper
public interface PlatformConfigurationTableExtraDAO extends PlatformConfigurationTableDAO {

    @Delete("delete from platform_configuration_table")
    int deleteAll();

    @InsertProvider(type = PlatformConfigurationTableSqlProvider.class, method = "insertSelective")
    int insertSelective(PlatformConfigurationTable row);
}
