package com.joonwook.realestate.dto;

import java.util.Date;

public class AptDtlRegDto {

    private Date histStrtDts;
    private Date histEndDts;
    private String aptId;
    private String totArea;
    private String usblArea;
    private String roomAmt;
    private String toiletAmt;
    private String highSellPrc;
    private String highSellDt;
    private String highRentPrc;
    private String highRentDt;
    private String aptDtlDesc;
    private Date regDts;
    private String regpeId;
    private Date modDts;
    private String modpeId;

    public AptDtlRegDto() {
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

    public String getAptId() {
        return aptId;
    }

    public void setAptId(String aptId) {
        this.aptId = aptId;
    }

    public String getTotArea() {
        return totArea;
    }

    public void setTotArea(String totArea) {
        this.totArea = totArea;
    }

    public String getUsblArea() {
        return usblArea;
    }

    public void setUsblArea(String usblArea) {
        this.usblArea = usblArea;
    }

    public String getRoomAmt() {
        return roomAmt;
    }

    public void setRoomAmt(String roomAmt) {
        this.roomAmt = roomAmt;
    }

    public String getToiletAmt() {
        return toiletAmt;
    }

    public void setToiletAmt(String toiletAmt) {
        this.toiletAmt = toiletAmt;
    }

    public String getHighSellPrc() {
        return highSellPrc;
    }

    public void setHighSellPrc(String highSellPrc) {
        this.highSellPrc = highSellPrc;
    }

    public String getHighSellDt() {
        return highSellDt;
    }

    public void setHighSellDt(String highSellDt) {
        this.highSellDt = highSellDt;
    }

    public String getHighRentPrc() {
        return highRentPrc;
    }

    public void setHighRentPrc(String highRentPrc) {
        this.highRentPrc = highRentPrc;
    }

    public String getHighRentDt() {
        return highRentDt;
    }

    public void setHighRentDt(String highRentDt) {
        this.highRentDt = highRentDt;
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

    public String getAptDtlDesc() {
        return aptDtlDesc;
    }

    public void setAptDtlDesc(String aptDtlDesc) {
        this.aptDtlDesc = aptDtlDesc;
    }
}
