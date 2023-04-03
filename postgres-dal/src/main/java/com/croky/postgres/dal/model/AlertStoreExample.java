package com.croky.postgres.dal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Croky.Zheng
 * @date 2023-03-06 17:19:16
*/
public class AlertStoreExample {
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
    public AlertStoreExample() {
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

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
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

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(String value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(String value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(String value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(String value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(String value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(String value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLike(String value) {
            addCriterion("store_id like", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotLike(String value) {
            addCriterion("store_id not like", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<String> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<String> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(String value1, String value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(String value1, String value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andMktTypeIsNull() {
            addCriterion("mkt_type is null");
            return (Criteria) this;
        }

        public Criteria andMktTypeIsNotNull() {
            addCriterion("mkt_type is not null");
            return (Criteria) this;
        }

        public Criteria andMktTypeEqualTo(String value) {
            addCriterion("mkt_type =", value, "mktType");
            return (Criteria) this;
        }

        public Criteria andMktTypeNotEqualTo(String value) {
            addCriterion("mkt_type <>", value, "mktType");
            return (Criteria) this;
        }

        public Criteria andMktTypeGreaterThan(String value) {
            addCriterion("mkt_type >", value, "mktType");
            return (Criteria) this;
        }

        public Criteria andMktTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mkt_type >=", value, "mktType");
            return (Criteria) this;
        }

        public Criteria andMktTypeLessThan(String value) {
            addCriterion("mkt_type <", value, "mktType");
            return (Criteria) this;
        }

        public Criteria andMktTypeLessThanOrEqualTo(String value) {
            addCriterion("mkt_type <=", value, "mktType");
            return (Criteria) this;
        }

        public Criteria andMktTypeLike(String value) {
            addCriterion("mkt_type like", value, "mktType");
            return (Criteria) this;
        }

        public Criteria andMktTypeNotLike(String value) {
            addCriterion("mkt_type not like", value, "mktType");
            return (Criteria) this;
        }

        public Criteria andMktTypeIn(List<String> values) {
            addCriterion("mkt_type in", values, "mktType");
            return (Criteria) this;
        }

        public Criteria andMktTypeNotIn(List<String> values) {
            addCriterion("mkt_type not in", values, "mktType");
            return (Criteria) this;
        }

        public Criteria andMktTypeBetween(String value1, String value2) {
            addCriterion("mkt_type between", value1, value2, "mktType");
            return (Criteria) this;
        }

        public Criteria andMktTypeNotBetween(String value1, String value2) {
            addCriterion("mkt_type not between", value1, value2, "mktType");
            return (Criteria) this;
        }

        public Criteria andTlIsNull() {
            addCriterion("tl is null");
            return (Criteria) this;
        }

        public Criteria andTlIsNotNull() {
            addCriterion("tl is not null");
            return (Criteria) this;
        }

        public Criteria andTlEqualTo(String value) {
            addCriterion("tl =", value, "tl");
            return (Criteria) this;
        }

        public Criteria andTlNotEqualTo(String value) {
            addCriterion("tl <>", value, "tl");
            return (Criteria) this;
        }

        public Criteria andTlGreaterThan(String value) {
            addCriterion("tl >", value, "tl");
            return (Criteria) this;
        }

        public Criteria andTlGreaterThanOrEqualTo(String value) {
            addCriterion("tl >=", value, "tl");
            return (Criteria) this;
        }

        public Criteria andTlLessThan(String value) {
            addCriterion("tl <", value, "tl");
            return (Criteria) this;
        }

        public Criteria andTlLessThanOrEqualTo(String value) {
            addCriterion("tl <=", value, "tl");
            return (Criteria) this;
        }

        public Criteria andTlLike(String value) {
            addCriterion("tl like", value, "tl");
            return (Criteria) this;
        }

        public Criteria andTlNotLike(String value) {
            addCriterion("tl not like", value, "tl");
            return (Criteria) this;
        }

        public Criteria andTlIn(List<String> values) {
            addCriterion("tl in", values, "tl");
            return (Criteria) this;
        }

        public Criteria andTlNotIn(List<String> values) {
            addCriterion("tl not in", values, "tl");
            return (Criteria) this;
        }

        public Criteria andTlBetween(String value1, String value2) {
            addCriterion("tl between", value1, value2, "tl");
            return (Criteria) this;
        }

        public Criteria andTlNotBetween(String value1, String value2) {
            addCriterion("tl not between", value1, value2, "tl");
            return (Criteria) this;
        }

        public Criteria andTlMinDayIsNull() {
            addCriterion("tl_min_day is null");
            return (Criteria) this;
        }

        public Criteria andTlMinDayIsNotNull() {
            addCriterion("tl_min_day is not null");
            return (Criteria) this;
        }

        public Criteria andTlMinDayEqualTo(Short value) {
            addCriterion("tl_min_day =", value, "tlMinDay");
            return (Criteria) this;
        }

        public Criteria andTlMinDayNotEqualTo(Short value) {
            addCriterion("tl_min_day <>", value, "tlMinDay");
            return (Criteria) this;
        }

        public Criteria andTlMinDayGreaterThan(Short value) {
            addCriterion("tl_min_day >", value, "tlMinDay");
            return (Criteria) this;
        }

        public Criteria andTlMinDayGreaterThanOrEqualTo(Short value) {
            addCriterion("tl_min_day >=", value, "tlMinDay");
            return (Criteria) this;
        }

        public Criteria andTlMinDayLessThan(Short value) {
            addCriterion("tl_min_day <", value, "tlMinDay");
            return (Criteria) this;
        }

        public Criteria andTlMinDayLessThanOrEqualTo(Short value) {
            addCriterion("tl_min_day <=", value, "tlMinDay");
            return (Criteria) this;
        }

        public Criteria andTlMinDayIn(List<Short> values) {
            addCriterion("tl_min_day in", values, "tlMinDay");
            return (Criteria) this;
        }

        public Criteria andTlMinDayNotIn(List<Short> values) {
            addCriterion("tl_min_day not in", values, "tlMinDay");
            return (Criteria) this;
        }

        public Criteria andTlMinDayBetween(Short value1, Short value2) {
            addCriterion("tl_min_day between", value1, value2, "tlMinDay");
            return (Criteria) this;
        }

        public Criteria andTlMinDayNotBetween(Short value1, Short value2) {
            addCriterion("tl_min_day not between", value1, value2, "tlMinDay");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicMinDayIsNull() {
            addCriterion("pic_min_day is null");
            return (Criteria) this;
        }

        public Criteria andPicMinDayIsNotNull() {
            addCriterion("pic_min_day is not null");
            return (Criteria) this;
        }

        public Criteria andPicMinDayEqualTo(Short value) {
            addCriterion("pic_min_day =", value, "picMinDay");
            return (Criteria) this;
        }

        public Criteria andPicMinDayNotEqualTo(Short value) {
            addCriterion("pic_min_day <>", value, "picMinDay");
            return (Criteria) this;
        }

        public Criteria andPicMinDayGreaterThan(Short value) {
            addCriterion("pic_min_day >", value, "picMinDay");
            return (Criteria) this;
        }

        public Criteria andPicMinDayGreaterThanOrEqualTo(Short value) {
            addCriterion("pic_min_day >=", value, "picMinDay");
            return (Criteria) this;
        }

        public Criteria andPicMinDayLessThan(Short value) {
            addCriterion("pic_min_day <", value, "picMinDay");
            return (Criteria) this;
        }

        public Criteria andPicMinDayLessThanOrEqualTo(Short value) {
            addCriterion("pic_min_day <=", value, "picMinDay");
            return (Criteria) this;
        }

        public Criteria andPicMinDayIn(List<Short> values) {
            addCriterion("pic_min_day in", values, "picMinDay");
            return (Criteria) this;
        }

        public Criteria andPicMinDayNotIn(List<Short> values) {
            addCriterion("pic_min_day not in", values, "picMinDay");
            return (Criteria) this;
        }

        public Criteria andPicMinDayBetween(Short value1, Short value2) {
            addCriterion("pic_min_day between", value1, value2, "picMinDay");
            return (Criteria) this;
        }

        public Criteria andPicMinDayNotBetween(Short value1, Short value2) {
            addCriterion("pic_min_day not between", value1, value2, "picMinDay");
            return (Criteria) this;
        }

        public Criteria andMktPicIsNull() {
            addCriterion("mkt_pic is null");
            return (Criteria) this;
        }

        public Criteria andMktPicIsNotNull() {
            addCriterion("mkt_pic is not null");
            return (Criteria) this;
        }

        public Criteria andMktPicEqualTo(String value) {
            addCriterion("mkt_pic =", value, "mktPic");
            return (Criteria) this;
        }

        public Criteria andMktPicNotEqualTo(String value) {
            addCriterion("mkt_pic <>", value, "mktPic");
            return (Criteria) this;
        }

        public Criteria andMktPicGreaterThan(String value) {
            addCriterion("mkt_pic >", value, "mktPic");
            return (Criteria) this;
        }

        public Criteria andMktPicGreaterThanOrEqualTo(String value) {
            addCriterion("mkt_pic >=", value, "mktPic");
            return (Criteria) this;
        }

        public Criteria andMktPicLessThan(String value) {
            addCriterion("mkt_pic <", value, "mktPic");
            return (Criteria) this;
        }

        public Criteria andMktPicLessThanOrEqualTo(String value) {
            addCriterion("mkt_pic <=", value, "mktPic");
            return (Criteria) this;
        }

        public Criteria andMktPicLike(String value) {
            addCriterion("mkt_pic like", value, "mktPic");
            return (Criteria) this;
        }

        public Criteria andMktPicNotLike(String value) {
            addCriterion("mkt_pic not like", value, "mktPic");
            return (Criteria) this;
        }

        public Criteria andMktPicIn(List<String> values) {
            addCriterion("mkt_pic in", values, "mktPic");
            return (Criteria) this;
        }

        public Criteria andMktPicNotIn(List<String> values) {
            addCriterion("mkt_pic not in", values, "mktPic");
            return (Criteria) this;
        }

        public Criteria andMktPicBetween(String value1, String value2) {
            addCriterion("mkt_pic between", value1, value2, "mktPic");
            return (Criteria) this;
        }

        public Criteria andMktPicNotBetween(String value1, String value2) {
            addCriterion("mkt_pic not between", value1, value2, "mktPic");
            return (Criteria) this;
        }

        public Criteria andMktPicMinDayIsNull() {
            addCriterion("mkt_pic_min_day is null");
            return (Criteria) this;
        }

        public Criteria andMktPicMinDayIsNotNull() {
            addCriterion("mkt_pic_min_day is not null");
            return (Criteria) this;
        }

        public Criteria andMktPicMinDayEqualTo(Short value) {
            addCriterion("mkt_pic_min_day =", value, "mktPicMinDay");
            return (Criteria) this;
        }

        public Criteria andMktPicMinDayNotEqualTo(Short value) {
            addCriterion("mkt_pic_min_day <>", value, "mktPicMinDay");
            return (Criteria) this;
        }

        public Criteria andMktPicMinDayGreaterThan(Short value) {
            addCriterion("mkt_pic_min_day >", value, "mktPicMinDay");
            return (Criteria) this;
        }

        public Criteria andMktPicMinDayGreaterThanOrEqualTo(Short value) {
            addCriterion("mkt_pic_min_day >=", value, "mktPicMinDay");
            return (Criteria) this;
        }

        public Criteria andMktPicMinDayLessThan(Short value) {
            addCriterion("mkt_pic_min_day <", value, "mktPicMinDay");
            return (Criteria) this;
        }

        public Criteria andMktPicMinDayLessThanOrEqualTo(Short value) {
            addCriterion("mkt_pic_min_day <=", value, "mktPicMinDay");
            return (Criteria) this;
        }

        public Criteria andMktPicMinDayIn(List<Short> values) {
            addCriterion("mkt_pic_min_day in", values, "mktPicMinDay");
            return (Criteria) this;
        }

        public Criteria andMktPicMinDayNotIn(List<Short> values) {
            addCriterion("mkt_pic_min_day not in", values, "mktPicMinDay");
            return (Criteria) this;
        }

        public Criteria andMktPicMinDayBetween(Short value1, Short value2) {
            addCriterion("mkt_pic_min_day between", value1, value2, "mktPicMinDay");
            return (Criteria) this;
        }

        public Criteria andMktPicMinDayNotBetween(Short value1, Short value2) {
            addCriterion("mkt_pic_min_day not between", value1, value2, "mktPicMinDay");
            return (Criteria) this;
        }

        public Criteria andIsManualIsNull() {
            addCriterion("is_manual is null");
            return (Criteria) this;
        }

        public Criteria andIsManualIsNotNull() {
            addCriterion("is_manual is not null");
            return (Criteria) this;
        }

        public Criteria andIsManualEqualTo(String value) {
            addCriterion("is_manual =", value, "isManual");
            return (Criteria) this;
        }

        public Criteria andIsManualNotEqualTo(String value) {
            addCriterion("is_manual <>", value, "isManual");
            return (Criteria) this;
        }

        public Criteria andIsManualGreaterThan(String value) {
            addCriterion("is_manual >", value, "isManual");
            return (Criteria) this;
        }

        public Criteria andIsManualGreaterThanOrEqualTo(String value) {
            addCriterion("is_manual >=", value, "isManual");
            return (Criteria) this;
        }

        public Criteria andIsManualLessThan(String value) {
            addCriterion("is_manual <", value, "isManual");
            return (Criteria) this;
        }

        public Criteria andIsManualLessThanOrEqualTo(String value) {
            addCriterion("is_manual <=", value, "isManual");
            return (Criteria) this;
        }

        public Criteria andIsManualLike(String value) {
            addCriterion("is_manual like", value, "isManual");
            return (Criteria) this;
        }

        public Criteria andIsManualNotLike(String value) {
            addCriterion("is_manual not like", value, "isManual");
            return (Criteria) this;
        }

        public Criteria andIsManualIn(List<String> values) {
            addCriterion("is_manual in", values, "isManual");
            return (Criteria) this;
        }

        public Criteria andIsManualNotIn(List<String> values) {
            addCriterion("is_manual not in", values, "isManual");
            return (Criteria) this;
        }

        public Criteria andIsManualBetween(String value1, String value2) {
            addCriterion("is_manual between", value1, value2, "isManual");
            return (Criteria) this;
        }

        public Criteria andIsManualNotBetween(String value1, String value2) {
            addCriterion("is_manual not between", value1, value2, "isManual");
            return (Criteria) this;
        }

        public Criteria andRoiBIsNull() {
            addCriterion("roi_b is null");
            return (Criteria) this;
        }

        public Criteria andRoiBIsNotNull() {
            addCriterion("roi_b is not null");
            return (Criteria) this;
        }

        public Criteria andRoiBEqualTo(String value) {
            addCriterion("roi_b =", value, "roiB");
            return (Criteria) this;
        }

        public Criteria andRoiBNotEqualTo(String value) {
            addCriterion("roi_b <>", value, "roiB");
            return (Criteria) this;
        }

        public Criteria andRoiBGreaterThan(String value) {
            addCriterion("roi_b >", value, "roiB");
            return (Criteria) this;
        }

        public Criteria andRoiBGreaterThanOrEqualTo(String value) {
            addCriterion("roi_b >=", value, "roiB");
            return (Criteria) this;
        }

        public Criteria andRoiBLessThan(String value) {
            addCriterion("roi_b <", value, "roiB");
            return (Criteria) this;
        }

        public Criteria andRoiBLessThanOrEqualTo(String value) {
            addCriterion("roi_b <=", value, "roiB");
            return (Criteria) this;
        }

        public Criteria andRoiBLike(String value) {
            addCriterion("roi_b like", value, "roiB");
            return (Criteria) this;
        }

        public Criteria andRoiBNotLike(String value) {
            addCriterion("roi_b not like", value, "roiB");
            return (Criteria) this;
        }

        public Criteria andRoiBIn(List<String> values) {
            addCriterion("roi_b in", values, "roiB");
            return (Criteria) this;
        }

        public Criteria andRoiBNotIn(List<String> values) {
            addCriterion("roi_b not in", values, "roiB");
            return (Criteria) this;
        }

        public Criteria andRoiBBetween(String value1, String value2) {
            addCriterion("roi_b between", value1, value2, "roiB");
            return (Criteria) this;
        }

        public Criteria andRoiBNotBetween(String value1, String value2) {
            addCriterion("roi_b not between", value1, value2, "roiB");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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