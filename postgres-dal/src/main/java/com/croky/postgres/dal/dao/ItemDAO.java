package com.croky.postgres.dal.dao;

import com.croky.postgres.dal.mapper.ItemMapper;
import com.croky.postgres.dal.model.Item;
import com.croky.common.lang.Pagination;
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
 * @date 2022-04-29 03:04:29
*/
@Mapper
public interface ItemDAO extends ItemMapper {
    /**

     */
    @Select({
        "select",
        "id, shop_id, barcode, name, pinyin, spec, unit, location, price, secr_stock, ",
        "stock, vip_price, cost_price, keyword, gmt_create, gmt_modify, status",
        "from item",
        "where id = #{id,jdbcType=BIGINT}",
        "for update"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="shop_id", property="shopId", jdbcType=JdbcType.INTEGER),
        @Result(column="barcode", property="barcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="pinyin", property="pinyin", jdbcType=JdbcType.VARCHAR),
        @Result(column="spec", property="spec", jdbcType=JdbcType.VARCHAR),
        @Result(column="unit", property="unit", jdbcType=JdbcType.VARCHAR),
        @Result(column="location", property="location", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="secr_stock", property="secrStock", jdbcType=JdbcType.DOUBLE),
        @Result(column="stock", property="stock", jdbcType=JdbcType.DOUBLE),
        @Result(column="vip_price", property="vipPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="cost_price", property="costPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="keyword", property="keyword", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT)
    })
    Item getAndLock(Long id);

    /**

     */
    @Select({
        "select",
        "id, shop_id, barcode, name, pinyin, spec, unit, location, price, secr_stock, ",
        "stock, vip_price, cost_price, keyword, gmt_create, gmt_modify, status",
        "from item",
        "where id = #{id,jdbcType=BIGINT}",
        "lock in share mode"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="shop_id", property="shopId", jdbcType=JdbcType.INTEGER),
        @Result(column="barcode", property="barcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="pinyin", property="pinyin", jdbcType=JdbcType.VARCHAR),
        @Result(column="spec", property="spec", jdbcType=JdbcType.VARCHAR),
        @Result(column="unit", property="unit", jdbcType=JdbcType.VARCHAR),
        @Result(column="location", property="location", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="secr_stock", property="secrStock", jdbcType=JdbcType.DOUBLE),
        @Result(column="stock", property="stock", jdbcType=JdbcType.DOUBLE),
        @Result(column="vip_price", property="vipPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="cost_price", property="costPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="keyword", property="keyword", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT)
    })
    Item getAndShareLock(Long id);

    /**

     */
    @Update({
    "update item ",
    "set status = -1",
    "where ",
    "id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**

     */
    @Select({"<script> ",
        "select",
        "id, shop_id, barcode, name, pinyin, spec, unit, location, price, secr_stock, ",
        "stock, vip_price, cost_price, keyword, gmt_create, gmt_modify, status",
        "from item",
    "<when test=\"where!=null and where!=''\">  where 1=1 and #{where,jdbcType=VARCHAR} </when>",
    "<when test=\"orderby!=null and orderby!=''\">  order by  #{orderby,jdbcType=VARCHAR}</when>",
    "<when test=\"pagination!=null\">  limit  #{pagination.offset,jdbcType=INTEGER},#{pagination.limit,jdbcType=INTEGER}</when>",
    "</script>"})
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="shop_id", property="shopId", jdbcType=JdbcType.INTEGER),
        @Result(column="barcode", property="barcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="pinyin", property="pinyin", jdbcType=JdbcType.VARCHAR),
        @Result(column="spec", property="spec", jdbcType=JdbcType.VARCHAR),
        @Result(column="unit", property="unit", jdbcType=JdbcType.VARCHAR),
        @Result(column="location", property="location", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="secr_stock", property="secrStock", jdbcType=JdbcType.DOUBLE),
        @Result(column="stock", property="stock", jdbcType=JdbcType.DOUBLE),
        @Result(column="vip_price", property="vipPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="cost_price", property="costPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="keyword", property="keyword", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT)
    })
    List<Item> listByWhere(@Param("where") String where, @Param("orderby") String orderby, @Param("pagination") Pagination pagination);
}