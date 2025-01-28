/**
 * - Proyecto Mascota Virtual
 * - Clase Perro
 *     En esta clase se definen los atributos y metodos de la clase Perro.
 *     Se definen los atributos nombre, edad, nivelEnergia, nivelHambre y estadoAnimo.
 *     Se definen los metodos comer(), jugar(), dormir() y mostrarEstado().
 *     Se definen los getters y setters de los atributos.
 *     Se define un constructor con parametros nombre y edad.
 *     Se valida que los niveles de hambre y energia no sean menores a 0 ni mayores a 100.
 *     Se define el estado de animo segun los niveles de hambre y energia.
 *
 * - Autor: Juanma Segura - DAM
 */

public class Perro {
    // Definimos los atributos de la clase Perro
    String nombre;
    int edad;
    int nivelEnergia;
    int nivelHambre;
    String estadoAnimo;

    // Definimos el constructor de la clase Perro con parametros nombre y edad
    public Perro(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.nivelEnergia = 100;
        this.nivelHambre = 0;
        this.estadoAnimo = "Feliz";
    }

    // Definiendo los getters y setters de los atributos
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

    // Definimos los metodos de la clase Perro
    public void comer(){
        this.nivelHambre -= 10;
            // nivelHambre no puede ser menor a 0
            if(this.nivelHambre < 0){
                this.nivelHambre = 0;
            }
    }
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
