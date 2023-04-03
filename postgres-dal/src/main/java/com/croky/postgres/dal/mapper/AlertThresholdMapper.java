package com.croky.postgres.dal.mapper;

import com.croky.postgres.dal.model.AlertThreshold;
import com.croky.postgres.dal.model.AlertThresholdExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * @author Croky.Zheng
 * @date 2023-02-13 17:21:18
 */
@Mapper
public interface AlertThresholdMapper {
    /**
     *
     */
    @SelectProvider(type = AlertThresholdSqlProvider.class, method = "countByExample")
    long countByExample(AlertThresholdExample example);

    /**
     *
     */
    @Insert({
            "insert into alert_threshold (roi_a, roi_c, ",
            "gmt_modify, gmt_create)",
            "values (#{roiA,jdbcType=VARCHAR}, #{roiC,jdbcType=VARCHAR}, ",
            "#{lastModifyDateTime,jdbcType=TIMESTAMP}, #{createDateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(AlertThreshold row);

    /**
     *
     */
    @InsertProvider(type = AlertThresholdSqlProvider.class, method = "insertSelective")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insertSelective(AlertThreshold row);

    /**
     *
     */
    @SelectProvider(type = AlertThresholdSqlProvider.class, method = "selectByExample")
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "roi_a", property = "roiA", jdbcType = JdbcType.VARCHAR),
            @Result(column = "roi_c", property = "roiC", jdbcType = JdbcType.VARCHAR),
            @Result(column = "gmt_modify", property = "lastModifyDateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "gmt_create", property = "createDateTime", jdbcType = JdbcType.TIMESTAMP)
    })
    List<AlertThreshold> selectByExample(AlertThresholdExample example);

    /**
     *
     */
    @Select({
            "select",
            "id, roi_a, roi_c, gmt_modify, gmt_create",
            "from alert_threshold",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "roi_a", property = "roiA", jdbcType = JdbcType.VARCHAR),
            @Result(column = "roi_c", property = "roiC", jdbcType = JdbcType.VARCHAR),
            @Result(column = "gmt_modify", property = "lastModifyDateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "gmt_create", property = "createDateTime", jdbcType = JdbcType.TIMESTAMP)
    })
    AlertThreshold selectByPrimaryKey(Integer id);

    /**
     *
     */
    @UpdateProvider(type = AlertThresholdSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("row") AlertThreshold row, @Param("example") AlertThresholdExample example);

    /**
     *
     */
    @UpdateProvider(type = AlertThresholdSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("row") AlertThreshold row, @Param("example") AlertThresholdExample example);

    /**
     *
     */
    @UpdateProvider(type = AlertThresholdSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AlertThreshold row);

    /**
     *
     */
    @Update({
            "update alert_threshold",
            "set roi_a = #{roiA,jdbcType=VARCHAR},",
            "roi_c = #{roiC,jdbcType=VARCHAR},",
            "gmt_modify = #{lastModifyDateTime,jdbcType=TIMESTAMP},",
            "gmt_create = #{createDateTime,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(AlertThreshold row);
}