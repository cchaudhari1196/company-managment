package com.companymanagment.entity;

public enum Industry {
    Advertising("Advertising"),
    Agriculture("Agriculture Industry"),
    Communications("Communications Industry");
//    Construction Industry,
//    Creative Industries,
//    Education,
//    Entertainment Industry,
//    Farming,
//    Fashion,
//    Finance,
//    Green Industry,
//    Heavy Industry,
//    Hospitality Industry,
//    Information Industry,
//    Information Technology,
//    Infrastructure,
//    Light Industry,
//    Manufacturing,
//    Materials,
//    Media,
//    Music Industry,
//    Primary Industry,
//    Publishing,
//    Retail,
//    Robotics,
//    Secondary Industry,
//    Service Industry,
//    Space,
//    Space Industry,
//    Technology Industry,
//    Telecom;

    private String value;
    Industry(String industry) {
        this.value = industry;
    }
}
