package More.Lucas;

import java.util.Objects;

public abstract class Vehiculo {

    protected Persona propietario;
    protected String marca;
    protected String modelo;
    protected float precio;
    protected int kilometraje;
    protected static int contadorVehiculos;

    static {
        contadorVehiculos = 0; //igualmente se inicializa en 0 por defecto
    }

    public Vehiculo(Persona propietario, String marca, String modelo, float precio) {
        this.propietario = propietario;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.kilometraje = (int) (Math.random()*3000);
        Vehiculo.contadorVehiculos++;//llamo a mi clase  
    }

    public float getPrecio() {
        return precio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public static boolean sonIguales(Vehiculo vehiculoA, Vehiculo vehiculoB) {
        return vehiculoA.marca.equals(vehiculoB.marca) && vehiculoA.modelo.equals(vehiculoB.modelo);
    }
    
    @Override
    public boolean equals(Object obj) {
        boolean rta = false;
        if (obj instanceof Vehiculo)
        {
            rta = Vehiculo.sonIguales(this, (Vehiculo)obj);
        }
        return rta;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.propietario);
        hash = 17 * hash + Objects.hashCode(this.marca);
        hash = 17 * hash + Objects.hashCode(this.modelo);
        hash = 17 * hash + Float.floatToIntBits(this.precio);
        hash = 17 * hash + this.kilometraje;
        return hash;
    }


 
    private static String mostrar(Vehiculo vehiculo)
    {
        StringBuilder cadena = new StringBuilder();
        cadena.append("Propietario: ").append(vehiculo.propietario.getNombreApellido()).append(" | ");
        cadena.append("Marca: ").append(vehiculo.marca).append(" | ");
        cadena.append("Modelo: ").append(vehiculo.modelo).append(" | ");
        cadena.append("Precio: ").append(vehiculo.precio).append(" | ");
        cadena.append("Kilometraje: ").append(vehiculo.kilometraje).append(" | ");
        return cadena.toString();
    }

    @Override
    public String toString() {
        return mostrar(this);
    }
    
    
}
