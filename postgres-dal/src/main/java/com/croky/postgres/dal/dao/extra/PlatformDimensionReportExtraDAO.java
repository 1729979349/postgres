package com.croky.postgres.dal.dao.extra;

import com.croky.postgres.dal.dao.PlatformDimensionReportDAO;
import com.croky.postgres.dal.mapper.PlatformDimensionReportSqlProvider;
import com.croky.postgres.dal.model.PlatformDimensionReport;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2023/3/6 14:24 星期一
 * Description
 */
@Mapper
public interface PlatformDimensionReportExtraDAO extends PlatformDimensionReportDAO {

    @Delete("delete from platform_dimension_report")
    int deleteAll();

    @InsertProvider(type = PlatformDimensionReportSqlProvider.class, method = "insertSelective")
    int insertSelective(PlatformDimensionReport row);
}
