/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupoica.ejem05modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author German
 */
public class DerbyDBUsuario {
	private static final String STR_CONEX = "jdbc:derby:C:\\Users\\sofia\\OneDrive\\Bureau\\Curso_CLE\\db_ica;create=true";
    public DerbyDBUsuario() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (Exception ex) {
            Logger.getLogger(DerbyDBUsuario.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        Connection con = null;
        try {
        	 con = DriverManager.getConnection(STR_CONEX);
        	Statement stmt = con.createStatement();
        	stmt.executeUpdate("CREATE TABLE usuario("
        			+ " id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY(Start with 1, Increment by 1),"
        			+ "nombre VARCHAR(50),"
        			+ "email VARCHAR(320),"
        			+ "edad INT,"
        			+ "password VARCHAR(50) )");
        			
        	stmt.executeUpdate("INSERT INTO usuario (nombre, edad, ) VALUES ('Luis', 30);");		
        	con.close();
        }catch (SQLException ex) {
        	System.out.println("Error SQL" + ex.getMessage());
        	
        	try {
        		con.close();
			} catch (Exception ex2) {
				System.out.println("Error SQL" + ex2.getMessage());
			}
        	
		}
        
    }

    public ArrayList<Usuario> listar() {
        try (Connection con = DriverManager.getConnection(
                STR_CONEX)) {

            ArrayList<Usuario> listaUsu = new ArrayList<>();
            String consultaSQL = "SELECT id, nombre, edad, email, password FROM Usuario";
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(consultaSQL);
            while (res.next()) {    // Obtener cada uno de los registros
                int id = res.getInt("id");
                String nombre = res.getString("nombre");
                String email = res.getString("email");
                String password = res.getString("password");
                int edad = res.getInt("edad");
                Usuario usu = new Usuario(nombre, password, edad, email);
                listaUsu.add(usu);
            }
            // Si todo ha ido bien:
            return listaUsu;
        } catch (SQLException ex) {
            System.err.println(" >>>>  " + ex.getMessage());
            return null;
        }
    }

    public boolean crear(Usuario persona) {

        try (Connection con = DriverManager.getConnection(
                STR_CONEX)) {
            String sqlID = "SELECT COUNT(id) AS ultId FROM Usuario";
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(sqlID);
            if (res.next()) {
                int ultId = res.getInt("ultId");
                ultId++;
                String sqlInsert = "INSERT INTO usuario (id, nombre, edad, email, password) VALUES ("
                        + ultId + ", '" + persona.getNombre() + "' ,  "
                        + persona.getEdad() + " ,  '"
                        + persona.getEmail() + "' ,  '"
                        + persona.getPassword() + "' )";
                System.err.println(" >>>>  " + sqlInsert);
                sentencia = con.createStatement();
                sentencia.executeUpdate(sqlInsert);  
                return true;              
            }
            return false;
        } catch (SQLException ex) {
            System.err.println(" >>>>  " + ex.getMessage());
            return false;
        }
    }
}
