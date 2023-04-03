package com.croky.postgres.dal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Croky.Zheng
 * @date 2023-03-06 17:48:11
*/
public class PlatformDimensionReportExample {
    /** 分页查询中的偏移量 */
    protected int offset;

    /** 分页查询中需要获取的数据量 */
    protected int limit;

    /**

     */
    protected String orderByClause;

    /**

     */
    protected boolean distinct;

    /**

     */
    protected List<Criteria> oredCriteria;

    /**

     */
    public PlatformDimensionReportExample() {
        oredCriteria = new ArrayList<>();
    }

    /** @param offset 设置查询偏移量 */
    public void setOffset(int offset) {
        this.offset = offset;
    }

    /** @return 获取查询偏移量 */
    public int getOffset() {
        return offset;
    }

    /** @param limit 设置查询返回数据量 */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /** @return 返回查询结果数据量 */
    public int getLimit() {
        return limit;
    }

    /**

     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**

     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**

     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**

     */
    public boolean isDistinct() {
        return distinct;
    }

    /**

     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**

     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**

     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**

     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**

     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**

     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**

     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeIsNull() {
            addCriterion("platform_type is null");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeIsNotNull() {
            addCriterion("platform_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeEqualTo(String value) {
            addCriterion("platform_type =", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeNotEqualTo(String value) {
            addCriterion("platform_type <>", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeGreaterThan(String value) {
            addCriterion("platform_type >", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeGreaterThanOrEqualTo(String value) {
            addCriterion("platform_type >=", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeLessThan(String value) {
            addCriterion("platform_type <", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeLessThanOrEqualTo(String value) {
            addCriterion("platform_type <=", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeLike(String value) {
            addCriterion("platform_type like", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeNotLike(String value) {
            addCriterion("platform_type not like", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeIn(List<String> values) {
            addCriterion("platform_type in", values, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeNotIn(List<String> values) {
            addCriterion("platform_type not in", values, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeBetween(String value1, String value2) {
            addCriterion("platform_type between", value1, value2, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeNotBetween(String value1, String value2) {
            addCriterion("platform_type not between", value1, value2, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("platform like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("platform not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andDataCategoryIsNull() {
            addCriterion("data_category is null");
            return (Criteria) this;
        }

        public Criteria andDataCategoryIsNotNull() {
            addCriterion("data_category is not null");
            return (Criteria) this;
        }

        public Criteria andDataCategoryEqualTo(String value) {
            addCriterion("data_category =", value, "dataCategory");
            return (Criteria) this;
        }

        public Criteria andDataCategoryNotEqualTo(String value) {
            addCriterion("data_category <>", value, "dataCategory");
            return (Criteria) this;
        }

        public Criteria andDataCategoryGreaterThan(String value) {
            addCriterion("data_category >", value, "dataCategory");
            return (Criteria) this;
        }

        public Criteria andDataCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("data_category >=", value, "dataCategory");
            return (Criteria) this;
        }

        public Criteria andDataCategoryLessThan(String value) {
            addCriterion("data_category <", value, "dataCategory");
            return (Criteria) this;
        }

        public Criteria andDataCategoryLessThanOrEqualTo(String value) {
            addCriterion("data_category <=", value, "dataCategory");
            return (Criteria) this;
        }

        public Criteria andDataCategoryLike(String value) {
            addCriterion("data_category like", value, "dataCategory");
            return (Criteria) this;
        }

        public Criteria andDataCategoryNotLike(String value) {
            addCriterion("data_category not like", value, "dataCategory");
            return (Criteria) this;
        }

        public Criteria andDataCategoryIn(List<String> values) {
            addCriterion("data_category in", values, "dataCategory");
            return (Criteria) this;
        }

        public Criteria andDataCategoryNotIn(List<String> values) {
            addCriterion("data_category not in", values, "dataCategory");
            return (Criteria) this;
        }

        public Criteria andDataCategoryBetween(String value1, String value2) {
            addCriterion("data_category between", value1, value2, "dataCategory");
            return (Criteria) this;
        }

        public Criteria andDataCategoryNotBetween(String value1, String value2) {
            addCriterion("data_category not between", value1, value2, "dataCategory");
            return (Criteria) this;
        }

        public Criteria andSourceCategoryIsNull() {
            addCriterion("source_category is null");
            return (Criteria) this;
        }

        public Criteria andSourceCategoryIsNotNull() {
            addCriterion("source_category is not null");
            return (Criteria) this;
        }

        public Criteria andSourceCategoryEqualTo(String value) {
            addCriterion("source_category =", value, "sourceCategory");
            return (Criteria) this;
        }

        public Criteria andSourceCategoryNotEqualTo(String value) {
            addCriterion("source_category <>", value, "sourceCategory");
            return (Criteria) this;
        }

        public Criteria andSourceCategoryGreaterThan(String value) {
            addCriterion("source_category >", value, "sourceCategory");
            return (Criteria) this;
        }

        public Criteria andSourceCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("source_category >=", value, "sourceCategory");
            return (Criteria) this;
        }

        public Criteria andSourceCategoryLessThan(String value) {
            addCriterion("source_category <", value, "sourceCategory");
            return (Criteria) this;
        }

        public Criteria andSourceCategoryLessThanOrEqualTo(String value) {
            addCriterion("source_category <=", value, "sourceCategory");
            return (Criteria) this;
        }

        public Criteria andSourceCategoryLike(String value) {
            addCriterion("source_category like", value, "sourceCategory");
            return (Criteria) this;
        }

        public Criteria andSourceCategoryNotLike(String value) {
            addCriterion("source_category not like", value, "sourceCategory");
            return (Criteria) this;
        }

        public Criteria andSourceCategoryIn(List<String> values) {
            addCriterion("source_category in", values, "sourceCategory");
            return (Criteria) this;
        }

        public Criteria andSourceCategoryNotIn(List<String> values) {
            addCriterion("source_category not in", values, "sourceCategory");
            return (Criteria) this;
        }

        public Criteria andSourceCategoryBetween(String value1, String value2) {
            addCriterion("source_category between", value1, value2, "sourceCategory");
            return (Criteria) this;
        }

        public Criteria andSourceCategoryNotBetween(String value1, String value2) {
            addCriterion("source_category not between", value1, value2, "sourceCategory");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andTableNameDwdIsNull() {
            addCriterion("table_name_dwd is null");
            return (Criteria) this;
        }

        public Criteria andTableNameDwdIsNotNull() {
            addCriterion("table_name_dwd is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameDwdEqualTo(String value) {
            addCriterion("table_name_dwd =", value, "tableNameDwd");
            return (Criteria) this;
        }

        public Criteria andTableNameDwdNotEqualTo(String value) {
            addCriterion("table_name_dwd <>", value, "tableNameDwd");
            return (Criteria) this;
        }

        public Criteria andTableNameDwdGreaterThan(String value) {
            addCriterion("table_name_dwd >", value, "tableNameDwd");
            return (Criteria) this;
        }

        public Criteria andTableNameDwdGreaterThanOrEqualTo(String value) {
            addCriterion("table_name_dwd >=", value, "tableNameDwd");
            return (Criteria) this;
        }

        public Criteria andTableNameDwdLessThan(String value) {
            addCriterion("table_name_dwd <", value, "tableNameDwd");
            return (Criteria) this;
        }

        public Criteria andTableNameDwdLessThanOrEqualTo(String value) {
            addCriterion("table_name_dwd <=", value, "tableNameDwd");
            return (Criteria) this;
        }

        public Criteria andTableNameDwdLike(String value) {
            addCriterion("table_name_dwd like", value, "tableNameDwd");
            return (Criteria) this;
        }

        public Criteria andTableNameDwdNotLike(String value) {
            addCriterion("table_name_dwd not like", value, "tableNameDwd");
            return (Criteria) this;
        }

        public Criteria andTableNameDwdIn(List<String> values) {
            addCriterion("table_name_dwd in", values, "tableNameDwd");
            return (Criteria) this;
        }

        public Criteria andTableNameDwdNotIn(List<String> values) {
            addCriterion("table_name_dwd not in", values, "tableNameDwd");
            return (Criteria) this;
        }

        public Criteria andTableNameDwdBetween(String value1, String value2) {
            addCriterion("table_name_dwd between", value1, value2, "tableNameDwd");
            return (Criteria) this;
        }

        public Criteria andTableNameDwdNotBetween(String value1, String value2) {
            addCriterion("table_name_dwd not between", value1, value2, "tableNameDwd");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateTimeIsNull() {
            addCriterion("gmt_modify is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateTimeIsNotNull() {
            addCriterion("gmt_modify is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateTimeEqualTo(Date value) {
            addCriterion("gmt_modify =", value, "lastModifyDateTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateTimeNotEqualTo(Date value) {
            addCriterion("gmt_modify <>", value, "lastModifyDateTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateTimeGreaterThan(Date value) {
            addCriterion("gmt_modify >", value, "lastModifyDateTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modify >=", value, "lastModifyDateTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateTimeLessThan(Date value) {
            addCriterion("gmt_modify <", value, "lastModifyDateTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modify <=", value, "lastModifyDateTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateTimeIn(List<Date> values) {
            addCriterion("gmt_modify in", values, "lastModifyDateTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateTimeNotIn(List<Date> values) {
            addCriterion("gmt_modify not in", values, "lastModifyDateTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateTimeBetween(Date value1, Date value2) {
            addCriterion("gmt_modify between", value1, value2, "lastModifyDateTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modify not between", value1, value2, "lastModifyDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeEqualTo(Date value) {
            addCriterion("gmt_create =", value, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeLessThan(Date value) {
            addCriterion("gmt_create <", value, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeIn(List<Date> values) {
            addCriterion("gmt_create in", values, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "createDateTime");
            return (Criteria) this;
        }
    }

    /**

     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**

     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}