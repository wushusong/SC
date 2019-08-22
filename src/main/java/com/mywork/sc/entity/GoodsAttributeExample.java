package com.mywork.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsAttributeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsAttributeExample() {
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

        public Criteria andGoodsAttrNameValueIdIsNull() {
            addCriterion("goods_attr_name_value_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNameValueIdIsNotNull() {
            addCriterion("goods_attr_name_value_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNameValueIdEqualTo(Integer value) {
            addCriterion("goods_attr_name_value_id =", value, "goodsAttrNameValueId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNameValueIdNotEqualTo(Integer value) {
            addCriterion("goods_attr_name_value_id <>", value, "goodsAttrNameValueId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNameValueIdGreaterThan(Integer value) {
            addCriterion("goods_attr_name_value_id >", value, "goodsAttrNameValueId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNameValueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_attr_name_value_id >=", value, "goodsAttrNameValueId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNameValueIdLessThan(Integer value) {
            addCriterion("goods_attr_name_value_id <", value, "goodsAttrNameValueId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNameValueIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_attr_name_value_id <=", value, "goodsAttrNameValueId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNameValueIdIn(List<Integer> values) {
            addCriterion("goods_attr_name_value_id in", values, "goodsAttrNameValueId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNameValueIdNotIn(List<Integer> values) {
            addCriterion("goods_attr_name_value_id not in", values, "goodsAttrNameValueId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNameValueIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_attr_name_value_id between", value1, value2, "goodsAttrNameValueId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNameValueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_attr_name_value_id not between", value1, value2, "goodsAttrNameValueId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andAttrNameIdIsNull() {
            addCriterion("attr_name_id is null");
            return (Criteria) this;
        }

        public Criteria andAttrNameIdIsNotNull() {
            addCriterion("attr_name_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttrNameIdEqualTo(Integer value) {
            addCriterion("attr_name_id =", value, "attrNameId");
            return (Criteria) this;
        }

        public Criteria andAttrNameIdNotEqualTo(Integer value) {
            addCriterion("attr_name_id <>", value, "attrNameId");
            return (Criteria) this;
        }

        public Criteria andAttrNameIdGreaterThan(Integer value) {
            addCriterion("attr_name_id >", value, "attrNameId");
            return (Criteria) this;
        }

        public Criteria andAttrNameIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("attr_name_id >=", value, "attrNameId");
            return (Criteria) this;
        }

        public Criteria andAttrNameIdLessThan(Integer value) {
            addCriterion("attr_name_id <", value, "attrNameId");
            return (Criteria) this;
        }

        public Criteria andAttrNameIdLessThanOrEqualTo(Integer value) {
            addCriterion("attr_name_id <=", value, "attrNameId");
            return (Criteria) this;
        }

        public Criteria andAttrNameIdIn(List<Integer> values) {
            addCriterion("attr_name_id in", values, "attrNameId");
            return (Criteria) this;
        }

        public Criteria andAttrNameIdNotIn(List<Integer> values) {
            addCriterion("attr_name_id not in", values, "attrNameId");
            return (Criteria) this;
        }

        public Criteria andAttrNameIdBetween(Integer value1, Integer value2) {
            addCriterion("attr_name_id between", value1, value2, "attrNameId");
            return (Criteria) this;
        }

        public Criteria andAttrNameIdNotBetween(Integer value1, Integer value2) {
            addCriterion("attr_name_id not between", value1, value2, "attrNameId");
            return (Criteria) this;
        }

        public Criteria andAttrValueIdIsNull() {
            addCriterion("attr_value_id is null");
            return (Criteria) this;
        }

        public Criteria andAttrValueIdIsNotNull() {
            addCriterion("attr_value_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttrValueIdEqualTo(Integer value) {
            addCriterion("attr_value_id =", value, "attrValueId");
            return (Criteria) this;
        }

        public Criteria andAttrValueIdNotEqualTo(Integer value) {
            addCriterion("attr_value_id <>", value, "attrValueId");
            return (Criteria) this;
        }

        public Criteria andAttrValueIdGreaterThan(Integer value) {
            addCriterion("attr_value_id >", value, "attrValueId");
            return (Criteria) this;
        }

        public Criteria andAttrValueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("attr_value_id >=", value, "attrValueId");
            return (Criteria) this;
        }

        public Criteria andAttrValueIdLessThan(Integer value) {
            addCriterion("attr_value_id <", value, "attrValueId");
            return (Criteria) this;
        }

        public Criteria andAttrValueIdLessThanOrEqualTo(Integer value) {
            addCriterion("attr_value_id <=", value, "attrValueId");
            return (Criteria) this;
        }

        public Criteria andAttrValueIdIn(List<Integer> values) {
            addCriterion("attr_value_id in", values, "attrValueId");
            return (Criteria) this;
        }

        public Criteria andAttrValueIdNotIn(List<Integer> values) {
            addCriterion("attr_value_id not in", values, "attrValueId");
            return (Criteria) this;
        }

        public Criteria andAttrValueIdBetween(Integer value1, Integer value2) {
            addCriterion("attr_value_id between", value1, value2, "attrValueId");
            return (Criteria) this;
        }

        public Criteria andAttrValueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("attr_value_id not between", value1, value2, "attrValueId");
            return (Criteria) this;
        }

        public Criteria andAttrNameDateIsNull() {
            addCriterion("attr_name_date is null");
            return (Criteria) this;
        }

        public Criteria andAttrNameDateIsNotNull() {
            addCriterion("attr_name_date is not null");
            return (Criteria) this;
        }

        public Criteria andAttrNameDateEqualTo(Date value) {
            addCriterion("attr_name_date =", value, "attrNameDate");
            return (Criteria) this;
        }

        public Criteria andAttrNameDateNotEqualTo(Date value) {
            addCriterion("attr_name_date <>", value, "attrNameDate");
            return (Criteria) this;
        }

        public Criteria andAttrNameDateGreaterThan(Date value) {
            addCriterion("attr_name_date >", value, "attrNameDate");
            return (Criteria) this;
        }

        public Criteria andAttrNameDateGreaterThanOrEqualTo(Date value) {
            addCriterion("attr_name_date >=", value, "attrNameDate");
            return (Criteria) this;
        }

        public Criteria andAttrNameDateLessThan(Date value) {
            addCriterion("attr_name_date <", value, "attrNameDate");
            return (Criteria) this;
        }

        public Criteria andAttrNameDateLessThanOrEqualTo(Date value) {
            addCriterion("attr_name_date <=", value, "attrNameDate");
            return (Criteria) this;
        }

        public Criteria andAttrNameDateIn(List<Date> values) {
            addCriterion("attr_name_date in", values, "attrNameDate");
            return (Criteria) this;
        }

        public Criteria andAttrNameDateNotIn(List<Date> values) {
            addCriterion("attr_name_date not in", values, "attrNameDate");
            return (Criteria) this;
        }

        public Criteria andAttrNameDateBetween(Date value1, Date value2) {
            addCriterion("attr_name_date between", value1, value2, "attrNameDate");
            return (Criteria) this;
        }

        public Criteria andAttrNameDateNotBetween(Date value1, Date value2) {
            addCriterion("attr_name_date not between", value1, value2, "attrNameDate");
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