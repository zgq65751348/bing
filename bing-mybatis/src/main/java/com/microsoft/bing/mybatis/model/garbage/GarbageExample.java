package com.microsoft.bing.mybatis.model.garbage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by nbj-mybatis-generator-plugins
 * @author 雅诗兰黛
 * @since 2021-08-06.
 */
public class GarbageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public GarbageExample() {
        oredCriteria = new ArrayList<>();
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSummonerIsNull() {
            addCriterion("summoner is null");
            return (Criteria) this;
        }

        public Criteria andSummonerIsNotNull() {
            addCriterion("summoner is not null");
            return (Criteria) this;
        }

        public Criteria andSummonerEqualTo(String value) {
            addCriterion("summoner =", value, "summoner");
            return (Criteria) this;
        }

        public Criteria andSummonerNotEqualTo(String value) {
            addCriterion("summoner <>", value, "summoner");
            return (Criteria) this;
        }

        public Criteria andSummonerGreaterThan(String value) {
            addCriterion("summoner >", value, "summoner");
            return (Criteria) this;
        }

        public Criteria andSummonerGreaterThanOrEqualTo(String value) {
            addCriterion("summoner >=", value, "summoner");
            return (Criteria) this;
        }

        public Criteria andSummonerLessThan(String value) {
            addCriterion("summoner <", value, "summoner");
            return (Criteria) this;
        }

        public Criteria andSummonerLessThanOrEqualTo(String value) {
            addCriterion("summoner <=", value, "summoner");
            return (Criteria) this;
        }

        public Criteria andSummonerLike(String value) {
            addCriterion("summoner like", value, "summoner");
            return (Criteria) this;
        }

        public Criteria andSummonerNotLike(String value) {
            addCriterion("summoner not like", value, "summoner");
            return (Criteria) this;
        }

        public Criteria andSummonerIn(List<String> values) {
            addCriterion("summoner in", values, "summoner");
            return (Criteria) this;
        }

        public Criteria andSummonerNotIn(List<String> values) {
            addCriterion("summoner not in", values, "summoner");
            return (Criteria) this;
        }

        public Criteria andSummonerBetween(String value1, String value2) {
            addCriterion("summoner between", value1, value2, "summoner");
            return (Criteria) this;
        }

        public Criteria andSummonerNotBetween(String value1, String value2) {
            addCriterion("summoner not between", value1, value2, "summoner");
            return (Criteria) this;
        }

        public Criteria andHeroIsNull() {
            addCriterion("hero is null");
            return (Criteria) this;
        }

        public Criteria andHeroIsNotNull() {
            addCriterion("hero is not null");
            return (Criteria) this;
        }

        public Criteria andHeroEqualTo(String value) {
            addCriterion("hero =", value, "hero");
            return (Criteria) this;
        }

        public Criteria andHeroNotEqualTo(String value) {
            addCriterion("hero <>", value, "hero");
            return (Criteria) this;
        }

        public Criteria andHeroGreaterThan(String value) {
            addCriterion("hero >", value, "hero");
            return (Criteria) this;
        }

        public Criteria andHeroGreaterThanOrEqualTo(String value) {
            addCriterion("hero >=", value, "hero");
            return (Criteria) this;
        }

        public Criteria andHeroLessThan(String value) {
            addCriterion("hero <", value, "hero");
            return (Criteria) this;
        }

        public Criteria andHeroLessThanOrEqualTo(String value) {
            addCriterion("hero <=", value, "hero");
            return (Criteria) this;
        }

        public Criteria andHeroLike(String value) {
            addCriterion("hero like", value, "hero");
            return (Criteria) this;
        }

        public Criteria andHeroNotLike(String value) {
            addCriterion("hero not like", value, "hero");
            return (Criteria) this;
        }

        public Criteria andHeroIn(List<String> values) {
            addCriterion("hero in", values, "hero");
            return (Criteria) this;
        }

        public Criteria andHeroNotIn(List<String> values) {
            addCriterion("hero not in", values, "hero");
            return (Criteria) this;
        }

        public Criteria andHeroBetween(String value1, String value2) {
            addCriterion("hero between", value1, value2, "hero");
            return (Criteria) this;
        }

        public Criteria andHeroNotBetween(String value1, String value2) {
            addCriterion("hero not between", value1, value2, "hero");
            return (Criteria) this;
        }

        public Criteria andFinishIsNull() {
            addCriterion("finish is null");
            return (Criteria) this;
        }

        public Criteria andFinishIsNotNull() {
            addCriterion("finish is not null");
            return (Criteria) this;
        }

