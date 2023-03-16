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
public class clsCat extends clsPet {
    private int catId;
    private String breed;

    public clsCat(int catId, String breed, int petId, String code, String name, int bornYear, String color, String healthStatus) {
        super(petId, code, name, bornYear, color, healthStatus);
        this.catId = catId;
        this.breed = breed;
    }

    
  
    @Override
    public void eat(){
        System.out.println("el gato está comiendo");
    }
    
    @Override
    public void move(){
        System.out.println("el gato se está moviendo");
    }

    public void selfCleaning(){
        System.out.println("El gato se está limipiando: " + super.getName());
    }
    
    
    @Override
    public String getAnimalType() {
        System.out.println("Soy una mascota");
        return "gato";
    }
    
    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    

    /**
     * @param catId the catId to set
     */
    public void setCatId(int catId) {
        this.catId = catId;
    }

    /**
     * @return the catId
     */
    public int getCatId() {
        return catId;
    }
    
    
}
