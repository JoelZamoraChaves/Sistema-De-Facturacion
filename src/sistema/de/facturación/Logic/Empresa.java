/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistema.de.facturación.Logic;
import sistema.de.facturación.data.Data;

public class Empresa {
    private static Empresa instancia;
    private Data informacion;

    private Empresa(String nombreEmpresa, String cedulaJuridica) {
        informacion = new Data(nombreEmpresa, cedulaJuridica);
    }
    
    public Empresa instancia(String nombreEmpresa, String cedulaJuridica){
        if (instancia == null){
            instancia = new Empresa(nombreEmpresa, cedulaJuridica);
        }
        return instancia;
    }

    public String getNombre() {
        return informacion.getNombre();
    }

    public String getCedula() {
        return informacion.getCedula();
    }
    
    public void setNombre(String nombre) {
        this.informacion.setNombre(nombre);
    }
    
    public void setCedula(String cedula){
        this.informacion.setCedula(cedula);
    }

    @Override
    public String toString() {
        return informacion.toString();
    }
  
}