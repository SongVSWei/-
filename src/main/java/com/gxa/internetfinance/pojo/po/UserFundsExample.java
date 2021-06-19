package com.gxa.internetfinance.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserFundsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserFundsExample() {
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

        public Criteria andTotalAssetsIsNull() {
            addCriterion("total_assets is null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsIsNotNull() {
            addCriterion("total_assets is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsEqualTo(Double value) {
            addCriterion("total_assets =", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsNotEqualTo(Double value) {
            addCriterion("total_assets <>", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsGreaterThan(Double value) {
            addCriterion("total_assets >", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsGreaterThanOrEqualTo(Double value) {
            addCriterion("total_assets >=", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsLessThan(Double value) {
            addCriterion("total_assets <", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsLessThanOrEqualTo(Double value) {
            addCriterion("total_assets <=", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsIn(List<Double> values) {
            addCriterion("total_assets in", values, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsNotIn(List<Double> values) {
            addCriterion("total_assets not in", values, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsBetween(Double value1, Double value2) {
            addCriterion("total_assets between", value1, value2, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsNotBetween(Double value1, Double value2) {
            addCriterion("total_assets not between", value1, value2, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceIsNull() {
            addCriterion("available_balance is null");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceIsNotNull() {
            addCriterion("available_balance is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceEqualTo(Double value) {
            addCriterion("available_balance =", value, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceNotEqualTo(Double value) {
            addCriterion("available_balance <>", value, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceGreaterThan(Double value) {
            addCriterion("available_balance >", value, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("available_balance >=", value, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceLessThan(Double value) {
            addCriterion("available_balance <", value, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceLessThanOrEqualTo(Double value) {
            addCriterion("available_balance <=", value, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceIn(List<Double> values) {
            addCriterion("available_balance in", values, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceNotIn(List<Double> values) {
            addCriterion("available_balance not in", values, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceBetween(Double value1, Double value2) {
            addCriterion("available_balance between", value1, value2, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceNotBetween(Double value1, Double value2) {
            addCriterion("available_balance not between", value1, value2, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountIsNull() {
            addCriterion("frozen_amount is null");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountIsNotNull() {
            addCriterion("frozen_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountEqualTo(Double value) {
            addCriterion("frozen_amount =", value, "frozenAmount");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountNotEqualTo(Double value) {
            addCriterion("frozen_amount <>", value, "frozenAmount");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountGreaterThan(Double value) {
            addCriterion("frozen_amount >", value, "frozenAmount");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("frozen_amount >=", value, "frozenAmount");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountLessThan(Double value) {
            addCriterion("frozen_amount <", value, "frozenAmount");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountLessThanOrEqualTo(Double value) {
            addCriterion("frozen_amount <=", value, "frozenAmount");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountIn(List<Double> values) {
            addCriterion("frozen_amount in", values, "frozenAmount");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountNotIn(List<Double> values) {
            addCriterion("frozen_amount not in", values, "frozenAmount");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountBetween(Double value1, Double value2) {
            addCriterion("frozen_amount between", value1, value2, "frozenAmount");
            return (Criteria) this;
        }

        public Criteria andFrozenAmountNotBetween(Double value1, Double value2) {
            addCriterion("frozen_amount not between", value1, value2, "frozenAmount");
            return (Criteria) this;
        }

        public Criteria andPendingAmountIsNull() {
            addCriterion("pending_amount is null");
            return (Criteria) this;
        }

        public Criteria andPendingAmountIsNotNull() {
            addCriterion("pending_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPendingAmountEqualTo(Double value) {
            addCriterion("pending_amount =", value, "pendingAmount");
            return (Criteria) this;
        }

        public Criteria andPendingAmountNotEqualTo(Double value) {
            addCriterion("pending_amount <>", value, "pendingAmount");
            return (Criteria) this;
        }

        public Criteria andPendingAmountGreaterThan(Double value) {
            addCriterion("pending_amount >", value, "pendingAmount");
            return (Criteria) this;
        }

        public Criteria andPendingAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("pending_amount >=", value, "pendingAmount");
            return (Criteria) this;
        }

        public Criteria andPendingAmountLessThan(Double value) {
            addCriterion("pending_amount <", value, "pendingAmount");
            return (Criteria) this;
        }

        public Criteria andPendingAmountLessThanOrEqualTo(Double value) {
            addCriterion("pending_amount <=", value, "pendingAmount");
            return (Criteria) this;
        }

        public Criteria andPendingAmountIn(List<Double> values) {
            addCriterion("pending_amount in", values, "pendingAmount");
            return (Criteria) this;
        }

        public Criteria andPendingAmountNotIn(List<Double> values) {
            addCriterion("pending_amount not in", values, "pendingAmount");
            return (Criteria) this;
        }

        public Criteria andPendingAmountBetween(Double value1, Double value2) {
            addCriterion("pending_amount between", value1, value2, "pendingAmount");
            return (Criteria) this;
        }

        public Criteria andPendingAmountNotBetween(Double value1, Double value2) {
            addCriterion("pending_amount not between", value1, value2, "pendingAmount");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentIsNull() {
            addCriterion("total_investment is null");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentIsNotNull() {
            addCriterion("total_investment is not null");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentEqualTo(Double value) {
            addCriterion("total_investment =", value, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentNotEqualTo(Double value) {
            addCriterion("total_investment <>", value, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentGreaterThan(Double value) {
            addCriterion("total_investment >", value, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentGreaterThanOrEqualTo(Double value) {
            addCriterion("total_investment >=", value, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentLessThan(Double value) {
            addCriterion("total_investment <", value, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentLessThanOrEqualTo(Double value) {
            addCriterion("total_investment <=", value, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentIn(List<Double> values) {
            addCriterion("total_investment in", values, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentNotIn(List<Double> values) {
            addCriterion("total_investment not in", values, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentBetween(Double value1, Double value2) {
            addCriterion("total_investment between", value1, value2, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentNotBetween(Double value1, Double value2) {
            addCriterion("total_investment not between", value1, value2, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentIncomeIsNull() {
            addCriterion("total_investment_income is null");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentIncomeIsNotNull() {
            addCriterion("total_investment_income is not null");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentIncomeEqualTo(Double value) {
            addCriterion("total_investment_income =", value, "totalInvestmentIncome");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentIncomeNotEqualTo(Double value) {
            addCriterion("total_investment_income <>", value, "totalInvestmentIncome");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentIncomeGreaterThan(Double value) {
            addCriterion("total_investment_income >", value, "totalInvestmentIncome");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentIncomeGreaterThanOrEqualTo(Double value) {
            addCriterion("total_investment_income >=", value, "totalInvestmentIncome");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentIncomeLessThan(Double value) {
            addCriterion("total_investment_income <", value, "totalInvestmentIncome");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentIncomeLessThanOrEqualTo(Double value) {
            addCriterion("total_investment_income <=", value, "totalInvestmentIncome");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentIncomeIn(List<Double> values) {
            addCriterion("total_investment_income in", values, "totalInvestmentIncome");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentIncomeNotIn(List<Double> values) {
            addCriterion("total_investment_income not in", values, "totalInvestmentIncome");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentIncomeBetween(Double value1, Double value2) {
            addCriterion("total_investment_income between", value1, value2, "totalInvestmentIncome");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentIncomeNotBetween(Double value1, Double value2) {
            addCriterion("total_investment_income not between", value1, value2, "totalInvestmentIncome");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowIsNull() {
            addCriterion("total_borrow is null");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowIsNotNull() {
            addCriterion("total_borrow is not null");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowEqualTo(Double value) {
            addCriterion("total_borrow =", value, "totalBorrow");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowNotEqualTo(Double value) {
            addCriterion("total_borrow <>", value, "totalBorrow");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowGreaterThan(Double value) {
            addCriterion("total_borrow >", value, "totalBorrow");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowGreaterThanOrEqualTo(Double value) {
            addCriterion("total_borrow >=", value, "totalBorrow");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowLessThan(Double value) {
            addCriterion("total_borrow <", value, "totalBorrow");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowLessThanOrEqualTo(Double value) {
            addCriterion("total_borrow <=", value, "totalBorrow");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowIn(List<Double> values) {
            addCriterion("total_borrow in", values, "totalBorrow");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowNotIn(List<Double> values) {
            addCriterion("total_borrow not in", values, "totalBorrow");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowBetween(Double value1, Double value2) {
            addCriterion("total_borrow between", value1, value2, "totalBorrow");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowNotBetween(Double value1, Double value2) {
            addCriterion("total_borrow not between", value1, value2, "totalBorrow");
            return (Criteria) this;
        }

        public Criteria andTotalRepaymentIsNull() {
            addCriterion("total_repayment is null");
            return (Criteria) this;
        }

        public Criteria andTotalRepaymentIsNotNull() {
            addCriterion("total_repayment is not null");
            return (Criteria) this;
        }

        public Criteria andTotalRepaymentEqualTo(Double value) {
            addCriterion("total_repayment =", value, "totalRepayment");
            return (Criteria) this;
        }

        public Criteria andTotalRepaymentNotEqualTo(Double value) {
            addCriterion("total_repayment <>", value, "totalRepayment");
            return (Criteria) this;
        }

        public Criteria andTotalRepaymentGreaterThan(Double value) {
            addCriterion("total_repayment >", value, "totalRepayment");
            return (Criteria) this;
        }

        public Criteria andTotalRepaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("total_repayment >=", value, "totalRepayment");
            return (Criteria) this;
        }

        public Criteria andTotalRepaymentLessThan(Double value) {
            addCriterion("total_repayment <", value, "totalRepayment");
            return (Criteria) this;
        }

        public Criteria andTotalRepaymentLessThanOrEqualTo(Double value) {
            addCriterion("total_repayment <=", value, "totalRepayment");
            return (Criteria) this;
        }

        public Criteria andTotalRepaymentIn(List<Double> values) {
            addCriterion("total_repayment in", values, "totalRepayment");
            return (Criteria) this;
        }

        public Criteria andTotalRepaymentNotIn(List<Double> values) {
            addCriterion("total_repayment not in", values, "totalRepayment");
            return (Criteria) this;
        }

        public Criteria andTotalRepaymentBetween(Double value1, Double value2) {
            addCriterion("total_repayment between", value1, value2, "totalRepayment");
            return (Criteria) this;
        }

        public Criteria andTotalRepaymentNotBetween(Double value1, Double value2) {
            addCriterion("total_repayment not between", value1, value2, "totalRepayment");
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