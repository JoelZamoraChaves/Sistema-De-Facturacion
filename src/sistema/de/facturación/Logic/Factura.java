/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistema.de.facturación.Logic;

import sistema.de.facturación.Logic.Cliente;
import java.util.ArrayList;

public class Factura {
    private int numero;
    private Fecha fecha;
    private Cliente cliente;
    private ArrayList<Producto> productos;  

    public Factura(int numero, Fecha fecha, Cliente cliente, ArrayList<Producto> productos) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.productos = productos;
    }

    public int getNumero() {
        return numero;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    @Override
    public String toString() {
        return "Información de la factura: \n Numero de factura: " + numero + 
                "\n Fecha: " + fecha + "\n Cliente: " + cliente + 
                "\n Productos: \n" + productos.toString();
    }
    
    
}
