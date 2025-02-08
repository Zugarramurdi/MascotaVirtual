/**
 * - Proyecto Mascota Virtual
 * - Clase Perro
 *     En esta clase se definen los atributos y metodos de la clase Perro.
 *     Se definen los atributos nombre, edad, nivelEnergia, nivelHambre y estadoAnimo.
 *     Se define un atributo estatico numPerros para contar el numero de perros creados, es publico para poder acceder a el desde la clase Main.
 *     Se definen los metodos comer(), jugar(), dormir() y mostrarEstado().
 *     Se definen los getters y setters de los atributos.
 *     Se define un constructor con parametros nombre y edad.
 *     Se valida que los niveles de hambre y energia no sean menores a 0 ni mayores a 100.
 *     Se define el estado de animo segun los niveles de hambre y energia.
 *     ***********************
 *     Update 06/02/2025
 *     Se ha actualizado la clase Perro para que herede de la clase Animal.
 *     Se han eliminado los atributos nombre, edad, nivelEnergia, nivelHambre y estadoAnimo.
 *     Se han eliminado los metodos comer(), jugar(), dormir() y mostrarEstado().
 *     Se han añadido los atributos y metodos de la clase abstracta Animal.
 *     Se ha actualizado el constructor para que llame al constructor de la clase Animal.
 *     Se le ha hecho @Override a los metodos comer(), jugar(), dormir() y mostrarEstado() para que aplique una logica especifica en clase Perro.
 *
 *
 *  @Autor: Juanma Segura - DAM
 */

// Definimos la clase Perro que hereda de la clase Animal
public class Perro extends Animal{
    // Definimos los atributos especificos de la clase Perro
    public static int numPerros = 0;

    // Definimos el constructor de la clase Perro con parametros nombre y edad, heredando los atributos de la clase Animal
    public Perro(String nombre, int edad){
        super(nombre, edad);
        super.nivelEnergia = 100;
        super.nivelHambre = 0;
        super.estadoAnimo = "Feliz";
    }


    // Definiendo los getters y setters de los atributos, no se llegan a usar todos pero se definen por si se necesitan en un futuro.
    public String getnombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getNivelEnergia(){
        return nivelEnergia;
    }
    public void setNivelEnergia(int nivelEnergia){
        this.nivelEnergia = nivelEnergia;
    }
    public int getNivelHambre(){
        return nivelHambre;
    }
    public void setNivelHambre(int nivelHambre){
        this.nivelHambre = nivelHambre;
    }
    public String getestadoAnimo(){
        return estadoAnimo;
    }
    public void setEstadoAnimo(String estadoAnimo){
        this.estadoAnimo = estadoAnimo;
    }

    // Llamamos a los metodos de la clase Animal y aplicamos una logica especifica para la clase Perro, @Override para sobreescribir los metodos de la clase Animal
    @Override
    public void comer(){
        this.nivelHambre -= 10;
            // nivelHambre no puede ser menor a 0
            if(this.nivelHambre < 0){
                this.nivelHambre = 0;
            }
    }
    @Override
    public void jugar(){
        this.nivelEnergia -= 30;
            if(this.nivelEnergia < 0){
                this.nivelEnergia = 0;
            }
        this.nivelHambre += 20;
            // nivelHambre no puede ser mayor a 100
            if(this.nivelHambre > 100){
                this.nivelHambre = 100;
            }
    }
    @Override
    public void dormir(){
        this.nivelEnergia += 50;
            // nivelEnergia no puede ser mayor a 100
            if(this.nivelEnergia > 100){
                this.nivelEnergia = 100;
            }
    }
    // Definimos el metodo mostrarEstado() para mostrar el estado del perro segun su nivel de hambre y energia
    public void mostrarEstado(){
        if (this.nivelHambre >= 50 && this.nivelEnergia < 50) {
            this.estadoAnimo = "Hambriento y Cansado";
        }else if (this.nivelHambre >= 50) {
            this.estadoAnimo = "Hambriento";
        }else if (this.nivelEnergia < 50) {
            this.estadoAnimo = "Cansado";
        }else{
            this.estadoAnimo = "Feliz";
        }
        System.out.println("\t**********************");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Nivel de energia: " + this.nivelEnergia);
        System.out.println("Nivel de hambre: "+this.nivelHambre);
        System.out.println("Estado de animo: "+this.estadoAnimo);
        System.out.println("\t**********************");
    }

}
