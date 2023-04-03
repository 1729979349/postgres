package com.croky.postgres.dal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * @author Croky.Zheng
 * @date 2023-02-20 11:23:50
*/
public class LzAdsDiscoveryDwdExample {
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
    public LzAdsDiscoveryDwdExample() {
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

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andCampaignNameIsNull() {
            addCriterion("campaign_name is null");
            return (Criteria) this;
        }

        public Criteria andCampaignNameIsNotNull() {
            addCriterion("campaign_name is not null");
            return (Criteria) this;
        }

        public Criteria andCampaignNameEqualTo(String value) {
            addCriterion("campaign_name =", value, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameNotEqualTo(String value) {
            addCriterion("campaign_name <>", value, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameGreaterThan(String value) {
            addCriterion("campaign_name >", value, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameGreaterThanOrEqualTo(String value) {
            addCriterion("campaign_name >=", value, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameLessThan(String value) {
            addCriterion("campaign_name <", value, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameLessThanOrEqualTo(String value) {
            addCriterion("campaign_name <=", value, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameLike(String value) {
            addCriterion("campaign_name like", value, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameNotLike(String value) {
            addCriterion("campaign_name not like", value, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameIn(List<String> values) {
            addCriterion("campaign_name in", values, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameNotIn(List<String> values) {
            addCriterion("campaign_name not in", values, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameBetween(String value1, String value2) {
            addCriterion("campaign_name between", value1, value2, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignNameNotBetween(String value1, String value2) {
            addCriterion("campaign_name not between", value1, value2, "campaignName");
            return (Criteria) this;
        }

        public Criteria andCampaignIdIsNull() {
            addCriterion("campaign_id is null");
            return (Criteria) this;
        }

        public Criteria andCampaignIdIsNotNull() {
            addCriterion("campaign_id is not null");
            return (Criteria) this;
        }

        public Criteria andCampaignIdEqualTo(String value) {
            addCriterion("campaign_id =", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdNotEqualTo(String value) {
            addCriterion("campaign_id <>", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdGreaterThan(String value) {
            addCriterion("campaign_id >", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdGreaterThanOrEqualTo(String value) {
            addCriterion("campaign_id >=", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdLessThan(String value) {
            addCriterion("campaign_id <", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdLessThanOrEqualTo(String value) {
            addCriterion("campaign_id <=", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdLike(String value) {
            addCriterion("campaign_id like", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdNotLike(String value) {
            addCriterion("campaign_id not like", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdIn(List<String> values) {
            addCriterion("campaign_id in", values, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdNotIn(List<String> values) {
            addCriterion("campaign_id not in", values, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdBetween(String value1, String value2) {
            addCriterion("campaign_id between", value1, value2, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdNotBetween(String value1, String value2) {
            addCriterion("campaign_id not between", value1, value2, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignObjectiveIsNull() {
            addCriterion("campaign_objective is null");
            return (Criteria) this;
        }

        public Criteria andCampaignObjectiveIsNotNull() {
            addCriterion("campaign_objective is not null");
            return (Criteria) this;
        }

        public Criteria andCampaignObjectiveEqualTo(String value) {
            addCriterion("campaign_objective =", value, "campaignObjective");
            return (Criteria) this;
        }

        public Criteria andCampaignObjectiveNotEqualTo(String value) {
            addCriterion("campaign_objective <>", value, "campaignObjective");
            return (Criteria) this;
        }

        public Criteria andCampaignObjectiveGreaterThan(String value) {
            addCriterion("campaign_objective >", value, "campaignObjective");
            return (Criteria) this;
        }

        public Criteria andCampaignObjectiveGreaterThanOrEqualTo(String value) {
            addCriterion("campaign_objective >=", value, "campaignObjective");
            return (Criteria) this;
        }

        public Criteria andCampaignObjectiveLessThan(String value) {
            addCriterion("campaign_objective <", value, "campaignObjective");
            return (Criteria) this;
        }

        public Criteria andCampaignObjectiveLessThanOrEqualTo(String value) {
            addCriterion("campaign_objective <=", value, "campaignObjective");
            return (Criteria) this;
        }

        public Criteria andCampaignObjectiveLike(String value) {
            addCriterion("campaign_objective like", value, "campaignObjective");
            return (Criteria) this;
        }

        public Criteria andCampaignObjectiveNotLike(String value) {
            addCriterion("campaign_objective not like", value, "campaignObjective");
            return (Criteria) this;
        }

        public Criteria andCampaignObjectiveIn(List<String> values) {
            addCriterion("campaign_objective in", values, "campaignObjective");
            return (Criteria) this;
        }

        public Criteria andCampaignObjectiveNotIn(List<String> values) {
            addCriterion("campaign_objective not in", values, "campaignObjective");
            return (Criteria) this;
        }

        public Criteria andCampaignObjectiveBetween(String value1, String value2) {
            addCriterion("campaign_objective between", value1, value2, "campaignObjective");
            return (Criteria) this;
        }

        public Criteria andCampaignObjectiveNotBetween(String value1, String value2) {
            addCriterion("campaign_objective not between", value1, value2, "campaignObjective");
            return (Criteria) this;
        }

        public Criteria andCampaignTypeIsNull() {
            addCriterion("campaign_type is null");
            return (Criteria) this;
        }

        public Criteria andCampaignTypeIsNotNull() {
            addCriterion("campaign_type is not null");
            return (Criteria) this;
        }

        public Criteria andCampaignTypeEqualTo(String value) {
            addCriterion("campaign_type =", value, "campaignType");
            return (Criteria) this;
        }

        public Criteria andCampaignTypeNotEqualTo(String value) {
            addCriterion("campaign_type <>", value, "campaignType");
            return (Criteria) this;
        }

        public Criteria andCampaignTypeGreaterThan(String value) {
            addCriterion("campaign_type >", value, "campaignType");
            return (Criteria) this;
        }

        public Criteria andCampaignTypeGreaterThanOrEqualTo(String value) {
            addCriterion("campaign_type >=", value, "campaignType");
            return (Criteria) this;
        }

        public Criteria andCampaignTypeLessThan(String value) {
            addCriterion("campaign_type <", value, "campaignType");
            return (Criteria) this;
        }

        public Criteria andCampaignTypeLessThanOrEqualTo(String value) {
            addCriterion("campaign_type <=", value, "campaignType");
            return (Criteria) this;
        }

        public Criteria andCampaignTypeLike(String value) {
            addCriterion("campaign_type like", value, "campaignType");
            return (Criteria) this;
        }

        public Criteria andCampaignTypeNotLike(String value) {
            addCriterion("campaign_type not like", value, "campaignType");
            return (Criteria) this;
        }

        public Criteria andCampaignTypeIn(List<String> values) {
            addCriterion("campaign_type in", values, "campaignType");
            return (Criteria) this;
        }

        public Criteria andCampaignTypeNotIn(List<String> values) {
            addCriterion("campaign_type not in", values, "campaignType");
            return (Criteria) this;
        }

        public Criteria andCampaignTypeBetween(String value1, String value2) {
            addCriterion("campaign_type between", value1, value2, "campaignType");
            return (Criteria) this;
        }

        public Criteria andCampaignTypeNotBetween(String value1, String value2) {
            addCriterion("campaign_type not between", value1, value2, "campaignType");
            return (Criteria) this;
        }

        public Criteria andPlacementIsNull() {
            addCriterion("placement is null");
            return (Criteria) this;
        }

        public Criteria andPlacementIsNotNull() {
            addCriterion("placement is not null");
            return (Criteria) this;
        }

        public Criteria andPlacementEqualTo(String value) {
            addCriterion("placement =", value, "placement");
            return (Criteria) this;
        }

        public Criteria andPlacementNotEqualTo(String value) {
            addCriterion("placement <>", value, "placement");
            return (Criteria) this;
        }

        public Criteria andPlacementGreaterThan(String value) {
            addCriterion("placement >", value, "placement");
            return (Criteria) this;
        }

        public Criteria andPlacementGreaterThanOrEqualTo(String value) {
            addCriterion("placement >=", value, "placement");
            return (Criteria) this;
        }

        public Criteria andPlacementLessThan(String value) {
            addCriterion("placement <", value, "placement");
            return (Criteria) this;
        }

        public Criteria andPlacementLessThanOrEqualTo(String value) {
            addCriterion("placement <=", value, "placement");
            return (Criteria) this;
        }

        public Criteria andPlacementLike(String value) {
            addCriterion("placement like", value, "placement");
            return (Criteria) this;
        }

        public Criteria andPlacementNotLike(String value) {
            addCriterion("placement not like", value, "placement");
            return (Criteria) this;
        }

        public Criteria andPlacementIn(List<String> values) {
            addCriterion("placement in", values, "placement");
            return (Criteria) this;
        }

        public Criteria andPlacementNotIn(List<String> values) {
            addCriterion("placement not in", values, "placement");
            return (Criteria) this;
        }

        public Criteria andPlacementBetween(String value1, String value2) {
            addCriterion("placement between", value1, value2, "placement");
            return (Criteria) this;
        }

        public Criteria andPlacementNotBetween(String value1, String value2) {
            addCriterion("placement not between", value1, value2, "placement");
            return (Criteria) this;
        }

        public Criteria andBudgetIsNull() {
            addCriterion("budget is null");
            return (Criteria) this;
        }

        public Criteria andBudgetIsNotNull() {
            addCriterion("budget is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetEqualTo(Integer value) {
            addCriterion("budget =", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotEqualTo(Integer value) {
            addCriterion("budget <>", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetGreaterThan(Integer value) {
            addCriterion("budget >", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetGreaterThanOrEqualTo(Integer value) {
            addCriterion("budget >=", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetLessThan(Integer value) {
            addCriterion("budget <", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetLessThanOrEqualTo(Integer value) {
            addCriterion("budget <=", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetIn(List<Integer> values) {
            addCriterion("budget in", values, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotIn(List<Integer> values) {
            addCriterion("budget not in", values, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetBetween(Integer value1, Integer value2) {
            addCriterion("budget between", value1, value2, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotBetween(Integer value1, Integer value2) {
            addCriterion("budget not between", value1, value2, "budget");
            return (Criteria) this;
        }

        public Criteria andSpendIsNull() {
            addCriterion("spend is null");
            return (Criteria) this;
        }

        public Criteria andSpendIsNotNull() {
            addCriterion("spend is not null");
            return (Criteria) this;
        }

        public Criteria andSpendEqualTo(Short value) {
            addCriterion("spend =", value, "spend");
            return (Criteria) this;
        }

        public Criteria andSpendNotEqualTo(Short value) {
            addCriterion("spend <>", value, "spend");
            return (Criteria) this;
        }

        public Criteria andSpendGreaterThan(Short value) {
            addCriterion("spend >", value, "spend");
            return (Criteria) this;
        }

        public Criteria andSpendGreaterThanOrEqualTo(Short value) {
            addCriterion("spend >=", value, "spend");
            return (Criteria) this;
        }

        public Criteria andSpendLessThan(Short value) {
            addCriterion("spend <", value, "spend");
            return (Criteria) this;
        }

        public Criteria andSpendLessThanOrEqualTo(Short value) {
            addCriterion("spend <=", value, "spend");
            return (Criteria) this;
        }

        public Criteria andSpendIn(List<Short> values) {
            addCriterion("spend in", values, "spend");
            return (Criteria) this;
        }

        public Criteria andSpendNotIn(List<Short> values) {
            addCriterion("spend not in", values, "spend");
            return (Criteria) this;
        }

        public Criteria andSpendBetween(Short value1, Short value2) {
            addCriterion("spend between", value1, value2, "spend");
            return (Criteria) this;
        }

        public Criteria andSpendNotBetween(Short value1, Short value2) {
            addCriterion("spend not between", value1, value2, "spend");
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

        public Criteria andCpcIsNull() {
            addCriterion("cpc is null");
            return (Criteria) this;
        }

        public Criteria andCpcIsNotNull() {
            addCriterion("cpc is not null");
            return (Criteria) this;
        }

        public Criteria andCpcEqualTo(Short value) {
            addCriterion("cpc =", value, "cpc");
            return (Criteria) this;
        }

        public Criteria andCpcNotEqualTo(Short value) {
            addCriterion("cpc <>", value, "cpc");
            return (Criteria) this;
        }

        public Criteria andCpcGreaterThan(Short value) {
            addCriterion("cpc >", value, "cpc");
            return (Criteria) this;
        }

        public Criteria andCpcGreaterThanOrEqualTo(Short value) {
            addCriterion("cpc >=", value, "cpc");
            return (Criteria) this;
        }

        public Criteria andCpcLessThan(Short value) {
            addCriterion("cpc <", value, "cpc");
            return (Criteria) this;
        }

        public Criteria andCpcLessThanOrEqualTo(Short value) {
            addCriterion("cpc <=", value, "cpc");
            return (Criteria) this;
        }

        public Criteria andCpcIn(List<Short> values) {
            addCriterion("cpc in", values, "cpc");
            return (Criteria) this;
        }

        public Criteria andCpcNotIn(List<Short> values) {
            addCriterion("cpc not in", values, "cpc");
            return (Criteria) this;
        }

        public Criteria andCpcBetween(Short value1, Short value2) {
            addCriterion("cpc between", value1, value2, "cpc");
            return (Criteria) this;
        }

        public Criteria andCpcNotBetween(Short value1, Short value2) {
            addCriterion("cpc not between", value1, value2, "cpc");
            return (Criteria) this;
        }

        public Criteria andStoreAddToCartUnitsIsNull() {
            addCriterion("store_add_to_cart_units is null");
            return (Criteria) this;
        }

        public Criteria andStoreAddToCartUnitsIsNotNull() {
            addCriterion("store_add_to_cart_units is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAddToCartUnitsEqualTo(Integer value) {
            addCriterion("store_add_to_cart_units =", value, "storeAddToCartUnits");
            return (Criteria) this;
        }

        public Criteria andStoreAddToCartUnitsNotEqualTo(Integer value) {
            addCriterion("store_add_to_cart_units <>", value, "storeAddToCartUnits");
            return (Criteria) this;
        }

        public Criteria andStoreAddToCartUnitsGreaterThan(Integer value) {
            addCriterion("store_add_to_cart_units >", value, "storeAddToCartUnits");
            return (Criteria) this;
        }

        public Criteria andStoreAddToCartUnitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_add_to_cart_units >=", value, "storeAddToCartUnits");
            return (Criteria) this;
        }

        public Criteria andStoreAddToCartUnitsLessThan(Integer value) {
            addCriterion("store_add_to_cart_units <", value, "storeAddToCartUnits");
            return (Criteria) this;
        }

        public Criteria andStoreAddToCartUnitsLessThanOrEqualTo(Integer value) {
            addCriterion("store_add_to_cart_units <=", value, "storeAddToCartUnits");
            return (Criteria) this;
        }

        public Criteria andStoreAddToCartUnitsIn(List<Integer> values) {
            addCriterion("store_add_to_cart_units in", values, "storeAddToCartUnits");
            return (Criteria) this;
        }

        public Criteria andStoreAddToCartUnitsNotIn(List<Integer> values) {
            addCriterion("store_add_to_cart_units not in", values, "storeAddToCartUnits");
            return (Criteria) this;
        }

        public Criteria andStoreAddToCartUnitsBetween(Integer value1, Integer value2) {
            addCriterion("store_add_to_cart_units between", value1, value2, "storeAddToCartUnits");
            return (Criteria) this;
        }

        public Criteria andStoreAddToCartUnitsNotBetween(Integer value1, Integer value2) {
            addCriterion("store_add_to_cart_units not between", value1, value2, "storeAddToCartUnits");
            return (Criteria) this;
        }

        public Criteria andStoreOrdersIsNull() {
            addCriterion("store_orders is null");
            return (Criteria) this;
        }

        public Criteria andStoreOrdersIsNotNull() {
            addCriterion("store_orders is not null");
            return (Criteria) this;
        }

        public Criteria andStoreOrdersEqualTo(Integer value) {
            addCriterion("store_orders =", value, "storeOrders");
            return (Criteria) this;
        }

        public Criteria andStoreOrdersNotEqualTo(Integer value) {
            addCriterion("store_orders <>", value, "storeOrders");
            return (Criteria) this;
        }

        public Criteria andStoreOrdersGreaterThan(Integer value) {
            addCriterion("store_orders >", value, "storeOrders");
            return (Criteria) this;
        }

        public Criteria andStoreOrdersGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_orders >=", value, "storeOrders");
            return (Criteria) this;
        }

        public Criteria andStoreOrdersLessThan(Integer value) {
            addCriterion("store_orders <", value, "storeOrders");
            return (Criteria) this;
        }

        public Criteria andStoreOrdersLessThanOrEqualTo(Integer value) {
            addCriterion("store_orders <=", value, "storeOrders");
            return (Criteria) this;
        }

        public Criteria andStoreOrdersIn(List<Integer> values) {
            addCriterion("store_orders in", values, "storeOrders");
            return (Criteria) this;
        }

        public Criteria andStoreOrdersNotIn(List<Integer> values) {
            addCriterion("store_orders not in", values, "storeOrders");
            return (Criteria) this;
        }

        public Criteria andStoreOrdersBetween(Integer value1, Integer value2) {
            addCriterion("store_orders between", value1, value2, "storeOrders");
            return (Criteria) this;
        }

        public Criteria andStoreOrdersNotBetween(Integer value1, Integer value2) {
            addCriterion("store_orders not between", value1, value2, "storeOrders");
            return (Criteria) this;
        }

        public Criteria andStoreCvrIsNull() {
            addCriterion("store_cvr is null");
            return (Criteria) this;
        }

        public Criteria andStoreCvrIsNotNull() {
            addCriterion("store_cvr is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCvrEqualTo(Short value) {
            addCriterion("store_cvr =", value, "storeCvr");
            return (Criteria) this;
        }

        public Criteria andStoreCvrNotEqualTo(Short value) {
            addCriterion("store_cvr <>", value, "storeCvr");
            return (Criteria) this;
        }

        public Criteria andStoreCvrGreaterThan(Short value) {
            addCriterion("store_cvr >", value, "storeCvr");
            return (Criteria) this;
        }

        public Criteria andStoreCvrGreaterThanOrEqualTo(Short value) {
            addCriterion("store_cvr >=", value, "storeCvr");
            return (Criteria) this;
        }

        public Criteria andStoreCvrLessThan(Short value) {
            addCriterion("store_cvr <", value, "storeCvr");
            return (Criteria) this;
        }

        public Criteria andStoreCvrLessThanOrEqualTo(Short value) {
            addCriterion("store_cvr <=", value, "storeCvr");
            return (Criteria) this;
        }

        public Criteria andStoreCvrIn(List<Short> values) {
            addCriterion("store_cvr in", values, "storeCvr");
            return (Criteria) this;
        }

        public Criteria andStoreCvrNotIn(List<Short> values) {
            addCriterion("store_cvr not in", values, "storeCvr");
            return (Criteria) this;
        }

        public Criteria andStoreCvrBetween(Short value1, Short value2) {
            addCriterion("store_cvr between", value1, value2, "storeCvr");
            return (Criteria) this;
        }

        public Criteria andStoreCvrNotBetween(Short value1, Short value2) {
            addCriterion("store_cvr not between", value1, value2, "storeCvr");
            return (Criteria) this;
        }

        public Criteria andStoreUnitsSoldIsNull() {
            addCriterion("store_units_sold is null");
            return (Criteria) this;
        }

        public Criteria andStoreUnitsSoldIsNotNull() {
            addCriterion("store_units_sold is not null");
            return (Criteria) this;
        }

        public Criteria andStoreUnitsSoldEqualTo(Integer value) {
            addCriterion("store_units_sold =", value, "storeUnitsSold");
            return (Criteria) this;
        }

        public Criteria andStoreUnitsSoldNotEqualTo(Integer value) {
            addCriterion("store_units_sold <>", value, "storeUnitsSold");
            return (Criteria) this;
        }

        public Criteria andStoreUnitsSoldGreaterThan(Integer value) {
            addCriterion("store_units_sold >", value, "storeUnitsSold");
            return (Criteria) this;
        }

        public Criteria andStoreUnitsSoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_units_sold >=", value, "storeUnitsSold");
            return (Criteria) this;
        }

        public Criteria andStoreUnitsSoldLessThan(Integer value) {
            addCriterion("store_units_sold <", value, "storeUnitsSold");
            return (Criteria) this;
        }

        public Criteria andStoreUnitsSoldLessThanOrEqualTo(Integer value) {
            addCriterion("store_units_sold <=", value, "storeUnitsSold");
            return (Criteria) this;
        }

        public Criteria andStoreUnitsSoldIn(List<Integer> values) {
            addCriterion("store_units_sold in", values, "storeUnitsSold");
            return (Criteria) this;
        }

        public Criteria andStoreUnitsSoldNotIn(List<Integer> values) {
            addCriterion("store_units_sold not in", values, "storeUnitsSold");
            return (Criteria) this;
        }

        public Criteria andStoreUnitsSoldBetween(Integer value1, Integer value2) {
            addCriterion("store_units_sold between", value1, value2, "storeUnitsSold");
            return (Criteria) this;
        }

        public Criteria andStoreUnitsSoldNotBetween(Integer value1, Integer value2) {
            addCriterion("store_units_sold not between", value1, value2, "storeUnitsSold");
            return (Criteria) this;
        }

        public Criteria andStoreRevenueIsNull() {
            addCriterion("store_revenue is null");
            return (Criteria) this;
        }

        public Criteria andStoreRevenueIsNotNull() {
            addCriterion("store_revenue is not null");
            return (Criteria) this;
        }

        public Criteria andStoreRevenueEqualTo(Short value) {
            addCriterion("store_revenue =", value, "storeRevenue");
            return (Criteria) this;
        }

        public Criteria andStoreRevenueNotEqualTo(Short value) {
            addCriterion("store_revenue <>", value, "storeRevenue");
            return (Criteria) this;
        }

        public Criteria andStoreRevenueGreaterThan(Short value) {
            addCriterion("store_revenue >", value, "storeRevenue");
            return (Criteria) this;
        }

        public Criteria andStoreRevenueGreaterThanOrEqualTo(Short value) {
            addCriterion("store_revenue >=", value, "storeRevenue");
            return (Criteria) this;
        }

        public Criteria andStoreRevenueLessThan(Short value) {
            addCriterion("store_revenue <", value, "storeRevenue");
            return (Criteria) this;
        }

        public Criteria andStoreRevenueLessThanOrEqualTo(Short value) {
            addCriterion("store_revenue <=", value, "storeRevenue");
            return (Criteria) this;
        }

        public Criteria andStoreRevenueIn(List<Short> values) {
            addCriterion("store_revenue in", values, "storeRevenue");
            return (Criteria) this;
        }

        public Criteria andStoreRevenueNotIn(List<Short> values) {
            addCriterion("store_revenue not in", values, "storeRevenue");
            return (Criteria) this;
        }

        public Criteria andStoreRevenueBetween(Short value1, Short value2) {
            addCriterion("store_revenue between", value1, value2, "storeRevenue");
            return (Criteria) this;
        }

        public Criteria andStoreRevenueNotBetween(Short value1, Short value2) {
            addCriterion("store_revenue not between", value1, value2, "storeRevenue");
            return (Criteria) this;
        }

        public Criteria andStoreRoiIsNull() {
            addCriterion("store_roi is null");
            return (Criteria) this;
        }

        public Criteria andStoreRoiIsNotNull() {
            addCriterion("store_roi is not null");
            return (Criteria) this;
        }

        public Criteria andStoreRoiEqualTo(Short value) {
            addCriterion("store_roi =", value, "storeRoi");
            return (Criteria) this;
        }

        public Criteria andStoreRoiNotEqualTo(Short value) {
            addCriterion("store_roi <>", value, "storeRoi");
            return (Criteria) this;
        }

        public Criteria andStoreRoiGreaterThan(Short value) {
            addCriterion("store_roi >", value, "storeRoi");
            return (Criteria) this;
        }

        public Criteria andStoreRoiGreaterThanOrEqualTo(Short value) {
            addCriterion("store_roi >=", value, "storeRoi");
            return (Criteria) this;
        }

        public Criteria andStoreRoiLessThan(Short value) {
            addCriterion("store_roi <", value, "storeRoi");
            return (Criteria) this;
        }

        public Criteria andStoreRoiLessThanOrEqualTo(Short value) {
            addCriterion("store_roi <=", value, "storeRoi");
            return (Criteria) this;
        }

        public Criteria andStoreRoiIn(List<Short> values) {
            addCriterion("store_roi in", values, "storeRoi");
            return (Criteria) this;
        }

        public Criteria andStoreRoiNotIn(List<Short> values) {
            addCriterion("store_roi not in", values, "storeRoi");
            return (Criteria) this;
        }

        public Criteria andStoreRoiBetween(Short value1, Short value2) {
            addCriterion("store_roi between", value1, value2, "storeRoi");
            return (Criteria) this;
        }

        public Criteria andStoreRoiNotBetween(Short value1, Short value2) {
            addCriterion("store_roi not between", value1, value2, "storeRoi");
            return (Criteria) this;
        }

        public Criteria andDirectAddToCartUnitsIsNull() {
            addCriterion("direct_add_to_cart_units is null");
            return (Criteria) this;
        }

        public Criteria andDirectAddToCartUnitsIsNotNull() {
            addCriterion("direct_add_to_cart_units is not null");
            return (Criteria) this;
        }

        public Criteria andDirectAddToCartUnitsEqualTo(Integer value) {
            addCriterion("direct_add_to_cart_units =", value, "directAddToCartUnits");
            return (Criteria) this;
        }

        public Criteria andDirectAddToCartUnitsNotEqualTo(Integer value) {
            addCriterion("direct_add_to_cart_units <>", value, "directAddToCartUnits");
            return (Criteria) this;
        }

        public Criteria andDirectAddToCartUnitsGreaterThan(Integer value) {
            addCriterion("direct_add_to_cart_units >", value, "directAddToCartUnits");
            return (Criteria) this;
        }

        public Criteria andDirectAddToCartUnitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("direct_add_to_cart_units >=", value, "directAddToCartUnits");
            return (Criteria) this;
        }

        public Criteria andDirectAddToCartUnitsLessThan(Integer value) {
            addCriterion("direct_add_to_cart_units <", value, "directAddToCartUnits");
            return (Criteria) this;
        }

        public Criteria andDirectAddToCartUnitsLessThanOrEqualTo(Integer value) {
            addCriterion("direct_add_to_cart_units <=", value, "directAddToCartUnits");
            return (Criteria) this;
        }

        public Criteria andDirectAddToCartUnitsIn(List<Integer> values) {
            addCriterion("direct_add_to_cart_units in", values, "directAddToCartUnits");
            return (Criteria) this;
        }

        public Criteria andDirectAddToCartUnitsNotIn(List<Integer> values) {
            addCriterion("direct_add_to_cart_units not in", values, "directAddToCartUnits");
            return (Criteria) this;
        }

        public Criteria andDirectAddToCartUnitsBetween(Integer value1, Integer value2) {
            addCriterion("direct_add_to_cart_units between", value1, value2, "directAddToCartUnits");
            return (Criteria) this;
        }

        public Criteria andDirectAddToCartUnitsNotBetween(Integer value1, Integer value2) {
            addCriterion("direct_add_to_cart_units not between", value1, value2, "directAddToCartUnits");
            return (Criteria) this;
        }

        public Criteria andDirectOrdersIsNull() {
            addCriterion("direct_orders is null");
            return (Criteria) this;
        }

        public Criteria andDirectOrdersIsNotNull() {
            addCriterion("direct_orders is not null");
            return (Criteria) this;
        }

        public Criteria andDirectOrdersEqualTo(Integer value) {
            addCriterion("direct_orders =", value, "directOrders");
            return (Criteria) this;
        }

        public Criteria andDirectOrdersNotEqualTo(Integer value) {
            addCriterion("direct_orders <>", value, "directOrders");
            return (Criteria) this;
        }

        public Criteria andDirectOrdersGreaterThan(Integer value) {
            addCriterion("direct_orders >", value, "directOrders");
            return (Criteria) this;
        }

        public Criteria andDirectOrdersGreaterThanOrEqualTo(Integer value) {
            addCriterion("direct_orders >=", value, "directOrders");
            return (Criteria) this;
        }

        public Criteria andDirectOrdersLessThan(Integer value) {
            addCriterion("direct_orders <", value, "directOrders");
            return (Criteria) this;
        }

        public Criteria andDirectOrdersLessThanOrEqualTo(Integer value) {
            addCriterion("direct_orders <=", value, "directOrders");
            return (Criteria) this;
        }

        public Criteria andDirectOrdersIn(List<Integer> values) {
            addCriterion("direct_orders in", values, "directOrders");
            return (Criteria) this;
        }

        public Criteria andDirectOrdersNotIn(List<Integer> values) {
            addCriterion("direct_orders not in", values, "directOrders");
            return (Criteria) this;
        }

        public Criteria andDirectOrdersBetween(Integer value1, Integer value2) {
            addCriterion("direct_orders between", value1, value2, "directOrders");
            return (Criteria) this;
        }

        public Criteria andDirectOrdersNotBetween(Integer value1, Integer value2) {
            addCriterion("direct_orders not between", value1, value2, "directOrders");
            return (Criteria) this;
        }

        public Criteria andDirectCvrIsNull() {
            addCriterion("direct_cvr is null");
            return (Criteria) this;
        }

        public Criteria andDirectCvrIsNotNull() {
            addCriterion("direct_cvr is not null");
            return (Criteria) this;
        }

        public Criteria andDirectCvrEqualTo(Short value) {
            addCriterion("direct_cvr =", value, "directCvr");
            return (Criteria) this;
        }

        public Criteria andDirectCvrNotEqualTo(Short value) {
            addCriterion("direct_cvr <>", value, "directCvr");
            return (Criteria) this;
        }

        public Criteria andDirectCvrGreaterThan(Short value) {
            addCriterion("direct_cvr >", value, "directCvr");
            return (Criteria) this;
        }

        public Criteria andDirectCvrGreaterThanOrEqualTo(Short value) {
            addCriterion("direct_cvr >=", value, "directCvr");
            return (Criteria) this;
        }

        public Criteria andDirectCvrLessThan(Short value) {
            addCriterion("direct_cvr <", value, "directCvr");
            return (Criteria) this;
        }

        public Criteria andDirectCvrLessThanOrEqualTo(Short value) {
            addCriterion("direct_cvr <=", value, "directCvr");
            return (Criteria) this;
        }

        public Criteria andDirectCvrIn(List<Short> values) {
            addCriterion("direct_cvr in", values, "directCvr");
            return (Criteria) this;
        }

        public Criteria andDirectCvrNotIn(List<Short> values) {
            addCriterion("direct_cvr not in", values, "directCvr");
            return (Criteria) this;
        }

        public Criteria andDirectCvrBetween(Short value1, Short value2) {
            addCriterion("direct_cvr between", value1, value2, "directCvr");
            return (Criteria) this;
        }

        public Criteria andDirectCvrNotBetween(Short value1, Short value2) {
            addCriterion("direct_cvr not between", value1, value2, "directCvr");
            return (Criteria) this;
        }

        public Criteria andDirectUnitsSoldIsNull() {
            addCriterion("direct_units_sold is null");
            return (Criteria) this;
        }

        public Criteria andDirectUnitsSoldIsNotNull() {
            addCriterion("direct_units_sold is not null");
            return (Criteria) this;
        }

        public Criteria andDirectUnitsSoldEqualTo(Integer value) {
            addCriterion("direct_units_sold =", value, "directUnitsSold");
            return (Criteria) this;
        }

        public Criteria andDirectUnitsSoldNotEqualTo(Integer value) {
            addCriterion("direct_units_sold <>", value, "directUnitsSold");
            return (Criteria) this;
        }

        public Criteria andDirectUnitsSoldGreaterThan(Integer value) {
            addCriterion("direct_units_sold >", value, "directUnitsSold");
            return (Criteria) this;
        }

        public Criteria andDirectUnitsSoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("direct_units_sold >=", value, "directUnitsSold");
            return (Criteria) this;
        }

        public Criteria andDirectUnitsSoldLessThan(Integer value) {
            addCriterion("direct_units_sold <", value, "directUnitsSold");
            return (Criteria) this;
        }

        public Criteria andDirectUnitsSoldLessThanOrEqualTo(Integer value) {
            addCriterion("direct_units_sold <=", value, "directUnitsSold");
            return (Criteria) this;
        }

        public Criteria andDirectUnitsSoldIn(List<Integer> values) {
            addCriterion("direct_units_sold in", values, "directUnitsSold");
            return (Criteria) this;
        }

        public Criteria andDirectUnitsSoldNotIn(List<Integer> values) {
            addCriterion("direct_units_sold not in", values, "directUnitsSold");
            return (Criteria) this;
        }

        public Criteria andDirectUnitsSoldBetween(Integer value1, Integer value2) {
            addCriterion("direct_units_sold between", value1, value2, "directUnitsSold");
            return (Criteria) this;
        }

        public Criteria andDirectUnitsSoldNotBetween(Integer value1, Integer value2) {
            addCriterion("direct_units_sold not between", value1, value2, "directUnitsSold");
            return (Criteria) this;
        }

        public Criteria andDirectRevenueIsNull() {
            addCriterion("direct_revenue is null");
            return (Criteria) this;
        }

        public Criteria andDirectRevenueIsNotNull() {
            addCriterion("direct_revenue is not null");
            return (Criteria) this;
        }

        public Criteria andDirectRevenueEqualTo(Short value) {
            addCriterion("direct_revenue =", value, "directRevenue");
            return (Criteria) this;
        }

        public Criteria andDirectRevenueNotEqualTo(Short value) {
            addCriterion("direct_revenue <>", value, "directRevenue");
            return (Criteria) this;
        }

        public Criteria andDirectRevenueGreaterThan(Short value) {
            addCriterion("direct_revenue >", value, "directRevenue");
            return (Criteria) this;
        }

        public Criteria andDirectRevenueGreaterThanOrEqualTo(Short value) {
            addCriterion("direct_revenue >=", value, "directRevenue");
            return (Criteria) this;
        }

        public Criteria andDirectRevenueLessThan(Short value) {
            addCriterion("direct_revenue <", value, "directRevenue");
            return (Criteria) this;
        }

        public Criteria andDirectRevenueLessThanOrEqualTo(Short value) {
            addCriterion("direct_revenue <=", value, "directRevenue");
            return (Criteria) this;
        }

        public Criteria andDirectRevenueIn(List<Short> values) {
            addCriterion("direct_revenue in", values, "directRevenue");
            return (Criteria) this;
        }

        public Criteria andDirectRevenueNotIn(List<Short> values) {
            addCriterion("direct_revenue not in", values, "directRevenue");
            return (Criteria) this;
        }

        public Criteria andDirectRevenueBetween(Short value1, Short value2) {
            addCriterion("direct_revenue between", value1, value2, "directRevenue");
            return (Criteria) this;
        }

        public Criteria andDirectRevenueNotBetween(Short value1, Short value2) {
            addCriterion("direct_revenue not between", value1, value2, "directRevenue");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
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