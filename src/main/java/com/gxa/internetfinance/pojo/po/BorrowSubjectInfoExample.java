package com.gxa.internetfinance.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BorrowSubjectInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowSubjectInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andIncrementalAmountIsNull() {
            addCriterion("incremental_amount is null");
            return (Criteria) this;
        }

        public Criteria andIncrementalAmountIsNotNull() {
            addCriterion("incremental_amount is not null");
            return (Criteria) this;
        }

        public Criteria andIncrementalAmountEqualTo(Integer value) {
            addCriterion("incremental_amount =", value, "incrementalAmount");
            return (Criteria) this;
        }

        public Criteria andIncrementalAmountNotEqualTo(Integer value) {
            addCriterion("incremental_amount <>", value, "incrementalAmount");
            return (Criteria) this;
        }

        public Criteria andIncrementalAmountGreaterThan(Integer value) {
            addCriterion("incremental_amount >", value, "incrementalAmount");
            return (Criteria) this;
        }

        public Criteria andIncrementalAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("incremental_amount >=", value, "incrementalAmount");
            return (Criteria) this;
        }

        public Criteria andIncrementalAmountLessThan(Integer value) {
            addCriterion("incremental_amount <", value, "incrementalAmount");
            return (Criteria) this;
        }

        public Criteria andIncrementalAmountLessThanOrEqualTo(Integer value) {
            addCriterion("incremental_amount <=", value, "incrementalAmount");
            return (Criteria) this;
        }

        public Criteria andIncrementalAmountIn(List<Integer> values) {
            addCriterion("incremental_amount in", values, "incrementalAmount");
            return (Criteria) this;
        }

        public Criteria andIncrementalAmountNotIn(List<Integer> values) {
            addCriterion("incremental_amount not in", values, "incrementalAmount");
            return (Criteria) this;
        }

        public Criteria andIncrementalAmountBetween(Integer value1, Integer value2) {
            addCriterion("incremental_amount between", value1, value2, "incrementalAmount");
            return (Criteria) this;
        }

        public Criteria andIncrementalAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("incremental_amount not between", value1, value2, "incrementalAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentInterestCalWayIsNull() {
            addCriterion("investment_interest_cal_way is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentInterestCalWayIsNotNull() {
            addCriterion("investment_interest_cal_way is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentInterestCalWayEqualTo(String value) {
            addCriterion("investment_interest_cal_way =", value, "investmentInterestCalWay");
            return (Criteria) this;
        }

        public Criteria andInvestmentInterestCalWayNotEqualTo(String value) {
            addCriterion("investment_interest_cal_way <>", value, "investmentInterestCalWay");
            return (Criteria) this;
        }

        public Criteria andInvestmentInterestCalWayGreaterThan(String value) {
            addCriterion("investment_interest_cal_way >", value, "investmentInterestCalWay");
            return (Criteria) this;
        }

        public Criteria andInvestmentInterestCalWayGreaterThanOrEqualTo(String value) {
            addCriterion("investment_interest_cal_way >=", value, "investmentInterestCalWay");
            return (Criteria) this;
        }

        public Criteria andInvestmentInterestCalWayLessThan(String value) {
            addCriterion("investment_interest_cal_way <", value, "investmentInterestCalWay");
            return (Criteria) this;
        }

        public Criteria andInvestmentInterestCalWayLessThanOrEqualTo(String value) {
            addCriterion("investment_interest_cal_way <=", value, "investmentInterestCalWay");
            return (Criteria) this;
        }

        public Criteria andInvestmentInterestCalWayLike(String value) {
            addCriterion("investment_interest_cal_way like", value, "investmentInterestCalWay");
            return (Criteria) this;
        }

        public Criteria andInvestmentInterestCalWayNotLike(String value) {
            addCriterion("investment_interest_cal_way not like", value, "investmentInterestCalWay");
            return (Criteria) this;
        }

        public Criteria andInvestmentInterestCalWayIn(List<String> values) {
            addCriterion("investment_interest_cal_way in", values, "investmentInterestCalWay");
            return (Criteria) this;
        }

        public Criteria andInvestmentInterestCalWayNotIn(List<String> values) {
            addCriterion("investment_interest_cal_way not in", values, "investmentInterestCalWay");
            return (Criteria) this;
        }

        public Criteria andInvestmentInterestCalWayBetween(String value1, String value2) {
            addCriterion("investment_interest_cal_way between", value1, value2, "investmentInterestCalWay");
            return (Criteria) this;
        }

        public Criteria andInvestmentInterestCalWayNotBetween(String value1, String value2) {
            addCriterion("investment_interest_cal_way not between", value1, value2, "investmentInterestCalWay");
            return (Criteria) this;
        }

        public Criteria andFeaturedIsNull() {
            addCriterion("featured is null");
            return (Criteria) this;
        }

        public Criteria andFeaturedIsNotNull() {
            addCriterion("featured is not null");
            return (Criteria) this;
        }

        public Criteria andFeaturedEqualTo(Boolean value) {
            addCriterion("featured =", value, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedNotEqualTo(Boolean value) {
            addCriterion("featured <>", value, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedGreaterThan(Boolean value) {
            addCriterion("featured >", value, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("featured >=", value, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedLessThan(Boolean value) {
            addCriterion("featured <", value, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedLessThanOrEqualTo(Boolean value) {
            addCriterion("featured <=", value, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedIn(List<Boolean> values) {
            addCriterion("featured in", values, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedNotIn(List<Boolean> values) {
            addCriterion("featured not in", values, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedBetween(Boolean value1, Boolean value2) {
            addCriterion("featured between", value1, value2, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("featured not between", value1, value2, "featured");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTimeIsNull() {
            addCriterion("recruitment_time is null");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTimeIsNotNull() {
            addCriterion("recruitment_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTimeEqualTo(Integer value) {
            addCriterion("recruitment_time =", value, "recruitmentTime");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTimeNotEqualTo(Integer value) {
            addCriterion("recruitment_time <>", value, "recruitmentTime");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTimeGreaterThan(Integer value) {
            addCriterion("recruitment_time >", value, "recruitmentTime");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("recruitment_time >=", value, "recruitmentTime");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTimeLessThan(Integer value) {
            addCriterion("recruitment_time <", value, "recruitmentTime");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTimeLessThanOrEqualTo(Integer value) {
            addCriterion("recruitment_time <=", value, "recruitmentTime");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTimeIn(List<Integer> values) {
            addCriterion("recruitment_time in", values, "recruitmentTime");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTimeNotIn(List<Integer> values) {
            addCriterion("recruitment_time not in", values, "recruitmentTime");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTimeBetween(Integer value1, Integer value2) {
            addCriterion("recruitment_time between", value1, value2, "recruitmentTime");
            return (Criteria) this;
        }

        public Criteria andRecruitmentTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("recruitment_time not between", value1, value2, "recruitmentTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeIsNull() {
            addCriterion("sale_time is null");
            return (Criteria) this;
        }

        public Criteria andSaleTimeIsNotNull() {
            addCriterion("sale_time is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTimeEqualTo(Date value) {
            addCriterion("sale_time =", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeNotEqualTo(Date value) {
            addCriterion("sale_time <>", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeGreaterThan(Date value) {
            addCriterion("sale_time >", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sale_time >=", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeLessThan(Date value) {
            addCriterion("sale_time <", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeLessThanOrEqualTo(Date value) {
            addCriterion("sale_time <=", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeIn(List<Date> values) {
            addCriterion("sale_time in", values, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeNotIn(List<Date> values) {
            addCriterion("sale_time not in", values, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeBetween(Date value1, Date value2) {
            addCriterion("sale_time between", value1, value2, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeNotBetween(Date value1, Date value2) {
            addCriterion("sale_time not between", value1, value2, "saleTime");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andMinInvestmentAmountIsNull() {
            addCriterion("min_investment_amount is null");
            return (Criteria) this;
        }

        public Criteria andMinInvestmentAmountIsNotNull() {
            addCriterion("min_investment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMinInvestmentAmountEqualTo(Integer value) {
            addCriterion("min_investment_amount =", value, "minInvestmentAmount");
            return (Criteria) this;
        }

        public Criteria andMinInvestmentAmountNotEqualTo(Integer value) {
            addCriterion("min_investment_amount <>", value, "minInvestmentAmount");
            return (Criteria) this;
        }

        public Criteria andMinInvestmentAmountGreaterThan(Integer value) {
            addCriterion("min_investment_amount >", value, "minInvestmentAmount");
            return (Criteria) this;
        }

        public Criteria andMinInvestmentAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_investment_amount >=", value, "minInvestmentAmount");
            return (Criteria) this;
        }

        public Criteria andMinInvestmentAmountLessThan(Integer value) {
            addCriterion("min_investment_amount <", value, "minInvestmentAmount");
            return (Criteria) this;
        }

        public Criteria andMinInvestmentAmountLessThanOrEqualTo(Integer value) {
            addCriterion("min_investment_amount <=", value, "minInvestmentAmount");
            return (Criteria) this;
        }

        public Criteria andMinInvestmentAmountIn(List<Integer> values) {
            addCriterion("min_investment_amount in", values, "minInvestmentAmount");
            return (Criteria) this;
        }

        public Criteria andMinInvestmentAmountNotIn(List<Integer> values) {
            addCriterion("min_investment_amount not in", values, "minInvestmentAmount");
            return (Criteria) this;
        }

        public Criteria andMinInvestmentAmountBetween(Integer value1, Integer value2) {
            addCriterion("min_investment_amount between", value1, value2, "minInvestmentAmount");
            return (Criteria) this;
        }

        public Criteria andMinInvestmentAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("min_investment_amount not between", value1, value2, "minInvestmentAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestmentAmountIsNull() {
            addCriterion("max_investment_amount is null");
            return (Criteria) this;
        }

        public Criteria andMaxInvestmentAmountIsNotNull() {
            addCriterion("max_investment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMaxInvestmentAmountEqualTo(Integer value) {
            addCriterion("max_investment_amount =", value, "maxInvestmentAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestmentAmountNotEqualTo(Integer value) {
            addCriterion("max_investment_amount <>", value, "maxInvestmentAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestmentAmountGreaterThan(Integer value) {
            addCriterion("max_investment_amount >", value, "maxInvestmentAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestmentAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_investment_amount >=", value, "maxInvestmentAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestmentAmountLessThan(Integer value) {
            addCriterion("max_investment_amount <", value, "maxInvestmentAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestmentAmountLessThanOrEqualTo(Integer value) {
            addCriterion("max_investment_amount <=", value, "maxInvestmentAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestmentAmountIn(List<Integer> values) {
            addCriterion("max_investment_amount in", values, "maxInvestmentAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestmentAmountNotIn(List<Integer> values) {
            addCriterion("max_investment_amount not in", values, "maxInvestmentAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestmentAmountBetween(Integer value1, Integer value2) {
            addCriterion("max_investment_amount between", value1, value2, "maxInvestmentAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestmentAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("max_investment_amount not between", value1, value2, "maxInvestmentAmount");
            return (Criteria) this;
        }

        public Criteria andShelfChannelIsNull() {
            addCriterion("shelf_channel is null");
            return (Criteria) this;
        }

        public Criteria andShelfChannelIsNotNull() {
            addCriterion("shelf_channel is not null");
            return (Criteria) this;
        }

        public Criteria andShelfChannelEqualTo(String value) {
            addCriterion("shelf_channel =", value, "shelfChannel");
            return (Criteria) this;
        }

        public Criteria andShelfChannelNotEqualTo(String value) {
            addCriterion("shelf_channel <>", value, "shelfChannel");
            return (Criteria) this;
        }

        public Criteria andShelfChannelGreaterThan(String value) {
            addCriterion("shelf_channel >", value, "shelfChannel");
            return (Criteria) this;
        }

        public Criteria andShelfChannelGreaterThanOrEqualTo(String value) {
            addCriterion("shelf_channel >=", value, "shelfChannel");
            return (Criteria) this;
        }

        public Criteria andShelfChannelLessThan(String value) {
            addCriterion("shelf_channel <", value, "shelfChannel");
            return (Criteria) this;
        }

        public Criteria andShelfChannelLessThanOrEqualTo(String value) {
            addCriterion("shelf_channel <=", value, "shelfChannel");
            return (Criteria) this;
        }

        public Criteria andShelfChannelLike(String value) {
            addCriterion("shelf_channel like", value, "shelfChannel");
            return (Criteria) this;
        }

        public Criteria andShelfChannelNotLike(String value) {
            addCriterion("shelf_channel not like", value, "shelfChannel");
            return (Criteria) this;
        }

        public Criteria andShelfChannelIn(List<String> values) {
            addCriterion("shelf_channel in", values, "shelfChannel");
            return (Criteria) this;
        }

        public Criteria andShelfChannelNotIn(List<String> values) {
            addCriterion("shelf_channel not in", values, "shelfChannel");
            return (Criteria) this;
        }

        public Criteria andShelfChannelBetween(String value1, String value2) {
            addCriterion("shelf_channel between", value1, value2, "shelfChannel");
            return (Criteria) this;
        }

        public Criteria andShelfChannelNotBetween(String value1, String value2) {
            addCriterion("shelf_channel not between", value1, value2, "shelfChannel");
            return (Criteria) this;
        }

        public Criteria andExclusiveForNovicesIsNull() {
            addCriterion("exclusive_for_novices is null");
            return (Criteria) this;
        }

        public Criteria andExclusiveForNovicesIsNotNull() {
            addCriterion("exclusive_for_novices is not null");
            return (Criteria) this;
        }

        public Criteria andExclusiveForNovicesEqualTo(Boolean value) {
            addCriterion("exclusive_for_novices =", value, "exclusiveForNovices");
            return (Criteria) this;
        }

        public Criteria andExclusiveForNovicesNotEqualTo(Boolean value) {
            addCriterion("exclusive_for_novices <>", value, "exclusiveForNovices");
            return (Criteria) this;
        }

        public Criteria andExclusiveForNovicesGreaterThan(Boolean value) {
            addCriterion("exclusive_for_novices >", value, "exclusiveForNovices");
            return (Criteria) this;
        }

        public Criteria andExclusiveForNovicesGreaterThanOrEqualTo(Boolean value) {
            addCriterion("exclusive_for_novices >=", value, "exclusiveForNovices");
            return (Criteria) this;
        }

        public Criteria andExclusiveForNovicesLessThan(Boolean value) {
            addCriterion("exclusive_for_novices <", value, "exclusiveForNovices");
            return (Criteria) this;
        }

        public Criteria andExclusiveForNovicesLessThanOrEqualTo(Boolean value) {
            addCriterion("exclusive_for_novices <=", value, "exclusiveForNovices");
            return (Criteria) this;
        }

        public Criteria andExclusiveForNovicesIn(List<Boolean> values) {
            addCriterion("exclusive_for_novices in", values, "exclusiveForNovices");
            return (Criteria) this;
        }

        public Criteria andExclusiveForNovicesNotIn(List<Boolean> values) {
            addCriterion("exclusive_for_novices not in", values, "exclusiveForNovices");
            return (Criteria) this;
        }

        public Criteria andExclusiveForNovicesBetween(Boolean value1, Boolean value2) {
            addCriterion("exclusive_for_novices between", value1, value2, "exclusiveForNovices");
            return (Criteria) this;
        }

        public Criteria andExclusiveForNovicesNotBetween(Boolean value1, Boolean value2) {
            addCriterion("exclusive_for_novices not between", value1, value2, "exclusiveForNovices");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedIsNull() {
            addCriterion("gmt_created is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedIsNotNull() {
            addCriterion("gmt_created is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedEqualTo(Date value) {
            addCriterion("gmt_created =", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedNotEqualTo(Date value) {
            addCriterion("gmt_created <>", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedGreaterThan(Date value) {
            addCriterion("gmt_created >", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_created >=", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedLessThan(Date value) {
            addCriterion("gmt_created <", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_created <=", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedIn(List<Date> values) {
            addCriterion("gmt_created in", values, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedNotIn(List<Date> values) {
            addCriterion("gmt_created not in", values, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedBetween(Date value1, Date value2) {
            addCriterion("gmt_created between", value1, value2, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_created not between", value1, value2, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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