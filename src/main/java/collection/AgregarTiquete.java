// Agrega los detalles de los tiquetes a las colecciones

package collection;
import java.util.LinkedList;
import java.util.List;

public class AgregarTiquete {
   private List<InfoTiquete> ticket;
   
   public AgregarTiquete(){
       ticket = new LinkedList<>();
   }
   //int numTiquete, String persona, String problema, String descripcion
   public void agregaDatos(){
        ticket.add(new InfoTiquete(1, "Karina Serrano", "Problema de equipo", "No funciona el monitor", "bajo", "soporte tecnico", "abierto"));
        ticket.add(new InfoTiquete(2, "Yinny Najera", "Problema de equipo", "Teclado danado", "medio", "soporte tecnico", "abierto"));
   }
  
}
