/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistema.de.facturación;
import sistema.de.facturación.principal.Interfaz;

public class Principal {
    public static void main(String[] args) {
        Interfaz vista = new Interfaz();
        vista.setVisible(true);
    }
}