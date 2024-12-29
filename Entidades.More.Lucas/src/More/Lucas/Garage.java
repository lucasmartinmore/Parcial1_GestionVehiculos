package More.Lucas;

import java.util.ArrayList;

public class Garage {
    private int capacidadMaxima;
    private ArrayList <Vehiculo> vehiculos;

    public Garage(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.vehiculos = new ArrayList<>();//instancio
    }

    public Garage() {
        this(3);
    }
    
    public  boolean sonIguales(Vehiculo v1)
    {
        boolean rta = false;
        for(Vehiculo vehiculo : vehiculos)
        {
            if(vehiculo.equals(v1))
            {
                rta = true;
            }
        }
        return rta;
    }
    
    public void agregar(Vehiculo v1)
    {
        if(this.vehiculos.size() < this.capacidadMaxima && this.sonIguales(v1)==false)
        {
            this.vehiculos.add(v1);
            System.out.println("Vehiculo agregado exitosamente!...");
        }
        else if(this.sonIguales(v1))
        {
            System.out.println("El vehiculo ya se encuentra agregado, reintente nuevamente otro vehiculo!...");
        }
        else
        {
            System.out.println("No se encuentra espacio disponible para el vehiculo!...");
        }
    }
    
    private double getPrecio(TipoVehiculo tipoVehiculo)
    {
        double precioTotal=0.0;
        for(Vehiculo vehiculo : this.vehiculos)
        {
            switch(tipoVehiculo)
            {
               case AUTOS:
                   if(vehiculo instanceof Auto)
                   {
                       precioTotal += vehiculo.getPrecio();
                   }
                   break;
               case MOTOS:
                   if(vehiculo instanceof Moto)
                   {
                       precioTotal += vehiculo.getPrecio();
                   }
                   break;
               case TODOS:
                   precioTotal += vehiculo.getPrecio();
                   break;
            }         
        }
        return precioTotal;
    }
    
    

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    
    public double getPrecioDeAutos()
    {
        return this.getPrecio(TipoVehiculo.AUTOS);
    }
    
    public double getPrecioDeMotos()
    {
        return this.getPrecio(TipoVehiculo.MOTOS);
    }
    
    public double getPrecioTotal()
    {
        return this.getPrecio(TipoVehiculo.TODOS);
    }
    
    public static String mostrar(Garage g1)
    {
        StringBuilder cadena = new StringBuilder();
        cadena.append("---Garage-----\n").append("Capacidad Maxima: ").append(g1.capacidadMaxima).append(" | ").append("Vehiculos: \n");
        g1.vehiculos.forEach(vehiculo -> cadena.append(vehiculo.toString()).append("\n"));
        cadena.append("Precio Total: ").append(g1.getPrecioTotal());
        return cadena.toString();
    }  
}
