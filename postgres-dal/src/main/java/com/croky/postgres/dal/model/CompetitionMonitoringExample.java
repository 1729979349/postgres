package com.croky.postgres.dal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Croky.Zheng
 * @date 2023-03-07 15:30:24
*/
public class CompetitionMonitoringExample {
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
    public CompetitionMonitoringExample() {
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

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andLazadaIsNull() {
            addCriterion("lazada is null");
            return (Criteria) this;
        }

        public Criteria andLazadaIsNotNull() {
            addCriterion("lazada is not null");
            return (Criteria) this;
        }

        public Criteria andLazadaEqualTo(String value) {
            addCriterion("lazada =", value, "lazada");
            return (Criteria) this;
        }

        public Criteria andLazadaNotEqualTo(String value) {
            addCriterion("lazada <>", value, "lazada");
            return (Criteria) this;
        }

        public Criteria andLazadaGreaterThan(String value) {
            addCriterion("lazada >", value, "lazada");
            return (Criteria) this;
        }

        public Criteria andLazadaGreaterThanOrEqualTo(String value) {
            addCriterion("lazada >=", value, "lazada");
            return (Criteria) this;
        }

        public Criteria andLazadaLessThan(String value) {
            addCriterion("lazada <", value, "lazada");
            return (Criteria) this;
        }

        public Criteria andLazadaLessThanOrEqualTo(String value) {
            addCriterion("lazada <=", value, "lazada");
            return (Criteria) this;
        }

        public Criteria andLazadaLike(String value) {
            addCriterion("lazada like", value, "lazada");
            return (Criteria) this;
        }

        public Criteria andLazadaNotLike(String value) {
            addCriterion("lazada not like", value, "lazada");
            return (Criteria) this;
        }

        public Criteria andLazadaIn(List<String> values) {
            addCriterion("lazada in", values, "lazada");
            return (Criteria) this;
        }

        public Criteria andLazadaNotIn(List<String> values) {
            addCriterion("lazada not in", values, "lazada");
            return (Criteria) this;
        }

        public Criteria andLazadaBetween(String value1, String value2) {
            addCriterion("lazada between", value1, value2, "lazada");
            return (Criteria) this;
        }

        public Criteria andLazadaNotBetween(String value1, String value2) {
            addCriterion("lazada not between", value1, value2, "lazada");
            return (Criteria) this;
        }

        public Criteria andShopeeIsNull() {
            addCriterion("shopee is null");
            return (Criteria) this;
        }

        public Criteria andShopeeIsNotNull() {
            addCriterion("shopee is not null");
            return (Criteria) this;
        }

        public Criteria andShopeeEqualTo(String value) {
            addCriterion("shopee =", value, "shopee");
            return (Criteria) this;
        }

        public Criteria andShopeeNotEqualTo(String value) {
            addCriterion("shopee <>", value, "shopee");
            return (Criteria) this;
        }

        public Criteria andShopeeGreaterThan(String value) {
            addCriterion("shopee >", value, "shopee");
            return (Criteria) this;
        }

        public Criteria andShopeeGreaterThanOrEqualTo(String value) {
            addCriterion("shopee >=", value, "shopee");
            return (Criteria) this;
        }

        public Criteria andShopeeLessThan(String value) {
            addCriterion("shopee <", value, "shopee");
            return (Criteria) this;
        }

        public Criteria andShopeeLessThanOrEqualTo(String value) {
            addCriterion("shopee <=", value, "shopee");
            return (Criteria) this;
        }

        public Criteria andShopeeLike(String value) {
            addCriterion("shopee like", value, "shopee");
            return (Criteria) this;
        }

        public Criteria andShopeeNotLike(String value) {
            addCriterion("shopee not like", value, "shopee");
            return (Criteria) this;
        }

        public Criteria andShopeeIn(List<String> values) {
            addCriterion("shopee in", values, "shopee");
            return (Criteria) this;
        }

        public Criteria andShopeeNotIn(List<String> values) {
            addCriterion("shopee not in", values, "shopee");
            return (Criteria) this;
        }

        public Criteria andShopeeBetween(String value1, String value2) {
            addCriterion("shopee between", value1, value2, "shopee");
            return (Criteria) this;
        }

        public Criteria andShopeeNotBetween(String value1, String value2) {
            addCriterion("shopee not between", value1, value2, "shopee");
            return (Criteria) this;
        }

        public Criteria andShopeeShopIdIsNull() {
            addCriterion("shopee_shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopeeShopIdIsNotNull() {
            addCriterion("shopee_shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopeeShopIdEqualTo(String value) {
            addCriterion("shopee_shop_id =", value, "shopeeShopId");
            return (Criteria) this;
        }

        public Criteria andShopeeShopIdNotEqualTo(String value) {
            addCriterion("shopee_shop_id <>", value, "shopeeShopId");
            return (Criteria) this;
        }

        public Criteria andShopeeShopIdGreaterThan(String value) {
            addCriterion("shopee_shop_id >", value, "shopeeShopId");
            return (Criteria) this;
        }

        public Criteria andShopeeShopIdGreaterThanOrEqualTo(String value) {
            addCriterion("shopee_shop_id >=", value, "shopeeShopId");
            return (Criteria) this;
        }

        public Criteria andShopeeShopIdLessThan(String value) {
            addCriterion("shopee_shop_id <", value, "shopeeShopId");
            return (Criteria) this;
        }

        public Criteria andShopeeShopIdLessThanOrEqualTo(String value) {
            addCriterion("shopee_shop_id <=", value, "shopeeShopId");
            return (Criteria) this;
        }

        public Criteria andShopeeShopIdLike(String value) {
            addCriterion("shopee_shop_id like", value, "shopeeShopId");
            return (Criteria) this;
        }

        public Criteria andShopeeShopIdNotLike(String value) {
            addCriterion("shopee_shop_id not like", value, "shopeeShopId");
            return (Criteria) this;
        }

        public Criteria andShopeeShopIdIn(List<String> values) {
            addCriterion("shopee_shop_id in", values, "shopeeShopId");
            return (Criteria) this;
        }

        public Criteria andShopeeShopIdNotIn(List<String> values) {
            addCriterion("shopee_shop_id not in", values, "shopeeShopId");
            return (Criteria) this;
        }

        public Criteria andShopeeShopIdBetween(String value1, String value2) {
            addCriterion("shopee_shop_id between", value1, value2, "shopeeShopId");
            return (Criteria) this;
        }

        public Criteria andShopeeShopIdNotBetween(String value1, String value2) {
            addCriterion("shopee_shop_id not between", value1, value2, "shopeeShopId");
            return (Criteria) this;
        }

        public Criteria andQoo10IsNull() {
            addCriterion("qoo10 is null");
            return (Criteria) this;
        }

        public Criteria andQoo10IsNotNull() {
            addCriterion("qoo10 is not null");
            return (Criteria) this;
        }

        public Criteria andQoo10EqualTo(String value) {
            addCriterion("qoo10 =", value, "qoo10");
            return (Criteria) this;
        }

        public Criteria andQoo10NotEqualTo(String value) {
            addCriterion("qoo10 <>", value, "qoo10");
            return (Criteria) this;
        }

        public Criteria andQoo10GreaterThan(String value) {
            addCriterion("qoo10 >", value, "qoo10");
            return (Criteria) this;
        }

        public Criteria andQoo10GreaterThanOrEqualTo(String value) {
            addCriterion("qoo10 >=", value, "qoo10");
            return (Criteria) this;
        }

        public Criteria andQoo10LessThan(String value) {
            addCriterion("qoo10 <", value, "qoo10");
            return (Criteria) this;
        }

        public Criteria andQoo10LessThanOrEqualTo(String value) {
            addCriterion("qoo10 <=", value, "qoo10");
            return (Criteria) this;
        }

        public Criteria andQoo10Like(String value) {
            addCriterion("qoo10 like", value, "qoo10");
            return (Criteria) this;
        }

        public Criteria andQoo10NotLike(String value) {
            addCriterion("qoo10 not like", value, "qoo10");
            return (Criteria) this;
        }

        public Criteria andQoo10In(List<String> values) {
            addCriterion("qoo10 in", values, "qoo10");
            return (Criteria) this;
        }

        public Criteria andQoo10NotIn(List<String> values) {
            addCriterion("qoo10 not in", values, "qoo10");
            return (Criteria) this;
        }

        public Criteria andQoo10Between(String value1, String value2) {
            addCriterion("qoo10 between", value1, value2, "qoo10");
            return (Criteria) this;
        }

        public Criteria andQoo10NotBetween(String value1, String value2) {
            addCriterion("qoo10 not between", value1, value2, "qoo10");
            return (Criteria) this;
        }

        public Criteria andTmallIsNull() {
            addCriterion("tmall is null");
            return (Criteria) this;
        }

        public Criteria andTmallIsNotNull() {
            addCriterion("tmall is not null");
            return (Criteria) this;
        }

        public Criteria andTmallEqualTo(String value) {
            addCriterion("tmall =", value, "tmall");
            return (Criteria) this;
        }

        public Criteria andTmallNotEqualTo(String value) {
            addCriterion("tmall <>", value, "tmall");
            return (Criteria) this;
        }

        public Criteria andTmallGreaterThan(String value) {
            addCriterion("tmall >", value, "tmall");
            return (Criteria) this;
        }

        public Criteria andTmallGreaterThanOrEqualTo(String value) {
            addCriterion("tmall >=", value, "tmall");
            return (Criteria) this;
        }

        public Criteria andTmallLessThan(String value) {
            addCriterion("tmall <", value, "tmall");
            return (Criteria) this;
        }

        public Criteria andTmallLessThanOrEqualTo(String value) {
            addCriterion("tmall <=", value, "tmall");
            return (Criteria) this;
        }

        public Criteria andTmallLike(String value) {
            addCriterion("tmall like", value, "tmall");
            return (Criteria) this;
        }

        public Criteria andTmallNotLike(String value) {
            addCriterion("tmall not like", value, "tmall");
            return (Criteria) this;
        }

        public Criteria andTmallIn(List<String> values) {
            addCriterion("tmall in", values, "tmall");
            return (Criteria) this;
        }

        public Criteria andTmallNotIn(List<String> values) {
            addCriterion("tmall not in", values, "tmall");
            return (Criteria) this;
        }

        public Criteria andTmallBetween(String value1, String value2) {
            addCriterion("tmall between", value1, value2, "tmall");
            return (Criteria) this;
        }

        public Criteria andTmallNotBetween(String value1, String value2) {
            addCriterion("tmall not between", value1, value2, "tmall");
            return (Criteria) this;
        }

        public Criteria andJdIsNull() {
            addCriterion("jd is null");
            return (Criteria) this;
        }

        public Criteria andJdIsNotNull() {
            addCriterion("jd is not null");
            return (Criteria) this;
        }

        public Criteria andJdEqualTo(String value) {
            addCriterion("jd =", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdNotEqualTo(String value) {
            addCriterion("jd <>", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdGreaterThan(String value) {
            addCriterion("jd >", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdGreaterThanOrEqualTo(String value) {
            addCriterion("jd >=", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdLessThan(String value) {
            addCriterion("jd <", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdLessThanOrEqualTo(String value) {
            addCriterion("jd <=", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdLike(String value) {
            addCriterion("jd like", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdNotLike(String value) {
            addCriterion("jd not like", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdIn(List<String> values) {
            addCriterion("jd in", values, "jd");
            return (Criteria) this;
        }

        public Criteria andJdNotIn(List<String> values) {
            addCriterion("jd not in", values, "jd");
            return (Criteria) this;
        }

        public Criteria andJdBetween(String value1, String value2) {
            addCriterion("jd between", value1, value2, "jd");
            return (Criteria) this;
        }

        public Criteria andJdNotBetween(String value1, String value2) {
            addCriterion("jd not between", value1, value2, "jd");
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