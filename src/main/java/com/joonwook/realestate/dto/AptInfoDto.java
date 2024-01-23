package com.joonwook.realestate.dto;

public class AptInfoDto {

    public AptInfoDto() {
    }

    private String aptNm;

    private String rgnCd;
    private String rgnDtlCd;
    private String address;
    private int aptYear;
    private String unitAmt;

    private String plotRate;

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


}
