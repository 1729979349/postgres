package com.croky.postgres.dal.mapper;

import com.croky.postgres.dal.model.NailingCrowd;
import com.croky.postgres.dal.model.NailingCrowdExample;
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
 * @date 2023-03-28 18:25:04
*/
@Mapper
public interface NailingCrowdMapper {
    /**

     */
    @SelectProvider(type=NailingCrowdSqlProvider.class, method="countByExample")
    long countByExample(NailingCrowdExample example);

    /**

     */
    @Insert({
        "insert into nailing_crowd (crowd_name, crowd_token, ",
        "gmt_modify, gmt_create)",
        "values (#{crowdName,jdbcType=VARCHAR}, #{crowdToken,jdbcType=VARCHAR}, ",
        "#{lastModifyDateTime,jdbcType=TIMESTAMP}, #{createDateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(NailingCrowd row);

    /**

     */
    @InsertProvider(type=NailingCrowdSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(NailingCrowd row);

    /**

     */
    @SelectProvider(type=NailingCrowdSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="crowd_name", property="crowdName", jdbcType=JdbcType.VARCHAR),
        @Result(column="crowd_token", property="crowdToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<NailingCrowd> selectByExample(NailingCrowdExample example);

    /**

     */
    @Select({
        "select",
        "id, crowd_name, crowd_token, gmt_modify, gmt_create",
        "from nailing_crowd",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="crowd_name", property="crowdName", jdbcType=JdbcType.VARCHAR),
        @Result(column="crowd_token", property="crowdToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    NailingCrowd selectByPrimaryKey(Integer id);

    /**

     */
    @UpdateProvider(type=NailingCrowdSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("row") NailingCrowd row, @Param("example") NailingCrowdExample example);

    /**

     */
    @UpdateProvider(type=NailingCrowdSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("row") NailingCrowd row, @Param("example") NailingCrowdExample example);

    /**

     */
    @UpdateProvider(type=NailingCrowdSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(NailingCrowd row);

    /**

     */
    @Update({
        "update nailing_crowd",
        "set crowd_name = #{crowdName,jdbcType=VARCHAR},",
          "crowd_token = #{crowdToken,jdbcType=VARCHAR},",
          "gmt_modify = #{lastModifyDateTime,jdbcType=TIMESTAMP},",
          "gmt_create = #{createDateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(NailingCrowd row);
}