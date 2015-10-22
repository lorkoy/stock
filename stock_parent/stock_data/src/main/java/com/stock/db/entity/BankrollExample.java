package com.stock.db.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankrollExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankrollExample() {
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

        public Criteria andStockCodeIsNull() {
            addCriterion("stock_code is null");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNotNull() {
            addCriterion("stock_code is not null");
            return (Criteria) this;
        }

        public Criteria andStockCodeEqualTo(String value) {
            addCriterion("stock_code =", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotEqualTo(String value) {
            addCriterion("stock_code <>", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThan(String value) {
            addCriterion("stock_code >", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_code >=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThan(String value) {
            addCriterion("stock_code <", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThanOrEqualTo(String value) {
            addCriterion("stock_code <=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLike(String value) {
            addCriterion("stock_code like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotLike(String value) {
            addCriterion("stock_code not like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeIn(List<String> values) {
            addCriterion("stock_code in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotIn(List<String> values) {
            addCriterion("stock_code not in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeBetween(String value1, String value2) {
            addCriterion("stock_code between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotBetween(String value1, String value2) {
            addCriterion("stock_code not between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(String value) {
            addCriterion("month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(String value) {
            addCriterion("month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(String value) {
            addCriterion("month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(String value) {
            addCriterion("month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(String value) {
            addCriterion("month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(String value) {
            addCriterion("month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLike(String value) {
            addCriterion("month like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotLike(String value) {
            addCriterion("month not like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<String> values) {
            addCriterion("month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<String> values) {
            addCriterion("month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(String value1, String value2) {
            addCriterion("month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(String value1, String value2) {
            addCriterion("month not between", value1, value2, "month");
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

        public Criteria andMainforceInIsNull() {
            addCriterion("mainForce_in is null");
            return (Criteria) this;
        }

        public Criteria andMainforceInIsNotNull() {
            addCriterion("mainForce_in is not null");
            return (Criteria) this;
        }

        public Criteria andMainforceInEqualTo(String value) {
            addCriterion("mainForce_in =", value, "mainforceIn");
            return (Criteria) this;
        }

        public Criteria andMainforceInNotEqualTo(String value) {
            addCriterion("mainForce_in <>", value, "mainforceIn");
            return (Criteria) this;
        }

        public Criteria andMainforceInGreaterThan(String value) {
            addCriterion("mainForce_in >", value, "mainforceIn");
            return (Criteria) this;
        }

        public Criteria andMainforceInGreaterThanOrEqualTo(String value) {
            addCriterion("mainForce_in >=", value, "mainforceIn");
            return (Criteria) this;
        }

        public Criteria andMainforceInLessThan(String value) {
            addCriterion("mainForce_in <", value, "mainforceIn");
            return (Criteria) this;
        }

        public Criteria andMainforceInLessThanOrEqualTo(String value) {
            addCriterion("mainForce_in <=", value, "mainforceIn");
            return (Criteria) this;
        }

        public Criteria andMainforceInLike(String value) {
            addCriterion("mainForce_in like", value, "mainforceIn");
            return (Criteria) this;
        }

        public Criteria andMainforceInNotLike(String value) {
            addCriterion("mainForce_in not like", value, "mainforceIn");
            return (Criteria) this;
        }

        public Criteria andMainforceInIn(List<String> values) {
            addCriterion("mainForce_in in", values, "mainforceIn");
            return (Criteria) this;
        }

        public Criteria andMainforceInNotIn(List<String> values) {
            addCriterion("mainForce_in not in", values, "mainforceIn");
            return (Criteria) this;
        }

        public Criteria andMainforceInBetween(String value1, String value2) {
            addCriterion("mainForce_in between", value1, value2, "mainforceIn");
            return (Criteria) this;
        }

        public Criteria andMainforceInNotBetween(String value1, String value2) {
            addCriterion("mainForce_in not between", value1, value2, "mainforceIn");
            return (Criteria) this;
        }

        public Criteria andMainforceOutIsNull() {
            addCriterion("mainForce_out is null");
            return (Criteria) this;
        }

        public Criteria andMainforceOutIsNotNull() {
            addCriterion("mainForce_out is not null");
            return (Criteria) this;
        }

        public Criteria andMainforceOutEqualTo(String value) {
            addCriterion("mainForce_out =", value, "mainforceOut");
            return (Criteria) this;
        }

        public Criteria andMainforceOutNotEqualTo(String value) {
            addCriterion("mainForce_out <>", value, "mainforceOut");
            return (Criteria) this;
        }

        public Criteria andMainforceOutGreaterThan(String value) {
            addCriterion("mainForce_out >", value, "mainforceOut");
            return (Criteria) this;
        }

        public Criteria andMainforceOutGreaterThanOrEqualTo(String value) {
            addCriterion("mainForce_out >=", value, "mainforceOut");
            return (Criteria) this;
        }

        public Criteria andMainforceOutLessThan(String value) {
            addCriterion("mainForce_out <", value, "mainforceOut");
            return (Criteria) this;
        }

        public Criteria andMainforceOutLessThanOrEqualTo(String value) {
            addCriterion("mainForce_out <=", value, "mainforceOut");
            return (Criteria) this;
        }

        public Criteria andMainforceOutLike(String value) {
            addCriterion("mainForce_out like", value, "mainforceOut");
            return (Criteria) this;
        }

        public Criteria andMainforceOutNotLike(String value) {
            addCriterion("mainForce_out not like", value, "mainforceOut");
            return (Criteria) this;
        }

        public Criteria andMainforceOutIn(List<String> values) {
            addCriterion("mainForce_out in", values, "mainforceOut");
            return (Criteria) this;
        }

        public Criteria andMainforceOutNotIn(List<String> values) {
            addCriterion("mainForce_out not in", values, "mainforceOut");
            return (Criteria) this;
        }

        public Criteria andMainforceOutBetween(String value1, String value2) {
            addCriterion("mainForce_out between", value1, value2, "mainforceOut");
            return (Criteria) this;
        }

        public Criteria andMainforceOutNotBetween(String value1, String value2) {
            addCriterion("mainForce_out not between", value1, value2, "mainforceOut");
            return (Criteria) this;
        }

        public Criteria andLargeInIsNull() {
            addCriterion("large_in is null");
            return (Criteria) this;
        }

        public Criteria andLargeInIsNotNull() {
            addCriterion("large_in is not null");
            return (Criteria) this;
        }

        public Criteria andLargeInEqualTo(String value) {
            addCriterion("large_in =", value, "largeIn");
            return (Criteria) this;
        }

        public Criteria andLargeInNotEqualTo(String value) {
            addCriterion("large_in <>", value, "largeIn");
            return (Criteria) this;
        }

        public Criteria andLargeInGreaterThan(String value) {
            addCriterion("large_in >", value, "largeIn");
            return (Criteria) this;
        }

        public Criteria andLargeInGreaterThanOrEqualTo(String value) {
            addCriterion("large_in >=", value, "largeIn");
            return (Criteria) this;
        }

        public Criteria andLargeInLessThan(String value) {
            addCriterion("large_in <", value, "largeIn");
            return (Criteria) this;
        }

        public Criteria andLargeInLessThanOrEqualTo(String value) {
            addCriterion("large_in <=", value, "largeIn");
            return (Criteria) this;
        }

        public Criteria andLargeInLike(String value) {
            addCriterion("large_in like", value, "largeIn");
            return (Criteria) this;
        }

        public Criteria andLargeInNotLike(String value) {
            addCriterion("large_in not like", value, "largeIn");
            return (Criteria) this;
        }

        public Criteria andLargeInIn(List<String> values) {
            addCriterion("large_in in", values, "largeIn");
            return (Criteria) this;
        }

        public Criteria andLargeInNotIn(List<String> values) {
            addCriterion("large_in not in", values, "largeIn");
            return (Criteria) this;
        }

        public Criteria andLargeInBetween(String value1, String value2) {
            addCriterion("large_in between", value1, value2, "largeIn");
            return (Criteria) this;
        }

        public Criteria andLargeInNotBetween(String value1, String value2) {
            addCriterion("large_in not between", value1, value2, "largeIn");
            return (Criteria) this;
        }

        public Criteria andLargeOutIsNull() {
            addCriterion("large_out is null");
            return (Criteria) this;
        }

        public Criteria andLargeOutIsNotNull() {
            addCriterion("large_out is not null");
            return (Criteria) this;
        }

        public Criteria andLargeOutEqualTo(String value) {
            addCriterion("large_out =", value, "largeOut");
            return (Criteria) this;
        }

        public Criteria andLargeOutNotEqualTo(String value) {
            addCriterion("large_out <>", value, "largeOut");
            return (Criteria) this;
        }

        public Criteria andLargeOutGreaterThan(String value) {
            addCriterion("large_out >", value, "largeOut");
            return (Criteria) this;
        }

        public Criteria andLargeOutGreaterThanOrEqualTo(String value) {
            addCriterion("large_out >=", value, "largeOut");
            return (Criteria) this;
        }

        public Criteria andLargeOutLessThan(String value) {
            addCriterion("large_out <", value, "largeOut");
            return (Criteria) this;
        }

        public Criteria andLargeOutLessThanOrEqualTo(String value) {
            addCriterion("large_out <=", value, "largeOut");
            return (Criteria) this;
        }

        public Criteria andLargeOutLike(String value) {
            addCriterion("large_out like", value, "largeOut");
            return (Criteria) this;
        }

        public Criteria andLargeOutNotLike(String value) {
            addCriterion("large_out not like", value, "largeOut");
            return (Criteria) this;
        }

        public Criteria andLargeOutIn(List<String> values) {
            addCriterion("large_out in", values, "largeOut");
            return (Criteria) this;
        }

        public Criteria andLargeOutNotIn(List<String> values) {
            addCriterion("large_out not in", values, "largeOut");
            return (Criteria) this;
        }

        public Criteria andLargeOutBetween(String value1, String value2) {
            addCriterion("large_out between", value1, value2, "largeOut");
            return (Criteria) this;
        }

        public Criteria andLargeOutNotBetween(String value1, String value2) {
            addCriterion("large_out not between", value1, value2, "largeOut");
            return (Criteria) this;
        }

        public Criteria andBigInIsNull() {
            addCriterion("big_in is null");
            return (Criteria) this;
        }

        public Criteria andBigInIsNotNull() {
            addCriterion("big_in is not null");
            return (Criteria) this;
        }

        public Criteria andBigInEqualTo(String value) {
            addCriterion("big_in =", value, "bigIn");
            return (Criteria) this;
        }

        public Criteria andBigInNotEqualTo(String value) {
            addCriterion("big_in <>", value, "bigIn");
            return (Criteria) this;
        }

        public Criteria andBigInGreaterThan(String value) {
            addCriterion("big_in >", value, "bigIn");
            return (Criteria) this;
        }

        public Criteria andBigInGreaterThanOrEqualTo(String value) {
            addCriterion("big_in >=", value, "bigIn");
            return (Criteria) this;
        }

        public Criteria andBigInLessThan(String value) {
            addCriterion("big_in <", value, "bigIn");
            return (Criteria) this;
        }

        public Criteria andBigInLessThanOrEqualTo(String value) {
            addCriterion("big_in <=", value, "bigIn");
            return (Criteria) this;
        }

        public Criteria andBigInLike(String value) {
            addCriterion("big_in like", value, "bigIn");
            return (Criteria) this;
        }

        public Criteria andBigInNotLike(String value) {
            addCriterion("big_in not like", value, "bigIn");
            return (Criteria) this;
        }

        public Criteria andBigInIn(List<String> values) {
            addCriterion("big_in in", values, "bigIn");
            return (Criteria) this;
        }

        public Criteria andBigInNotIn(List<String> values) {
            addCriterion("big_in not in", values, "bigIn");
            return (Criteria) this;
        }

        public Criteria andBigInBetween(String value1, String value2) {
            addCriterion("big_in between", value1, value2, "bigIn");
            return (Criteria) this;
        }

        public Criteria andBigInNotBetween(String value1, String value2) {
            addCriterion("big_in not between", value1, value2, "bigIn");
            return (Criteria) this;
        }

        public Criteria andBigOutIsNull() {
            addCriterion("big_out is null");
            return (Criteria) this;
        }

        public Criteria andBigOutIsNotNull() {
            addCriterion("big_out is not null");
            return (Criteria) this;
        }

        public Criteria andBigOutEqualTo(String value) {
            addCriterion("big_out =", value, "bigOut");
            return (Criteria) this;
        }

        public Criteria andBigOutNotEqualTo(String value) {
            addCriterion("big_out <>", value, "bigOut");
            return (Criteria) this;
        }

        public Criteria andBigOutGreaterThan(String value) {
            addCriterion("big_out >", value, "bigOut");
            return (Criteria) this;
        }

        public Criteria andBigOutGreaterThanOrEqualTo(String value) {
            addCriterion("big_out >=", value, "bigOut");
            return (Criteria) this;
        }

        public Criteria andBigOutLessThan(String value) {
            addCriterion("big_out <", value, "bigOut");
            return (Criteria) this;
        }

        public Criteria andBigOutLessThanOrEqualTo(String value) {
            addCriterion("big_out <=", value, "bigOut");
            return (Criteria) this;
        }

        public Criteria andBigOutLike(String value) {
            addCriterion("big_out like", value, "bigOut");
            return (Criteria) this;
        }

        public Criteria andBigOutNotLike(String value) {
            addCriterion("big_out not like", value, "bigOut");
            return (Criteria) this;
        }

        public Criteria andBigOutIn(List<String> values) {
            addCriterion("big_out in", values, "bigOut");
            return (Criteria) this;
        }

        public Criteria andBigOutNotIn(List<String> values) {
            addCriterion("big_out not in", values, "bigOut");
            return (Criteria) this;
        }

        public Criteria andBigOutBetween(String value1, String value2) {
            addCriterion("big_out between", value1, value2, "bigOut");
            return (Criteria) this;
        }

        public Criteria andBigOutNotBetween(String value1, String value2) {
            addCriterion("big_out not between", value1, value2, "bigOut");
            return (Criteria) this;
        }

        public Criteria andMediumInIsNull() {
            addCriterion("medium_in is null");
            return (Criteria) this;
        }

        public Criteria andMediumInIsNotNull() {
            addCriterion("medium_in is not null");
            return (Criteria) this;
        }

        public Criteria andMediumInEqualTo(String value) {
            addCriterion("medium_in =", value, "mediumIn");
            return (Criteria) this;
        }

        public Criteria andMediumInNotEqualTo(String value) {
            addCriterion("medium_in <>", value, "mediumIn");
            return (Criteria) this;
        }

        public Criteria andMediumInGreaterThan(String value) {
            addCriterion("medium_in >", value, "mediumIn");
            return (Criteria) this;
        }

        public Criteria andMediumInGreaterThanOrEqualTo(String value) {
            addCriterion("medium_in >=", value, "mediumIn");
            return (Criteria) this;
        }

        public Criteria andMediumInLessThan(String value) {
            addCriterion("medium_in <", value, "mediumIn");
            return (Criteria) this;
        }

        public Criteria andMediumInLessThanOrEqualTo(String value) {
            addCriterion("medium_in <=", value, "mediumIn");
            return (Criteria) this;
        }

        public Criteria andMediumInLike(String value) {
            addCriterion("medium_in like", value, "mediumIn");
            return (Criteria) this;
        }

        public Criteria andMediumInNotLike(String value) {
            addCriterion("medium_in not like", value, "mediumIn");
            return (Criteria) this;
        }

        public Criteria andMediumInIn(List<String> values) {
            addCriterion("medium_in in", values, "mediumIn");
            return (Criteria) this;
        }

        public Criteria andMediumInNotIn(List<String> values) {
            addCriterion("medium_in not in", values, "mediumIn");
            return (Criteria) this;
        }

        public Criteria andMediumInBetween(String value1, String value2) {
            addCriterion("medium_in between", value1, value2, "mediumIn");
            return (Criteria) this;
        }

        public Criteria andMediumInNotBetween(String value1, String value2) {
            addCriterion("medium_in not between", value1, value2, "mediumIn");
            return (Criteria) this;
        }

        public Criteria andMediumOutIsNull() {
            addCriterion("medium_out is null");
            return (Criteria) this;
        }

        public Criteria andMediumOutIsNotNull() {
            addCriterion("medium_out is not null");
            return (Criteria) this;
        }

        public Criteria andMediumOutEqualTo(String value) {
            addCriterion("medium_out =", value, "mediumOut");
            return (Criteria) this;
        }

        public Criteria andMediumOutNotEqualTo(String value) {
            addCriterion("medium_out <>", value, "mediumOut");
            return (Criteria) this;
        }

        public Criteria andMediumOutGreaterThan(String value) {
            addCriterion("medium_out >", value, "mediumOut");
            return (Criteria) this;
        }

        public Criteria andMediumOutGreaterThanOrEqualTo(String value) {
            addCriterion("medium_out >=", value, "mediumOut");
            return (Criteria) this;
        }

        public Criteria andMediumOutLessThan(String value) {
            addCriterion("medium_out <", value, "mediumOut");
            return (Criteria) this;
        }

        public Criteria andMediumOutLessThanOrEqualTo(String value) {
            addCriterion("medium_out <=", value, "mediumOut");
            return (Criteria) this;
        }

        public Criteria andMediumOutLike(String value) {
            addCriterion("medium_out like", value, "mediumOut");
            return (Criteria) this;
        }

        public Criteria andMediumOutNotLike(String value) {
            addCriterion("medium_out not like", value, "mediumOut");
            return (Criteria) this;
        }

        public Criteria andMediumOutIn(List<String> values) {
            addCriterion("medium_out in", values, "mediumOut");
            return (Criteria) this;
        }

        public Criteria andMediumOutNotIn(List<String> values) {
            addCriterion("medium_out not in", values, "mediumOut");
            return (Criteria) this;
        }

        public Criteria andMediumOutBetween(String value1, String value2) {
            addCriterion("medium_out between", value1, value2, "mediumOut");
            return (Criteria) this;
        }

        public Criteria andMediumOutNotBetween(String value1, String value2) {
            addCriterion("medium_out not between", value1, value2, "mediumOut");
            return (Criteria) this;
        }

        public Criteria andSmallInIsNull() {
            addCriterion("small_in is null");
            return (Criteria) this;
        }

        public Criteria andSmallInIsNotNull() {
            addCriterion("small_in is not null");
            return (Criteria) this;
        }

        public Criteria andSmallInEqualTo(String value) {
            addCriterion("small_in =", value, "smallIn");
            return (Criteria) this;
        }

        public Criteria andSmallInNotEqualTo(String value) {
            addCriterion("small_in <>", value, "smallIn");
            return (Criteria) this;
        }

        public Criteria andSmallInGreaterThan(String value) {
            addCriterion("small_in >", value, "smallIn");
            return (Criteria) this;
        }

        public Criteria andSmallInGreaterThanOrEqualTo(String value) {
            addCriterion("small_in >=", value, "smallIn");
            return (Criteria) this;
        }

        public Criteria andSmallInLessThan(String value) {
            addCriterion("small_in <", value, "smallIn");
            return (Criteria) this;
        }

        public Criteria andSmallInLessThanOrEqualTo(String value) {
            addCriterion("small_in <=", value, "smallIn");
            return (Criteria) this;
        }

        public Criteria andSmallInLike(String value) {
            addCriterion("small_in like", value, "smallIn");
            return (Criteria) this;
        }

        public Criteria andSmallInNotLike(String value) {
            addCriterion("small_in not like", value, "smallIn");
            return (Criteria) this;
        }

        public Criteria andSmallInIn(List<String> values) {
            addCriterion("small_in in", values, "smallIn");
            return (Criteria) this;
        }

        public Criteria andSmallInNotIn(List<String> values) {
            addCriterion("small_in not in", values, "smallIn");
            return (Criteria) this;
        }

        public Criteria andSmallInBetween(String value1, String value2) {
            addCriterion("small_in between", value1, value2, "smallIn");
            return (Criteria) this;
        }

        public Criteria andSmallInNotBetween(String value1, String value2) {
            addCriterion("small_in not between", value1, value2, "smallIn");
            return (Criteria) this;
        }

        public Criteria andSmallOutIsNull() {
            addCriterion("small_out is null");
            return (Criteria) this;
        }

        public Criteria andSmallOutIsNotNull() {
            addCriterion("small_out is not null");
            return (Criteria) this;
        }

        public Criteria andSmallOutEqualTo(String value) {
            addCriterion("small_out =", value, "smallOut");
            return (Criteria) this;
        }

        public Criteria andSmallOutNotEqualTo(String value) {
            addCriterion("small_out <>", value, "smallOut");
            return (Criteria) this;
        }

        public Criteria andSmallOutGreaterThan(String value) {
            addCriterion("small_out >", value, "smallOut");
            return (Criteria) this;
        }

        public Criteria andSmallOutGreaterThanOrEqualTo(String value) {
            addCriterion("small_out >=", value, "smallOut");
            return (Criteria) this;
        }

        public Criteria andSmallOutLessThan(String value) {
            addCriterion("small_out <", value, "smallOut");
            return (Criteria) this;
        }

        public Criteria andSmallOutLessThanOrEqualTo(String value) {
            addCriterion("small_out <=", value, "smallOut");
            return (Criteria) this;
        }

        public Criteria andSmallOutLike(String value) {
            addCriterion("small_out like", value, "smallOut");
            return (Criteria) this;
        }

        public Criteria andSmallOutNotLike(String value) {
            addCriterion("small_out not like", value, "smallOut");
            return (Criteria) this;
        }

        public Criteria andSmallOutIn(List<String> values) {
            addCriterion("small_out in", values, "smallOut");
            return (Criteria) this;
        }

        public Criteria andSmallOutNotIn(List<String> values) {
            addCriterion("small_out not in", values, "smallOut");
            return (Criteria) this;
        }

        public Criteria andSmallOutBetween(String value1, String value2) {
            addCriterion("small_out between", value1, value2, "smallOut");
            return (Criteria) this;
        }

        public Criteria andSmallOutNotBetween(String value1, String value2) {
            addCriterion("small_out not between", value1, value2, "smallOut");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
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