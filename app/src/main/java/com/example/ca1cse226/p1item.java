package com.example.ca1cse226;

public class p1item {
    private String patientname;
    private String patientdisease;
    private int patientimages;
    public p1item(String patientname,String patientdisease,int patientimages){

        this.patientname=patientname;
        this.patientdisease=patientdisease;
        this.patientimages=patientimages;

    }


    public String getPatientname() {
        return patientname;
    }

    public String getPatientdisease() {
        return patientdisease;
    }

    public int getPatientimages() {
        return patientimages;
    }
}
