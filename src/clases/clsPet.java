/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import interfaces.*;

/**
 *
 * @author tec_crhistit
 */
public class clsPet implements IAnimal,IVertebrado{
    private int petId;
    private String code;
    private String name;
    private int bornYear;
    private String color;
    private String healthStatus;
    private clsVeterinary veterinary;

    public clsPet(int petId,String code, String name, int bornYear, String color, String healthStatus) {
        this.petId = petId;
        this.code = code;
        this.name = name;
        this.bornYear = bornYear;
        this.color = color;
        this.healthStatus = healthStatus;
        
    }

    public void eat(){
        System.out.println("La mascota está comiendo");
    }
    
    public void move(){
        System.out.println("La mascota se está moviendo");
    }
    
    public void sound(){
        System.out.println("La mascota está emitiendo un sonido");
    }
    
    /**
     * @return the code de la mascota
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
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
     * @return the bornYear
     */
    public int getBornYear() {
        return bornYear;
    }

    /**
     * @param bornYear the bornYear to set
     */
    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the healthStatus
     */
    public String getHealthStatus() {
        return healthStatus;
    }

    /**
     * @param healthStatus the healthStatus to set
     */
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * @return the veterinary
     */
    public clsVeterinary getVeterinary() {
        return veterinary;
    }

    /**
     * @param veterinary the veterinary to set
     */
    public void setVeterinary(clsVeterinary veterinary) {
        this.veterinary = veterinary;
    }

    
    @Override
    public String getAnimalType() {
        System.out.println("Soy una mascota");
        return "";
    }

    @Override
    public int getNumberOfBones() {
        System.out.println("Numero huesos");
        return 10;
    }

    /**
     * @return the petId
     */
    public int getPetId() {
        return petId;
    }

    /**
     * @param petId the petId to set
     */
    public void setPetId(int petId) {
        this.petId = petId;
    }
            
    
}
