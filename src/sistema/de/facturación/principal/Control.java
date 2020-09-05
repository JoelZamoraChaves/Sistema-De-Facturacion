/*
UNIVERSIDAD NACIONAL DE COSTA RICA
EIF-206  -  PROGRAMACIÓN III
ESTUDIANTES: JOEL ZAMORA Y DIEGO JIMÉNEZ
PROFESOR: JOSE SÁNCHEZ SALAZAR
*/

package sistema.de.facturación.principal;

public class Control {
    private Model model;
    private Interfaz view;
    
    Control(Model model, Interfaz view){
        this.model = model;
        this.view = view;
        view.setModel(model);
        view.setControl(this);
    }
}
