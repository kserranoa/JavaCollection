// Ordena por departamento
package collection;

import java.util.Comparator;


public class ViewDepartamento implements Comparator<InfoTiquete> {
    
    @Override
    public int compare(InfoTiquete o1, InfoTiquete o2) {
        return o1.getDepartamento().toLowerCase().compareTo(o1.getDepartamento().toLowerCase());
    }

}
