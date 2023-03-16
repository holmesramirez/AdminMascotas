/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminmascotas;

import clases.*;
import java.util.LinkedList;

/**
 *
 * @author tec_crhistit
 */
public class AdminMascotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*clsPet pet1 = new clsPet("111A", "Maisifus", 2020, "blanco", "Sano");
        clsPet pet2 = new clsPet("111B", "ron", 2019, "negro", "Enfermo");
        
        System.out.println("Nombre pet 1: " + pet1.getName());
        System.out.println("Nombre pet 2: " + pet2.getName());
        
        pet1.eat();
        pet1.sound();
        pet1.move();
        
        clsDog dog1 = new clsDog("Pastor aleman", true, "2222", "rufo", 2021, "negro y cafe", "Sano");
        clsCat cat1 = new clsCat("Angora", "444", "mini", 2020, "negro", "Enfermo");
        
//        System.out.println("perro1: " + dog1.getName());
//        System.out.println("cat1: " + cat1.getName());
        
        dog1.eat();
        dog1.move();
        dog1.sound();
        
        cat1.eat();
        cat1.move();
        cat1.sound();
        
        cat1.selfCleaning();
        dog1.walkAround();
         */
//       clsPet pet1 = new clsPet("111A", "Maisifus", 2020, "blanco", "Sano");
//       
//       clsDog dog1 = new clsDog("Pastor aleman", true, "2222", "rufo", 2021, "negro y cafe", "Sano");
//       clsCat cat1 = new clsCat("Angora", "444", "mini", 2020, "negro", "Enfermo");
//       
//       System.out.println("veterninaria perro 1: " + dog1.getVeterinary());
//       clsDoctor doctor1 = new clsDoctor("Juan", "Lic123");
//       
//       clsVeterinary veterinary1 = new clsVeterinary("Veterinaria rufus", "78678678", "Calle 20", doctor1);
//       
//       
//       System.out.println(veterinary1.getPatientType());
//       System.out.println(veterinary1.getSurgeryType());
//       System.out.println(veterinary1.getHospitalInformation());
//       
//       System.out.println("----------");
//       dog1.setVeterinary(veterinary1);
//       
//       System.out.println("veterninaria perro 1: " + dog1.getVeterinary().getName());
//       
//       veterinary1.petCare(pet1);
//       veterinary1.petCare(cat1);
//       veterinary1.petCare(dog1);
//       
//       dog1.eat();
//       dog1.move();
//       cat1.eat();
//       cat1.move();
//       
//       
//       dog1.walkAround();
//       dog1.walkAround(20);
//       dog1.walkAround("Parque Olaya");
//       
//       
//       dog1.getAnimalType();
//       System.out.println(dog1.getNumberOfBones());
//        LinkedList<String> lista = new LinkedList<>();
//        lista.add("Hola");
//        lista.add("Mundo");
//        
//        for (String cadena : lista) {
//            System.out.println(cadena);
//        }
//        
//        System.out.println("--------");
//        lista.forEach((cadena) -> {
//            System.out.println(cadena);
//        });
        System.out.println("Datos dde una persona");
        String nombre = "Juan";
        int edad = 14;
        String estadoCivil = "CASADO";

        System.out.println("Datos dde una persona 2");
        String nombre2 = "Juan";
        int edad2 = 14;
        String estadoCivil2 = "CASADO";

        System.out.println("nombre" + nombre + " edad" + edad + "estado civil: " + estadoCivil);
    }

    public void datoPersona1() {
        String nombre = "Juan";
        int edad = 14;
        String estadoCivil = "CASADO";
    }
    
//    def datoPersoa1():
//        nombre = "juan"
//        edad = 11
//        estadoCivil = "SOltero"

    public void datoPersona2() {
        String nombre = "Juan";
        int edad = 14;
        String estadoCivil = "CASADO";
    }
    
   

}
