package com.croky.postgres.dal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * @author Croky.Zheng
 * @date 2023-02-20 16:00:45
*/
public class SpAdsDwdExample {
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
    public SpAdsDwdExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andDateOfDataIsNull() {
            addCriterion("date_of_data is null");
            return (Criteria) this;
        }

        public Criteria andDateOfDataIsNotNull() {
            addCriterion("date_of_data is not null");
            return (Criteria) this;
        }

        public Criteria andDateOfDataEqualTo(Date value) {
            addCriterionForJDBCDate("date_of_data =", value, "dateOfData");
            return (Criteria) this;
        }

        public Criteria andDateOfDataNotEqualTo(Date value) {
            addCriterionForJDBCDate("date_of_data <>", value, "dateOfData");
            return (Criteria) this;
        }

        public Criteria andDateOfDataGreaterThan(Date value) {
            addCriterionForJDBCDate("date_of_data >", value, "dateOfData");
            return (Criteria) this;
        }

        public Criteria andDateOfDataGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_of_data >=", value, "dateOfData");
            return (Criteria) this;
        }

        public Criteria andDateOfDataLessThan(Date value) {
            addCriterionForJDBCDate("date_of_data <", value, "dateOfData");
            return (Criteria) this;
        }

        public Criteria andDateOfDataLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_of_data <=", value, "dateOfData");
            return (Criteria) this;
        }

        public Criteria andDateOfDataIn(List<Date> values) {
            addCriterionForJDBCDate("date_of_data in", values, "dateOfData");
            return (Criteria) this;
        }

        public Criteria andDateOfDataNotIn(List<Date> values) {
            addCriterionForJDBCDate("date_of_data not in", values, "dateOfData");
            return (Criteria) this;
        }

        public Criteria andDateOfDataBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_of_data between", value1, value2, "dateOfData");
            return (Criteria) this;
        }

        public Criteria andDateOfDataNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_of_data not between", value1, value2, "dateOfData");
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

        public Criteria andProductNameAdNameIsNull() {
            addCriterion("product_name_ad_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameAdNameIsNotNull() {
            addCriterion("product_name_ad_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameAdNameEqualTo(String value) {
            addCriterion("product_name_ad_name =", value, "productNameAdName");
            return (Criteria) this;
        }

        public Criteria andProductNameAdNameNotEqualTo(String value) {
            addCriterion("product_name_ad_name <>", value, "productNameAdName");
            return (Criteria) this;
        }

        public Criteria andProductNameAdNameGreaterThan(String value) {
            addCriterion("product_name_ad_name >", value, "productNameAdName");
            return (Criteria) this;
        }

        public Criteria andProductNameAdNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name_ad_name >=", value, "productNameAdName");
            return (Criteria) this;
        }

        public Criteria andProductNameAdNameLessThan(String value) {
            addCriterion("product_name_ad_name <", value, "productNameAdName");
            return (Criteria) this;
        }

        public Criteria andProductNameAdNameLessThanOrEqualTo(String value) {
            addCriterion("product_name_ad_name <=", value, "productNameAdName");
            return (Criteria) this;
        }

        public Criteria andProductNameAdNameLike(String value) {
            addCriterion("product_name_ad_name like", value, "productNameAdName");
            return (Criteria) this;
        }

        public Criteria andProductNameAdNameNotLike(String value) {
            addCriterion("product_name_ad_name not like", value, "productNameAdName");
            return (Criteria) this;
        }

        public Criteria andProductNameAdNameIn(List<String> values) {
            addCriterion("product_name_ad_name in", values, "productNameAdName");
            return (Criteria) this;
        }

        public Criteria andProductNameAdNameNotIn(List<String> values) {
            addCriterion("product_name_ad_name not in", values, "productNameAdName");
            return (Criteria) this;
        }

        public Criteria andProductNameAdNameBetween(String value1, String value2) {
            addCriterion("product_name_ad_name between", value1, value2, "productNameAdName");
            return (Criteria) this;
        }

        public Criteria andProductNameAdNameNotBetween(String value1, String value2) {
            addCriterion("product_name_ad_name not between", value1, value2, "productNameAdName");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andAdsTypeIsNull() {
            addCriterion("ads_type is null");
            return (Criteria) this;
        }

        public Criteria andAdsTypeIsNotNull() {
            addCriterion("ads_type is not null");
            return (Criteria) this;
        }

        public Criteria andAdsTypeEqualTo(String value) {
            addCriterion("ads_type =", value, "adsType");
            return (Criteria) this;
        }

        public Criteria andAdsTypeNotEqualTo(String value) {
            addCriterion("ads_type <>", value, "adsType");
            return (Criteria) this;
        }

        public Criteria andAdsTypeGreaterThan(String value) {
            addCriterion("ads_type >", value, "adsType");
            return (Criteria) this;
        }

        public Criteria andAdsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ads_type >=", value, "adsType");
            return (Criteria) this;
        }

        public Criteria andAdsTypeLessThan(String value) {
            addCriterion("ads_type <", value, "adsType");
            return (Criteria) this;
        }

        public Criteria andAdsTypeLessThanOrEqualTo(String value) {
            addCriterion("ads_type <=", value, "adsType");
            return (Criteria) this;
        }

        public Criteria andAdsTypeLike(String value) {
            addCriterion("ads_type like", value, "adsType");
            return (Criteria) this;
        }

        public Criteria andAdsTypeNotLike(String value) {
            addCriterion("ads_type not like", value, "adsType");
            return (Criteria) this;
        }

        public Criteria andAdsTypeIn(List<String> values) {
            addCriterion("ads_type in", values, "adsType");
            return (Criteria) this;
        }

        public Criteria andAdsTypeNotIn(List<String> values) {
            addCriterion("ads_type not in", values, "adsType");
            return (Criteria) this;
        }

        public Criteria andAdsTypeBetween(String value1, String value2) {
            addCriterion("ads_type between", value1, value2, "adsType");
            return (Criteria) this;
        }

        public Criteria andAdsTypeNotBetween(String value1, String value2) {
            addCriterion("ads_type not between", value1, value2, "adsType");
            return (Criteria) this;
        }

        public Criteria andPlacementKeywordIsNull() {
            addCriterion("placement_keyword is null");
            return (Criteria) this;
        }

        public Criteria andPlacementKeywordIsNotNull() {
            addCriterion("placement_keyword is not null");
            return (Criteria) this;
        }

        public Criteria andPlacementKeywordEqualTo(String value) {
            addCriterion("placement_keyword =", value, "placementKeyword");
            return (Criteria) this;
        }

        public Criteria andPlacementKeywordNotEqualTo(String value) {
            addCriterion("placement_keyword <>", value, "placementKeyword");
            return (Criteria) this;
        }

        public Criteria andPlacementKeywordGreaterThan(String value) {
            addCriterion("placement_keyword >", value, "placementKeyword");
            return (Criteria) this;
        }

        public Criteria andPlacementKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("placement_keyword >=", value, "placementKeyword");
            return (Criteria) this;
        }

        public Criteria andPlacementKeywordLessThan(String value) {
            addCriterion("placement_keyword <", value, "placementKeyword");
            return (Criteria) this;
        }

        public Criteria andPlacementKeywordLessThanOrEqualTo(String value) {
            addCriterion("placement_keyword <=", value, "placementKeyword");
            return (Criteria) this;
        }

        public Criteria andPlacementKeywordLike(String value) {
            addCriterion("placement_keyword like", value, "placementKeyword");
            return (Criteria) this;
        }

        public Criteria andPlacementKeywordNotLike(String value) {
            addCriterion("placement_keyword not like", value, "placementKeyword");
            return (Criteria) this;
        }

        public Criteria andPlacementKeywordIn(List<String> values) {
            addCriterion("placement_keyword in", values, "placementKeyword");
            return (Criteria) this;
        }

        public Criteria andPlacementKeywordNotIn(List<String> values) {
            addCriterion("placement_keyword not in", values, "placementKeyword");
            return (Criteria) this;
        }

        public Criteria andPlacementKeywordBetween(String value1, String value2) {
            addCriterion("placement_keyword between", value1, value2, "placementKeyword");
            return (Criteria) this;
        }

        public Criteria andPlacementKeywordNotBetween(String value1, String value2) {
            addCriterion("placement_keyword not between", value1, value2, "placementKeyword");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(String value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(String value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(String value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(String value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(String value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLike(String value) {
            addCriterion("end_date like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotLike(String value) {
            addCriterion("end_date not like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<String> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<String> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(String value1, String value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(String value1, String value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andImpressionIsNull() {
            addCriterion("impression is null");
            return (Criteria) this;
        }

        public Criteria andImpressionIsNotNull() {
            addCriterion("impression is not null");
            return (Criteria) this;
        }

        public Criteria andImpressionEqualTo(Integer value) {
            addCriterion("impression =", value, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionNotEqualTo(Integer value) {
            addCriterion("impression <>", value, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionGreaterThan(Integer value) {
            addCriterion("impression >", value, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionGreaterThanOrEqualTo(Integer value) {
            addCriterion("impression >=", value, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionLessThan(Integer value) {
            addCriterion("impression <", value, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionLessThanOrEqualTo(Integer value) {
            addCriterion("impression <=", value, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionIn(List<Integer> values) {
            addCriterion("impression in", values, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionNotIn(List<Integer> values) {
            addCriterion("impression not in", values, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionBetween(Integer value1, Integer value2) {
            addCriterion("impression between", value1, value2, "impression");
            return (Criteria) this;
        }

        public Criteria andImpressionNotBetween(Integer value1, Integer value2) {
            addCriterion("impression not between", value1, value2, "impression");
            return (Criteria) this;
        }

        public Criteria andClicksIsNull() {
            addCriterion("clicks is null");
            return (Criteria) this;
        }

        public Criteria andClicksIsNotNull() {
            addCriterion("clicks is not null");
            return (Criteria) this;
        }

        public Criteria andClicksEqualTo(Integer value) {
            addCriterion("clicks =", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksNotEqualTo(Integer value) {
            addCriterion("clicks <>", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksGreaterThan(Integer value) {
            addCriterion("clicks >", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksGreaterThanOrEqualTo(Integer value) {
            addCriterion("clicks >=", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksLessThan(Integer value) {
            addCriterion("clicks <", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksLessThanOrEqualTo(Integer value) {
            addCriterion("clicks <=", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksIn(List<Integer> values) {
            addCriterion("clicks in", values, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksNotIn(List<Integer> values) {
            addCriterion("clicks not in", values, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksBetween(Integer value1, Integer value2) {
            addCriterion("clicks between", value1, value2, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksNotBetween(Integer value1, Integer value2) {
            addCriterion("clicks not between", value1, value2, "clicks");
            return (Criteria) this;
        }

        public Criteria andCtrIsNull() {
            addCriterion("ctr is null");
            return (Criteria) this;
        }

        public Criteria andCtrIsNotNull() {
            addCriterion("ctr is not null");
            return (Criteria) this;
        }

        public Criteria andCtrEqualTo(Short value) {
            addCriterion("ctr =", value, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrNotEqualTo(Short value) {
            addCriterion("ctr <>", value, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrGreaterThan(Short value) {
            addCriterion("ctr >", value, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrGreaterThanOrEqualTo(Short value) {
            addCriterion("ctr >=", value, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrLessThan(Short value) {
            addCriterion("ctr <", value, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrLessThanOrEqualTo(Short value) {
            addCriterion("ctr <=", value, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrIn(List<Short> values) {
            addCriterion("ctr in", values, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrNotIn(List<Short> values) {
            addCriterion("ctr not in", values, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrBetween(Short value1, Short value2) {
            addCriterion("ctr between", value1, value2, "ctr");
            return (Criteria) this;
        }

        public Criteria andCtrNotBetween(Short value1, Short value2) {
            addCriterion("ctr not between", value1, value2, "ctr");
            return (Criteria) this;
        }

        public Criteria andConversionsIsNull() {
            addCriterion("conversions is null");
            return (Criteria) this;
        }

        public Criteria andConversionsIsNotNull() {
            addCriterion("conversions is not null");
            return (Criteria) this;
        }

        public Criteria andConversionsEqualTo(Integer value) {
            addCriterion("conversions =", value, "conversions");
            return (Criteria) this;
        }

        public Criteria andConversionsNotEqualTo(Integer value) {
            addCriterion("conversions <>", value, "conversions");
            return (Criteria) this;
        }

        public Criteria andConversionsGreaterThan(Integer value) {
            addCriterion("conversions >", value, "conversions");
            return (Criteria) this;
        }

        public Criteria andConversionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("conversions >=", value, "conversions");
            return (Criteria) this;
        }

        public Criteria andConversionsLessThan(Integer value) {
            addCriterion("conversions <", value, "conversions");
            return (Criteria) this;
        }

        public Criteria andConversionsLessThanOrEqualTo(Integer value) {
            addCriterion("conversions <=", value, "conversions");
            return (Criteria) this;
        }

        public Criteria andConversionsIn(List<Integer> values) {
            addCriterion("conversions in", values, "conversions");
            return (Criteria) this;
        }

        public Criteria andConversionsNotIn(List<Integer> values) {
            addCriterion("conversions not in", values, "conversions");
            return (Criteria) this;
        }

        public Criteria andConversionsBetween(Integer value1, Integer value2) {
            addCriterion("conversions between", value1, value2, "conversions");
            return (Criteria) this;
        }

        public Criteria andConversionsNotBetween(Integer value1, Integer value2) {
            addCriterion("conversions not between", value1, value2, "conversions");
            return (Criteria) this;
        }

        public Criteria andDirectConversionsIsNull() {
            addCriterion("direct_conversions is null");
            return (Criteria) this;
        }

        public Criteria andDirectConversionsIsNotNull() {
            addCriterion("direct_conversions is not null");
            return (Criteria) this;
        }

        public Criteria andDirectConversionsEqualTo(Integer value) {
            addCriterion("direct_conversions =", value, "directConversions");
            return (Criteria) this;
        }

        public Criteria andDirectConversionsNotEqualTo(Integer value) {
            addCriterion("direct_conversions <>", value, "directConversions");
            return (Criteria) this;
        }

        public Criteria andDirectConversionsGreaterThan(Integer value) {
            addCriterion("direct_conversions >", value, "directConversions");
            return (Criteria) this;
        }

        public Criteria andDirectConversionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("direct_conversions >=", value, "directConversions");
            return (Criteria) this;
        }

        public Criteria andDirectConversionsLessThan(Integer value) {
            addCriterion("direct_conversions <", value, "directConversions");
            return (Criteria) this;
        }

        public Criteria andDirectConversionsLessThanOrEqualTo(Integer value) {
            addCriterion("direct_conversions <=", value, "directConversions");
            return (Criteria) this;
        }

        public Criteria andDirectConversionsIn(List<Integer> values) {
            addCriterion("direct_conversions in", values, "directConversions");
            return (Criteria) this;
        }

        public Criteria andDirectConversionsNotIn(List<Integer> values) {
            addCriterion("direct_conversions not in", values, "directConversions");
            return (Criteria) this;
        }

        public Criteria andDirectConversionsBetween(Integer value1, Integer value2) {
            addCriterion("direct_conversions between", value1, value2, "directConversions");
            return (Criteria) this;
        }

        public Criteria andDirectConversionsNotBetween(Integer value1, Integer value2) {
            addCriterion("direct_conversions not between", value1, value2, "directConversions");
            return (Criteria) this;
        }

        public Criteria andConversionRateIsNull() {
            addCriterion("conversion_rate is null");
            return (Criteria) this;
        }

        public Criteria andConversionRateIsNotNull() {
            addCriterion("conversion_rate is not null");
            return (Criteria) this;
        }

        public Criteria andConversionRateEqualTo(Short value) {
            addCriterion("conversion_rate =", value, "conversionRate");
            return (Criteria) this;
        }

        public Criteria andConversionRateNotEqualTo(Short value) {
            addCriterion("conversion_rate <>", value, "conversionRate");
            return (Criteria) this;
        }

        public Criteria andConversionRateGreaterThan(Short value) {
            addCriterion("conversion_rate >", value, "conversionRate");
            return (Criteria) this;
        }

        public Criteria andConversionRateGreaterThanOrEqualTo(Short value) {
            addCriterion("conversion_rate >=", value, "conversionRate");
            return (Criteria) this;
        }

        public Criteria andConversionRateLessThan(Short value) {
            addCriterion("conversion_rate <", value, "conversionRate");
            return (Criteria) this;
        }

        public Criteria andConversionRateLessThanOrEqualTo(Short value) {
            addCriterion("conversion_rate <=", value, "conversionRate");
            return (Criteria) this;
        }

        public Criteria andConversionRateIn(List<Short> values) {
            addCriterion("conversion_rate in", values, "conversionRate");
            return (Criteria) this;
        }

        public Criteria andConversionRateNotIn(List<Short> values) {
            addCriterion("conversion_rate not in", values, "conversionRate");
            return (Criteria) this;
        }

        public Criteria andConversionRateBetween(Short value1, Short value2) {
            addCriterion("conversion_rate between", value1, value2, "conversionRate");
            return (Criteria) this;
        }

        public Criteria andConversionRateNotBetween(Short value1, Short value2) {
            addCriterion("conversion_rate not between", value1, value2, "conversionRate");
            return (Criteria) this;
        }

        public Criteria andDirectConversionRateIsNull() {
            addCriterion("direct_conversion_rate is null");
            return (Criteria) this;
        }

        public Criteria andDirectConversionRateIsNotNull() {
            addCriterion("direct_conversion_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDirectConversionRateEqualTo(Short value) {
            addCriterion("direct_conversion_rate =", value, "directConversionRate");
            return (Criteria) this;
        }

        public Criteria andDirectConversionRateNotEqualTo(Short value) {
            addCriterion("direct_conversion_rate <>", value, "directConversionRate");
            return (Criteria) this;
        }

        public Criteria andDirectConversionRateGreaterThan(Short value) {
            addCriterion("direct_conversion_rate >", value, "directConversionRate");
            return (Criteria) this;
        }

        public Criteria andDirectConversionRateGreaterThanOrEqualTo(Short value) {
            addCriterion("direct_conversion_rate >=", value, "directConversionRate");
            return (Criteria) this;
        }

        public Criteria andDirectConversionRateLessThan(Short value) {
            addCriterion("direct_conversion_rate <", value, "directConversionRate");
            return (Criteria) this;
        }

        public Criteria andDirectConversionRateLessThanOrEqualTo(Short value) {
            addCriterion("direct_conversion_rate <=", value, "directConversionRate");
            return (Criteria) this;
        }

        public Criteria andDirectConversionRateIn(List<Short> values) {
            addCriterion("direct_conversion_rate in", values, "directConversionRate");
            return (Criteria) this;
        }

        public Criteria andDirectConversionRateNotIn(List<Short> values) {
            addCriterion("direct_conversion_rate not in", values, "directConversionRate");
            return (Criteria) this;
        }

        public Criteria andDirectConversionRateBetween(Short value1, Short value2) {
            addCriterion("direct_conversion_rate between", value1, value2, "directConversionRate");
            return (Criteria) this;
        }

        public Criteria andDirectConversionRateNotBetween(Short value1, Short value2) {
            addCriterion("direct_conversion_rate not between", value1, value2, "directConversionRate");
            return (Criteria) this;
        }

        public Criteria andCostPerConversionIsNull() {
            addCriterion("cost_per_conversion is null");
            return (Criteria) this;
        }

        public Criteria andCostPerConversionIsNotNull() {
            addCriterion("cost_per_conversion is not null");
            return (Criteria) this;
        }

        public Criteria andCostPerConversionEqualTo(Short value) {
            addCriterion("cost_per_conversion =", value, "costPerConversion");
            return (Criteria) this;
        }

        public Criteria andCostPerConversionNotEqualTo(Short value) {
            addCriterion("cost_per_conversion <>", value, "costPerConversion");
            return (Criteria) this;
        }

        public Criteria andCostPerConversionGreaterThan(Short value) {
            addCriterion("cost_per_conversion >", value, "costPerConversion");
            return (Criteria) this;
        }

        public Criteria andCostPerConversionGreaterThanOrEqualTo(Short value) {
            addCriterion("cost_per_conversion >=", value, "costPerConversion");
            return (Criteria) this;
        }

        public Criteria andCostPerConversionLessThan(Short value) {
            addCriterion("cost_per_conversion <", value, "costPerConversion");
            return (Criteria) this;
        }

        public Criteria andCostPerConversionLessThanOrEqualTo(Short value) {
            addCriterion("cost_per_conversion <=", value, "costPerConversion");
            return (Criteria) this;
        }

        public Criteria andCostPerConversionIn(List<Short> values) {
            addCriterion("cost_per_conversion in", values, "costPerConversion");
            return (Criteria) this;
        }

        public Criteria andCostPerConversionNotIn(List<Short> values) {
            addCriterion("cost_per_conversion not in", values, "costPerConversion");
            return (Criteria) this;
        }

        public Criteria andCostPerConversionBetween(Short value1, Short value2) {
            addCriterion("cost_per_conversion between", value1, value2, "costPerConversion");
            return (Criteria) this;
        }

        public Criteria andCostPerConversionNotBetween(Short value1, Short value2) {
            addCriterion("cost_per_conversion not between", value1, value2, "costPerConversion");
            return (Criteria) this;
        }

        public Criteria andCostPerDirectConversionIsNull() {
            addCriterion("cost_per_direct_conversion is null");
            return (Criteria) this;
        }

        public Criteria andCostPerDirectConversionIsNotNull() {
            addCriterion("cost_per_direct_conversion is not null");
            return (Criteria) this;
        }

        public Criteria andCostPerDirectConversionEqualTo(Short value) {
            addCriterion("cost_per_direct_conversion =", value, "costPerDirectConversion");
            return (Criteria) this;
        }

        public Criteria andCostPerDirectConversionNotEqualTo(Short value) {
            addCriterion("cost_per_direct_conversion <>", value, "costPerDirectConversion");
            return (Criteria) this;
        }

        public Criteria andCostPerDirectConversionGreaterThan(Short value) {
            addCriterion("cost_per_direct_conversion >", value, "costPerDirectConversion");
            return (Criteria) this;
        }

        public Criteria andCostPerDirectConversionGreaterThanOrEqualTo(Short value) {
            addCriterion("cost_per_direct_conversion >=", value, "costPerDirectConversion");
            return (Criteria) this;
        }

        public Criteria andCostPerDirectConversionLessThan(Short value) {
            addCriterion("cost_per_direct_conversion <", value, "costPerDirectConversion");
            return (Criteria) this;
        }

        public Criteria andCostPerDirectConversionLessThanOrEqualTo(Short value) {
            addCriterion("cost_per_direct_conversion <=", value, "costPerDirectConversion");
            return (Criteria) this;
        }

        public Criteria andCostPerDirectConversionIn(List<Short> values) {
            addCriterion("cost_per_direct_conversion in", values, "costPerDirectConversion");
            return (Criteria) this;
        }

        public Criteria andCostPerDirectConversionNotIn(List<Short> values) {
            addCriterion("cost_per_direct_conversion not in", values, "costPerDirectConversion");
            return (Criteria) this;
        }

        public Criteria andCostPerDirectConversionBetween(Short value1, Short value2) {
            addCriterion("cost_per_direct_conversion between", value1, value2, "costPerDirectConversion");
            return (Criteria) this;
        }

        public Criteria andCostPerDirectConversionNotBetween(Short value1, Short value2) {
            addCriterion("cost_per_direct_conversion not between", value1, value2, "costPerDirectConversion");
            return (Criteria) this;
        }

        public Criteria andItemsSoldIsNull() {
            addCriterion("items_sold is null");
            return (Criteria) this;
        }

        public Criteria andItemsSoldIsNotNull() {
            addCriterion("items_sold is not null");
            return (Criteria) this;
        }

        public Criteria andItemsSoldEqualTo(Integer value) {
            addCriterion("items_sold =", value, "itemsSold");
            return (Criteria) this;
        }

        public Criteria andItemsSoldNotEqualTo(Integer value) {
            addCriterion("items_sold <>", value, "itemsSold");
            return (Criteria) this;
        }

        public Criteria andItemsSoldGreaterThan(Integer value) {
            addCriterion("items_sold >", value, "itemsSold");
            return (Criteria) this;
        }

        public Criteria andItemsSoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("items_sold >=", value, "itemsSold");
            return (Criteria) this;
        }

        public Criteria andItemsSoldLessThan(Integer value) {
            addCriterion("items_sold <", value, "itemsSold");
            return (Criteria) this;
        }

        public Criteria andItemsSoldLessThanOrEqualTo(Integer value) {
            addCriterion("items_sold <=", value, "itemsSold");
            return (Criteria) this;
        }

        public Criteria andItemsSoldIn(List<Integer> values) {
            addCriterion("items_sold in", values, "itemsSold");
            return (Criteria) this;
        }

        public Criteria andItemsSoldNotIn(List<Integer> values) {
            addCriterion("items_sold not in", values, "itemsSold");
            return (Criteria) this;
        }

        public Criteria andItemsSoldBetween(Integer value1, Integer value2) {
            addCriterion("items_sold between", value1, value2, "itemsSold");
            return (Criteria) this;
        }

        public Criteria andItemsSoldNotBetween(Integer value1, Integer value2) {
            addCriterion("items_sold not between", value1, value2, "itemsSold");
            return (Criteria) this;
        }

        public Criteria andDirectItemsSoldIsNull() {
            addCriterion("direct_items_sold is null");
            return (Criteria) this;
        }

        public Criteria andDirectItemsSoldIsNotNull() {
            addCriterion("direct_items_sold is not null");
            return (Criteria) this;
        }

        public Criteria andDirectItemsSoldEqualTo(Integer value) {
            addCriterion("direct_items_sold =", value, "directItemsSold");
            return (Criteria) this;
        }

        public Criteria andDirectItemsSoldNotEqualTo(Integer value) {
            addCriterion("direct_items_sold <>", value, "directItemsSold");
            return (Criteria) this;
        }

        public Criteria andDirectItemsSoldGreaterThan(Integer value) {
            addCriterion("direct_items_sold >", value, "directItemsSold");
            return (Criteria) this;
        }

        public Criteria andDirectItemsSoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("direct_items_sold >=", value, "directItemsSold");
            return (Criteria) this;
        }

        public Criteria andDirectItemsSoldLessThan(Integer value) {
            addCriterion("direct_items_sold <", value, "directItemsSold");
            return (Criteria) this;
        }

        public Criteria andDirectItemsSoldLessThanOrEqualTo(Integer value) {
            addCriterion("direct_items_sold <=", value, "directItemsSold");
            return (Criteria) this;
        }

        public Criteria andDirectItemsSoldIn(List<Integer> values) {
            addCriterion("direct_items_sold in", values, "directItemsSold");
            return (Criteria) this;
        }

        public Criteria andDirectItemsSoldNotIn(List<Integer> values) {
            addCriterion("direct_items_sold not in", values, "directItemsSold");
            return (Criteria) this;
        }

        public Criteria andDirectItemsSoldBetween(Integer value1, Integer value2) {
            addCriterion("direct_items_sold between", value1, value2, "directItemsSold");
            return (Criteria) this;
        }

        public Criteria andDirectItemsSoldNotBetween(Integer value1, Integer value2) {
            addCriterion("direct_items_sold not between", value1, value2, "directItemsSold");
            return (Criteria) this;
        }

        public Criteria andGmvIsNull() {
            addCriterion("gmv is null");
            return (Criteria) this;
        }

        public Criteria andGmvIsNotNull() {
            addCriterion("gmv is not null");
            return (Criteria) this;
        }

        public Criteria andGmvEqualTo(Short value) {
            addCriterion("gmv =", value, "gmv");
            return (Criteria) this;
        }

        public Criteria andGmvNotEqualTo(Short value) {
            addCriterion("gmv <>", value, "gmv");
            return (Criteria) this;
        }

        public Criteria andGmvGreaterThan(Short value) {
            addCriterion("gmv >", value, "gmv");
            return (Criteria) this;
        }

        public Criteria andGmvGreaterThanOrEqualTo(Short value) {
            addCriterion("gmv >=", value, "gmv");
            return (Criteria) this;
        }

        public Criteria andGmvLessThan(Short value) {
            addCriterion("gmv <", value, "gmv");
            return (Criteria) this;
        }

        public Criteria andGmvLessThanOrEqualTo(Short value) {
            addCriterion("gmv <=", value, "gmv");
            return (Criteria) this;
        }

        public Criteria andGmvIn(List<Short> values) {
            addCriterion("gmv in", values, "gmv");
            return (Criteria) this;
        }

        public Criteria andGmvNotIn(List<Short> values) {
            addCriterion("gmv not in", values, "gmv");
            return (Criteria) this;
        }

        public Criteria andGmvBetween(Short value1, Short value2) {
            addCriterion("gmv between", value1, value2, "gmv");
            return (Criteria) this;
        }

        public Criteria andGmvNotBetween(Short value1, Short value2) {
            addCriterion("gmv not between", value1, value2, "gmv");
            return (Criteria) this;
        }

        public Criteria andDirectGmvIsNull() {
            addCriterion("direct_gmv is null");
            return (Criteria) this;
        }

        public Criteria andDirectGmvIsNotNull() {
            addCriterion("direct_gmv is not null");
            return (Criteria) this;
        }

        public Criteria andDirectGmvEqualTo(Short value) {
            addCriterion("direct_gmv =", value, "directGmv");
            return (Criteria) this;
        }

        public Criteria andDirectGmvNotEqualTo(Short value) {
            addCriterion("direct_gmv <>", value, "directGmv");
            return (Criteria) this;
        }

        public Criteria andDirectGmvGreaterThan(Short value) {
            addCriterion("direct_gmv >", value, "directGmv");
            return (Criteria) this;
        }

        public Criteria andDirectGmvGreaterThanOrEqualTo(Short value) {
            addCriterion("direct_gmv >=", value, "directGmv");
            return (Criteria) this;
        }

        public Criteria andDirectGmvLessThan(Short value) {
            addCriterion("direct_gmv <", value, "directGmv");
            return (Criteria) this;
        }

        public Criteria andDirectGmvLessThanOrEqualTo(Short value) {
            addCriterion("direct_gmv <=", value, "directGmv");
            return (Criteria) this;
        }

        public Criteria andDirectGmvIn(List<Short> values) {
            addCriterion("direct_gmv in", values, "directGmv");
            return (Criteria) this;
        }

        public Criteria andDirectGmvNotIn(List<Short> values) {
            addCriterion("direct_gmv not in", values, "directGmv");
            return (Criteria) this;
        }

        public Criteria andDirectGmvBetween(Short value1, Short value2) {
            addCriterion("direct_gmv between", value1, value2, "directGmv");
            return (Criteria) this;
        }

        public Criteria andDirectGmvNotBetween(Short value1, Short value2) {
            addCriterion("direct_gmv not between", value1, value2, "directGmv");
            return (Criteria) this;
        }

        public Criteria andExpenseIsNull() {
            addCriterion("expense is null");
            return (Criteria) this;
        }

        public Criteria andExpenseIsNotNull() {
            addCriterion("expense is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseEqualTo(Short value) {
            addCriterion("expense =", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotEqualTo(Short value) {
            addCriterion("expense <>", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseGreaterThan(Short value) {
            addCriterion("expense >", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseGreaterThanOrEqualTo(Short value) {
            addCriterion("expense >=", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseLessThan(Short value) {
            addCriterion("expense <", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseLessThanOrEqualTo(Short value) {
            addCriterion("expense <=", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseIn(List<Short> values) {
            addCriterion("expense in", values, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotIn(List<Short> values) {
            addCriterion("expense not in", values, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseBetween(Short value1, Short value2) {
            addCriterion("expense between", value1, value2, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotBetween(Short value1, Short value2) {
            addCriterion("expense not between", value1, value2, "expense");
            return (Criteria) this;
        }

        public Criteria andRoiIsNull() {
            addCriterion("roi is null");
            return (Criteria) this;
        }

        public Criteria andRoiIsNotNull() {
            addCriterion("roi is not null");
            return (Criteria) this;
        }

        public Criteria andRoiEqualTo(Short value) {
            addCriterion("roi =", value, "roi");
            return (Criteria) this;
        }

        public Criteria andRoiNotEqualTo(Short value) {
            addCriterion("roi <>", value, "roi");
            return (Criteria) this;
        }

        public Criteria andRoiGreaterThan(Short value) {
            addCriterion("roi >", value, "roi");
            return (Criteria) this;
        }

        public Criteria andRoiGreaterThanOrEqualTo(Short value) {
            addCriterion("roi >=", value, "roi");
            return (Criteria) this;
        }

        public Criteria andRoiLessThan(Short value) {
            addCriterion("roi <", value, "roi");
            return (Criteria) this;
        }

        public Criteria andRoiLessThanOrEqualTo(Short value) {
            addCriterion("roi <=", value, "roi");
            return (Criteria) this;
        }

        public Criteria andRoiIn(List<Short> values) {
            addCriterion("roi in", values, "roi");
            return (Criteria) this;
        }

        public Criteria andRoiNotIn(List<Short> values) {
            addCriterion("roi not in", values, "roi");
            return (Criteria) this;
        }

        public Criteria andRoiBetween(Short value1, Short value2) {
            addCriterion("roi between", value1, value2, "roi");
            return (Criteria) this;
        }

        public Criteria andRoiNotBetween(Short value1, Short value2) {
            addCriterion("roi not between", value1, value2, "roi");
            return (Criteria) this;
        }

        public Criteria andDirectRoiIsNull() {
            addCriterion("direct_roi is null");
            return (Criteria) this;
        }

        public Criteria andDirectRoiIsNotNull() {
            addCriterion("direct_roi is not null");
            return (Criteria) this;
        }

        public Criteria andDirectRoiEqualTo(Short value) {
            addCriterion("direct_roi =", value, "directRoi");
            return (Criteria) this;
        }

        public Criteria andDirectRoiNotEqualTo(Short value) {
            addCriterion("direct_roi <>", value, "directRoi");
            return (Criteria) this;
        }

        public Criteria andDirectRoiGreaterThan(Short value) {
            addCriterion("direct_roi >", value, "directRoi");
            return (Criteria) this;
        }

        public Criteria andDirectRoiGreaterThanOrEqualTo(Short value) {
            addCriterion("direct_roi >=", value, "directRoi");
            return (Criteria) this;
        }

        public Criteria andDirectRoiLessThan(Short value) {
            addCriterion("direct_roi <", value, "directRoi");
            return (Criteria) this;
        }

        public Criteria andDirectRoiLessThanOrEqualTo(Short value) {
            addCriterion("direct_roi <=", value, "directRoi");
            return (Criteria) this;
        }

        public Criteria andDirectRoiIn(List<Short> values) {
            addCriterion("direct_roi in", values, "directRoi");
            return (Criteria) this;
        }

        public Criteria andDirectRoiNotIn(List<Short> values) {
            addCriterion("direct_roi not in", values, "directRoi");
            return (Criteria) this;
        }

        public Criteria andDirectRoiBetween(Short value1, Short value2) {
            addCriterion("direct_roi between", value1, value2, "directRoi");
            return (Criteria) this;
        }

        public Criteria andDirectRoiNotBetween(Short value1, Short value2) {
            addCriterion("direct_roi not between", value1, value2, "directRoi");
            return (Criteria) this;
        }

        public Criteria andCirIsNull() {
            addCriterion("cir is null");
            return (Criteria) this;
        }

        public Criteria andCirIsNotNull() {
            addCriterion("cir is not null");
            return (Criteria) this;
        }

        public Criteria andCirEqualTo(Short value) {
            addCriterion("cir =", value, "cir");
            return (Criteria) this;
        }

        public Criteria andCirNotEqualTo(Short value) {
            addCriterion("cir <>", value, "cir");
            return (Criteria) this;
        }

        public Criteria andCirGreaterThan(Short value) {
            addCriterion("cir >", value, "cir");
            return (Criteria) this;
        }

        public Criteria andCirGreaterThanOrEqualTo(Short value) {
            addCriterion("cir >=", value, "cir");
            return (Criteria) this;
        }

        public Criteria andCirLessThan(Short value) {
            addCriterion("cir <", value, "cir");
            return (Criteria) this;
        }

        public Criteria andCirLessThanOrEqualTo(Short value) {
            addCriterion("cir <=", value, "cir");
            return (Criteria) this;
        }

        public Criteria andCirIn(List<Short> values) {
            addCriterion("cir in", values, "cir");
            return (Criteria) this;
        }

        public Criteria andCirNotIn(List<Short> values) {
            addCriterion("cir not in", values, "cir");
            return (Criteria) this;
        }

        public Criteria andCirBetween(Short value1, Short value2) {
            addCriterion("cir between", value1, value2, "cir");
            return (Criteria) this;
        }

        public Criteria andCirNotBetween(Short value1, Short value2) {
            addCriterion("cir not between", value1, value2, "cir");
            return (Criteria) this;
        }

        public Criteria andDirectCirIsNull() {
            addCriterion("direct_cir is null");
            return (Criteria) this;
        }

        public Criteria andDirectCirIsNotNull() {
            addCriterion("direct_cir is not null");
            return (Criteria) this;
        }

        public Criteria andDirectCirEqualTo(Short value) {
            addCriterion("direct_cir =", value, "directCir");
            return (Criteria) this;
        }

        public Criteria andDirectCirNotEqualTo(Short value) {
            addCriterion("direct_cir <>", value, "directCir");
            return (Criteria) this;
        }

        public Criteria andDirectCirGreaterThan(Short value) {
            addCriterion("direct_cir >", value, "directCir");
            return (Criteria) this;
        }

        public Criteria andDirectCirGreaterThanOrEqualTo(Short value) {
            addCriterion("direct_cir >=", value, "directCir");
            return (Criteria) this;
        }

        public Criteria andDirectCirLessThan(Short value) {
            addCriterion("direct_cir <", value, "directCir");
            return (Criteria) this;
        }

        public Criteria andDirectCirLessThanOrEqualTo(Short value) {
            addCriterion("direct_cir <=", value, "directCir");
            return (Criteria) this;
        }

        public Criteria andDirectCirIn(List<Short> values) {
            addCriterion("direct_cir in", values, "directCir");
            return (Criteria) this;
        }

        public Criteria andDirectCirNotIn(List<Short> values) {
            addCriterion("direct_cir not in", values, "directCir");
            return (Criteria) this;
        }

        public Criteria andDirectCirBetween(Short value1, Short value2) {
            addCriterion("direct_cir between", value1, value2, "directCir");
            return (Criteria) this;
        }

        public Criteria andDirectCirNotBetween(Short value1, Short value2) {
            addCriterion("direct_cir not between", value1, value2, "directCir");
            return (Criteria) this;
        }

        public Criteria andProductImpressionsIsNull() {
            addCriterion("product_impressions is null");
            return (Criteria) this;
        }

        public Criteria andProductImpressionsIsNotNull() {
            addCriterion("product_impressions is not null");
            return (Criteria) this;
        }

        public Criteria andProductImpressionsEqualTo(Integer value) {
            addCriterion("product_impressions =", value, "productImpressions");
            return (Criteria) this;
        }

        public Criteria andProductImpressionsNotEqualTo(Integer value) {
            addCriterion("product_impressions <>", value, "productImpressions");
            return (Criteria) this;
        }

        public Criteria andProductImpressionsGreaterThan(Integer value) {
            addCriterion("product_impressions >", value, "productImpressions");
            return (Criteria) this;
        }

        public Criteria andProductImpressionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_impressions >=", value, "productImpressions");
            return (Criteria) this;
        }

        public Criteria andProductImpressionsLessThan(Integer value) {
            addCriterion("product_impressions <", value, "productImpressions");
            return (Criteria) this;
        }

        public Criteria andProductImpressionsLessThanOrEqualTo(Integer value) {
            addCriterion("product_impressions <=", value, "productImpressions");
            return (Criteria) this;
        }

        public Criteria andProductImpressionsIn(List<Integer> values) {
            addCriterion("product_impressions in", values, "productImpressions");
            return (Criteria) this;
        }

        public Criteria andProductImpressionsNotIn(List<Integer> values) {
            addCriterion("product_impressions not in", values, "productImpressions");
            return (Criteria) this;
        }

        public Criteria andProductImpressionsBetween(Integer value1, Integer value2) {
            addCriterion("product_impressions between", value1, value2, "productImpressions");
            return (Criteria) this;
        }

        public Criteria andProductImpressionsNotBetween(Integer value1, Integer value2) {
            addCriterion("product_impressions not between", value1, value2, "productImpressions");
            return (Criteria) this;
        }

        public Criteria andProductClicksIsNull() {
            addCriterion("product_clicks is null");
            return (Criteria) this;
        }

        public Criteria andProductClicksIsNotNull() {
            addCriterion("product_clicks is not null");
            return (Criteria) this;
        }

        public Criteria andProductClicksEqualTo(Integer value) {
            addCriterion("product_clicks =", value, "productClicks");
            return (Criteria) this;
        }

        public Criteria andProductClicksNotEqualTo(Integer value) {
            addCriterion("product_clicks <>", value, "productClicks");
            return (Criteria) this;
        }

        public Criteria andProductClicksGreaterThan(Integer value) {
            addCriterion("product_clicks >", value, "productClicks");
            return (Criteria) this;
        }

        public Criteria andProductClicksGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_clicks >=", value, "productClicks");
            return (Criteria) this;
        }

        public Criteria andProductClicksLessThan(Integer value) {
            addCriterion("product_clicks <", value, "productClicks");
            return (Criteria) this;
        }

        public Criteria andProductClicksLessThanOrEqualTo(Integer value) {
            addCriterion("product_clicks <=", value, "productClicks");
            return (Criteria) this;
        }

        public Criteria andProductClicksIn(List<Integer> values) {
            addCriterion("product_clicks in", values, "productClicks");
            return (Criteria) this;
        }

        public Criteria andProductClicksNotIn(List<Integer> values) {
            addCriterion("product_clicks not in", values, "productClicks");
            return (Criteria) this;
        }

        public Criteria andProductClicksBetween(Integer value1, Integer value2) {
            addCriterion("product_clicks between", value1, value2, "productClicks");
            return (Criteria) this;
        }

        public Criteria andProductClicksNotBetween(Integer value1, Integer value2) {
            addCriterion("product_clicks not between", value1, value2, "productClicks");
            return (Criteria) this;
        }

        public Criteria andProductCtrIsNull() {
            addCriterion("product_ctr is null");
            return (Criteria) this;
        }

        public Criteria andProductCtrIsNotNull() {
            addCriterion("product_ctr is not null");
            return (Criteria) this;
        }

        public Criteria andProductCtrEqualTo(Short value) {
            addCriterion("product_ctr =", value, "productCtr");
            return (Criteria) this;
        }

        public Criteria andProductCtrNotEqualTo(Short value) {
            addCriterion("product_ctr <>", value, "productCtr");
            return (Criteria) this;
        }

        public Criteria andProductCtrGreaterThan(Short value) {
            addCriterion("product_ctr >", value, "productCtr");
            return (Criteria) this;
        }

        public Criteria andProductCtrGreaterThanOrEqualTo(Short value) {
            addCriterion("product_ctr >=", value, "productCtr");
            return (Criteria) this;
        }

        public Criteria andProductCtrLessThan(Short value) {
            addCriterion("product_ctr <", value, "productCtr");
            return (Criteria) this;
        }

        public Criteria andProductCtrLessThanOrEqualTo(Short value) {
            addCriterion("product_ctr <=", value, "productCtr");
            return (Criteria) this;
        }

        public Criteria andProductCtrIn(List<Short> values) {
            addCriterion("product_ctr in", values, "productCtr");
            return (Criteria) this;
        }

        public Criteria andProductCtrNotIn(List<Short> values) {
            addCriterion("product_ctr not in", values, "productCtr");
            return (Criteria) this;
        }

        public Criteria andProductCtrBetween(Short value1, Short value2) {
            addCriterion("product_ctr between", value1, value2, "productCtr");
            return (Criteria) this;
        }

        public Criteria andProductCtrNotBetween(Short value1, Short value2) {
            addCriterion("product_ctr not between", value1, value2, "productCtr");
            return (Criteria) this;
        }

        public Criteria andFlowIdIsNull() {
            addCriterion("flow_id is null");
            return (Criteria) this;
        }

        public Criteria andFlowIdIsNotNull() {
            addCriterion("flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlowIdEqualTo(String value) {
            addCriterion("flow_id =", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotEqualTo(String value) {
            addCriterion("flow_id <>", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThan(String value) {
            addCriterion("flow_id >", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThanOrEqualTo(String value) {
            addCriterion("flow_id >=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThan(String value) {
            addCriterion("flow_id <", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThanOrEqualTo(String value) {
            addCriterion("flow_id <=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLike(String value) {
            addCriterion("flow_id like", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotLike(String value) {
            addCriterion("flow_id not like", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdIn(List<String> values) {
            addCriterion("flow_id in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotIn(List<String> values) {
            addCriterion("flow_id not in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdBetween(String value1, String value2) {
            addCriterion("flow_id between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotBetween(String value1, String value2) {
            addCriterion("flow_id not between", value1, value2, "flowId");
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