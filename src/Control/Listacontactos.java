package Control;

import Modelado.Persona;
import java.util.*;
import javax.swing.JOptionPane;



public class Listacontactos {
    
    List<Persona> lista=new ArrayList<>();
    Persona persona = new Persona();;
    
    public void agregar(String nombre,String apellido, String id, String edad, String sexo)
    {
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setIdentificacion(id);
        persona.setEdad(edad);
        persona.setSexo(sexo);
        lista.add(persona);
        JOptionPane.showMessageDialog(null, "Registrado");
        
    }
    
    public Persona buscar(String buscar){
        int Buscar = Integer.parseInt(buscar);
        persona=lista.get(Buscar);
        return persona;
    }
    
    public void eliminar(String buscar)
    {
        int Buscar = Integer.parseInt(buscar);
        lista.remove(Buscar);
        JOptionPane.showMessageDialog(null, "Eelimiando");
        
    }
    
    public void editar (String buscar,String nombre,String apellido, String id, String edad, String sexo)
    {
        int Buscar = Integer.parseInt(buscar);
        persona = new Persona();
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setIdentificacion(id);
        persona.setEdad(edad);
        persona.setSexo(sexo);
        lista.set(Buscar,persona);
        JOptionPane.showMessageDialog(null, "Editado");
        
        
    }
    
    public void todob(){
        lista.clear();
    }
    
}
