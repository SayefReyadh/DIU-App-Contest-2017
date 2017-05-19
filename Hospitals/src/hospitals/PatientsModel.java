/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitals;

/**
 *
 * @author SayefReyadh
 */
public class PatientsModel {
    
    private int patientId;
    private int pId;
    private String name;
    private String age;
    private String bloodType;
    private String gender;
    private int patientMedicalDetailsId;
    private int patientDetailsId;
    private String email;
    private String phoneNumber;

    public PatientsModel() {
    }

    public PatientsModel(int patientId, String name, String age, String bloodType, String gender, int patientMedicalDetailsId, int patientDetailsId, String email, String phoneNumber) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.bloodType = bloodType;
        this.gender = gender;
        this.patientMedicalDetailsId = patientMedicalDetailsId;
        this.patientDetailsId = patientDetailsId;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
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

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPatientMedicalDetailsId() {
        return patientMedicalDetailsId;
    }

    public void setPatientMedicalDetailsId(int patientMedicalDetailsId) {
        this.patientMedicalDetailsId = patientMedicalDetailsId;
    }

    public int getPatientDetailsId() {
        return patientDetailsId;
    }

    public void setPatientDetailsId(int patientDetailsId) {
        this.patientDetailsId = patientDetailsId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    
    
}
