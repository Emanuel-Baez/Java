package Excepciones;

public class Excepciones {




    public static void main(String[] args) {

        int[] edades ={12,23,45,56};




        try {
            System.out.println("Edad" + edades[4]);
        } catch ( Exception  ex) {
            System.out.println("Intente acceder a un indice que no tengo.");
        }

    }
}
