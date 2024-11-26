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
    
    public Persona buscar(String busc){
        int bus = Integer.parseInt(busc);
        persona=lista.get(bus);
        return persona;
    }
    
    public void eliminar(String busc)
    {
        int bus = Integer.parseInt(busc);
        lista.remove(bus);
        JOptionPane.showMessageDialog(null, "Eelimiando");
        
    }
    
    public void editar (String busc,String nom,String ape, String id, String ed, String sex)
    {
        int bus = Integer.parseInt(busc);
        persona = new Persona();
        persona.setNombre(nom);
        persona.setApellido(ape);
        persona.setIdentificacion(id);
        persona.setEdad(ed);
        persona.setSexo(sex);
        lista.set(bus,persona);
        JOptionPane.showMessageDialog(null, "Editado");
        
        
    }
    
    public void todob(){
        lista.clear();
    }
    
}
