package com.microsoft.bing.mybatis.model.garbage;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by nbj-mybatis-generator-plugins
 * @author 雅诗兰黛
 * @since 2021-08-06.
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Garbage {
    private Long id;

    private String summoner;

    private String hero;

    private String finish;

    private String reasonsReporting;

    private Date times;

    private String informants;

    public Long getId() {
        return id;
    }

    public Garbage withId(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSummoner() {
        return summoner;
    }

    public Garbage withSummoner(String summoner) {
        this.setSummoner(summoner);
        return this;
    }

    public void setSummoner(String summoner) {
        this.summoner = summoner;
    }

    public String getHero() {
        return hero;
    }

    public Garbage withHero(String hero) {
        this.setHero(hero);
        return this;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public String getFinish() {
        return finish;
    }

    public Garbage withFinish(String finish) {
        this.setFinish(finish);
        return this;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public String getReasonsReporting() {
        return reasonsReporting;
    }

    public Garbage withReasonsReporting(String reasonsReporting) {
        this.setReasonsReporting(reasonsReporting);
        return this;
    }

    public void setReasonsReporting(String reasonsReporting) {
        this.reasonsReporting = reasonsReporting;
    }

    public Date getTimes() {
        return times;
    }

    public Garbage withTimes(Date times) {
        this.setTimes(times);
        return this;
    }

    public void setTimes(Date times) {
        this.times = times;
    }

    public String getInformants() {
        return informants;
    }

    public Garbage withInformants(String informants) {
        this.setInformants(informants);
        return this;
    }

    public void setInformants(String informants) {
        this.informants = informants;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Garbage other = (Garbage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSummoner() == null ? other.getSummoner() == null : this.getSummoner().equals(other.getSummoner()))
            && (this.getHero() == null ? other.getHero() == null : this.getHero().equals(other.getHero()))
            && (this.getFinish() == null ? other.getFinish() == null : this.getFinish().equals(other.getFinish()))
            && (this.getReasonsReporting() == null ? other.getReasonsReporting() == null : this.getReasonsReporting().equals(other.getReasonsReporting()))
            && (this.getTimes() == null ? other.getTimes() == null : this.getTimes().equals(other.getTimes()))
            && (this.getInformants() == null ? other.getInformants() == null : this.getInformants().equals(other.getInformants()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSummoner() == null) ? 0 : getSummoner().hashCode());
        result = prime * result + ((getHero() == null) ? 0 : getHero().hashCode());
        result = prime * result + ((getFinish() == null) ? 0 : getFinish().hashCode());
        result = prime * result + ((getReasonsReporting() == null) ? 0 : getReasonsReporting().hashCode());
        result = prime * result + ((getTimes() == null) ? 0 : getTimes().hashCode());
        result = prime * result + ((getInformants() == null) ? 0 : getInformants().hashCode());
        return result;
    }
}