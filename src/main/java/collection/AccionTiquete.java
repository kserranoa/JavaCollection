// Clase main que ejecuta las tareas del programa

package collection;

import java.util.LinkedList;
import java.util.List;

public class AccionTiquete {
       
       
    public static void main(String[] args) {
            var tiquete = new AgregarTiquete();
            tiquete.agregaDatos();
            tiquete.muestra();
            System.out.println("Ordena por numero tiquete");
            tiquete.viewOrden();
            tiquete.muestra();
            System.out.println("Ordena por persona");
            tiquete.viewPerson();
            tiquete.muestra();
    }

}
