package com.croky.postgres.dal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Croky.Zheng
 * @date 2023-03-28 18:25:04
*/
public class NailingCrowdExample {
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
    public NailingCrowdExample() {
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

        public Criteria andCrowdNameIsNull() {
            addCriterion("crowd_name is null");
            return (Criteria) this;
        }

        public Criteria andCrowdNameIsNotNull() {
            addCriterion("crowd_name is not null");
            return (Criteria) this;
        }

        public Criteria andCrowdNameEqualTo(String value) {
            addCriterion("crowd_name =", value, "crowdName");
            return (Criteria) this;
        }

        public Criteria andCrowdNameNotEqualTo(String value) {
            addCriterion("crowd_name <>", value, "crowdName");
            return (Criteria) this;
        }

        public Criteria andCrowdNameGreaterThan(String value) {
            addCriterion("crowd_name >", value, "crowdName");
            return (Criteria) this;
        }

        public Criteria andCrowdNameGreaterThanOrEqualTo(String value) {
            addCriterion("crowd_name >=", value, "crowdName");
            return (Criteria) this;
        }

        public Criteria andCrowdNameLessThan(String value) {
            addCriterion("crowd_name <", value, "crowdName");
            return (Criteria) this;
        }

        public Criteria andCrowdNameLessThanOrEqualTo(String value) {
            addCriterion("crowd_name <=", value, "crowdName");
            return (Criteria) this;
        }

        public Criteria andCrowdNameLike(String value) {
            addCriterion("crowd_name like", value, "crowdName");
            return (Criteria) this;
        }

        public Criteria andCrowdNameNotLike(String value) {
            addCriterion("crowd_name not like", value, "crowdName");
            return (Criteria) this;
        }

        public Criteria andCrowdNameIn(List<String> values) {
            addCriterion("crowd_name in", values, "crowdName");
            return (Criteria) this;
        }

        public Criteria andCrowdNameNotIn(List<String> values) {
            addCriterion("crowd_name not in", values, "crowdName");
            return (Criteria) this;
        }

        public Criteria andCrowdNameBetween(String value1, String value2) {
            addCriterion("crowd_name between", value1, value2, "crowdName");
            return (Criteria) this;
        }

        public Criteria andCrowdNameNotBetween(String value1, String value2) {
            addCriterion("crowd_name not between", value1, value2, "crowdName");
            return (Criteria) this;
        }

        public Criteria andCrowdTokenIsNull() {
            addCriterion("crowd_token is null");
            return (Criteria) this;
        }

        public Criteria andCrowdTokenIsNotNull() {
            addCriterion("crowd_token is not null");
            return (Criteria) this;
        }

        public Criteria andCrowdTokenEqualTo(String value) {
            addCriterion("crowd_token =", value, "crowdToken");
            return (Criteria) this;
        }

        public Criteria andCrowdTokenNotEqualTo(String value) {
            addCriterion("crowd_token <>", value, "crowdToken");
            return (Criteria) this;
        }

        public Criteria andCrowdTokenGreaterThan(String value) {
            addCriterion("crowd_token >", value, "crowdToken");
            return (Criteria) this;
        }

        public Criteria andCrowdTokenGreaterThanOrEqualTo(String value) {
            addCriterion("crowd_token >=", value, "crowdToken");
            return (Criteria) this;
        }

        public Criteria andCrowdTokenLessThan(String value) {
            addCriterion("crowd_token <", value, "crowdToken");
            return (Criteria) this;
        }

        public Criteria andCrowdTokenLessThanOrEqualTo(String value) {
            addCriterion("crowd_token <=", value, "crowdToken");
            return (Criteria) this;
        }

        public Criteria andCrowdTokenLike(String value) {
            addCriterion("crowd_token like", value, "crowdToken");
            return (Criteria) this;
        }

        public Criteria andCrowdTokenNotLike(String value) {
            addCriterion("crowd_token not like", value, "crowdToken");
            return (Criteria) this;
        }

        public Criteria andCrowdTokenIn(List<String> values) {
            addCriterion("crowd_token in", values, "crowdToken");
            return (Criteria) this;
        }

        public Criteria andCrowdTokenNotIn(List<String> values) {
            addCriterion("crowd_token not in", values, "crowdToken");
            return (Criteria) this;
        }

        public Criteria andCrowdTokenBetween(String value1, String value2) {
            addCriterion("crowd_token between", value1, value2, "crowdToken");
            return (Criteria) this;
        }

        public Criteria andCrowdTokenNotBetween(String value1, String value2) {
            addCriterion("crowd_token not between", value1, value2, "crowdToken");
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