package Control;

import Modelado.Persona;
import java.util.*;
import javax.swing.JOptionPane;



public class Listacontactos {
    
    List<Persona> lista=new ArrayList<>();
    Persona pr = new Persona();;
    
    public void agregar(String nom,String ape, String id, String ed, String sex)
    {
        pr.setNombre(nom);
        pr.setApellido(ape);
        pr.setIdentificacion(id);
        pr.setEdad(ed);
        pr.setSexo(sex);
        lista.add(pr);
        JOptionPane.showMessageDialog(null, "Registrado");
        
    }
    
    public Persona buscar(String busc){
        int bus = Integer.parseInt(busc);
        pr=lista.get(bus);
        return pr;
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
        pr = new Persona();
        pr.setNombre(nom);
        pr.setApellido(ape);
        pr.setIdentificacion(id);
        pr.setEdad(ed);
        pr.setSexo(sex);
        lista.set(bus,pr);
        JOptionPane.showMessageDialog(null, "Editado");
        
        
    }
    
    public void todob(){
        lista.clear();
    }
    
}
