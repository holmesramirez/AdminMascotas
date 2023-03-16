/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import clases.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author tec_crhistit
 */
public class modelCat {

    LinkedList<clsCat> listaGatosEnmodelo = new LinkedList<>();

    clsDbData dbData;

    public modelCat() {
        this.dbData = new clsDbData();
    }

    public LinkedList<clsCat> retornarListaCompletaGatos() {
        return this.listaGatosEnmodelo;
    }

    public boolean createPet(clsCat cat) {
        
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            
            String query = "INSERT INTO tb_pet(code, name, born_year, color, health_status) VALUES (?,?,?,?,?)";
            PreparedStatement statementPet = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statementPet.setString(1, cat.getCode());
            statementPet.setString(2, cat.getName());
            statementPet.setInt(3, cat.getBornYear());
            statementPet.setString(4, cat.getColor());
            statementPet.setString(5, cat.getHealthStatus());

            int rowsInserted = statementPet.executeUpdate();
            if (rowsInserted > 0) {
                ResultSet generatedKeys = statementPet.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int idPet = generatedKeys.getInt(1);
                    query = "INSERT INTO tb_cat(breed, id_pet) VALUES (?,?)";
                    PreparedStatement statementCat = conn.prepareStatement(query);
                    statementCat.setString(1, cat.getBreed());
                    statementCat.setInt(2, idPet);
                    rowsInserted = statementCat.executeUpdate();
                    if (rowsInserted > 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean editPet(clsCat cat) {

        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String query = "UPDATE tb_pet SET code = ?, name = ?, born_year = ?, color = ?, health_status = ? WHERE id = ?";
            PreparedStatement statementPet = conn.prepareStatement(query);
            statementPet.setString(1, cat.getCode());
            statementPet.setString(2, cat.getName());
            statementPet.setInt(3, cat.getBornYear());
            statementPet.setString(4, cat.getColor());
            statementPet.setString(5, cat.getHealthStatus());
            statementPet.setInt(6, cat.getPetId());
            
            String queryCat = "UPDATE tb_cat SET breed = ? WHERE id = ?";
            PreparedStatement statementCat = conn.prepareStatement(queryCat);
            statementCat.setString(1, cat.getBreed());
            statementCat.setInt(2, cat.getCatId());
            
            int rowsUpdatePet = statementPet.executeUpdate();
            int rowsUpdateCat = statementCat.executeUpdate();
            
            return rowsUpdatePet > 0 && rowsUpdateCat > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error ejecutando consulta");
            return false;
        }
    }

    public boolean deletePet(clsCat cat) {

        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String query = "DELETE FROM tb_cat WHERE id = ?";
            PreparedStatement statementCat = conn.prepareStatement(query);
            statementCat.setInt(1, cat.getCatId());
            
            String queryPet = "DELETE FROM tb_pet WHERE id = ?";
            PreparedStatement statemementPet = conn.prepareStatement(queryPet);
            statemementPet.setInt(1, cat.getPetId());
            
            int rowsDeleteCat = statementCat.executeUpdate();
            int rowsDeletePet = statemementPet.executeUpdate();
            
            return rowsDeleteCat > 0 && rowsDeletePet > 0;
        } catch (Exception e) {
            return false;
        }
    }

    public clsPet searchPet(String code) {

        clsCat catFound = null;
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "SELECT * FROM tb_pet AS p INNER JOIN tb_cat AS c ON c.id_pet = p.id WHERE p.code = ?";
            PreparedStatement statmentPet = conn.prepareStatement(query);
            statmentPet.setString(1, code);
            ResultSet result = statmentPet.executeQuery();
            while (result.next()){
                int petId = result.getInt(1);
                String petCode = result.getString(2);
                String petName = result.getString("name");
                int petBornYear = result.getInt("born_year");
                String petColor = result.getString(5);
                String petHealthStatus = result.getString(6);
                int catId = result.getInt(7);
                String catBreed = result.getString(8);
                catFound = new clsCat(catId, catBreed, petId, petCode, petName, petBornYear, petColor, petHealthStatus);
            }
            
            return catFound;
        } catch (Exception e) {
            return null;
        }
    }
    
    public LinkedList<clsPet> searchPet() {
        
        LinkedList<clsPet> catList = new LinkedList<>();

        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "SELECT * FROM tb_pet AS p INNER JOIN tb_cat AS c ON c.id_pet = p.id";
            PreparedStatement statmentPet = conn.prepareStatement(query);
           
            ResultSet result = statmentPet.executeQuery();
            while (result.next()){
                int petId = result.getInt(1);
                String petCode = result.getString(2);
                String petName = result.getString("name");
                int petBornYear = result.getInt("born_year");
                String petColor = result.getString(5);
                String petHealthStatus = result.getString(6);
                int catId = result.getInt(7);
                String catBreed = result.getString(8);
                clsCat cat = new clsCat(catId, catBreed, petId, petCode, petName, petBornYear, petColor, petHealthStatus);
                catList.add(cat);
            }
            
            return catList;
        } catch (Exception e) {
            return catList;
        }
    }

    public LinkedList<clsReportHealthStatus> reportByHeathStatus(){
        LinkedList<clsReportHealthStatus> listaReporte = new LinkedList<>();
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String query = "SELECT health_status, COUNT(health_status) FROM tb_pet GROUP BY health_status";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                clsReportHealthStatus registro = new clsReportHealthStatus();
                String healthStatus = result.getString(1);
                int countHealthStatus = result.getInt(2);
                registro.setHealthStatus(healthStatus);
                registro.setCountHealthStatus(countHealthStatus);
                listaReporte.add(registro);
            }
            return listaReporte;
        } catch (SQLException e) {
            return listaReporte;
        }
    }
    
}
