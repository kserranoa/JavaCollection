// Agrega los detalles de los tiquetes a las colecciones

package collection;
import java.util.Collections;
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
        ticket.add(new InfoTiquete(2, "Yinny Najera", "Problema de equipo", "Teclado danado", "alto", "soporte tecnico", "abierto"));
        ticket.add(new InfoTiquete(9, "Monica Lopez", "Problema de pago", "Menos salario", "medio", "pagos", "cerrado"));
        ticket.add(new InfoTiquete(3, "Tatiana Mendez", "Consulta de limpieza", "Escritorio sucio", "bajo", "problemas generales", "abierto"));
        ticket.add(new InfoTiquete(8, "Lupita Ramirez", "Reduccion en las ventas", "Menos ventas en el mes", "medio", "ventas", "cerrado"));
   }
  
   // Elimina datos por posicion de la lista
   public void eliminaDatos(int index){
       ticket.remove(index);
   }
   
   public void muestra(){
    /*   for(var tiquete: ticket){
           System.out.println(tiquete.print());
       }
      */ 
       // Recorre una lista
       for(var i = 0; i< ticket.size(); i++){
           System.out.println(ticket.get(i).print()); //Permite ver cada objeto de la lista
       }
   }
   
   // Metodo para ordernar por id
   public void viewOrden(){
       Collections.sort(ticket, new ViewOrden());
   }
   
   // Metodo ordena por Persona
   public void viewPerson(){
       Collections.sort(ticket, new ViewPerson());
   }
}
