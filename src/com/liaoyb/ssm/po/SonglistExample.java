package com.liaoyb.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class SonglistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SonglistExample() {
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

        public Criteria andListnameIsNull() {
            addCriterion("listname is null");
            return (Criteria) this;
        }

        public Criteria andListnameIsNotNull() {
            addCriterion("listname is not null");
            return (Criteria) this;
        }

        public Criteria andListnameEqualTo(String value) {
            addCriterion("listname =", value, "listname");
            return (Criteria) this;
        }

        public Criteria andListnameNotEqualTo(String value) {
            addCriterion("listname <>", value, "listname");
            return (Criteria) this;
        }

        public Criteria andListnameGreaterThan(String value) {
            addCriterion("listname >", value, "listname");
            return (Criteria) this;
        }

        public Criteria andListnameGreaterThanOrEqualTo(String value) {
            addCriterion("listname >=", value, "listname");
            return (Criteria) this;
        }

        public Criteria andListnameLessThan(String value) {
            addCriterion("listname <", value, "listname");
            return (Criteria) this;
        }

        public Criteria andListnameLessThanOrEqualTo(String value) {
            addCriterion("listname <=", value, "listname");
            return (Criteria) this;
        }

        public Criteria andListnameLike(String value) {
            addCriterion("listname like", value, "listname");
            return (Criteria) this;
        }

        public Criteria andListnameNotLike(String value) {
            addCriterion("listname not like", value, "listname");
            return (Criteria) this;
        }

        public Criteria andListnameIn(List<String> values) {
            addCriterion("listname in", values, "listname");
            return (Criteria) this;
        }

        public Criteria andListnameNotIn(List<String> values) {
            addCriterion("listname not in", values, "listname");
            return (Criteria) this;
        }

        public Criteria andListnameBetween(String value1, String value2) {
            addCriterion("listname between", value1, value2, "listname");
            return (Criteria) this;
        }

        public Criteria andListnameNotBetween(String value1, String value2) {
            addCriterion("listname not between", value1, value2, "listname");
            return (Criteria) this;
        }

        public Criteria andListinfoIsNull() {
            addCriterion("listinfo is null");
            return (Criteria) this;
        }

        public Criteria andListinfoIsNotNull() {
            addCriterion("listinfo is not null");
            return (Criteria) this;
        }

        public Criteria andListinfoEqualTo(String value) {
            addCriterion("listinfo =", value, "listinfo");
            return (Criteria) this;
        }

        public Criteria andListinfoNotEqualTo(String value) {
            addCriterion("listinfo <>", value, "listinfo");
            return (Criteria) this;
        }

        public Criteria andListinfoGreaterThan(String value) {
            addCriterion("listinfo >", value, "listinfo");
            return (Criteria) this;
        }

        public Criteria andListinfoGreaterThanOrEqualTo(String value) {
            addCriterion("listinfo >=", value, "listinfo");
            return (Criteria) this;
        }

        public Criteria andListinfoLessThan(String value) {
            addCriterion("listinfo <", value, "listinfo");
            return (Criteria) this;
        }

        public Criteria andListinfoLessThanOrEqualTo(String value) {
            addCriterion("listinfo <=", value, "listinfo");
            return (Criteria) this;
        }

        public Criteria andListinfoLike(String value) {
            addCriterion("listinfo like", value, "listinfo");
            return (Criteria) this;
        }

        public Criteria andListinfoNotLike(String value) {
            addCriterion("listinfo not like", value, "listinfo");
            return (Criteria) this;
        }

        public Criteria andListinfoIn(List<String> values) {
            addCriterion("listinfo in", values, "listinfo");
            return (Criteria) this;
        }

        public Criteria andListinfoNotIn(List<String> values) {
            addCriterion("listinfo not in", values, "listinfo");
            return (Criteria) this;
        }

        public Criteria andListinfoBetween(String value1, String value2) {
            addCriterion("listinfo between", value1, value2, "listinfo");
            return (Criteria) this;
        }

        public Criteria andListinfoNotBetween(String value1, String value2) {
            addCriterion("listinfo not between", value1, value2, "listinfo");
            return (Criteria) this;
        }

        public Criteria andCollectcountIsNull() {
            addCriterion("collectcount is null");
            return (Criteria) this;
        }

        public Criteria andCollectcountIsNotNull() {
            addCriterion("collectcount is not null");
            return (Criteria) this;
        }

        public Criteria andCollectcountEqualTo(Integer value) {
            addCriterion("collectcount =", value, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountNotEqualTo(Integer value) {
            addCriterion("collectcount <>", value, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountGreaterThan(Integer value) {
            addCriterion("collectcount >", value, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("collectcount >=", value, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountLessThan(Integer value) {
            addCriterion("collectcount <", value, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountLessThanOrEqualTo(Integer value) {
            addCriterion("collectcount <=", value, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountIn(List<Integer> values) {
            addCriterion("collectcount in", values, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountNotIn(List<Integer> values) {
            addCriterion("collectcount not in", values, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountBetween(Integer value1, Integer value2) {
            addCriterion("collectcount between", value1, value2, "collectcount");
            return (Criteria) this;
        }

        public Criteria andCollectcountNotBetween(Integer value1, Integer value2) {
            addCriterion("collectcount not between", value1, value2, "collectcount");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
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