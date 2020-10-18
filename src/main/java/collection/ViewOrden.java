// Realiza el proceso de ordenar los tiquetes

package collection;

import java.util.Comparator;

public class ViewOrden  implements Comparator<InfoTiquete>{

    // Metodo abstracto
    @Override
    public int compare(InfoTiquete o1, InfoTiquete o2) {
        //throw new UnsupportedOperationException("Not supported yet.");
        if(o1.getNumTiquete() > o2.getNumTiquete())
            return 1;
        else if(o1.getNumTiquete() < o2.getNumTiquete())
            return -1;
        else
            return 0;
           
        }
    }
    

