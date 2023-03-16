/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author tec_crhistit
 */
public class clsVeterinary extends clsHospital{
    private String name;
    private String phone;
    private String address;
    private clsDoctor doctor;

    

    public clsVeterinary(String name, String phone, String address, clsDoctor doctor) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.doctor = doctor;
    }
    
    
    public void petCare(clsPet pet){
        System.out.println("Veterinaria atendiendo una mascota: " + pet.getName());
    }
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the doctor
     */
    public clsDoctor getDoctor() {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(clsDoctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String getPatientType() {
        return "Animales";
    }

    @Override
    public String getSurgeryType() {
        return "Cirugia de columna";
    }
    
    @Override
    public String getHospitalInformation(){
        return "Hospital Mascotas y personas - Zona veterinaria";
    }
    

    
    
}
