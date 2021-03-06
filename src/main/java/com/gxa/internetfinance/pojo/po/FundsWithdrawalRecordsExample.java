package com.gxa.internetfinance.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FundsWithdrawalRecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FundsWithdrawalRecordsExample() {
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

        public Criteria andWithdrawalAmountIsNull() {
            addCriterion("withdrawal_amount is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalAmountIsNotNull() {
            addCriterion("withdrawal_amount is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalAmountEqualTo(Double value) {
            addCriterion("withdrawal_amount =", value, "withdrawalAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalAmountNotEqualTo(Double value) {
            addCriterion("withdrawal_amount <>", value, "withdrawalAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalAmountGreaterThan(Double value) {
            addCriterion("withdrawal_amount >", value, "withdrawalAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("withdrawal_amount >=", value, "withdrawalAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalAmountLessThan(Double value) {
            addCriterion("withdrawal_amount <", value, "withdrawalAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalAmountLessThanOrEqualTo(Double value) {
            addCriterion("withdrawal_amount <=", value, "withdrawalAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalAmountIn(List<Double> values) {
            addCriterion("withdrawal_amount in", values, "withdrawalAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalAmountNotIn(List<Double> values) {
            addCriterion("withdrawal_amount not in", values, "withdrawalAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalAmountBetween(Double value1, Double value2) {
            addCriterion("withdrawal_amount between", value1, value2, "withdrawalAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalAmountNotBetween(Double value1, Double value2) {
            addCriterion("withdrawal_amount not between", value1, value2, "withdrawalAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalFeeIsNull() {
            addCriterion("withdrawal_fee is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalFeeIsNotNull() {
            addCriterion("withdrawal_fee is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalFeeEqualTo(Double value) {
            addCriterion("withdrawal_fee =", value, "withdrawalFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawalFeeNotEqualTo(Double value) {
            addCriterion("withdrawal_fee <>", value, "withdrawalFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawalFeeGreaterThan(Double value) {
            addCriterion("withdrawal_fee >", value, "withdrawalFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawalFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("withdrawal_fee >=", value, "withdrawalFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawalFeeLessThan(Double value) {
            addCriterion("withdrawal_fee <", value, "withdrawalFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawalFeeLessThanOrEqualTo(Double value) {
            addCriterion("withdrawal_fee <=", value, "withdrawalFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawalFeeIn(List<Double> values) {
            addCriterion("withdrawal_fee in", values, "withdrawalFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawalFeeNotIn(List<Double> values) {
            addCriterion("withdrawal_fee not in", values, "withdrawalFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawalFeeBetween(Double value1, Double value2) {
            addCriterion("withdrawal_fee between", value1, value2, "withdrawalFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawalFeeNotBetween(Double value1, Double value2) {
            addCriterion("withdrawal_fee not between", value1, value2, "withdrawalFee");
            return (Criteria) this;
        }

        public Criteria andAmountToAccountIsNull() {
            addCriterion("amount_to_account is null");
            return (Criteria) this;
        }

        public Criteria andAmountToAccountIsNotNull() {
            addCriterion("amount_to_account is not null");
            return (Criteria) this;
        }

        public Criteria andAmountToAccountEqualTo(Double value) {
            addCriterion("amount_to_account =", value, "amountToAccount");
            return (Criteria) this;
        }

        public Criteria andAmountToAccountNotEqualTo(Double value) {
            addCriterion("amount_to_account <>", value, "amountToAccount");
            return (Criteria) this;
        }

        public Criteria andAmountToAccountGreaterThan(Double value) {
            addCriterion("amount_to_account >", value, "amountToAccount");
            return (Criteria) this;
        }

        public Criteria andAmountToAccountGreaterThanOrEqualTo(Double value) {
            addCriterion("amount_to_account >=", value, "amountToAccount");
            return (Criteria) this;
        }

        public Criteria andAmountToAccountLessThan(Double value) {
            addCriterion("amount_to_account <", value, "amountToAccount");
            return (Criteria) this;
        }

        public Criteria andAmountToAccountLessThanOrEqualTo(Double value) {
            addCriterion("amount_to_account <=", value, "amountToAccount");
            return (Criteria) this;
        }

        public Criteria andAmountToAccountIn(List<Double> values) {
            addCriterion("amount_to_account in", values, "amountToAccount");
            return (Criteria) this;
        }

        public Criteria andAmountToAccountNotIn(List<Double> values) {
            addCriterion("amount_to_account not in", values, "amountToAccount");
            return (Criteria) this;
        }

        public Criteria andAmountToAccountBetween(Double value1, Double value2) {
            addCriterion("amount_to_account between", value1, value2, "amountToAccount");
            return (Criteria) this;
        }

        public Criteria andAmountToAccountNotBetween(Double value1, Double value2) {
            addCriterion("amount_to_account not between", value1, value2, "amountToAccount");
            return (Criteria) this;
        }

        public Criteria andBankSerialNumberIsNull() {
            addCriterion("bank_serial_number is null");
            return (Criteria) this;
        }

        public Criteria andBankSerialNumberIsNotNull() {
            addCriterion("bank_serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andBankSerialNumberEqualTo(String value) {
            addCriterion("bank_serial_number =", value, "bankSerialNumber");
            return (Criteria) this;
        }

        public Criteria andBankSerialNumberNotEqualTo(String value) {
            addCriterion("bank_serial_number <>", value, "bankSerialNumber");
            return (Criteria) this;
        }

        public Criteria andBankSerialNumberGreaterThan(String value) {
            addCriterion("bank_serial_number >", value, "bankSerialNumber");
            return (Criteria) this;
        }

        public Criteria andBankSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("bank_serial_number >=", value, "bankSerialNumber");
            return (Criteria) this;
        }

        public Criteria andBankSerialNumberLessThan(String value) {
            addCriterion("bank_serial_number <", value, "bankSerialNumber");
            return (Criteria) this;
        }

        public Criteria andBankSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("bank_serial_number <=", value, "bankSerialNumber");
            return (Criteria) this;
        }

        public Criteria andBankSerialNumberLike(String value) {
            addCriterion("bank_serial_number like", value, "bankSerialNumber");
            return (Criteria) this;
        }

        public Criteria andBankSerialNumberNotLike(String value) {
            addCriterion("bank_serial_number not like", value, "bankSerialNumber");
            return (Criteria) this;
        }

        public Criteria andBankSerialNumberIn(List<String> values) {
            addCriterion("bank_serial_number in", values, "bankSerialNumber");
            return (Criteria) this;
        }

        public Criteria andBankSerialNumberNotIn(List<String> values) {
            addCriterion("bank_serial_number not in", values, "bankSerialNumber");
            return (Criteria) this;
        }

        public Criteria andBankSerialNumberBetween(String value1, String value2) {
            addCriterion("bank_serial_number between", value1, value2, "bankSerialNumber");
            return (Criteria) this;
        }

        public Criteria andBankSerialNumberNotBetween(String value1, String value2) {
            addCriterion("bank_serial_number not between", value1, value2, "bankSerialNumber");
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