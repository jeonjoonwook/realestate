package com.joonwook.realestate.dto;

import java.util.Date;

public class AptPrcRegDto {

    private Date histStrtDts;
    private Date histEndDts;
    private String aptDtlId;
    private String prcTypeCd;
    private String dealTypeCd;
    private String price;
    private String prcDt;
    private String aptPrcDesc;
    private Date regDts;
    private String regpeId;
    private Date modDts;
    private String modpeId;
    public AptPrcRegDto() {
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

    public String getAptDtlId() {
        return aptDtlId;
    }

    public void setAptDtlId(String aptDtlId) {
        this.aptDtlId = aptDtlId;
    }

    public String getPrcTypeCd() {
        return prcTypeCd;
    }

    public void setPrcTypeCd(String prcTypeCd) {
        this.prcTypeCd = prcTypeCd;
    }

    public String getDealTypeCd() {
        return dealTypeCd;
    }

    public void setDealTypeCd(String dealTypeCd) {
        this.dealTypeCd = dealTypeCd;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrcDt() {
        return prcDt;
    }

    public void setPrcDt(String prcDt) {
        this.prcDt = prcDt;
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

    public String getAptPrcDesc() {
        return aptPrcDesc;
    }

    public void setAptPrcDesc(String aptPrcDesc) {
        this.aptPrcDesc = aptPrcDesc;
    }
}
