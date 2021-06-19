package com.gxa.internetfinance.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FundsRechargeRecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FundsRechargeRecordsExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserSourceIsNull() {
            addCriterion("user_source is null");
            return (Criteria) this;
        }

        public Criteria andUserSourceIsNotNull() {
            addCriterion("user_source is not null");
            return (Criteria) this;
        }

        public Criteria andUserSourceEqualTo(String value) {
            addCriterion("user_source =", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotEqualTo(String value) {
            addCriterion("user_source <>", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceGreaterThan(String value) {
            addCriterion("user_source >", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceGreaterThanOrEqualTo(String value) {
            addCriterion("user_source >=", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceLessThan(String value) {
            addCriterion("user_source <", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceLessThanOrEqualTo(String value) {
            addCriterion("user_source <=", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceLike(String value) {
            addCriterion("user_source like", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotLike(String value) {
            addCriterion("user_source not like", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceIn(List<String> values) {
            addCriterion("user_source in", values, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotIn(List<String> values) {
            addCriterion("user_source not in", values, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceBetween(String value1, String value2) {
            addCriterion("user_source between", value1, value2, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotBetween(String value1, String value2) {
            addCriterion("user_source not between", value1, value2, "userSource");
            return (Criteria) this;
        }

        public Criteria andAppSourceIsNull() {
            addCriterion("app_source is null");
            return (Criteria) this;
        }

        public Criteria andAppSourceIsNotNull() {
            addCriterion("app_source is not null");
            return (Criteria) this;
        }

        public Criteria andAppSourceEqualTo(String value) {
            addCriterion("app_source =", value, "appSource");
            return (Criteria) this;
        }

        public Criteria andAppSourceNotEqualTo(String value) {
            addCriterion("app_source <>", value, "appSource");
            return (Criteria) this;
        }

        public Criteria andAppSourceGreaterThan(String value) {
            addCriterion("app_source >", value, "appSource");
            return (Criteria) this;
        }

        public Criteria andAppSourceGreaterThanOrEqualTo(String value) {
            addCriterion("app_source >=", value, "appSource");
            return (Criteria) this;
        }

        public Criteria andAppSourceLessThan(String value) {
            addCriterion("app_source <", value, "appSource");
            return (Criteria) this;
        }

        public Criteria andAppSourceLessThanOrEqualTo(String value) {
            addCriterion("app_source <=", value, "appSource");
            return (Criteria) this;
        }

        public Criteria andAppSourceLike(String value) {
            addCriterion("app_source like", value, "appSource");
            return (Criteria) this;
        }

        public Criteria andAppSourceNotLike(String value) {
            addCriterion("app_source not like", value, "appSource");
            return (Criteria) this;
        }

        public Criteria andAppSourceIn(List<String> values) {
            addCriterion("app_source in", values, "appSource");
            return (Criteria) this;
        }

        public Criteria andAppSourceNotIn(List<String> values) {
            addCriterion("app_source not in", values, "appSource");
            return (Criteria) this;
        }

        public Criteria andAppSourceBetween(String value1, String value2) {
            addCriterion("app_source between", value1, value2, "appSource");
            return (Criteria) this;
        }

        public Criteria andAppSourceNotBetween(String value1, String value2) {
            addCriterion("app_source not between", value1, value2, "appSource");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIsNull() {
            addCriterion("recharge_amount is null");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIsNotNull() {
            addCriterion("recharge_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountEqualTo(Double value) {
            addCriterion("recharge_amount =", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotEqualTo(Double value) {
            addCriterion("recharge_amount <>", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountGreaterThan(Double value) {
            addCriterion("recharge_amount >", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("recharge_amount >=", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountLessThan(Double value) {
            addCriterion("recharge_amount <", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountLessThanOrEqualTo(Double value) {
            addCriterion("recharge_amount <=", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIn(List<Double> values) {
            addCriterion("recharge_amount in", values, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotIn(List<Double> values) {
            addCriterion("recharge_amount not in", values, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountBetween(Double value1, Double value2) {
            addCriterion("recharge_amount between", value1, value2, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotBetween(Double value1, Double value2) {
            addCriterion("recharge_amount not between", value1, value2, "rechargeAmount");
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

        public Criteria andHandFeeIsNull() {
            addCriterion("hand_fee is null");
            return (Criteria) this;
        }

        public Criteria andHandFeeIsNotNull() {
            addCriterion("hand_fee is not null");
            return (Criteria) this;
        }

        public Criteria andHandFeeEqualTo(Double value) {
            addCriterion("hand_fee =", value, "handFee");
            return (Criteria) this;
        }

        public Criteria andHandFeeNotEqualTo(Double value) {
            addCriterion("hand_fee <>", value, "handFee");
            return (Criteria) this;
        }

        public Criteria andHandFeeGreaterThan(Double value) {
            addCriterion("hand_fee >", value, "handFee");
            return (Criteria) this;
        }

        public Criteria andHandFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("hand_fee >=", value, "handFee");
            return (Criteria) this;
        }

        public Criteria andHandFeeLessThan(Double value) {
            addCriterion("hand_fee <", value, "handFee");
            return (Criteria) this;
        }

        public Criteria andHandFeeLessThanOrEqualTo(Double value) {
            addCriterion("hand_fee <=", value, "handFee");
            return (Criteria) this;
        }

        public Criteria andHandFeeIn(List<Double> values) {
            addCriterion("hand_fee in", values, "handFee");
            return (Criteria) this;
        }

        public Criteria andHandFeeNotIn(List<Double> values) {
            addCriterion("hand_fee not in", values, "handFee");
            return (Criteria) this;
        }

        public Criteria andHandFeeBetween(Double value1, Double value2) {
            addCriterion("hand_fee between", value1, value2, "handFee");
            return (Criteria) this;
        }

        public Criteria andHandFeeNotBetween(Double value1, Double value2) {
            addCriterion("hand_fee not between", value1, value2, "handFee");
            return (Criteria) this;
        }

        public Criteria andRechargeWayIsNull() {
            addCriterion("recharge_way is null");
            return (Criteria) this;
        }

        public Criteria andRechargeWayIsNotNull() {
            addCriterion("recharge_way is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeWayEqualTo(String value) {
            addCriterion("recharge_way =", value, "rechargeWay");
            return (Criteria) this;
        }

        public Criteria andRechargeWayNotEqualTo(String value) {
            addCriterion("recharge_way <>", value, "rechargeWay");
            return (Criteria) this;
        }

        public Criteria andRechargeWayGreaterThan(String value) {
            addCriterion("recharge_way >", value, "rechargeWay");
            return (Criteria) this;
        }

        public Criteria andRechargeWayGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_way >=", value, "rechargeWay");
            return (Criteria) this;
        }

        public Criteria andRechargeWayLessThan(String value) {
            addCriterion("recharge_way <", value, "rechargeWay");
            return (Criteria) this;
        }

        public Criteria andRechargeWayLessThanOrEqualTo(String value) {
            addCriterion("recharge_way <=", value, "rechargeWay");
            return (Criteria) this;
        }

        public Criteria andRechargeWayLike(String value) {
            addCriterion("recharge_way like", value, "rechargeWay");
            return (Criteria) this;
        }

        public Criteria andRechargeWayNotLike(String value) {
            addCriterion("recharge_way not like", value, "rechargeWay");
            return (Criteria) this;
        }

        public Criteria andRechargeWayIn(List<String> values) {
            addCriterion("recharge_way in", values, "rechargeWay");
            return (Criteria) this;
        }

        public Criteria andRechargeWayNotIn(List<String> values) {
            addCriterion("recharge_way not in", values, "rechargeWay");
            return (Criteria) this;
        }

        public Criteria andRechargeWayBetween(String value1, String value2) {
            addCriterion("recharge_way between", value1, value2, "rechargeWay");
            return (Criteria) this;
        }

        public Criteria andRechargeWayNotBetween(String value1, String value2) {
            addCriterion("recharge_way not between", value1, value2, "rechargeWay");
            return (Criteria) this;
        }

        public Criteria andTradeSerialNumberIsNull() {
            addCriterion("trade_serial_number is null");
            return (Criteria) this;
        }

        public Criteria andTradeSerialNumberIsNotNull() {
            addCriterion("trade_serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andTradeSerialNumberEqualTo(String value) {
            addCriterion("trade_serial_number =", value, "tradeSerialNumber");
            return (Criteria) this;
        }

        public Criteria andTradeSerialNumberNotEqualTo(String value) {
            addCriterion("trade_serial_number <>", value, "tradeSerialNumber");
            return (Criteria) this;
        }

        public Criteria andTradeSerialNumberGreaterThan(String value) {
            addCriterion("trade_serial_number >", value, "tradeSerialNumber");
            return (Criteria) this;
        }

        public Criteria andTradeSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("trade_serial_number >=", value, "tradeSerialNumber");
            return (Criteria) this;
        }

        public Criteria andTradeSerialNumberLessThan(String value) {
            addCriterion("trade_serial_number <", value, "tradeSerialNumber");
            return (Criteria) this;
        }

        public Criteria andTradeSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("trade_serial_number <=", value, "tradeSerialNumber");
            return (Criteria) this;
        }

        public Criteria andTradeSerialNumberLike(String value) {
            addCriterion("trade_serial_number like", value, "tradeSerialNumber");
            return (Criteria) this;
        }

        public Criteria andTradeSerialNumberNotLike(String value) {
            addCriterion("trade_serial_number not like", value, "tradeSerialNumber");
            return (Criteria) this;
        }

        public Criteria andTradeSerialNumberIn(List<String> values) {
            addCriterion("trade_serial_number in", values, "tradeSerialNumber");
            return (Criteria) this;
        }

        public Criteria andTradeSerialNumberNotIn(List<String> values) {
            addCriterion("trade_serial_number not in", values, "tradeSerialNumber");
            return (Criteria) this;
        }

        public Criteria andTradeSerialNumberBetween(String value1, String value2) {
            addCriterion("trade_serial_number between", value1, value2, "tradeSerialNumber");
            return (Criteria) this;
        }

        public Criteria andTradeSerialNumberNotBetween(String value1, String value2) {
            addCriterion("trade_serial_number not between", value1, value2, "tradeSerialNumber");
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

        public Criteria andGmtMofifiedIsNull() {
            addCriterion("gmt_mofified is null");
            return (Criteria) this;
        }

        public Criteria andGmtMofifiedIsNotNull() {
            addCriterion("gmt_mofified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtMofifiedEqualTo(Date value) {
            addCriterion("gmt_mofified =", value, "gmtMofified");
            return (Criteria) this;
        }

        public Criteria andGmtMofifiedNotEqualTo(Date value) {
            addCriterion("gmt_mofified <>", value, "gmtMofified");
            return (Criteria) this;
        }

        public Criteria andGmtMofifiedGreaterThan(Date value) {
            addCriterion("gmt_mofified >", value, "gmtMofified");
            return (Criteria) this;
        }

        public Criteria andGmtMofifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_mofified >=", value, "gmtMofified");
            return (Criteria) this;
        }

        public Criteria andGmtMofifiedLessThan(Date value) {
            addCriterion("gmt_mofified <", value, "gmtMofified");
            return (Criteria) this;
        }

        public Criteria andGmtMofifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_mofified <=", value, "gmtMofified");
            return (Criteria) this;
        }

        public Criteria andGmtMofifiedIn(List<Date> values) {
            addCriterion("gmt_mofified in", values, "gmtMofified");
            return (Criteria) this;
        }

        public Criteria andGmtMofifiedNotIn(List<Date> values) {
            addCriterion("gmt_mofified not in", values, "gmtMofified");
            return (Criteria) this;
        }

        public Criteria andGmtMofifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_mofified between", value1, value2, "gmtMofified");
            return (Criteria) this;
        }

        public Criteria andGmtMofifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_mofified not between", value1, value2, "gmtMofified");
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