package Modelado;

public class Persona {
    
    int edad;
    String nombre;
    String apellido;
    String identificacion;
    String sexo;

    public int getEdad() {
        return edad;
    }

    public void setEdad(String e) {
        this.edad = Integer.parseInt(e);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
}
