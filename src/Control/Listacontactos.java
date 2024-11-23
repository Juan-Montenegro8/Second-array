package Control;

import Modelado.Persona;


import java.util.Vector;
import javax.swing.JOptionPane;



public class Listacontactos {
    
    Vector<Persona> lis=new Vector<Persona>();
    Persona pr;
    
    public void agregar(String nom,String ape, String id, String ed, String sex)
    {
     
        pr = new Persona();
        pr.setNombre(nom);
        pr.setApellido(ape);
        pr.setIdentificacion(id);
        pr.setEdad(ed);
        pr.setSexo(sex);
        lis.add(pr);
        JOptionPane.showMessageDialog(null, "Registrado");
        
    }
    
    public Persona buscar(String busc){
        int bus = Integer.parseInt(busc);
        pr=lis.get(bus);
        return pr;
    }
    
    public void eliminar(String busc)
    {
        int bus = Integer.parseInt(busc);
        lis.remove(bus);
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
        lis.set(bus,pr);
        JOptionPane.showMessageDialog(null, "Editado");
        
        
    }
    
    public void todob(){
        lis.clear();
    }
    
}
