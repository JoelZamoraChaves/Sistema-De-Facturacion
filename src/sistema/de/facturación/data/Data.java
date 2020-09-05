/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistema.de.facturación.data;

import java.util.ArrayList;
import sistema.de.facturación.Logic.Cliente;
import sistema.de.facturación.Logic.Producto;

public class Data {
    private String nombreEmpresa;
    private String cedulaJuridica;
    private ArrayList<Cliente> clientes;
    private ArrayList<Producto> productos;
    
    public Data(String nombre, String cedula){
        nombreEmpresa = nombre;
        cedulaJuridica = cedula;
        clientes = new ArrayList<>();
        productos = new ArrayList<>();
    }
    
    public String getNombre(){
        return nombreEmpresa;
    }
    
    public String getCedula(){
        return cedulaJuridica;
    }
    
    public ArrayList<Cliente> getClientes(){
        return clientes;
    }
    
    public ArrayList<Producto> getProductos(){
        return productos;
    }
    
    public void setNombre(String nombre){
        nombreEmpresa = nombre;
    }
    
    public void setCedula(String cedula){
        cedulaJuridica = cedula;
    }
    @Override
    public String toString(){
        return String.format("Nombre empresa: %s", "Cedula jurídica: %s",
                "Número de clientes: %s", "Número de productos: %s",
                nombreEmpresa, cedulaJuridica, clientes.size(), productos.size());
    }
}
