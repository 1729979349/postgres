package com.croky.postgres.dal.dao;

import com.croky.common.lang.Pagination;
import com.croky.postgres.dal.mapper.AlertStoreMapper;
import com.croky.postgres.dal.model.AlertStore;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

/**
 * @author Croky.Zheng
 * @date 2023-03-06 17:19:16
*/
@Mapper
public interface AlertStoreDAO extends AlertStoreMapper {
    /**

     */
    @Select({
        "select",
        "id, country, brand, platform, store_name, store_id, mkt_type, tl, tl_min_day, ",
        "pic, pic_min_day, mkt_pic, mkt_pic_min_day, is_manual, roi_b, remarks, gmt_modify, ",
        "gmt_create",
        "from alert_store",
        "where id = #{id,jdbcType=INTEGER}",
        "for update"
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
    AlertStore getAndLock(Integer id);

    /**

     */
    @Select({
        "select",
        "id, country, brand, platform, store_name, store_id, mkt_type, tl, tl_min_day, ",
        "pic, pic_min_day, mkt_pic, mkt_pic_min_day, is_manual, roi_b, remarks, gmt_modify, ",
        "gmt_create",
        "from alert_store",
        "where id = #{id,jdbcType=INTEGER}",
        "lock in share mode"
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
    AlertStore getAndShareLock(Integer id);

    /**

     */
    @Update({
    "update alert_store ",
    "set status = -1",
    "where ",
    "id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**

     */
    @Select({"<script> ",
        "select",
        "id, country, brand, platform, store_name, store_id, mkt_type, tl, tl_min_day, ",
        "pic, pic_min_day, mkt_pic, mkt_pic_min_day, is_manual, roi_b, remarks, gmt_modify, ",
        "gmt_create",
        "from alert_store",
    "<when test=\"where!=null and where!=''\">  where 1=1 and #{where,jdbcType=VARCHAR} </when>",
    "<when test=\"orderby!=null and orderby!=''\">  order by  #{orderby,jdbcType=VARCHAR}</when>",
    "<when test=\"pagination!=null\">  limit  #{pagination.offset,jdbcType=INTEGER},#{pagination.limit,jdbcType=INTEGER}</when>",
    "</script>"})
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
    List<AlertStore> listByWhere(@Param("where") String where, @Param("orderby") String orderby, @Param("pagination") Pagination pagination);
}