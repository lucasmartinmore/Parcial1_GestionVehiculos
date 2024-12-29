package More.Lucas;

import java.util.Objects;

public class Auto extends Vehiculo {
    private int cantidadPuertas;
    private TipoAuto tipoAuto;

    public Auto(int cantidadPuertas, TipoAuto tipoAuto, Persona propietario, String marca, String modelo, float precio) {
        super(propietario, marca, modelo, precio);
        this.cantidadPuertas = cantidadPuertas;
        this.tipoAuto = tipoAuto;
    }

    @Override
    public String toString() {
        StringBuilder cadena = new StringBuilder();
        cadena.append(super.toString()).append("Puertas: ").append(this.cantidadPuertas).append(" | ").append("Tipo Vehiculo: ").append(this.tipoAuto);
      return cadena.toString(); 
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.cantidadPuertas;
        hash = 29 * hash + Objects.hashCode(this.tipoAuto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        boolean rta = false;
        if(obj instanceof Auto)
        {
            Auto otroAuto = (Auto) obj;
            rta = super.equals(obj) && this.cantidadPuertas == otroAuto.cantidadPuertas;    
        }
        return rta;
    }  
}
