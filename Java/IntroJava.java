public class IntroJava {
    public static void main(String[] args) {
        //system es una clase, out es un objeto, el parametro es strin y el args es "todo lo que pongas"
        System.out.println("Bienvenidos a ICA");
        repetirMensaje(5);
    }
    //funciones statica es como una funcion global
    private static void repetirMensaje(int veces) {
        String mensajeFun = "variable local a la funcion";
        for (int i = 0; i < veces; i++) {
           
           String texto = mensajeFun;
           System.out.println("<p>" + texto + "</p>");
       }
       System.out.println(mensajeFun);
    }
}