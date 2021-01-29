package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static class Patient {

        private Date birthday;
        private String sex;
        private String basicInsurance;
        private String supplementaryInsurance;
        private String degree;
        private String job;
        private String location;
        private String geographicLocation;
        private ArrayList<String> confidantDoctors;
        private ArrayList<Disease> medicalSubdivision;

        //...
    }

    public static class Disease {

        private String generalTypeOFDisease;
        private String diseaseBiography;
        private String doctorDiagnosis;
        private String diseaseSafetyLevel;
        private String medicine;
        private Date date;
        private String doctor;

        //...
    }

    public static class Access {

        public void provideForResearch() {
            //...
        }

        public void provideForPharmacy() {
            //...
        }

        public void accessMedicalSubdivision() {
            //...
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}
