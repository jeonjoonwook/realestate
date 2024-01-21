package com.joonwook.realestate.dto;

import java.util.Date;

public class AptRegDto {

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

    public AptRegDto() {
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

}
