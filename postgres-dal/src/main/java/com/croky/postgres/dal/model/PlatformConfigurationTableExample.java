package com.croky.postgres.dal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Croky.Zheng
 * @date 2022-12-07 16:26:41
*/
public class PlatformConfigurationTableExample {
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
    public PlatformConfigurationTableExample() {
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

        public Criteria andActiveStatusIsNull() {
            addCriterion("active_status is null");
            return (Criteria) this;
        }

        public Criteria andActiveStatusIsNotNull() {
            addCriterion("active_status is not null");
            return (Criteria) this;
        }

        public Criteria andActiveStatusEqualTo(String value) {
            addCriterion("active_status =", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusNotEqualTo(String value) {
            addCriterion("active_status <>", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusGreaterThan(String value) {
            addCriterion("active_status >", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusGreaterThanOrEqualTo(String value) {
            addCriterion("active_status >=", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusLessThan(String value) {
            addCriterion("active_status <", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusLessThanOrEqualTo(String value) {
            addCriterion("active_status <=", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusLike(String value) {
            addCriterion("active_status like", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusNotLike(String value) {
            addCriterion("active_status not like", value, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusIn(List<String> values) {
            addCriterion("active_status in", values, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusNotIn(List<String> values) {
            addCriterion("active_status not in", values, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusBetween(String value1, String value2) {
            addCriterion("active_status between", value1, value2, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStatusNotBetween(String value1, String value2) {
            addCriterion("active_status not between", value1, value2, "activeStatus");
            return (Criteria) this;
        }

        public Criteria andShopCountryIsNull() {
            addCriterion("shop_country is null");
            return (Criteria) this;
        }

        public Criteria andShopCountryIsNotNull() {
            addCriterion("shop_country is not null");
            return (Criteria) this;
        }

        public Criteria andShopCountryEqualTo(String value) {
            addCriterion("shop_country =", value, "shopCountry");
            return (Criteria) this;
        }

        public Criteria andShopCountryNotEqualTo(String value) {
            addCriterion("shop_country <>", value, "shopCountry");
            return (Criteria) this;
        }

        public Criteria andShopCountryGreaterThan(String value) {
            addCriterion("shop_country >", value, "shopCountry");
            return (Criteria) this;
        }

        public Criteria andShopCountryGreaterThanOrEqualTo(String value) {
            addCriterion("shop_country >=", value, "shopCountry");
            return (Criteria) this;
        }

        public Criteria andShopCountryLessThan(String value) {
            addCriterion("shop_country <", value, "shopCountry");
            return (Criteria) this;
        }

        public Criteria andShopCountryLessThanOrEqualTo(String value) {
            addCriterion("shop_country <=", value, "shopCountry");
            return (Criteria) this;
        }

        public Criteria andShopCountryLike(String value) {
            addCriterion("shop_country like", value, "shopCountry");
            return (Criteria) this;
        }

        public Criteria andShopCountryNotLike(String value) {
            addCriterion("shop_country not like", value, "shopCountry");
            return (Criteria) this;
        }

        public Criteria andShopCountryIn(List<String> values) {
            addCriterion("shop_country in", values, "shopCountry");
            return (Criteria) this;
        }

        public Criteria andShopCountryNotIn(List<String> values) {
            addCriterion("shop_country not in", values, "shopCountry");
            return (Criteria) this;
        }

        public Criteria andShopCountryBetween(String value1, String value2) {
            addCriterion("shop_country between", value1, value2, "shopCountry");
            return (Criteria) this;
        }

        public Criteria andShopCountryNotBetween(String value1, String value2) {
            addCriterion("shop_country not between", value1, value2, "shopCountry");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
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
            addCriterion("store_id !=''");
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

        public Criteria andLoginUrlIsNull() {
            addCriterion("login_url is null");
            return (Criteria) this;
        }

        public Criteria andLoginUrlIsNotNull() {
            addCriterion("login_url is not null");
            return (Criteria) this;
        }

        public Criteria andLoginUrlEqualTo(String value) {
            addCriterion("login_url =", value, "loginUrl");
            return (Criteria) this;
        }

        public Criteria andLoginUrlNotEqualTo(String value) {
            addCriterion("login_url <>", value, "loginUrl");
            return (Criteria) this;
        }

        public Criteria andLoginUrlGreaterThan(String value) {
            addCriterion("login_url >", value, "loginUrl");
            return (Criteria) this;
        }

        public Criteria andLoginUrlGreaterThanOrEqualTo(String value) {
            addCriterion("login_url >=", value, "loginUrl");
            return (Criteria) this;
        }

        public Criteria andLoginUrlLessThan(String value) {
            addCriterion("login_url <", value, "loginUrl");
            return (Criteria) this;
        }

        public Criteria andLoginUrlLessThanOrEqualTo(String value) {
            addCriterion("login_url <=", value, "loginUrl");
            return (Criteria) this;
        }

        public Criteria andLoginUrlLike(String value) {
            addCriterion("login_url like", value, "loginUrl");
            return (Criteria) this;
        }

        public Criteria andLoginUrlNotLike(String value) {
            addCriterion("login_url not like", value, "loginUrl");
            return (Criteria) this;
        }

        public Criteria andLoginUrlIn(List<String> values) {
            addCriterion("login_url in", values, "loginUrl");
            return (Criteria) this;
        }

        public Criteria andLoginUrlNotIn(List<String> values) {
            addCriterion("login_url not in", values, "loginUrl");
            return (Criteria) this;
        }

        public Criteria andLoginUrlBetween(String value1, String value2) {
            addCriterion("login_url between", value1, value2, "loginUrl");
            return (Criteria) this;
        }

        public Criteria andLoginUrlNotBetween(String value1, String value2) {
            addCriterion("login_url not between", value1, value2, "loginUrl");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andBindedEmailIsNull() {
            addCriterion("binded_email is null");
            return (Criteria) this;
        }

        public Criteria andBindedEmailIsNotNull() {
            addCriterion("binded_email is not null");
            return (Criteria) this;
        }

        public Criteria andBindedEmailEqualTo(String value) {
            addCriterion("binded_email =", value, "bindedEmail");
            return (Criteria) this;
        }

        public Criteria andBindedEmailNotEqualTo(String value) {
            addCriterion("binded_email <>", value, "bindedEmail");
            return (Criteria) this;
        }

        public Criteria andBindedEmailGreaterThan(String value) {
            addCriterion("binded_email >", value, "bindedEmail");
            return (Criteria) this;
        }

        public Criteria andBindedEmailGreaterThanOrEqualTo(String value) {
            addCriterion("binded_email >=", value, "bindedEmail");
            return (Criteria) this;
        }

        public Criteria andBindedEmailLessThan(String value) {
            addCriterion("binded_email <", value, "bindedEmail");
            return (Criteria) this;
        }

        public Criteria andBindedEmailLessThanOrEqualTo(String value) {
            addCriterion("binded_email <=", value, "bindedEmail");
            return (Criteria) this;
        }

        public Criteria andBindedEmailLike(String value) {
            addCriterion("binded_email like", value, "bindedEmail");
            return (Criteria) this;
        }

        public Criteria andBindedEmailNotLike(String value) {
            addCriterion("binded_email not like", value, "bindedEmail");
            return (Criteria) this;
        }

        public Criteria andBindedEmailIn(List<String> values) {
            addCriterion("binded_email in", values, "bindedEmail");
            return (Criteria) this;
        }

        public Criteria andBindedEmailNotIn(List<String> values) {
            addCriterion("binded_email not in", values, "bindedEmail");
            return (Criteria) this;
        }

        public Criteria andBindedEmailBetween(String value1, String value2) {
            addCriterion("binded_email between", value1, value2, "bindedEmail");
            return (Criteria) this;
        }

        public Criteria andBindedEmailNotBetween(String value1, String value2) {
            addCriterion("binded_email not between", value1, value2, "bindedEmail");
            return (Criteria) this;
        }

        public Criteria andBindedPhoneIsNull() {
            addCriterion("binded_phone is null");
            return (Criteria) this;
        }

        public Criteria andBindedPhoneIsNotNull() {
            addCriterion("binded_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBindedPhoneEqualTo(String value) {
            addCriterion("binded_phone =", value, "bindedPhone");
            return (Criteria) this;
        }

        public Criteria andBindedPhoneNotEqualTo(String value) {
            addCriterion("binded_phone <>", value, "bindedPhone");
            return (Criteria) this;
        }

        public Criteria andBindedPhoneGreaterThan(String value) {
            addCriterion("binded_phone >", value, "bindedPhone");
            return (Criteria) this;
        }

        public Criteria andBindedPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("binded_phone >=", value, "bindedPhone");
            return (Criteria) this;
        }

        public Criteria andBindedPhoneLessThan(String value) {
            addCriterion("binded_phone <", value, "bindedPhone");
            return (Criteria) this;
        }

        public Criteria andBindedPhoneLessThanOrEqualTo(String value) {
            addCriterion("binded_phone <=", value, "bindedPhone");
            return (Criteria) this;
        }

        public Criteria andBindedPhoneLike(String value) {
            addCriterion("binded_phone like", value, "bindedPhone");
            return (Criteria) this;
        }

        public Criteria andBindedPhoneNotLike(String value) {
            addCriterion("binded_phone not like", value, "bindedPhone");
            return (Criteria) this;
        }

        public Criteria andBindedPhoneIn(List<String> values) {
            addCriterion("binded_phone in", values, "bindedPhone");
            return (Criteria) this;
        }

        public Criteria andBindedPhoneNotIn(List<String> values) {
            addCriterion("binded_phone not in", values, "bindedPhone");
            return (Criteria) this;
        }

        public Criteria andBindedPhoneBetween(String value1, String value2) {
            addCriterion("binded_phone between", value1, value2, "bindedPhone");
            return (Criteria) this;
        }

        public Criteria andBindedPhoneNotBetween(String value1, String value2) {
            addCriterion("binded_phone not between", value1, value2, "bindedPhone");
            return (Criteria) this;
        }

        public Criteria andDataExtractionIsNull() {
            addCriterion("data_extraction is null");
            return (Criteria) this;
        }

        public Criteria andDataExtractionIsNotNull() {
            addCriterion("data_extraction is not null");
            return (Criteria) this;
        }

        public Criteria andDataExtractionEqualTo(String value) {
            addCriterion("data_extraction =", value, "dataExtraction");
            return (Criteria) this;
        }

        public Criteria andDataExtractionNotEqualTo(String value) {
            addCriterion("data_extraction <>", value, "dataExtraction");
            return (Criteria) this;
        }

        public Criteria andDataExtractionGreaterThan(String value) {
            addCriterion("data_extraction >", value, "dataExtraction");
            return (Criteria) this;
        }

        public Criteria andDataExtractionGreaterThanOrEqualTo(String value) {
            addCriterion("data_extraction >=", value, "dataExtraction");
            return (Criteria) this;
        }

        public Criteria andDataExtractionLessThan(String value) {
            addCriterion("data_extraction <", value, "dataExtraction");
            return (Criteria) this;
        }

        public Criteria andDataExtractionLessThanOrEqualTo(String value) {
            addCriterion("data_extraction <=", value, "dataExtraction");
            return (Criteria) this;
        }

        public Criteria andDataExtractionLike(String value) {
            addCriterion("data_extraction like", value, "dataExtraction");
            return (Criteria) this;
        }

        public Criteria andDataExtractionNotLike(String value) {
            addCriterion("data_extraction not like", value, "dataExtraction");
            return (Criteria) this;
        }

        public Criteria andDataExtractionIn(List<String> values) {
            addCriterion("data_extraction in", values, "dataExtraction");
            return (Criteria) this;
        }

        public Criteria andDataExtractionNotIn(List<String> values) {
            addCriterion("data_extraction not in", values, "dataExtraction");
            return (Criteria) this;
        }

        public Criteria andDataExtractionBetween(String value1, String value2) {
            addCriterion("data_extraction between", value1, value2, "dataExtraction");
            return (Criteria) this;
        }

        public Criteria andDataExtractionNotBetween(String value1, String value2) {
            addCriterion("data_extraction not between", value1, value2, "dataExtraction");
            return (Criteria) this;
        }

        public Criteria andPasswordFailedIsNull() {
            addCriterion("password_failed is null");
            return (Criteria) this;
        }

        public Criteria andPasswordFailedIsNotNull() {
            addCriterion("password_failed is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordFailedEqualTo(String value) {
            addCriterion("password_failed =", value, "passwordFailed");
            return (Criteria) this;
        }

        public Criteria andPasswordFailedNotEqualTo(String value) {
            addCriterion("password_failed <>", value, "passwordFailed");
            return (Criteria) this;
        }

        public Criteria andPasswordFailedGreaterThan(String value) {
            addCriterion("password_failed >", value, "passwordFailed");
            return (Criteria) this;
        }

        public Criteria andPasswordFailedGreaterThanOrEqualTo(String value) {
            addCriterion("password_failed >=", value, "passwordFailed");
            return (Criteria) this;
        }

        public Criteria andPasswordFailedLessThan(String value) {
            addCriterion("password_failed <", value, "passwordFailed");
            return (Criteria) this;
        }

        public Criteria andPasswordFailedLessThanOrEqualTo(String value) {
            addCriterion("password_failed <=", value, "passwordFailed");
            return (Criteria) this;
        }

        public Criteria andPasswordFailedLike(String value) {
            addCriterion("password_failed like", value, "passwordFailed");
            return (Criteria) this;
        }

        public Criteria andPasswordFailedNotLike(String value) {
            addCriterion("password_failed not like", value, "passwordFailed");
            return (Criteria) this;
        }

        public Criteria andPasswordFailedIn(List<String> values) {
            addCriterion("password_failed in", values, "passwordFailed");
            return (Criteria) this;
        }

        public Criteria andPasswordFailedNotIn(List<String> values) {
            addCriterion("password_failed not in", values, "passwordFailed");
            return (Criteria) this;
        }

        public Criteria andPasswordFailedBetween(String value1, String value2) {
            addCriterion("password_failed between", value1, value2, "passwordFailed");
            return (Criteria) this;
        }

        public Criteria andPasswordFailedNotBetween(String value1, String value2) {
            addCriterion("password_failed not between", value1, value2, "passwordFailed");
            return (Criteria) this;
        }

        public Criteria andEmailFailedIsNull() {
            addCriterion("email_failed is null");
            return (Criteria) this;
        }

        public Criteria andEmailFailedIsNotNull() {
            addCriterion("email_failed is not null");
            return (Criteria) this;
        }

        public Criteria andEmailFailedEqualTo(String value) {
            addCriterion("email_failed =", value, "emailFailed");
            return (Criteria) this;
        }

        public Criteria andEmailFailedNotEqualTo(String value) {
            addCriterion("email_failed <>", value, "emailFailed");
            return (Criteria) this;
        }

        public Criteria andEmailFailedGreaterThan(String value) {
            addCriterion("email_failed >", value, "emailFailed");
            return (Criteria) this;
        }

        public Criteria andEmailFailedGreaterThanOrEqualTo(String value) {
            addCriterion("email_failed >=", value, "emailFailed");
            return (Criteria) this;
        }

        public Criteria andEmailFailedLessThan(String value) {
            addCriterion("email_failed <", value, "emailFailed");
            return (Criteria) this;
        }

        public Criteria andEmailFailedLessThanOrEqualTo(String value) {
            addCriterion("email_failed <=", value, "emailFailed");
            return (Criteria) this;
        }

        public Criteria andEmailFailedLike(String value) {
            addCriterion("email_failed like", value, "emailFailed");
            return (Criteria) this;
        }

        public Criteria andEmailFailedNotLike(String value) {
            addCriterion("email_failed not like", value, "emailFailed");
            return (Criteria) this;
        }

        public Criteria andEmailFailedIn(List<String> values) {
            addCriterion("email_failed in", values, "emailFailed");
            return (Criteria) this;
        }

        public Criteria andEmailFailedNotIn(List<String> values) {
            addCriterion("email_failed not in", values, "emailFailed");
            return (Criteria) this;
        }

        public Criteria andEmailFailedBetween(String value1, String value2) {
            addCriterion("email_failed between", value1, value2, "emailFailed");
            return (Criteria) this;
        }

        public Criteria andEmailFailedNotBetween(String value1, String value2) {
            addCriterion("email_failed not between", value1, value2, "emailFailed");
            return (Criteria) this;
        }

        public Criteria andPhoneFailedIsNull() {
            addCriterion("phone_failed is null");
            return (Criteria) this;
        }

        public Criteria andPhoneFailedIsNotNull() {
            addCriterion("phone_failed is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneFailedEqualTo(String value) {
            addCriterion("phone_failed =", value, "phoneFailed");
            return (Criteria) this;
        }

        public Criteria andPhoneFailedNotEqualTo(String value) {
            addCriterion("phone_failed <>", value, "phoneFailed");
            return (Criteria) this;
        }

        public Criteria andPhoneFailedGreaterThan(String value) {
            addCriterion("phone_failed >", value, "phoneFailed");
            return (Criteria) this;
        }

        public Criteria andPhoneFailedGreaterThanOrEqualTo(String value) {
            addCriterion("phone_failed >=", value, "phoneFailed");
            return (Criteria) this;
        }

        public Criteria andPhoneFailedLessThan(String value) {
            addCriterion("phone_failed <", value, "phoneFailed");
            return (Criteria) this;
        }

        public Criteria andPhoneFailedLessThanOrEqualTo(String value) {
            addCriterion("phone_failed <=", value, "phoneFailed");
            return (Criteria) this;
        }

        public Criteria andPhoneFailedLike(String value) {
            addCriterion("phone_failed like", value, "phoneFailed");
            return (Criteria) this;
        }

        public Criteria andPhoneFailedNotLike(String value) {
            addCriterion("phone_failed not like", value, "phoneFailed");
            return (Criteria) this;
        }

        public Criteria andPhoneFailedIn(List<String> values) {
            addCriterion("phone_failed in", values, "phoneFailed");
            return (Criteria) this;
        }

        public Criteria andPhoneFailedNotIn(List<String> values) {
            addCriterion("phone_failed not in", values, "phoneFailed");
            return (Criteria) this;
        }

        public Criteria andPhoneFailedBetween(String value1, String value2) {
            addCriterion("phone_failed between", value1, value2, "phoneFailed");
            return (Criteria) this;
        }

        public Criteria andPhoneFailedNotBetween(String value1, String value2) {
            addCriterion("phone_failed not between", value1, value2, "phoneFailed");
            return (Criteria) this;
        }

        public Criteria andTeamRegionIsNull() {
            addCriterion("team_region is null");
            return (Criteria) this;
        }

        public Criteria andTeamRegionIsNotNull() {
            addCriterion("team_region is not null");
            return (Criteria) this;
        }

        public Criteria andTeamRegionEqualTo(String value) {
            addCriterion("team_region =", value, "teamRegion");
            return (Criteria) this;
        }

        public Criteria andTeamRegionNotEqualTo(String value) {
            addCriterion("team_region <>", value, "teamRegion");
            return (Criteria) this;
        }

        public Criteria andTeamRegionGreaterThan(String value) {
            addCriterion("team_region >", value, "teamRegion");
            return (Criteria) this;
        }

        public Criteria andTeamRegionGreaterThanOrEqualTo(String value) {
            addCriterion("team_region >=", value, "teamRegion");
            return (Criteria) this;
        }

        public Criteria andTeamRegionLessThan(String value) {
            addCriterion("team_region <", value, "teamRegion");
            return (Criteria) this;
        }

        public Criteria andTeamRegionLessThanOrEqualTo(String value) {
            addCriterion("team_region <=", value, "teamRegion");
            return (Criteria) this;
        }

        public Criteria andTeamRegionLike(String value) {
            addCriterion("team_region like", value, "teamRegion");
            return (Criteria) this;
        }

        public Criteria andTeamRegionNotLike(String value) {
            addCriterion("team_region not like", value, "teamRegion");
            return (Criteria) this;
        }

        public Criteria andTeamRegionIn(List<String> values) {
            addCriterion("team_region in", values, "teamRegion");
            return (Criteria) this;
        }

        public Criteria andTeamRegionNotIn(List<String> values) {
            addCriterion("team_region not in", values, "teamRegion");
            return (Criteria) this;
        }

        public Criteria andTeamRegionBetween(String value1, String value2) {
            addCriterion("team_region between", value1, value2, "teamRegion");
            return (Criteria) this;
        }

        public Criteria andTeamRegionNotBetween(String value1, String value2) {
            addCriterion("team_region not between", value1, value2, "teamRegion");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderIsNull() {
            addCriterion("team_leader is null");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderIsNotNull() {
            addCriterion("team_leader is not null");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderEqualTo(String value) {
            addCriterion("team_leader =", value, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderNotEqualTo(String value) {
            addCriterion("team_leader <>", value, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderGreaterThan(String value) {
            addCriterion("team_leader >", value, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("team_leader >=", value, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderLessThan(String value) {
            addCriterion("team_leader <", value, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderLessThanOrEqualTo(String value) {
            addCriterion("team_leader <=", value, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderLike(String value) {
            addCriterion("team_leader like", value, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderNotLike(String value) {
            addCriterion("team_leader not like", value, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderIn(List<String> values) {
            addCriterion("team_leader in", values, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderNotIn(List<String> values) {
            addCriterion("team_leader not in", values, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderBetween(String value1, String value2) {
            addCriterion("team_leader between", value1, value2, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderNotBetween(String value1, String value2) {
            addCriterion("team_leader not between", value1, value2, "teamLeader");
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