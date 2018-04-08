package com.example.seraf.babiarz.krzysztof.app18;

import java.security.SecureRandom;

public class Puzzle {

    private CompanyAndDievice[] companyAndDievices;
    private int currentDeviceModel;
    private static final int NUMBER_OF_MODELS = 60;
    private static final SecureRandom secureRandomNubers = new SecureRandom();

    public Puzzle() {

        String[] companies = { "Apple", "Google", "Sony", "Samsung", "HTC" };

        String[] devices = { "Xperia Z3", "iPhone 6", "Galaxy Note8", "Galaxy Note10", "iPod Touch",
                            "HTC M9", "Xperia Z5", "iPod Nano", "Xperia M", "Galaxy S6",
                            "Nexus5", "Nexus10"};

        /* Instantiating companyAndDevice array
        * in this Puzzle() constructor
        * and in brackeds we placed lenght of array */
        companyAndDievices = new CompanyAndDievice[NUMBER_OF_MODELS];

        currentDeviceModel = 0;

        for (int i = 0; i < companyAndDievices.length; i++){
            companyAndDievices[i] = new CompanyAndDievice(companies[i / 12],
                    devices[i % 5]);
        }

    }

    public void letsShuffleTheDevices(){

        currentDeviceModel = 0;

        for (int firstDevice = 0; firstDevice < companyAndDievices.length; firstDevice++){

            int secondDevice = secureRandomNubers.nextInt(NUMBER_OF_MODELS);
            CompanyAndDievice tempCompanyDevice = companyAndDievices[firstDevice];
            companyAndDievices[firstDevice] = companyAndDievices[secondDevice];
            companyAndDievices[secondDevice] = tempCompanyDevice;

        }
    }

    public CompanyAndDievice giveMeTheModels(){

        if (currentDeviceModel < companyAndDievices.length){
            return companyAndDievices[currentDeviceModel++];
        }else {
            return null;
        }
    }
}
