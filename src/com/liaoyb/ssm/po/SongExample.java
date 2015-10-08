package com.liaoyb.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SongExample() {
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

        public Criteria andSongtitleIsNull() {
            addCriterion("songtitle is null");
            return (Criteria) this;
        }

        public Criteria andSongtitleIsNotNull() {
            addCriterion("songtitle is not null");
            return (Criteria) this;
        }

        public Criteria andSongtitleEqualTo(String value) {
            addCriterion("songtitle =", value, "songtitle");
            return (Criteria) this;
        }

        public Criteria andSongtitleNotEqualTo(String value) {
            addCriterion("songtitle <>", value, "songtitle");
            return (Criteria) this;
        }

        public Criteria andSongtitleGreaterThan(String value) {
            addCriterion("songtitle >", value, "songtitle");
            return (Criteria) this;
        }

        public Criteria andSongtitleGreaterThanOrEqualTo(String value) {
            addCriterion("songtitle >=", value, "songtitle");
            return (Criteria) this;
        }

        public Criteria andSongtitleLessThan(String value) {
            addCriterion("songtitle <", value, "songtitle");
            return (Criteria) this;
        }

        public Criteria andSongtitleLessThanOrEqualTo(String value) {
            addCriterion("songtitle <=", value, "songtitle");
            return (Criteria) this;
        }

        public Criteria andSongtitleLike(String value) {
            addCriterion("songtitle like", value, "songtitle");
            return (Criteria) this;
        }

        public Criteria andSongtitleNotLike(String value) {
            addCriterion("songtitle not like", value, "songtitle");
            return (Criteria) this;
        }

        public Criteria andSongtitleIn(List<String> values) {
            addCriterion("songtitle in", values, "songtitle");
            return (Criteria) this;
        }

        public Criteria andSongtitleNotIn(List<String> values) {
            addCriterion("songtitle not in", values, "songtitle");
            return (Criteria) this;
        }

        public Criteria andSongtitleBetween(String value1, String value2) {
            addCriterion("songtitle between", value1, value2, "songtitle");
            return (Criteria) this;
        }

        public Criteria andSongtitleNotBetween(String value1, String value2) {
            addCriterion("songtitle not between", value1, value2, "songtitle");
            return (Criteria) this;
        }

        public Criteria andReleasetimeIsNull() {
            addCriterion("releasetime is null");
            return (Criteria) this;
        }

        public Criteria andReleasetimeIsNotNull() {
            addCriterion("releasetime is not null");
            return (Criteria) this;
        }

        public Criteria andReleasetimeEqualTo(Date value) {
            addCriterionForJDBCDate("releasetime =", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("releasetime <>", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("releasetime >", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("releasetime >=", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeLessThan(Date value) {
            addCriterionForJDBCDate("releasetime <", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("releasetime <=", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeIn(List<Date> values) {
            addCriterionForJDBCDate("releasetime in", values, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("releasetime not in", values, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("releasetime between", value1, value2, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("releasetime not between", value1, value2, "releasetime");
            return (Criteria) this;
        }

        public Criteria andInfoIsNull() {
            addCriterion("info is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("info is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("info =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("info <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("info >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("info >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("info <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("info <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("info like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("info not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("info in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("info not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("info between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("info not between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andPlaycountIsNull() {
            addCriterion("playcount is null");
            return (Criteria) this;
        }

        public Criteria andPlaycountIsNotNull() {
            addCriterion("playcount is not null");
            return (Criteria) this;
        }

        public Criteria andPlaycountEqualTo(Integer value) {
            addCriterion("playcount =", value, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountNotEqualTo(Integer value) {
            addCriterion("playcount <>", value, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountGreaterThan(Integer value) {
            addCriterion("playcount >", value, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountGreaterThanOrEqualTo(Integer value) {
            addCriterion("playcount >=", value, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountLessThan(Integer value) {
            addCriterion("playcount <", value, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountLessThanOrEqualTo(Integer value) {
            addCriterion("playcount <=", value, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountIn(List<Integer> values) {
            addCriterion("playcount in", values, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountNotIn(List<Integer> values) {
            addCriterion("playcount not in", values, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountBetween(Integer value1, Integer value2) {
            addCriterion("playcount between", value1, value2, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountNotBetween(Integer value1, Integer value2) {
            addCriterion("playcount not between", value1, value2, "playcount");
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

        public Criteria andDownloadcountIsNull() {
            addCriterion("downloadcount is null");
            return (Criteria) this;
        }

        public Criteria andDownloadcountIsNotNull() {
            addCriterion("downloadcount is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadcountEqualTo(Integer value) {
            addCriterion("downloadcount =", value, "downloadcount");
            return (Criteria) this;
        }

        public Criteria andDownloadcountNotEqualTo(Integer value) {
            addCriterion("downloadcount <>", value, "downloadcount");
            return (Criteria) this;
        }

        public Criteria andDownloadcountGreaterThan(Integer value) {
            addCriterion("downloadcount >", value, "downloadcount");
            return (Criteria) this;
        }

        public Criteria andDownloadcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("downloadcount >=", value, "downloadcount");
            return (Criteria) this;
        }

        public Criteria andDownloadcountLessThan(Integer value) {
            addCriterion("downloadcount <", value, "downloadcount");
            return (Criteria) this;
        }

        public Criteria andDownloadcountLessThanOrEqualTo(Integer value) {
            addCriterion("downloadcount <=", value, "downloadcount");
            return (Criteria) this;
        }

        public Criteria andDownloadcountIn(List<Integer> values) {
            addCriterion("downloadcount in", values, "downloadcount");
            return (Criteria) this;
        }

        public Criteria andDownloadcountNotIn(List<Integer> values) {
            addCriterion("downloadcount not in", values, "downloadcount");
            return (Criteria) this;
        }

        public Criteria andDownloadcountBetween(Integer value1, Integer value2) {
            addCriterion("downloadcount between", value1, value2, "downloadcount");
            return (Criteria) this;
        }

        public Criteria andDownloadcountNotBetween(Integer value1, Integer value2) {
            addCriterion("downloadcount not between", value1, value2, "downloadcount");
            return (Criteria) this;
        }

        public Criteria andMusicidIsNull() {
            addCriterion("musicid is null");
            return (Criteria) this;
        }

        public Criteria andMusicidIsNotNull() {
            addCriterion("musicid is not null");
            return (Criteria) this;
        }

        public Criteria andMusicidEqualTo(Integer value) {
            addCriterion("musicid =", value, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidNotEqualTo(Integer value) {
            addCriterion("musicid <>", value, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidGreaterThan(Integer value) {
            addCriterion("musicid >", value, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidGreaterThanOrEqualTo(Integer value) {
            addCriterion("musicid >=", value, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidLessThan(Integer value) {
            addCriterion("musicid <", value, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidLessThanOrEqualTo(Integer value) {
            addCriterion("musicid <=", value, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidIn(List<Integer> values) {
            addCriterion("musicid in", values, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidNotIn(List<Integer> values) {
            addCriterion("musicid not in", values, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidBetween(Integer value1, Integer value2) {
            addCriterion("musicid between", value1, value2, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidNotBetween(Integer value1, Integer value2) {
            addCriterion("musicid not between", value1, value2, "musicid");
            return (Criteria) this;
        }

        public Criteria andImgidIsNull() {
            addCriterion("imgid is null");
            return (Criteria) this;
        }

        public Criteria andImgidIsNotNull() {
            addCriterion("imgid is not null");
            return (Criteria) this;
        }

        public Criteria andImgidEqualTo(Integer value) {
            addCriterion("imgid =", value, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidNotEqualTo(Integer value) {
            addCriterion("imgid <>", value, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidGreaterThan(Integer value) {
            addCriterion("imgid >", value, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("imgid >=", value, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidLessThan(Integer value) {
            addCriterion("imgid <", value, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidLessThanOrEqualTo(Integer value) {
            addCriterion("imgid <=", value, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidIn(List<Integer> values) {
            addCriterion("imgid in", values, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidNotIn(List<Integer> values) {
            addCriterion("imgid not in", values, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidBetween(Integer value1, Integer value2) {
            addCriterion("imgid between", value1, value2, "imgid");
            return (Criteria) this;
        }

        public Criteria andImgidNotBetween(Integer value1, Integer value2) {
            addCriterion("imgid not between", value1, value2, "imgid");
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