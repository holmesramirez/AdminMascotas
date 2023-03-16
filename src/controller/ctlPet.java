/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import clases.*;
import java.util.LinkedList;
import model.modelCat;

/**
 *
 * @author tec_crhistit
 */
public class ctlPet {
    
    private modelCat modeloGato;

    public ctlPet() {
        this.modeloGato = new modelCat();
    }

    public LinkedList<clsCat> retornarListaGatosAvista(){
        LinkedList<clsCat> listaRetornada = this.modeloGato.retornarListaCompletaGatos();
        return listaRetornada;
    }
    
    public boolean createPet(clsPet pet) {

        try {
            switch (pet.getAnimalType()) {
                case "gato":
                    //Ejecutar llamado al modelo para crear un gato
                    this.modeloGato.createPet((clsCat)pet);
                    break;
                case "perro":
                    //Ejecutar llamado al modelo para crear un perro
                    break;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean editPet(clsPet pet) {

        try {
            switch (pet.getAnimalType()) {
                case "gato":
                    //Ejecutar llamado al modelo para editar un gato
                    this.modeloGato.editPet((clsCat)pet);
                    break;
                case "perro":
                    //Ejecutar llamado al modelo para editar un perro
                    break;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean deletePet(clsPet pet) {

        try {
            switch (pet.getAnimalType()) {
                case "gato":
                    //Ejecutar llamado al modelo para eliminar un gato
                    this.modeloGato.deletePet((clsCat)pet);
                    break;
                case "perro":
                    //Ejecutar llamado al modelo para eliminar un perro
                    break;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public clsPet searchPet(String code, String type) {

        clsPet petFound = null;
        
        try {
            switch (type) {
                case "gato":
                    //Ejecutar llamado al modelo para buscar un gato
                    petFound = this.modeloGato.searchPet(code);
                    break;
                case "perro":
                    //Ejecutar llamado al modelo para buscar un perro
                    break;
            }
            return petFound;
        } catch (Exception e) {
            return null;
        }
    }

    
    public LinkedList<clsPet> ListarPets(String type) {

        LinkedList<clsPet> lista = new LinkedList<>();
        
        try {
            switch (type) {
                case "gato":
                    //Ejecutar llamado al modelo para buscar un gato
                    lista = this.modeloGato.searchPet();
                    break;
                case "perro":
                    //Ejecutar llamado al modelo para buscar un perro
                    break;
            }
            return lista;
        } catch (Exception e) {
            return lista;
        }
    }
    
    
    public LinkedList<clsReportHealthStatus> reportHealthStatus(){
        LinkedList<clsReportHealthStatus> reporte = this.modeloGato.reportByHeathStatus();
        return reporte;
    }
    
}
