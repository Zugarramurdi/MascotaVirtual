/**
 * Clase abstracta Animal
 * Esta clase es la clase padre de todos los animales
 * Contiene los atributos y metodos comunes a todos los animales
 * Se definen los metodos abstractos comer, jugar y dormir
 * Los atributos y los metodos son protected para que puedan ser accedidos por las clases hijas
 * Ya no es necesario que la clase Perro tenga los atributos genericos que podria tener un animal ya que los hereda de aqui.
 *
 * @Autor: Juanma Segura - DAM
 */

//Definimos la clase abstracta Animal, que sera la clase padre de todos los animales.
    //Definimos los atributos comunes a todos los animales.
    //Clave de acceso protected para que puedan ser accedidos por las clases hijas.
public abstract  class Animal {
    protected String nombre;
    protected int edad;
    protected int nivelEnergia;
    protected int nivelHambre;
    protected String estadoAnimo;

    //Definimos los constructores de la clase Animal, uno sin parametros y otro con parametros nombre y edad.
    protected Animal(){
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.nivelEnergia = 0;
        this.nivelHambre = 0;
        this.estadoAnimo = "Sin Estado";
    }
    //Este constructor es especifico para el ejercicio, ya que se pide que el animal nazca con unos parametros concretos.
    protected Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.nivelEnergia = 100;
        this.nivelHambre = 0;
        this.estadoAnimo = "Feliz";
    }


    //Definimos los metodos abstractos de la clase Animal.
    //Los metodos abstractos estan vacios, ya que se implementaran en las clases hijas y ahi se definira la logica.
    protected void comer(){
    }
    protected void jugar(){
    }
    protected void dormir(){
    }


}
