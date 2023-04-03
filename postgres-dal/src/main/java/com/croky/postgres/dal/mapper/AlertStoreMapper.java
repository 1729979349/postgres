package com.croky.postgres.dal.mapper;

import com.croky.postgres.dal.model.AlertStore;
import com.croky.postgres.dal.model.AlertStoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

/**
 * @author Croky.Zheng
 * @date 2023-03-06 17:19:16
*/
@Mapper
public interface AlertStoreMapper {
    /**

     */
    @SelectProvider(type=AlertStoreSqlProvider.class, method="countByExample")
    long countByExample(AlertStoreExample example);

    /**

     */
    @Insert({
        "insert into alert_store (country, brand, ",
        "platform, store_name, ",
        "store_id, mkt_type, ",
        "tl, tl_min_day, pic, ",
        "pic_min_day, mkt_pic, ",
        "mkt_pic_min_day, is_manual, ",
        "roi_b, remarks, gmt_modify, ",
        "gmt_create)",
        "values (#{country,jdbcType=VARCHAR}, #{brand,jdbcType=VARCHAR}, ",
        "#{platform,jdbcType=VARCHAR}, #{storeName,jdbcType=VARCHAR}, ",
        "#{storeId,jdbcType=VARCHAR}, #{mktType,jdbcType=VARCHAR}, ",
        "#{tl,jdbcType=VARCHAR}, #{tlMinDay,jdbcType=SMALLINT}, #{pic,jdbcType=VARCHAR}, ",
        "#{picMinDay,jdbcType=SMALLINT}, #{mktPic,jdbcType=VARCHAR}, ",
        "#{mktPicMinDay,jdbcType=SMALLINT}, #{isManual,jdbcType=VARCHAR}, ",
        "#{roiB,jdbcType=VARCHAR}, #{remarks,jdbcType=VARCHAR}, #{lastModifyDateTime,jdbcType=TIMESTAMP}, ",
        "#{createDateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(AlertStore row);

    /**

     */
    @InsertProvider(type=AlertStoreSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(AlertStore row);

    /**

     */
    @SelectProvider(type=AlertStoreSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="country", property="country", jdbcType=JdbcType.VARCHAR),
        @Result(column="brand", property="brand", jdbcType=JdbcType.VARCHAR),
        @Result(column="platform", property="platform", jdbcType=JdbcType.VARCHAR),
        @Result(column="store_name", property="storeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="store_id", property="storeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="mkt_type", property="mktType", jdbcType=JdbcType.VARCHAR),
        @Result(column="tl", property="tl", jdbcType=JdbcType.VARCHAR),
        @Result(column="tl_min_day", property="tlMinDay", jdbcType=JdbcType.SMALLINT),
        @Result(column="pic", property="pic", jdbcType=JdbcType.VARCHAR),
        @Result(column="pic_min_day", property="picMinDay", jdbcType=JdbcType.SMALLINT),
        @Result(column="mkt_pic", property="mktPic", jdbcType=JdbcType.VARCHAR),
        @Result(column="mkt_pic_min_day", property="mktPicMinDay", jdbcType=JdbcType.SMALLINT),
        @Result(column="is_manual", property="isManual", jdbcType=JdbcType.VARCHAR),
        @Result(column="roi_b", property="roiB", jdbcType=JdbcType.VARCHAR),
        @Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<AlertStore> selectByExample(AlertStoreExample example);

    /**

     */
    @Select({
        "select",
        "id, country, brand, platform, store_name, store_id, mkt_type, tl, tl_min_day, ",
        "pic, pic_min_day, mkt_pic, mkt_pic_min_day, is_manual, roi_b, remarks, gmt_modify, ",
        "gmt_create",
        "from alert_store",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="country", property="country", jdbcType=JdbcType.VARCHAR),
        @Result(column="brand", property="brand", jdbcType=JdbcType.VARCHAR),
        @Result(column="platform", property="platform", jdbcType=JdbcType.VARCHAR),
        @Result(column="store_name", property="storeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="store_id", property="storeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="mkt_type", property="mktType", jdbcType=JdbcType.VARCHAR),
        @Result(column="tl", property="tl", jdbcType=JdbcType.VARCHAR),
        @Result(column="tl_min_day", property="tlMinDay", jdbcType=JdbcType.SMALLINT),
        @Result(column="pic", property="pic", jdbcType=JdbcType.VARCHAR),
        @Result(column="pic_min_day", property="picMinDay", jdbcType=JdbcType.SMALLINT),
        @Result(column="mkt_pic", property="mktPic", jdbcType=JdbcType.VARCHAR),
        @Result(column="mkt_pic_min_day", property="mktPicMinDay", jdbcType=JdbcType.SMALLINT),
        @Result(column="is_manual", property="isManual", jdbcType=JdbcType.VARCHAR),
        @Result(column="roi_b", property="roiB", jdbcType=JdbcType.VARCHAR),
        @Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    AlertStore selectByPrimaryKey(Integer id);

    /**

     */
    @UpdateProvider(type=AlertStoreSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("row") AlertStore row, @Param("example") AlertStoreExample example);

    /**

     */
    @UpdateProvider(type=AlertStoreSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("row") AlertStore row, @Param("example") AlertStoreExample example);

    /**

     */
    @UpdateProvider(type=AlertStoreSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AlertStore row);

    /**

     */
    @Update({
        "update alert_store",
        "set country = #{country,jdbcType=VARCHAR},",
          "brand = #{brand,jdbcType=VARCHAR},",
          "platform = #{platform,jdbcType=VARCHAR},",
          "store_name = #{storeName,jdbcType=VARCHAR},",
          "store_id = #{storeId,jdbcType=VARCHAR},",
          "mkt_type = #{mktType,jdbcType=VARCHAR},",
          "tl = #{tl,jdbcType=VARCHAR},",
          "tl_min_day = #{tlMinDay,jdbcType=SMALLINT},",
          "pic = #{pic,jdbcType=VARCHAR},",
          "pic_min_day = #{picMinDay,jdbcType=SMALLINT},",
          "mkt_pic = #{mktPic,jdbcType=VARCHAR},",
          "mkt_pic_min_day = #{mktPicMinDay,jdbcType=SMALLINT},",
          "is_manual = #{isManual,jdbcType=VARCHAR},",
          "roi_b = #{roiB,jdbcType=VARCHAR},",
          "remarks = #{remarks,jdbcType=VARCHAR},",
          "gmt_modify = #{lastModifyDateTime,jdbcType=TIMESTAMP},",
          "gmt_create = #{createDateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(AlertStore row);
}