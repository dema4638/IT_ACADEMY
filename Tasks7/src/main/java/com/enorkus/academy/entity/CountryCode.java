package com.enorkus.academy.entity;

public enum CountryCode {
    LT, LV, EE, SE;


    public static boolean checkIfValueIsCountryCode(String countryCode) {
        boolean isValueAnEnum = false;
        for (CountryCode countryCodeEnum : CountryCode.values()) {
            if (countryCode.equals(countryCodeEnum.toString())) {
                isValueAnEnum = true;
            }
        }
        return isValueAnEnum;
    }
}



