package Abstractas;

public abstract class Persona {
    private static Integer i = 0;
    private final Integer id;
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.id = ++i;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
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
}
