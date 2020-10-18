// Ordena por tipo de prioridad
package collection;

import java.util.Comparator;


public class ViewPrioridad implements Comparator<InfoTiquete> {
    
    @Override
    public int compare(InfoTiquete o1, InfoTiquete o2) {
        return o1.getPersona().toLowerCase().compareTo(o1.getPersona().toLowerCase());
    }

}
