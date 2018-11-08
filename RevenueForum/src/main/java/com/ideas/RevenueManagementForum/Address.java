package com.ideas.RevenueManagementForum;



/**
 * Created by idnklm on 3/4/2018.
 */

public class Address {
    String details;
    String city;
    Integer pinCode;
    String state;
    String country;
    String linkToGoogleMap;

    public Address(){

    }

    public Address(String addressDetails, String city, Integer pinCode,String state, String country, String linkToGoogleMap ) {
        this.details = addressDetails;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.country = country;
        this.linkToGoogleMap=linkToGoogleMap;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer postCode) {
        this.pinCode = postCode;
    }


    public String getLinkToGoogleMap() {
        return linkToGoogleMap;
    }

    public void setLinkToGoogleMap(String linkToGoogleMap) {
        this.linkToGoogleMap = linkToGoogleMap;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
