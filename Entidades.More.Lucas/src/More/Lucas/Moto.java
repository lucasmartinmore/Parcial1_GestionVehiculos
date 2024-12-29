package More.Lucas;

import java.util.Objects;

public class Moto extends Vehiculo{
    private int cilindrada;
    private TipoMoto tipoMoto;

    public Moto(int cilindrada, TipoMoto tipoMoto, Persona propietario, String marca, String modelo, float precio) {
        super(propietario, marca, modelo, precio);
        this.cilindrada = cilindrada;
        this.tipoMoto = tipoMoto;
    }

    @Override
    public String toString() {
        StringBuilder cadena = new StringBuilder();
        cadena.append(super.toString()).append("Cilindradas: ").append(this.cilindrada).append(" | ").append("Tipo Moto: ").append(this.tipoMoto);
      return cadena.toString(); 
    }
    

    @Override
    public boolean equals(Object obj) {
        boolean rta = false;
        if(obj instanceof Moto)
        {
            Moto otroAuto = (Moto) obj;
            rta = super.equals(obj) && this.cilindrada == otroAuto.cilindrada;    
        }
        return rta;
    }  

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.cilindrada;
        hash = 43 * hash + Objects.hashCode(this.tipoMoto);
        return hash;
    }
    
    
}
