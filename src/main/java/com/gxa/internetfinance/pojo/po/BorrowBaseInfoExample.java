package com.gxa.internetfinance.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BorrowBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowBaseInfoExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andAprIsNull() {
            addCriterion("apr is null");
            return (Criteria) this;
        }

        public Criteria andAprIsNotNull() {
            addCriterion("apr is not null");
            return (Criteria) this;
        }

        public Criteria andAprEqualTo(Double value) {
            addCriterion("apr =", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprNotEqualTo(Double value) {
            addCriterion("apr <>", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprGreaterThan(Double value) {
            addCriterion("apr >", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprGreaterThanOrEqualTo(Double value) {
            addCriterion("apr >=", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprLessThan(Double value) {
            addCriterion("apr <", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprLessThanOrEqualTo(Double value) {
            addCriterion("apr <=", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprIn(List<Double> values) {
            addCriterion("apr in", values, "apr");
            return (Criteria) this;
        }

        public Criteria andAprNotIn(List<Double> values) {
            addCriterion("apr not in", values, "apr");
            return (Criteria) this;
        }

        public Criteria andAprBetween(Double value1, Double value2) {
            addCriterion("apr between", value1, value2, "apr");
            return (Criteria) this;
        }

        public Criteria andAprNotBetween(Double value1, Double value2) {
            addCriterion("apr not between", value1, value2, "apr");
            return (Criteria) this;
        }

        public Criteria andTermTypeIsNull() {
            addCriterion("term_type is null");
            return (Criteria) this;
        }

        public Criteria andTermTypeIsNotNull() {
            addCriterion("term_type is not null");
            return (Criteria) this;
        }

        public Criteria andTermTypeEqualTo(String value) {
            addCriterion("term_type =", value, "termType");
            return (Criteria) this;
        }

        public Criteria andTermTypeNotEqualTo(String value) {
            addCriterion("term_type <>", value, "termType");
            return (Criteria) this;
        }

        public Criteria andTermTypeGreaterThan(String value) {
            addCriterion("term_type >", value, "termType");
            return (Criteria) this;
        }

        public Criteria andTermTypeGreaterThanOrEqualTo(String value) {
            addCriterion("term_type >=", value, "termType");
            return (Criteria) this;
        }

        public Criteria andTermTypeLessThan(String value) {
            addCriterion("term_type <", value, "termType");
            return (Criteria) this;
        }

        public Criteria andTermTypeLessThanOrEqualTo(String value) {
            addCriterion("term_type <=", value, "termType");
            return (Criteria) this;
        }

        public Criteria andTermTypeLike(String value) {
            addCriterion("term_type like", value, "termType");
            return (Criteria) this;
        }

        public Criteria andTermTypeNotLike(String value) {
            addCriterion("term_type not like", value, "termType");
            return (Criteria) this;
        }

        public Criteria andTermTypeIn(List<String> values) {
            addCriterion("term_type in", values, "termType");
            return (Criteria) this;
        }

        public Criteria andTermTypeNotIn(List<String> values) {
            addCriterion("term_type not in", values, "termType");
            return (Criteria) this;
        }

        public Criteria andTermTypeBetween(String value1, String value2) {
            addCriterion("term_type between", value1, value2, "termType");
            return (Criteria) this;
        }

        public Criteria andTermTypeNotBetween(String value1, String value2) {
            addCriterion("term_type not between", value1, value2, "termType");
            return (Criteria) this;
        }

        public Criteria andInterestWayIsNull() {
            addCriterion("Interest_way is null");
            return (Criteria) this;
        }

        public Criteria andInterestWayIsNotNull() {
            addCriterion("Interest_way is not null");
            return (Criteria) this;
        }

        public Criteria andInterestWayEqualTo(String value) {
            addCriterion("Interest_way =", value, "interestWay");
            return (Criteria) this;
        }

        public Criteria andInterestWayNotEqualTo(String value) {
            addCriterion("Interest_way <>", value, "interestWay");
            return (Criteria) this;
        }

        public Criteria andInterestWayGreaterThan(String value) {
            addCriterion("Interest_way >", value, "interestWay");
            return (Criteria) this;
        }

        public Criteria andInterestWayGreaterThanOrEqualTo(String value) {
            addCriterion("Interest_way >=", value, "interestWay");
            return (Criteria) this;
        }

        public Criteria andInterestWayLessThan(String value) {
            addCriterion("Interest_way <", value, "interestWay");
            return (Criteria) this;
        }

        public Criteria andInterestWayLessThanOrEqualTo(String value) {
            addCriterion("Interest_way <=", value, "interestWay");
            return (Criteria) this;
        }

        public Criteria andInterestWayLike(String value) {
            addCriterion("Interest_way like", value, "interestWay");
            return (Criteria) this;
        }

        public Criteria andInterestWayNotLike(String value) {
            addCriterion("Interest_way not like", value, "interestWay");
            return (Criteria) this;
        }

        public Criteria andInterestWayIn(List<String> values) {
            addCriterion("Interest_way in", values, "interestWay");
            return (Criteria) this;
        }

        public Criteria andInterestWayNotIn(List<String> values) {
            addCriterion("Interest_way not in", values, "interestWay");
            return (Criteria) this;
        }

        public Criteria andInterestWayBetween(String value1, String value2) {
            addCriterion("Interest_way between", value1, value2, "interestWay");
            return (Criteria) this;
        }

        public Criteria andInterestWayNotBetween(String value1, String value2) {
            addCriterion("Interest_way not between", value1, value2, "interestWay");
            return (Criteria) this;
        }

        public Criteria andOverdueIsNull() {
            addCriterion("overdue is null");
            return (Criteria) this;
        }

        public Criteria andOverdueIsNotNull() {
            addCriterion("overdue is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueEqualTo(Double value) {
            addCriterion("overdue =", value, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueNotEqualTo(Double value) {
            addCriterion("overdue <>", value, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueGreaterThan(Double value) {
            addCriterion("overdue >", value, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueGreaterThanOrEqualTo(Double value) {
            addCriterion("overdue >=", value, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueLessThan(Double value) {
            addCriterion("overdue <", value, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueLessThanOrEqualTo(Double value) {
            addCriterion("overdue <=", value, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueIn(List<Double> values) {
            addCriterion("overdue in", values, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueNotIn(List<Double> values) {
            addCriterion("overdue not in", values, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueBetween(Double value1, Double value2) {
            addCriterion("overdue between", value1, value2, "overdue");
            return (Criteria) this;
        }

        public Criteria andOverdueNotBetween(Double value1, Double value2) {
            addCriterion("overdue not between", value1, value2, "overdue");
            return (Criteria) this;
        }

        public Criteria andUseOfFundsIsNull() {
            addCriterion("use_of_funds is null");
            return (Criteria) this;
        }

        public Criteria andUseOfFundsIsNotNull() {
            addCriterion("use_of_funds is not null");
            return (Criteria) this;
        }

        public Criteria andUseOfFundsEqualTo(String value) {
            addCriterion("use_of_funds =", value, "useOfFunds");
            return (Criteria) this;
        }

        public Criteria andUseOfFundsNotEqualTo(String value) {
            addCriterion("use_of_funds <>", value, "useOfFunds");
            return (Criteria) this;
        }

        public Criteria andUseOfFundsGreaterThan(String value) {
            addCriterion("use_of_funds >", value, "useOfFunds");
            return (Criteria) this;
        }

        public Criteria andUseOfFundsGreaterThanOrEqualTo(String value) {
            addCriterion("use_of_funds >=", value, "useOfFunds");
            return (Criteria) this;
        }

        public Criteria andUseOfFundsLessThan(String value) {
            addCriterion("use_of_funds <", value, "useOfFunds");
            return (Criteria) this;
        }

        public Criteria andUseOfFundsLessThanOrEqualTo(String value) {
            addCriterion("use_of_funds <=", value, "useOfFunds");
            return (Criteria) this;
        }

        public Criteria andUseOfFundsLike(String value) {
            addCriterion("use_of_funds like", value, "useOfFunds");
            return (Criteria) this;
        }

        public Criteria andUseOfFundsNotLike(String value) {
            addCriterion("use_of_funds not like", value, "useOfFunds");
            return (Criteria) this;
        }

        public Criteria andUseOfFundsIn(List<String> values) {
            addCriterion("use_of_funds in", values, "useOfFunds");
            return (Criteria) this;
        }

        public Criteria andUseOfFundsNotIn(List<String> values) {
            addCriterion("use_of_funds not in", values, "useOfFunds");
            return (Criteria) this;
        }

        public Criteria andUseOfFundsBetween(String value1, String value2) {
            addCriterion("use_of_funds between", value1, value2, "useOfFunds");
            return (Criteria) this;
        }

        public Criteria andUseOfFundsNotBetween(String value1, String value2) {
            addCriterion("use_of_funds not between", value1, value2, "useOfFunds");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIsNull() {
            addCriterion("risk_level is null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIsNotNull() {
            addCriterion("risk_level is not null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelEqualTo(String value) {
            addCriterion("risk_level =", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotEqualTo(String value) {
            addCriterion("risk_level <>", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelGreaterThan(String value) {
            addCriterion("risk_level >", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelGreaterThanOrEqualTo(String value) {
            addCriterion("risk_level >=", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLessThan(String value) {
            addCriterion("risk_level <", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLessThanOrEqualTo(String value) {
            addCriterion("risk_level <=", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLike(String value) {
            addCriterion("risk_level like", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotLike(String value) {
            addCriterion("risk_level not like", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIn(List<String> values) {
            addCriterion("risk_level in", values, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotIn(List<String> values) {
            addCriterion("risk_level not in", values, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelBetween(String value1, String value2) {
            addCriterion("risk_level between", value1, value2, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotBetween(String value1, String value2) {
            addCriterion("risk_level not between", value1, value2, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Integer value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Integer value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Integer value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Integer value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Integer value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Integer> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Integer> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Integer value1, Integer value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andRepaymentIsNull() {
            addCriterion("repayment is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentIsNotNull() {
            addCriterion("repayment is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentEqualTo(String value) {
            addCriterion("repayment =", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentNotEqualTo(String value) {
            addCriterion("repayment <>", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentGreaterThan(String value) {
            addCriterion("repayment >", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentGreaterThanOrEqualTo(String value) {
            addCriterion("repayment >=", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentLessThan(String value) {
            addCriterion("repayment <", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentLessThanOrEqualTo(String value) {
            addCriterion("repayment <=", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentLike(String value) {
            addCriterion("repayment like", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentNotLike(String value) {
            addCriterion("repayment not like", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentIn(List<String> values) {
            addCriterion("repayment in", values, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentNotIn(List<String> values) {
            addCriterion("repayment not in", values, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentBetween(String value1, String value2) {
            addCriterion("repayment between", value1, value2, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentNotBetween(String value1, String value2) {
            addCriterion("repayment not between", value1, value2, "repayment");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodIsNull() {
            addCriterion("loan_period is null");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodIsNotNull() {
            addCriterion("loan_period is not null");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodEqualTo(Integer value) {
            addCriterion("loan_period =", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodNotEqualTo(Integer value) {
            addCriterion("loan_period <>", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodGreaterThan(Integer value) {
            addCriterion("loan_period >", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_period >=", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodLessThan(Integer value) {
            addCriterion("loan_period <", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("loan_period <=", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodIn(List<Integer> values) {
            addCriterion("loan_period in", values, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodNotIn(List<Integer> values) {
            addCriterion("loan_period not in", values, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodBetween(Integer value1, Integer value2) {
            addCriterion("loan_period between", value1, value2, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_period not between", value1, value2, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanMgrInterestRateIsNull() {
            addCriterion("loan_mgr_interest_rate is null");
            return (Criteria) this;
        }

        public Criteria andLoanMgrInterestRateIsNotNull() {
            addCriterion("loan_mgr_interest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andLoanMgrInterestRateEqualTo(Double value) {
            addCriterion("loan_mgr_interest_rate =", value, "loanMgrInterestRate");
            return (Criteria) this;
        }

        public Criteria andLoanMgrInterestRateNotEqualTo(Double value) {
            addCriterion("loan_mgr_interest_rate <>", value, "loanMgrInterestRate");
            return (Criteria) this;
        }

        public Criteria andLoanMgrInterestRateGreaterThan(Double value) {
            addCriterion("loan_mgr_interest_rate >", value, "loanMgrInterestRate");
            return (Criteria) this;
        }

        public Criteria andLoanMgrInterestRateGreaterThanOrEqualTo(Double value) {
            addCriterion("loan_mgr_interest_rate >=", value, "loanMgrInterestRate");
            return (Criteria) this;
        }

        public Criteria andLoanMgrInterestRateLessThan(Double value) {
            addCriterion("loan_mgr_interest_rate <", value, "loanMgrInterestRate");
            return (Criteria) this;
        }

        public Criteria andLoanMgrInterestRateLessThanOrEqualTo(Double value) {
            addCriterion("loan_mgr_interest_rate <=", value, "loanMgrInterestRate");
            return (Criteria) this;
        }

        public Criteria andLoanMgrInterestRateIn(List<Double> values) {
            addCriterion("loan_mgr_interest_rate in", values, "loanMgrInterestRate");
            return (Criteria) this;
        }

        public Criteria andLoanMgrInterestRateNotIn(List<Double> values) {
            addCriterion("loan_mgr_interest_rate not in", values, "loanMgrInterestRate");
            return (Criteria) this;
        }

        public Criteria andLoanMgrInterestRateBetween(Double value1, Double value2) {
            addCriterion("loan_mgr_interest_rate between", value1, value2, "loanMgrInterestRate");
            return (Criteria) this;
        }

        public Criteria andLoanMgrInterestRateNotBetween(Double value1, Double value2) {
            addCriterion("loan_mgr_interest_rate not between", value1, value2, "loanMgrInterestRate");
            return (Criteria) this;
        }

        public Criteria andLoanTypeIsNull() {
            addCriterion("loan_type is null");
            return (Criteria) this;
        }

        public Criteria andLoanTypeIsNotNull() {
            addCriterion("loan_type is not null");
            return (Criteria) this;
        }

        public Criteria andLoanTypeEqualTo(String value) {
            addCriterion("loan_type =", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNotEqualTo(String value) {
            addCriterion("loan_type <>", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeGreaterThan(String value) {
            addCriterion("loan_type >", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeGreaterThanOrEqualTo(String value) {
            addCriterion("loan_type >=", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeLessThan(String value) {
            addCriterion("loan_type <", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeLessThanOrEqualTo(String value) {
            addCriterion("loan_type <=", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeLike(String value) {
            addCriterion("loan_type like", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNotLike(String value) {
            addCriterion("loan_type not like", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeIn(List<String> values) {
            addCriterion("loan_type in", values, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNotIn(List<String> values) {
            addCriterion("loan_type not in", values, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeBetween(String value1, String value2) {
            addCriterion("loan_type between", value1, value2, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNotBetween(String value1, String value2) {
            addCriterion("loan_type not between", value1, value2, "loanType");
            return (Criteria) this;
        }

        public Criteria andAsdIsNull() {
            addCriterion("asd is null");
            return (Criteria) this;
        }

        public Criteria andAsdIsNotNull() {
            addCriterion("asd is not null");
            return (Criteria) this;
        }

        public Criteria andAsdEqualTo(String value) {
            addCriterion("asd =", value, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdNotEqualTo(String value) {
            addCriterion("asd <>", value, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdGreaterThan(String value) {
            addCriterion("asd >", value, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdGreaterThanOrEqualTo(String value) {
            addCriterion("asd >=", value, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdLessThan(String value) {
            addCriterion("asd <", value, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdLessThanOrEqualTo(String value) {
            addCriterion("asd <=", value, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdLike(String value) {
            addCriterion("asd like", value, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdNotLike(String value) {
            addCriterion("asd not like", value, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdIn(List<String> values) {
            addCriterion("asd in", values, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdNotIn(List<String> values) {
            addCriterion("asd not in", values, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdBetween(String value1, String value2) {
            addCriterion("asd between", value1, value2, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdNotBetween(String value1, String value2) {
            addCriterion("asd not between", value1, value2, "asd");
            return (Criteria) this;
        }

        public Criteria andLoanInformationIsNull() {
            addCriterion("loan_information is null");
            return (Criteria) this;
        }

        public Criteria andLoanInformationIsNotNull() {
            addCriterion("loan_information is not null");
            return (Criteria) this;
        }

        public Criteria andLoanInformationEqualTo(String value) {
            addCriterion("loan_information =", value, "loanInformation");
            return (Criteria) this;
        }

        public Criteria andLoanInformationNotEqualTo(String value) {
            addCriterion("loan_information <>", value, "loanInformation");
            return (Criteria) this;
        }

        public Criteria andLoanInformationGreaterThan(String value) {
            addCriterion("loan_information >", value, "loanInformation");
            return (Criteria) this;
        }

        public Criteria andLoanInformationGreaterThanOrEqualTo(String value) {
            addCriterion("loan_information >=", value, "loanInformation");
            return (Criteria) this;
        }

        public Criteria andLoanInformationLessThan(String value) {
            addCriterion("loan_information <", value, "loanInformation");
            return (Criteria) this;
        }

        public Criteria andLoanInformationLessThanOrEqualTo(String value) {
            addCriterion("loan_information <=", value, "loanInformation");
            return (Criteria) this;
        }

        public Criteria andLoanInformationLike(String value) {
            addCriterion("loan_information like", value, "loanInformation");
            return (Criteria) this;
        }

        public Criteria andLoanInformationNotLike(String value) {
            addCriterion("loan_information not like", value, "loanInformation");
            return (Criteria) this;
        }

        public Criteria andLoanInformationIn(List<String> values) {
            addCriterion("loan_information in", values, "loanInformation");
            return (Criteria) this;
        }

        public Criteria andLoanInformationNotIn(List<String> values) {
            addCriterion("loan_information not in", values, "loanInformation");
            return (Criteria) this;
        }

        public Criteria andLoanInformationBetween(String value1, String value2) {
            addCriterion("loan_information between", value1, value2, "loanInformation");
            return (Criteria) this;
        }

        public Criteria andLoanInformationNotBetween(String value1, String value2) {
            addCriterion("loan_information not between", value1, value2, "loanInformation");
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