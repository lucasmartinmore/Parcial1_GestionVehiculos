package More.Lucas;

public class Primer_Parcial_More_Lucas {

    public static void main(String[] args) {

        Garage miGaraje = new Garage(5);
        Persona p1 = new Persona("Carlos", "Rodriguez");
        Persona p2 = new Persona("María", "Gómez");
        Auto a1 = new Auto(4, TipoAuto.SEDAN, p1, "Toyota", "Corolla", 30000f);
        Moto m1 = new Moto(600, TipoMoto.DEPORTIVA, p2, "Honda", "CBR", 15000f);
        miGaraje.agregar(a1);
        miGaraje.agregar(m1);
// YA INGRESADO
        miGaraje.agregar(a1);
        System.out.println("");
// TRUE
        System.out.println(a1.equals(a1));
// FALSE
        System.out.println(a1.equals(m1));
        System.out.println("");
        System.out.println(Garage.mostrar(miGaraje));
    }
}
