package com.joonwook.realestate.dto;

public class Apartment {

    private String name;
    private String age;
    private String numRooms;
    private String supplySize;
    private String realSize;
    private String highestMarketPrice;
    private String highestRentPrice;
    private String topLowFloorYn;
    private String nowMarketPrice;
    private String pricePerSize;
    private String nowRentPrice;
    private String marketPerRent;
    public Apartment(String name, String age, String numRooms, String supplySize, String realSize, String highestMarketPrice, String highestRentPrice, String topLowFloorYn, String nowMarketPrice, String pricePerSize, String nowRentPrice, String marketPerRent) {
        this.name = name;
        this.age = age;
        this.numRooms = numRooms;
        this.supplySize = supplySize;
        this.realSize = realSize;
        this.highestMarketPrice = highestMarketPrice;
        this.highestRentPrice = highestRentPrice;
        this.topLowFloorYn = topLowFloorYn;
        this.nowMarketPrice = nowMarketPrice;
        this.pricePerSize = pricePerSize;
        this.nowRentPrice = nowRentPrice;
        this.marketPerRent = marketPerRent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(String numRooms) {
        this.numRooms = numRooms;
    }

    public String getSupplySize() {
        return supplySize;
    }

    public void setSupplySize(String supplySize) {
        this.supplySize = supplySize;
    }

    public String getRealSize() {
        return realSize;
    }

    public void setRealSize(String realSize) {
        this.realSize = realSize;
    }

    public String getHighestMarketPrice() {
        return highestMarketPrice;
    }

    public void setHighestMarketPrice(String highestMarketPrice) {
        this.highestMarketPrice = highestMarketPrice;
    }

    public String getHighestRentPrice() {
        return highestRentPrice;
    }

    public void setHighestRentPrice(String highestRentPrice) {
        this.highestRentPrice = highestRentPrice;
    }

    public String getTopLowFloorYn() {
        return topLowFloorYn;
    }

    public void setTopLowFloorYn(String topLowFloorYn) {
        this.topLowFloorYn = topLowFloorYn;
    }

    public String getNowMarketPrice() {
        return nowMarketPrice;
    }

    public void setNowMarketPrice(String nowMarketPrice) {
        this.nowMarketPrice = nowMarketPrice;
    }

    public String getPricePerSize() {
        return pricePerSize;
    }

    public void setPricePerSize(String pricePerSize) {
        this.pricePerSize = pricePerSize;
    }

    public String getNowRentPrice() {
        return nowRentPrice;
    }

    public void setNowRentPrice(String nowRentPrice) {
        this.nowRentPrice = nowRentPrice;
    }

    public String getMarketPerRent() {
        return marketPerRent;
    }

    public void setMarketPerRent(String marketPerRent) {
        this.marketPerRent = marketPerRent;
    }
}
