/**
 * - Proyecto Mascota Virtual
 * - Clase Main
 *      En esta clase se ejecuta el programa, se crean los objetos de la clase Perro y
 *      se muestra el menu de opciones para interactuar con los perros.
 *      Se muestra el estado de los perros despues de cada accion.
 *      Se valida que la opcion ingresada sea numerica con metodo hasNextInt() y esté dentro del rango 1-4.
 *      Se reinicia la variable opcion despues de cada accion para no entrar en un bucle infinito.
 *
 * - Autor: Juanma Segura - DAM
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //Declaramos e inicializamos las variables
        boolean juegoActivo = true;
        int opcion = 0, opcionInfo = 0;

        //Instanciamos un objeto de la clase Scanner para leer la entrada del usuario
        //Instanciamos los objetos de la clase Perro y les asignamos un nombre y edad
        Scanner sc = new Scanner(System.in);
        Perro perro1 = new Perro("Firulais", 2);
        Perro perro2 = new Perro("Sirkan", 10);
        Perro perro3 = new Perro("Laika", 5);

        System.out.println("\t**** Bienvenido a casa! **** \n Tienes 3 perros para cuidar: \n");
        System.out.println(perro1.getnombre()+" con "+perro1.getEdad()+" años \n"+perro2.getnombre()+" con "+perro2.getEdad()+" años \n"+perro3.getnombre()+" con "+perro3.getEdad()+" años \n");

        //Bucle principal del juego
        while(juegoActivo) {
            perro1.mostrarEstado();
            perro2.mostrarEstado();
            perro3.mostrarEstado();
            System.out.println("Que quieres hacer con ellos?");

            //Menu de opciones con bucle para validar la opcion ingresada
            while (opcion < 1 || opcion > 4) {
                System.out.println("Alimentar perros: 1 \nJugar con los perros: 2 \nMandar a dormir a los perros: 3 \nSalir: 4\n");
                if (sc.hasNextInt()) {
                    opcion = sc.nextInt();
                    if (opcion < 1 || opcion > 4) {
                        System.out.println("\t***ERROR! Opcion fuera de rango (1-4)***\n");
                    }
                }else {
                    System.out.println("\t***ERROR! Tiene que ser numerico***\n");
                    sc.next();
                }
                switch (opcion) {
                    case 1:
                        System.out.println("\tAlimentando a los perros...");
                        perro1.comer();
                        perro2.comer();
                        perro3.comer();
                        break;
                    case 2:
                        System.out.println("\tJugando con los perros...");
                        perro1.jugar();
                        perro2.jugar();
                        perro3.jugar();
                        break;
                    case 3:
                        System.out.println("\tMandando a dormir a los perros...");
                        perro1.dormir();
                        perro2.dormir();
                        perro3.dormir();
                        break;
                    case 4:
                        juegoActivo = false;
                        break;
                }

            }

            // Reiniciamos la variable opcion
            opcion = 0;

        }

    }
}