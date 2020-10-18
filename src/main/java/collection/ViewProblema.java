// Metodo ordena por nombre del problema
package collection;

import java.util.Comparator;


public class ViewProblema implements Comparator<InfoTiquete> {
    
    @Override
    public int compare(InfoTiquete o1, InfoTiquete o2) {
        return o1.getProblema().toLowerCase().compareTo(o1.getProblema().toLowerCase());
    }

}
