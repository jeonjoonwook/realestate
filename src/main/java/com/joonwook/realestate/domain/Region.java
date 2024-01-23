package com.joonwook.realestate.domain;

import java.util.Date;

public class Region {

    private int aptId;
    private Date histStrtDts;
    private Date histEndDts;
    private String rgnCd;
    private String rgnNm;
    private String rgnDtlCd;
    private String rgnDtlNm;
    private String description;
    private Date regDts;
    private String regpeId;
    private Date modDts;
    private String modpeId;

    public Region(int aptId, Date histStrtDts, Date histEndDts, String rgnCd, String rgnNm, String rgnDtlCd, String rgnDtlNm, String description, Date regDts, String regpeId, Date modDts, String modpeId) {
        this.aptId = aptId;
        this.histStrtDts = histStrtDts;
        this.histEndDts = histEndDts;
        this.rgnCd = rgnCd;
        this.rgnNm = rgnNm;
        this.rgnDtlCd = rgnDtlCd;
        this.rgnDtlNm = rgnDtlNm;
        this.description = description;
        this.regDts = regDts;
        this.regpeId = regpeId;
        this.modDts = modDts;
        this.modpeId = modpeId;
    }

    public Region() {
    }

    public int getAptId() {
        return aptId;
    }

    public void setAptId(int aptId) {
        this.aptId = aptId;
    }

    public Date getHistStrtDts() {
        return histStrtDts;
    }

    public void setHistStrtDts(Date histStrtDts) {
        this.histStrtDts = histStrtDts;
    }

    public Date getHistEndDts() {
        return histEndDts;
    }

    public void setHistEndDts(Date histEndDts) {
        this.histEndDts = histEndDts;
    }

    public String getRgnCd() {
        return rgnCd;
    }

    public void setRgnCd(String rgnCd) {
        this.rgnCd = rgnCd;
    }

    public String getRgnNm() {
        return rgnNm;
    }

    public void setRgnNm(String rgnNm) {
        this.rgnNm = rgnNm;
    }

    public String getRgnDtlCd() {
        return rgnDtlCd;
    }

    public void setRgnDtlCd(String rgnDtlCd) {
        this.rgnDtlCd = rgnDtlCd;
    }

    public String getRgnDtlNm() {
        return rgnDtlNm;
    }

    public void setRgnDtlNm(String rgnDtlNm) {
        this.rgnDtlNm = rgnDtlNm;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getRegDts() {
        return regDts;
    }

    public void setRegDts(Date regDts) {
        this.regDts = regDts;
    }

    public String getRegpeId() {
        return regpeId;
    }

    public void setRegpeId(String regpeId) {
        this.regpeId = regpeId;
    }

    public Date getModDts() {
        return modDts;
    }

    public void setModDts(Date modDts) {
        this.modDts = modDts;
    }

    public String getModpeId() {
        return modpeId;
    }

    public void setModpeId(String modpeId) {
        this.modpeId = modpeId;
    }

}
