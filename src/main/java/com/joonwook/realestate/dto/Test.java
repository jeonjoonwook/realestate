package com.joonwook.realestate.dto;

public class Test {

    public Test(String aptId, String aptNm) {
        this.aptId = aptId;
        this.aptNm = aptNm;
    }


    private String aptId;


    private String aptNm;

    public String getAptId() {
        return aptId;
    }

    public void setAptId(String aptId) {
        this.aptId = aptId;
    }

    public String getAptNm() {
        return aptNm;
    }

    public void setAptNm(String aptNm) {
        this.aptNm = aptNm;
    }


}
