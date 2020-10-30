package com.grupoica.ejem05modelo;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	DerbyDBUsuario m = new DerbyDBUsuario();
    	ArrayList<Usuario> usuarios =  m.listar();
    	for(Usuario usuario : usuarios) {
    		System.out.println("usu: " + usuario.getNombre());
    	}
    }
}
