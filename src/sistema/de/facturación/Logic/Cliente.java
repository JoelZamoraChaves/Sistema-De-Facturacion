/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistema.de.facturación.Logic;

import java.util.ArrayList;

public class Cliente {
    private String cedula;
    private String nombre;
    private String telefono;
    private String correoElec;
    private String direccion;
    private ArrayList<Factura> facturas;

    public Cliente(String cedula, String nombre, String telefono, String correoElec, String direccion, Factura factura) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correoElec = correoElec;
        this.direccion = direccion;
        this.facturas = new ArrayList<>();
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElec() {
        return correoElec;
    }

    public void setCorreoElec(String correoElec) {
        this.correoElec = correoElec;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    @Override
    public String toString() {
        return "Información del cliente:\n Cédula: " + cedula + " \n Nombre:" + nombre + 
               "\n Teléfono:" + telefono + "\n Correo Electrónico: " + correoElec + 
               "\n Dirección: " + direccion + "\n\n Factura: \n" + facturas.toString();
    }
    
    
}