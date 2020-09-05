/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistema.de.facturación.Logic;

public class Producto {
    private String codigo;
    private String nombre;
    private String precio;
    private String impuesto;

    public Producto(String codigo, String nombre, String precio, String impuesto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.impuesto = impuesto;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(String impuesto) {
        this.impuesto = impuesto;
    }

    @Override
    public String toString() {
        return "Producto: " + "\n Código: " + codigo + "\n Nombre: " + nombre + 
               "\n Precio: " + precio + "\n Impuesto: " + impuesto;
    }
    
    
}