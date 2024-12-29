package More.Lucas;

public class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public static boolean sonIguales(Persona personaA, Persona personaB)
    {
        return personaA.nombre.equals(personaB.nombre) && personaA.apellido.equals(personaB.apellido);
    }
    
    public String getNombreApellido()
    {
        return this.getNombre()+" "+this.getApellido();
    }
}
