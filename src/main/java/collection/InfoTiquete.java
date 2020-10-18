// Contiene los atributos para los tiquetes

package collection;

import java.util.List;


public class InfoTiquete {
     int numTiquete; 
    String persona, problema, descripcion, prioridad, departamento, estadoTiquete;
    //String [] prioridad = {"bajo", "medio", "urgente"};
//    String departamento = {"soporte tecnico", "problemas generales", "pagos", "ventas"};
//    String estadoTiquete = {"abierto", "cerrado"};

    public InfoTiquete(int numTiquete, String persona, String problema, String descripcion, String prioridad, String departamento, String estadoTiquete) {
        this.numTiquete = numTiquete;
        this.persona = persona;
        this.problema = problema;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.departamento = departamento;
        this.estadoTiquete = estadoTiquete;
    }

    public int getNumTiquete() {
        return numTiquete;
    }

    public void setNumTiquete(int numTiquete) {
        this.numTiquete = numTiquete;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEstadoTiquete() {
        return estadoTiquete;
    }

    public void setEstadoTiquete(String estadoTiquete) {
        this.estadoTiquete = estadoTiquete;
    }
    
//    protected String print()
//    {
//        return "Persona: " + persona + " Numero Tiquete: " + numTiquete;
//    }
//    
//    public final String ViewName()
//    {
//        return persona.toUpperCase();
//    }
}
