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
public class clsDog extends clsPet{
    private int dogId;
    private String breed;
    private boolean pedigree;

    public clsDog(int dogId, String breed, boolean pedigree, int petId, String code, String name, int bornYear, String color, String healthStatus) {
        super(petId, code, name, bornYear, color, healthStatus);
        this.dogId = dogId;
        this.breed = breed;
        this.pedigree = pedigree;
    }

    

    
    
    @Override
    public void eat(){
        System.out.println("el perro está comiendo");
    }
    
    @Override
    public void move(){
        System.out.println("el perro se está moviendo");
    }
    
    
    @Override
    public String getAnimalType() {
        System.out.println("Soy un perro");
        return "perro";
    }
    
    @Override
    public int getNumberOfBones() {
        System.out.println("Numero huesos");
        return 200;
    }
    
    public void walkAround(){
        System.out.println("El perro está caminando: " + super.getName());
    }
    
    public void walkAround(int distance){
        System.out.println("El perro está caminando: " + super.getName() + " " + "distancia: " + distance);
    }
    
    public void walkAround(String parque){
        System.out.println("El perro está caminando: " + super.getName() + " " + "en el parque: " + parque);
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
     * @return the pedigree
     */
    public boolean isPedigree() {
        return pedigree;
    }

    /**
     * @param pedigree the pedigree to set
     */
    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }

    /**
     * @return the dogId
     */
    public int getDogId() {
        return dogId;
    }

    /**
     * @param dogId the dogId to set
     */
    public void setDogId(int dogId) {
        this.dogId = dogId;
    }
    
    
}
