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
public abstract class clsHospital {
    
    public abstract String getPatientType();
    public abstract String getSurgeryType();
    
    public String getHospitalInformation(){
        return "Hospital Mascotas y personas";
    }
}
