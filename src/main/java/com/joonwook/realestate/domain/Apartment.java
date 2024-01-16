package com.joonwook.realestate.domain;

import java.util.Date;

public class Apartment {

    private int aptId;
    private Date histStrtDts;
    private Date histEndDts;
    private String aptNm;
    private String rgnCd;
    private String rgnDtlCd;
    private String address;
    private int aptYear;
    private String unitAmt;
    private String plotRate;
    private Date regDts;
    private String regpeId;
    private Date modDts;

    private String modpeId;

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

    public String getAptNm() {
        return aptNm;
    }

    public void setAptNm(String aptNm) {
        this.aptNm = aptNm;
    }

    public String getRgnCd() {
        return rgnCd;
    }

    public void setRgnCd(String rgnCd) {
        this.rgnCd = rgnCd;
    }

    public String getRgnDtlCd() {
        return rgnDtlCd;
    }

    public void setRgnDtlCd(String rgnDtlCd) {
        this.rgnDtlCd = rgnDtlCd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAptYear() {
        return aptYear;
    }

    public void setAptYear(int aptYear) {
        this.aptYear = aptYear;
    }

    public String getUnitAmt() {
        return unitAmt;
    }

    public void setUnitAmt(String unitAmt) {
        this.unitAmt = unitAmt;
    }

    public String getPlotRate() {
        return plotRate;
    }

    public void setPlotRate(String plotRate) {
        this.plotRate = plotRate;
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


    public Apartment(int aptId, Date histStrtDts, Date histEndDts, String aptNm, String rgnCd, String rgnDtlCd, String address, int aptYear, String unitAmt, String plotRate, Date regDts, String regpeId, Date modDts, String modpeId) {
        this.aptId = aptId;
        this.histStrtDts = histStrtDts;
        this.histEndDts = histEndDts;
        this.aptNm = aptNm;
        this.rgnCd = rgnCd;
        this.rgnDtlCd = rgnDtlCd;
        this.address = address;
        this.aptYear = aptYear;
        this.unitAmt = unitAmt;
        this.plotRate = plotRate;
        this.regDts = regDts;
        this.regpeId = regpeId;
        this.modDts = modDts;
        this.modpeId = modpeId;
    }




}
