/**
 * - Proyecto Mascota Virtual
 * - Clase Main
 *      En esta clase se ejecuta el programa principal.
 *      Consiste en un juego de mascota virtual en el que se pueden crear perros, jugar con ellos, darles de comer, mandarlos a dormir y ver su estado.
 *      Se han creado 2 metodos, menu() para el menu principal y mostrarPerros() para mostrar los perros dentro del vector.
 *      Se ha añadido un vector de objetos de la clase Perro para almacenar los perros creados (hasta 100).
 *      Se valida que la opcion ingresada sea numerica con metodo hasNextInt() y esté dentro del rango.
 *      Al final de switch se vuelve a llamar al metodo menu() para volver a mostrar el menu principal y no tener bucle infinito.
 *      El programa permite crear perros con el nombre y edad que se desee.
 *
 *  @Autor: Juanma Segura - DAM
 */


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //Declaramos las variables usadas durante el programa
        String nombre;
        int opcion, edad, selecPerro;

        //Instanciamos un objeto de la clase Scanner para leer la entrada del usuario
        //Instanciamos un vector de objetos de la clase Perro para almacenar los perros creados
        Scanner sc = new Scanner(System.in);
        Perro[] perros = new Perro[100];

        //Bucle principal del programa
        opcion=menu();
            while(opcion != 6){
                switch (opcion){
                    case 1: //Crear perro
                        System.out.println("Introduce el nombre del perro: ");
                        nombre = sc.next();
                        System.out.println("Introduce la edad del perro: ");
                        edad = sc.nextInt();
                        perros[Perro.numPerros] = new Perro(nombre,edad);
                        Perro.numPerros++;
                        break;
                    case 2: //Jugar con perro
                        System.out.println("Con que perro quieres jugar? ");
                        System.out.println("Perros disponibles: ");
                        mostrarPerros(perros);
                        System.out.print("\nOpcion: ");
                        if(sc.hasNextInt()) {
                            selecPerro = sc.nextInt();
                            if (selecPerro < 1 || selecPerro > Perro.numPerros) {
                                System.out.println("\t*** ERROR: Perro no encontrado ***");
                            }else{
                                perros[selecPerro -1].jugar();
                                System.out.println(perros[selecPerro -1].getnombre()+" ha jugado y esta "+perros[selecPerro -1].getestadoAnimo());
                            }
                        }else{
                            System.out.println("\t*** ERROR: Selecciona con numero ***");
                            sc.next();
                        }
                        break;
                    case 3: //Dar de comer a perro
                        System.out.println("A que perro le das de comer? ");
                        System.out.println("Perros disponibles: ");
                        mostrarPerros(perros);
                        System.out.print("\nOpcion: ");
                        if(sc.hasNextInt()) {
                            selecPerro = sc.nextInt();
                            if (selecPerro < 1 || selecPerro > Perro.numPerros) {
                                System.out.println("\t*** ERROR: Perro no encontrado ***");
                            }else{
                                perros[selecPerro -1].comer();
                                System.out.println(perros[selecPerro -1].getnombre()+" ha comido y esta "+perros[selecPerro -1].getestadoAnimo());
                            }
                        }else{
                            System.out.println("\t*** ERROR: Selecciona con numero ***");
                            sc.next();
                        }
                        break;
                    case 4: //Mandar a dormir a perro
                        System.out.println("Que perro ira a dormir? ");
                        System.out.println("Perros disponibles: ");
                        mostrarPerros(perros);
                        System.out.print("\nOpcion: ");
                        if(sc.hasNextInt()) {
                            selecPerro = sc.nextInt();
                            if (selecPerro < 1 || selecPerro > Perro.numPerros) {
                                System.out.println("\t*** ERROR: Perro no encontrado ***");
                            }else{
                                perros[selecPerro -1].dormir();
                                System.out.println(perros[selecPerro -1].getnombre()+" ha dormido y esta "+perros[selecPerro -1].getestadoAnimo());
                            }
                        }else{
                            System.out.println("\t*** ERROR: Selecciona con numero ***");
                            sc.next();
                        }
                        break;
                    case 5: //Mostrar estado de perro
                        System.out.println("De que perro quieres saber estado?");
                        System.out.println("Perros disponibles: ");
                        mostrarPerros(perros);
                        System.out.print("\nOpcion: ");
                        if(sc.hasNextInt()) {
                            selecPerro = sc.nextInt();
                            if (selecPerro < 1 || selecPerro > Perro.numPerros) {
                                System.out.println("\t*** ERROR: Perro no encontrado ***");
                            }else{
                                perros[selecPerro -1].mostrarEstado();
                            }
                        }else{
                            System.out.println("\t*** ERROR: Selecciona con numero ***");
                            sc.next();
                        }
                        break;
                    case 6: //Salir del programa
                        System.out.println("\t***Saliendo del juego...*** \nGracias por jugar!");
                        break;
                    default:
                        System.out.println("\t*** ERROR: Opcion no valida ***");


                }
                //Volvemos a mostrar el menu principal
                opcion=menu();
            }

        }
      //METODOS
    //Metodo menu para mostrar el menu principal, con control de rango y tipo de dato
    public static int menu(){
        Scanner lector = new Scanner(System.in);
        while(true) {
            System.out.println("1. Crear Perro \n2. Jugar con Perro \n3. Dar de comer a Perro \n4. Mandar a dormir a Perro \n5. Mostrar estado de perro \n6. Salir ");
            System.out.print("\nOpcion: ");
            if(lector.hasNextInt()){
                int opcion = lector.nextInt();
                if(opcion >= 1 && opcion <= 6){
                    return opcion;
                }else{
                    System.out.println("\t*** ERROR: Opcion fuera de rango ***");}
            }else{
                System.out.println("\t*** ERROR: Tiene que ser numerico ***");
                lector.next();
            }
        }
    }

    /*Metodo mostrar perros para mostrar los perros creados, con control si hay perros creados
      si no hay perros llama a la funcion menu(). El bucle for recorre completamente el vector de perros
      y te muestra los perros creados con sus respectivos nombres*/
    public static void mostrarPerros(Perro[] perros){
        if(Perro.numPerros ==0){
            System.out.println("\t*** Aun no tienes perros ***");
            menu();
        }
        for(int i = 0; i < Perro.numPerros; i++){
            System.out.println((i+1)+". "+perros[i].getnombre());
        }
    }

}
