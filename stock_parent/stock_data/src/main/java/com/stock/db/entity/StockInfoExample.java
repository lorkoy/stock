package com.stock.db.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StockInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockInfoExample() {
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
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andClosingIsNull() {
            addCriterion("closing is null");
            return (Criteria) this;
        }

        public Criteria andClosingIsNotNull() {
            addCriterion("closing is not null");
            return (Criteria) this;
        }

        public Criteria andClosingEqualTo(String value) {
            addCriterion("closing =", value, "closing");
            return (Criteria) this;
        }

        public Criteria andClosingNotEqualTo(String value) {
            addCriterion("closing <>", value, "closing");
            return (Criteria) this;
        }

        public Criteria andClosingGreaterThan(String value) {
            addCriterion("closing >", value, "closing");
            return (Criteria) this;
        }

        public Criteria andClosingGreaterThanOrEqualTo(String value) {
            addCriterion("closing >=", value, "closing");
            return (Criteria) this;
        }

        public Criteria andClosingLessThan(String value) {
            addCriterion("closing <", value, "closing");
            return (Criteria) this;
        }

        public Criteria andClosingLessThanOrEqualTo(String value) {
            addCriterion("closing <=", value, "closing");
            return (Criteria) this;
        }

        public Criteria andClosingLike(String value) {
            addCriterion("closing like", value, "closing");
            return (Criteria) this;
        }

        public Criteria andClosingNotLike(String value) {
            addCriterion("closing not like", value, "closing");
            return (Criteria) this;
        }

        public Criteria andClosingIn(List<String> values) {
            addCriterion("closing in", values, "closing");
            return (Criteria) this;
        }

        public Criteria andClosingNotIn(List<String> values) {
            addCriterion("closing not in", values, "closing");
            return (Criteria) this;
        }

        public Criteria andClosingBetween(String value1, String value2) {
            addCriterion("closing between", value1, value2, "closing");
            return (Criteria) this;
        }

        public Criteria andClosingNotBetween(String value1, String value2) {
            addCriterion("closing not between", value1, value2, "closing");
            return (Criteria) this;
        }

        public Criteria andOpenIsNull() {
            addCriterion("open is null");
            return (Criteria) this;
        }

        public Criteria andOpenIsNotNull() {
            addCriterion("open is not null");
            return (Criteria) this;
        }

        public Criteria andOpenEqualTo(String value) {
            addCriterion("open =", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotEqualTo(String value) {
            addCriterion("open <>", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThan(String value) {
            addCriterion("open >", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThanOrEqualTo(String value) {
            addCriterion("open >=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThan(String value) {
            addCriterion("open <", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThanOrEqualTo(String value) {
            addCriterion("open <=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLike(String value) {
            addCriterion("open like", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotLike(String value) {
            addCriterion("open not like", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenIn(List<String> values) {
            addCriterion("open in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotIn(List<String> values) {
            addCriterion("open not in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenBetween(String value1, String value2) {
            addCriterion("open between", value1, value2, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotBetween(String value1, String value2) {
            addCriterion("open not between", value1, value2, "open");
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andLowestIsNull() {
            addCriterion("lowest is null");
            return (Criteria) this;
        }

        public Criteria andLowestIsNotNull() {
            addCriterion("lowest is not null");
            return (Criteria) this;
        }

        public Criteria andLowestEqualTo(String value) {
            addCriterion("lowest =", value, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestNotEqualTo(String value) {
            addCriterion("lowest <>", value, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestGreaterThan(String value) {
            addCriterion("lowest >", value, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestGreaterThanOrEqualTo(String value) {
            addCriterion("lowest >=", value, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestLessThan(String value) {
            addCriterion("lowest <", value, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestLessThanOrEqualTo(String value) {
            addCriterion("lowest <=", value, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestLike(String value) {
            addCriterion("lowest like", value, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestNotLike(String value) {
            addCriterion("lowest not like", value, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestIn(List<String> values) {
            addCriterion("lowest in", values, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestNotIn(List<String> values) {
            addCriterion("lowest not in", values, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestBetween(String value1, String value2) {
            addCriterion("lowest between", value1, value2, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestNotBetween(String value1, String value2) {
            addCriterion("lowest not between", value1, value2, "lowest");
            return (Criteria) this;
        }

        public Criteria andHighestIsNull() {
            addCriterion("highest is null");
            return (Criteria) this;
        }

        public Criteria andHighestIsNotNull() {
            addCriterion("highest is not null");
            return (Criteria) this;
        }

        public Criteria andHighestEqualTo(String value) {
            addCriterion("highest =", value, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestNotEqualTo(String value) {
            addCriterion("highest <>", value, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestGreaterThan(String value) {
            addCriterion("highest >", value, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestGreaterThanOrEqualTo(String value) {
            addCriterion("highest >=", value, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestLessThan(String value) {
            addCriterion("highest <", value, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestLessThanOrEqualTo(String value) {
            addCriterion("highest <=", value, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestLike(String value) {
            addCriterion("highest like", value, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestNotLike(String value) {
            addCriterion("highest not like", value, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestIn(List<String> values) {
            addCriterion("highest in", values, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestNotIn(List<String> values) {
            addCriterion("highest not in", values, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestBetween(String value1, String value2) {
            addCriterion("highest between", value1, value2, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestNotBetween(String value1, String value2) {
            addCriterion("highest not between", value1, value2, "highest");
            return (Criteria) this;
        }

        public Criteria andCurrentIsNull() {
            addCriterion("current is null");
            return (Criteria) this;
        }

        public Criteria andCurrentIsNotNull() {
            addCriterion("current is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentEqualTo(String value) {
            addCriterion("current =", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotEqualTo(String value) {
            addCriterion("current <>", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentGreaterThan(String value) {
            addCriterion("current >", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentGreaterThanOrEqualTo(String value) {
            addCriterion("current >=", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentLessThan(String value) {
            addCriterion("current <", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentLessThanOrEqualTo(String value) {
            addCriterion("current <=", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentLike(String value) {
            addCriterion("current like", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotLike(String value) {
            addCriterion("current not like", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentIn(List<String> values) {
            addCriterion("current in", values, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotIn(List<String> values) {
            addCriterion("current not in", values, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentBetween(String value1, String value2) {
            addCriterion("current between", value1, value2, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotBetween(String value1, String value2) {
            addCriterion("current not between", value1, value2, "current");
            return (Criteria) this;
        }

        public Criteria andPrecloseIsNull() {
            addCriterion("preClose is null");
            return (Criteria) this;
        }

        public Criteria andPrecloseIsNotNull() {
            addCriterion("preClose is not null");
            return (Criteria) this;
        }

        public Criteria andPrecloseEqualTo(String value) {
            addCriterion("preClose =", value, "preclose");
            return (Criteria) this;
        }

        public Criteria andPrecloseNotEqualTo(String value) {
            addCriterion("preClose <>", value, "preclose");
            return (Criteria) this;
        }

        public Criteria andPrecloseGreaterThan(String value) {
            addCriterion("preClose >", value, "preclose");
            return (Criteria) this;
        }

        public Criteria andPrecloseGreaterThanOrEqualTo(String value) {
            addCriterion("preClose >=", value, "preclose");
            return (Criteria) this;
        }

        public Criteria andPrecloseLessThan(String value) {
            addCriterion("preClose <", value, "preclose");
            return (Criteria) this;
        }

        public Criteria andPrecloseLessThanOrEqualTo(String value) {
            addCriterion("preClose <=", value, "preclose");
            return (Criteria) this;
        }

        public Criteria andPrecloseLike(String value) {
            addCriterion("preClose like", value, "preclose");
            return (Criteria) this;
        }

        public Criteria andPrecloseNotLike(String value) {
            addCriterion("preClose not like", value, "preclose");
            return (Criteria) this;
        }

        public Criteria andPrecloseIn(List<String> values) {
            addCriterion("preClose in", values, "preclose");
            return (Criteria) this;
        }

        public Criteria andPrecloseNotIn(List<String> values) {
            addCriterion("preClose not in", values, "preclose");
            return (Criteria) this;
        }

        public Criteria andPrecloseBetween(String value1, String value2) {
            addCriterion("preClose between", value1, value2, "preclose");
            return (Criteria) this;
        }

        public Criteria andPrecloseNotBetween(String value1, String value2) {
            addCriterion("preClose not between", value1, value2, "preclose");
            return (Criteria) this;
        }

        public Criteria andVolIsNull() {
            addCriterion("vol is null");
            return (Criteria) this;
        }

        public Criteria andVolIsNotNull() {
            addCriterion("vol is not null");
            return (Criteria) this;
        }

        public Criteria andVolEqualTo(String value) {
            addCriterion("vol =", value, "vol");
            return (Criteria) this;
        }

        public Criteria andVolNotEqualTo(String value) {
            addCriterion("vol <>", value, "vol");
            return (Criteria) this;
        }

        public Criteria andVolGreaterThan(String value) {
            addCriterion("vol >", value, "vol");
            return (Criteria) this;
        }

        public Criteria andVolGreaterThanOrEqualTo(String value) {
            addCriterion("vol >=", value, "vol");
            return (Criteria) this;
        }

        public Criteria andVolLessThan(String value) {
            addCriterion("vol <", value, "vol");
            return (Criteria) this;
        }

        public Criteria andVolLessThanOrEqualTo(String value) {
            addCriterion("vol <=", value, "vol");
            return (Criteria) this;
        }

        public Criteria andVolLike(String value) {
            addCriterion("vol like", value, "vol");
            return (Criteria) this;
        }

        public Criteria andVolNotLike(String value) {
            addCriterion("vol not like", value, "vol");
            return (Criteria) this;
        }

        public Criteria andVolIn(List<String> values) {
            addCriterion("vol in", values, "vol");
            return (Criteria) this;
        }

        public Criteria andVolNotIn(List<String> values) {
            addCriterion("vol not in", values, "vol");
            return (Criteria) this;
        }

        public Criteria andVolBetween(String value1, String value2) {
            addCriterion("vol between", value1, value2, "vol");
            return (Criteria) this;
        }

        public Criteria andVolNotBetween(String value1, String value2) {
            addCriterion("vol not between", value1, value2, "vol");
            return (Criteria) this;
        }

        public Criteria andClosingcostIsNull() {
            addCriterion("closingCost is null");
            return (Criteria) this;
        }

        public Criteria andClosingcostIsNotNull() {
            addCriterion("closingCost is not null");
            return (Criteria) this;
        }

        public Criteria andClosingcostEqualTo(String value) {
            addCriterion("closingCost =", value, "closingcost");
            return (Criteria) this;
        }

        public Criteria andClosingcostNotEqualTo(String value) {
            addCriterion("closingCost <>", value, "closingcost");
            return (Criteria) this;
        }

        public Criteria andClosingcostGreaterThan(String value) {
            addCriterion("closingCost >", value, "closingcost");
            return (Criteria) this;
        }

        public Criteria andClosingcostGreaterThanOrEqualTo(String value) {
            addCriterion("closingCost >=", value, "closingcost");
            return (Criteria) this;
        }

        public Criteria andClosingcostLessThan(String value) {
            addCriterion("closingCost <", value, "closingcost");
            return (Criteria) this;
        }

        public Criteria andClosingcostLessThanOrEqualTo(String value) {
            addCriterion("closingCost <=", value, "closingcost");
            return (Criteria) this;
        }

        public Criteria andClosingcostLike(String value) {
            addCriterion("closingCost like", value, "closingcost");
            return (Criteria) this;
        }

        public Criteria andClosingcostNotLike(String value) {
            addCriterion("closingCost not like", value, "closingcost");
            return (Criteria) this;
        }

        public Criteria andClosingcostIn(List<String> values) {
            addCriterion("closingCost in", values, "closingcost");
            return (Criteria) this;
        }

        public Criteria andClosingcostNotIn(List<String> values) {
            addCriterion("closingCost not in", values, "closingcost");
            return (Criteria) this;
        }

        public Criteria andClosingcostBetween(String value1, String value2) {
            addCriterion("closingCost between", value1, value2, "closingcost");
            return (Criteria) this;
        }

        public Criteria andClosingcostNotBetween(String value1, String value2) {
            addCriterion("closingCost not between", value1, value2, "closingcost");
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

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andWeekIsNull() {
            addCriterion("week is null");
            return (Criteria) this;
        }

        public Criteria andWeekIsNotNull() {
            addCriterion("week is not null");
            return (Criteria) this;
        }

        public Criteria andWeekEqualTo(Integer value) {
            addCriterion("week =", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotEqualTo(Integer value) {
            addCriterion("week <>", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThan(Integer value) {
            addCriterion("week >", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThanOrEqualTo(Integer value) {
            addCriterion("week >=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThan(Integer value) {
            addCriterion("week <", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThanOrEqualTo(Integer value) {
            addCriterion("week <=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekIn(List<Integer> values) {
            addCriterion("week in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotIn(List<Integer> values) {
            addCriterion("week not in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekBetween(Integer value1, Integer value2) {
            addCriterion("week between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotBetween(Integer value1, Integer value2) {
            addCriterion("week not between", value1, value2, "week");
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