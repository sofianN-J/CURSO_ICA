import java.util.List;
import java.util.ArrayList; 

public class Valores{
    public static void main(String[] args) {
        System.out.println("*****************************");
        System.out.println("-EJERCICIOS DE VARIABLES-");
        System.out.println("*****************************");

        /*Crear dos variables de cualquiera de los tipos básicos,
        dar un valor a la primera y a continuación asigne la segunda a la primera.
        Imprimir por pantalla las dos variables. Cambiar el valor de la segunda variable 
        y volver a imprimir las variables por pantalla. ¿Qué es lo que ocurre? */

        int a = 5;
        //int b = a;
        int b = 2;

        /*en el caso de que le de un valor a "a" y b la inicialize con a, ambas varibales
        valdran lo mismo*/
        //en el primer caso tanto a como b valdran 5.
        //en el segundo caso cada variable valdra su valor a=5 y b=2;
        System.out.println("El valor de a --> " +  a);
        System.out.println("El valor de b --> " +  b);
        

        //EJEMPLO 2.
        int x = 1;
        int y = 2;
        System.out.println("EJERCICIO 2");
        System.out.println("el valor de x e y antes de modificacion primitiva");
        System.out.println("x-->" + x + " y--> " + y);
        //cuando enviamos x e y al metodo, se hacen dos copias, las variables originales
        //no han sido enviadas al metodo, quiere decir que cualquier modificacion en el 
        //metodo, solo afectara a las copias.
        modificacionPrimitiva(x, y);
        System.out.println("el valor de x e y despues de modificacion primitiva");
        System.out.println("x-->" + x + " y--> " + y);

        //sacara el mismo valor, PASA CON TODOS LOS PRIMITIVOS, INTEGER, STRING.

        //EJEMPLO 3 HACEMOS LA PRUEBA CON ARRAYS
        
        System.out.println("EJERCICIO 3");
        List numeros = new ArrayList();
        numeros.add(1);
        //antes de llamar al metodo nos imprime 1
        System.out.println("lista numeros antes de la modificacion --> " + numeros.size());
        //pero en el momento que llamamos al metodo se pone el nuevo valor ya que dos referencias
        //apuntan al mismo punntero de memoria
        //CUALQUIER CAMBIO EN EL METODO SE VERA REFLEJADO-- CON LOS OBJETOS PASA IGUAL --.
        modificarLista(numeros);
        System.out.println("lista numeros despues de la modificacion --> " + numeros.size());
        
        
        
        //EJERCICIO 4 - CON OBJETO.
       
        Estudiante estudiante1 = new Estudiante();
        
        System.out.println("EJERCICIO 4");
        System.out.println("valor antes de modificar al estudiante1 --> " + estudiante1.getNombre());
        modificarNombre(estudiante1);
        System.out.println("valor despues de modificar al estudiante1 --> " + estudiante1.getNombre());
        
        
        
       
        
        
        
        
    }
    //metodo para el EJEMPLO 2
    private static void modificacionPrimitiva(int x, int y) {
        x = 5;
        y = 10;
    }   

    //METODO PARA EL EJEMPLO 3
    private static void modificarLista(List parametro) {
        parametro.add(2);
    }
    
    
    //metodo para ejemplo 4
    public static void modificarNombre(Estudiante estudiante) {
    	estudiante.setNombre("Julian");
    }

}
