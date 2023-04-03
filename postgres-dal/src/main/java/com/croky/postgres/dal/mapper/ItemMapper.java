package com.croky.postgres.dal.mapper;

import com.croky.postgres.dal.model.Item;
import com.croky.postgres.dal.model.ItemExample;
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
 * @date 2022-04-29 03:04:29
*/
@Mapper
public interface ItemMapper {
    /**

     */
    @SelectProvider(type=ItemSqlProvider.class, method="countByExample")
    long countByExample(ItemExample example);

    /**

     */
    @Insert({
        "insert into item (shop_id, barcode, ",
        "name, pinyin, spec, ",
        "unit, location, ",
        "price, secr_stock, ",
        "stock, vip_price, ",
        "cost_price, keyword, ",
        "gmt_create, gmt_modify, ",
        "status)",
        "values (#{shopId,jdbcType=INTEGER}, #{barcode,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{pinyin,jdbcType=VARCHAR}, #{spec,jdbcType=VARCHAR}, ",
        "#{unit,jdbcType=VARCHAR}, #{location,jdbcType=VARCHAR}, ",
        "#{price,jdbcType=INTEGER}, #{secrStock,jdbcType=DOUBLE}, ",
        "#{stock,jdbcType=DOUBLE}, #{vipPrice,jdbcType=INTEGER}, ",
        "#{costPrice,jdbcType=INTEGER}, #{keyword,jdbcType=VARCHAR}, ",
        "#{createDateTime,jdbcType=TIMESTAMP}, #{lastModifyDateTime,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=TINYINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(Item row);

    /**

     */
    @InsertProvider(type=ItemSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(Item row);

    /**

     */
    @SelectProvider(type=ItemSqlProvider.class, method="selectByExample")
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
    List<Item> selectByExample(ItemExample example);

    /**

     */
    @Select({
        "select",
        "id, shop_id, barcode, name, pinyin, spec, unit, location, price, secr_stock, ",
        "stock, vip_price, cost_price, keyword, gmt_create, gmt_modify, status",
        "from item",
        "where id = #{id,jdbcType=BIGINT}"
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
    Item selectByPrimaryKey(Long id);

    /**

     */
    @UpdateProvider(type=ItemSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("row") Item row, @Param("example") ItemExample example);

    /**

     */
    @UpdateProvider(type=ItemSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("row") Item row, @Param("example") ItemExample example);

    /**

     */
    @UpdateProvider(type=ItemSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Item row);

    /**

     */
    @Update({
        "update item",
        "set shop_id = #{shopId,jdbcType=INTEGER},",
          "barcode = #{barcode,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "pinyin = #{pinyin,jdbcType=VARCHAR},",
          "spec = #{spec,jdbcType=VARCHAR},",
          "unit = #{unit,jdbcType=VARCHAR},",
          "location = #{location,jdbcType=VARCHAR},",
          "price = #{price,jdbcType=INTEGER},",
          "secr_stock = #{secrStock,jdbcType=DOUBLE},",
          "stock = #{stock,jdbcType=DOUBLE},",
          "vip_price = #{vipPrice,jdbcType=INTEGER},",
          "cost_price = #{costPrice,jdbcType=INTEGER},",
          "keyword = #{keyword,jdbcType=VARCHAR},",
          "gmt_create = #{createDateTime,jdbcType=TIMESTAMP},",
          "gmt_modify = #{lastModifyDateTime,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Item row);
}