        public Criteria andFinishEqualTo(String value) {
            addCriterion("finish =", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishNotEqualTo(String value) {
            addCriterion("finish <>", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishGreaterThan(String value) {
            addCriterion("finish >", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishGreaterThanOrEqualTo(String value) {
            addCriterion("finish >=", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishLessThan(String value) {
            addCriterion("finish <", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishLessThanOrEqualTo(String value) {
            addCriterion("finish <=", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishLike(String value) {
            addCriterion("finish like", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishNotLike(String value) {
            addCriterion("finish not like", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishIn(List<String> values) {
            addCriterion("finish in", values, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishNotIn(List<String> values) {
            addCriterion("finish not in", values, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishBetween(String value1, String value2) {
            addCriterion("finish between", value1, value2, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishNotBetween(String value1, String value2) {
            addCriterion("finish not between", value1, value2, "finish");
            return (Criteria) this;
        }

        public Criteria andReasonsReportingIsNull() {
            addCriterion("reasons_reporting is null");
            return (Criteria) this;
        }

        public Criteria andReasonsReportingIsNotNull() {
            addCriterion("reasons_reporting is not null");
            return (Criteria) this;
        }

        public Criteria andReasonsReportingEqualTo(String value) {
            addCriterion("reasons_reporting =", value, "reasonsReporting");
            return (Criteria) this;
        }

        public Criteria andReasonsReportingNotEqualTo(String value) {
            addCriterion("reasons_reporting <>", value, "reasonsReporting");
            return (Criteria) this;
        }

        public Criteria andReasonsReportingGreaterThan(String value) {
            addCriterion("reasons_reporting >", value, "reasonsReporting");
            return (Criteria) this;
        }

        public Criteria andReasonsReportingGreaterThanOrEqualTo(String value) {
            addCriterion("reasons_reporting >=", value, "reasonsReporting");
            return (Criteria) this;
        }

        public Criteria andReasonsReportingLessThan(String value) {
            addCriterion("reasons_reporting <", value, "reasonsReporting");
            return (Criteria) this;
        }

        public Criteria andReasonsReportingLessThanOrEqualTo(String value) {
            addCriterion("reasons_reporting <=", value, "reasonsReporting");
            return (Criteria) this;
        }

        public Criteria andReasonsReportingLike(String value) {
            addCriterion("reasons_reporting like", value, "reasonsReporting");
            return (Criteria) this;
        }

        public Criteria andReasonsReportingNotLike(String value) {
            addCriterion("reasons_reporting not like", value, "reasonsReporting");
            return (Criteria) this;
        }

        public Criteria andReasonsReportingIn(List<String> values) {
            addCriterion("reasons_reporting in", values, "reasonsReporting");
            return (Criteria) this;
        }

        public Criteria andReasonsReportingNotIn(List<String> values) {
            addCriterion("reasons_reporting not in", values, "reasonsReporting");
            return (Criteria) this;
        }

        public Criteria andReasonsReportingBetween(String value1, String value2) {
            addCriterion("reasons_reporting between", value1, value2, "reasonsReporting");
            return (Criteria) this;
        }

        public Criteria andReasonsReportingNotBetween(String value1, String value2) {
            addCriterion("reasons_reporting not between", value1, value2, "reasonsReporting");
            return (Criteria) this;
        }

        public Criteria andTimesIsNull() {
            addCriterion("times is null");
            return (Criteria) this;
        }

        public Criteria andTimesIsNotNull() {
            addCriterion("times is not null");
            return (Criteria) this;
        }

        public Criteria andTimesEqualTo(Date value) {
            addCriterion("times =", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotEqualTo(Date value) {
            addCriterion("times <>", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThan(Date value) {
            addCriterion("times >", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThanOrEqualTo(Date value) {
            addCriterion("times >=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThan(Date value) {
            addCriterion("times <", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThanOrEqualTo(Date value) {
            addCriterion("times <=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesIn(List<Date> values) {
            addCriterion("times in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotIn(List<Date> values) {
            addCriterion("times not in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesBetween(Date value1, Date value2) {
            addCriterion("times between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotBetween(Date value1, Date value2) {
            addCriterion("times not between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andInformantsIsNull() {
            addCriterion("informants is null");
            return (Criteria) this;
        }

        public Criteria andInformantsIsNotNull() {
            addCriterion("informants is not null");
            return (Criteria) this;
        }

        public Criteria andInformantsEqualTo(String value) {
            addCriterion("informants =", value, "informants");
            return (Criteria) this;
        }

        public Criteria andInformantsNotEqualTo(String value) {
            addCriterion("informants <>", value, "informants");
            return (Criteria) this;
        }

        public Criteria andInformantsGreaterThan(String value) {
            addCriterion("informants >", value, "informants");
            return (Criteria) this;
        }

        public Criteria andInformantsGreaterThanOrEqualTo(String value) {
            addCriterion("informants >=", value, "informants");
            return (Criteria) this;
        }

        public Criteria andInformantsLessThan(String value) {
            addCriterion("informants <", value, "informants");
            return (Criteria) this;
        }

        public Criteria andInformantsLessThanOrEqualTo(String value) {
            addCriterion("informants <=", value, "informants");
            return (Criteria) this;
        }

        public Criteria andInformantsLike(String value) {
            addCriterion("informants like", value, "informants");
            return (Criteria) this;
        }

        public Criteria andInformantsNotLike(String value) {
            addCriterion("informants not like", value, "informants");
            return (Criteria) this;
        }

        public Criteria andInformantsIn(List<String> values) {
            addCriterion("informants in", values, "informants");
            return (Criteria) this;
        }

        public Criteria andInformantsNotIn(List<String> values) {
            addCriterion("informants not in", values, "informants");
            return (Criteria) this;
        }

        public Criteria andInformantsBetween(String value1, String value2) {
            addCriterion("informants between", value1, value2, "informants");
            return (Criteria) this;
        }

        public Criteria andInformantsNotBetween(String value1, String value2) {
            addCriterion("informants not between", value1, value2, "informants");
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