package com.mywork.sc.entity;

import java.util.ArrayList;
import java.util.List;

public class OrderstateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderstateExample() {
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

        public Criteria andOsidIsNull() {
            addCriterion("osid is null");
            return (Criteria) this;
        }

        public Criteria andOsidIsNotNull() {
            addCriterion("osid is not null");
            return (Criteria) this;
        }

        public Criteria andOsidEqualTo(Integer value) {
            addCriterion("osid =", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidNotEqualTo(Integer value) {
            addCriterion("osid <>", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidGreaterThan(Integer value) {
            addCriterion("osid >", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("osid >=", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidLessThan(Integer value) {
            addCriterion("osid <", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidLessThanOrEqualTo(Integer value) {
            addCriterion("osid <=", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidIn(List<Integer> values) {
            addCriterion("osid in", values, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidNotIn(List<Integer> values) {
            addCriterion("osid not in", values, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidBetween(Integer value1, Integer value2) {
            addCriterion("osid between", value1, value2, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidNotBetween(Integer value1, Integer value2) {
            addCriterion("osid not between", value1, value2, "osid");
            return (Criteria) this;
        }

        public Criteria andStateDescIsNull() {
            addCriterion("state_desc is null");
            return (Criteria) this;
        }

        public Criteria andStateDescIsNotNull() {
            addCriterion("state_desc is not null");
            return (Criteria) this;
        }

        public Criteria andStateDescEqualTo(String value) {
            addCriterion("state_desc =", value, "stateDesc");
            return (Criteria) this;
        }

        public Criteria andStateDescNotEqualTo(String value) {
            addCriterion("state_desc <>", value, "stateDesc");
            return (Criteria) this;
        }

        public Criteria andStateDescGreaterThan(String value) {
            addCriterion("state_desc >", value, "stateDesc");
            return (Criteria) this;
        }

        public Criteria andStateDescGreaterThanOrEqualTo(String value) {
            addCriterion("state_desc >=", value, "stateDesc");
            return (Criteria) this;
        }

        public Criteria andStateDescLessThan(String value) {
            addCriterion("state_desc <", value, "stateDesc");
            return (Criteria) this;
        }

        public Criteria andStateDescLessThanOrEqualTo(String value) {
            addCriterion("state_desc <=", value, "stateDesc");
            return (Criteria) this;
        }

        public Criteria andStateDescLike(String value) {
            addCriterion("state_desc like", value, "stateDesc");
            return (Criteria) this;
        }

        public Criteria andStateDescNotLike(String value) {
            addCriterion("state_desc not like", value, "stateDesc");
            return (Criteria) this;
        }

        public Criteria andStateDescIn(List<String> values) {
            addCriterion("state_desc in", values, "stateDesc");
            return (Criteria) this;
        }

        public Criteria andStateDescNotIn(List<String> values) {
            addCriterion("state_desc not in", values, "stateDesc");
            return (Criteria) this;
        }

        public Criteria andStateDescBetween(String value1, String value2) {
            addCriterion("state_desc between", value1, value2, "stateDesc");
            return (Criteria) this;
        }

        public Criteria andStateDescNotBetween(String value1, String value2) {
            addCriterion("state_desc not between", value1, value2, "stateDesc");
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