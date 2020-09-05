/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistema.de.facturación.principal;
import java.util.Observable;
import java.util.Observer;

public class Model extends Observable{

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o); 
        this.setChanged();
        this.notifyObservers();
    }

} //Esta clase es un observer pero ¿Qué hacen estos métodos?