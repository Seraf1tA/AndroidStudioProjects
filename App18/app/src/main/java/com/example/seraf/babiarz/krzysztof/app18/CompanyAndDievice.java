package com.example.seraf.babiarz.krzysztof.app18;

public class CompanyAndDievice {

    private final String COMPANY_NAME;
    private final String COMPANY_DEVICE;

    public CompanyAndDievice(String COMPANY_NAME, String COMPANY_DEVICE) {
        this.COMPANY_NAME = COMPANY_NAME;
        this.COMPANY_DEVICE = COMPANY_DEVICE;
    }

    /*When ever we create object from this class this method will be called*/
    @Override
    public String toString() {
        return " " + COMPANY_DEVICE + " From " + COMPANY_NAME + " Company " +
                ". \n\n\n";
    }
}
