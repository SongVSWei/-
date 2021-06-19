package com.gxa.internetfinance.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BorrowGuaranteeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowGuaranteeExample() {
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

        public Criteria andBaseInfoIdIsNull() {
            addCriterion("base_info_id is null");
            return (Criteria) this;
        }

        public Criteria andBaseInfoIdIsNotNull() {
            addCriterion("base_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andBaseInfoIdEqualTo(Integer value) {
            addCriterion("base_info_id =", value, "baseInfoId");
            return (Criteria) this;
        }

        public Criteria andBaseInfoIdNotEqualTo(Integer value) {
            addCriterion("base_info_id <>", value, "baseInfoId");
            return (Criteria) this;
        }

        public Criteria andBaseInfoIdGreaterThan(Integer value) {
            addCriterion("base_info_id >", value, "baseInfoId");
            return (Criteria) this;
        }

        public Criteria andBaseInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("base_info_id >=", value, "baseInfoId");
            return (Criteria) this;
        }

        public Criteria andBaseInfoIdLessThan(Integer value) {
            addCriterion("base_info_id <", value, "baseInfoId");
            return (Criteria) this;
        }

        public Criteria andBaseInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("base_info_id <=", value, "baseInfoId");
            return (Criteria) this;
        }

        public Criteria andBaseInfoIdIn(List<Integer> values) {
            addCriterion("base_info_id in", values, "baseInfoId");
            return (Criteria) this;
        }

        public Criteria andBaseInfoIdNotIn(List<Integer> values) {
            addCriterion("base_info_id not in", values, "baseInfoId");
            return (Criteria) this;
        }

        public Criteria andBaseInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("base_info_id between", value1, value2, "baseInfoId");
            return (Criteria) this;
        }

        public Criteria andBaseInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("base_info_id not between", value1, value2, "baseInfoId");
            return (Criteria) this;
        }

        public Criteria andGuaranteedIsNull() {
            addCriterion("guaranteed is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteedIsNotNull() {
            addCriterion("guaranteed is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteedEqualTo(Boolean value) {
            addCriterion("guaranteed =", value, "guaranteed");
            return (Criteria) this;
        }

        public Criteria andGuaranteedNotEqualTo(Boolean value) {
            addCriterion("guaranteed <>", value, "guaranteed");
            return (Criteria) this;
        }

        public Criteria andGuaranteedGreaterThan(Boolean value) {
            addCriterion("guaranteed >", value, "guaranteed");
            return (Criteria) this;
        }

        public Criteria andGuaranteedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("guaranteed >=", value, "guaranteed");
            return (Criteria) this;
        }

        public Criteria andGuaranteedLessThan(Boolean value) {
            addCriterion("guaranteed <", value, "guaranteed");
            return (Criteria) this;
        }

        public Criteria andGuaranteedLessThanOrEqualTo(Boolean value) {
            addCriterion("guaranteed <=", value, "guaranteed");
            return (Criteria) this;
        }

        public Criteria andGuaranteedIn(List<Boolean> values) {
            addCriterion("guaranteed in", values, "guaranteed");
            return (Criteria) this;
        }

        public Criteria andGuaranteedNotIn(List<Boolean> values) {
            addCriterion("guaranteed not in", values, "guaranteed");
            return (Criteria) this;
        }

        public Criteria andGuaranteedBetween(Boolean value1, Boolean value2) {
            addCriterion("guaranteed between", value1, value2, "guaranteed");
            return (Criteria) this;
        }

        public Criteria andGuaranteedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("guaranteed not between", value1, value2, "guaranteed");
            return (Criteria) this;
        }

        public Criteria andMortgageTypeIsNull() {
            addCriterion("mortgage_type is null");
            return (Criteria) this;
        }

        public Criteria andMortgageTypeIsNotNull() {
            addCriterion("mortgage_type is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageTypeEqualTo(Integer value) {
            addCriterion("mortgage_type =", value, "mortgageType");
            return (Criteria) this;
        }

        public Criteria andMortgageTypeNotEqualTo(Integer value) {
            addCriterion("mortgage_type <>", value, "mortgageType");
            return (Criteria) this;
        }

        public Criteria andMortgageTypeGreaterThan(Integer value) {
            addCriterion("mortgage_type >", value, "mortgageType");
            return (Criteria) this;
        }

        public Criteria andMortgageTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mortgage_type >=", value, "mortgageType");
            return (Criteria) this;
        }

        public Criteria andMortgageTypeLessThan(Integer value) {
            addCriterion("mortgage_type <", value, "mortgageType");
            return (Criteria) this;
        }

        public Criteria andMortgageTypeLessThanOrEqualTo(Integer value) {
            addCriterion("mortgage_type <=", value, "mortgageType");
            return (Criteria) this;
        }

        public Criteria andMortgageTypeIn(List<Integer> values) {
            addCriterion("mortgage_type in", values, "mortgageType");
            return (Criteria) this;
        }

        public Criteria andMortgageTypeNotIn(List<Integer> values) {
            addCriterion("mortgage_type not in", values, "mortgageType");
            return (Criteria) this;
        }

        public Criteria andMortgageTypeBetween(Integer value1, Integer value2) {
            addCriterion("mortgage_type between", value1, value2, "mortgageType");
            return (Criteria) this;
        }

        public Criteria andMortgageTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("mortgage_type not between", value1, value2, "mortgageType");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyIsNull() {
            addCriterion("guarantee_agency is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyIsNotNull() {
            addCriterion("guarantee_agency is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyEqualTo(String value) {
            addCriterion("guarantee_agency =", value, "guaranteeAgency");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyNotEqualTo(String value) {
            addCriterion("guarantee_agency <>", value, "guaranteeAgency");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyGreaterThan(String value) {
            addCriterion("guarantee_agency >", value, "guaranteeAgency");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyGreaterThanOrEqualTo(String value) {
            addCriterion("guarantee_agency >=", value, "guaranteeAgency");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyLessThan(String value) {
            addCriterion("guarantee_agency <", value, "guaranteeAgency");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyLessThanOrEqualTo(String value) {
            addCriterion("guarantee_agency <=", value, "guaranteeAgency");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyLike(String value) {
            addCriterion("guarantee_agency like", value, "guaranteeAgency");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyNotLike(String value) {
            addCriterion("guarantee_agency not like", value, "guaranteeAgency");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyIn(List<String> values) {
            addCriterion("guarantee_agency in", values, "guaranteeAgency");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyNotIn(List<String> values) {
            addCriterion("guarantee_agency not in", values, "guaranteeAgency");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyBetween(String value1, String value2) {
            addCriterion("guarantee_agency between", value1, value2, "guaranteeAgency");
            return (Criteria) this;
        }

        public Criteria andGuaranteeAgencyNotBetween(String value1, String value2) {
            addCriterion("guarantee_agency not between", value1, value2, "guaranteeAgency");
            return (Criteria) this;
        }

        public Criteria andCollateralIsNull() {
            addCriterion("collateral is null");
            return (Criteria) this;
        }

        public Criteria andCollateralIsNotNull() {
            addCriterion("collateral is not null");
            return (Criteria) this;
        }

        public Criteria andCollateralEqualTo(String value) {
            addCriterion("collateral =", value, "collateral");
            return (Criteria) this;
        }

        public Criteria andCollateralNotEqualTo(String value) {
            addCriterion("collateral <>", value, "collateral");
            return (Criteria) this;
        }

        public Criteria andCollateralGreaterThan(String value) {
            addCriterion("collateral >", value, "collateral");
            return (Criteria) this;
        }

        public Criteria andCollateralGreaterThanOrEqualTo(String value) {
            addCriterion("collateral >=", value, "collateral");
            return (Criteria) this;
        }

        public Criteria andCollateralLessThan(String value) {
            addCriterion("collateral <", value, "collateral");
            return (Criteria) this;
        }

        public Criteria andCollateralLessThanOrEqualTo(String value) {
            addCriterion("collateral <=", value, "collateral");
            return (Criteria) this;
        }

        public Criteria andCollateralLike(String value) {
            addCriterion("collateral like", value, "collateral");
            return (Criteria) this;
        }

        public Criteria andCollateralNotLike(String value) {
            addCriterion("collateral not like", value, "collateral");
            return (Criteria) this;
        }

        public Criteria andCollateralIn(List<String> values) {
            addCriterion("collateral in", values, "collateral");
            return (Criteria) this;
        }

        public Criteria andCollateralNotIn(List<String> values) {
            addCriterion("collateral not in", values, "collateral");
            return (Criteria) this;
        }

        public Criteria andCollateralBetween(String value1, String value2) {
            addCriterion("collateral between", value1, value2, "collateral");
            return (Criteria) this;
        }

        public Criteria andCollateralNotBetween(String value1, String value2) {
            addCriterion("collateral not between", value1, value2, "collateral");
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