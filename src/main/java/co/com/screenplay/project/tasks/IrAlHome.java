package co.com.screenplay.project.tasks;

import co.com.screenplay.project.interactions.ClickeaSobre;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.screenplay.project.userinterfaces.DetalleProducto.BOTON_AGREGAR_CARRITO;
import static co.com.screenplay.project.userinterfaces.DetalleProducto.CANTIDAD_PRODUCTO;
import static co.com.screenplay.project.userinterfaces.HomeSanAngel.HOME;
import static co.com.screenplay.project.userinterfaces.HomeSanAngel.PRODUCTO_DOS_FLORES_PRESENTE;

public class IrAlHome implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickeaSobre.el(HOME));

    }

    public static IrAlHome home(){
        return Tasks.instrumented(IrAlHome.class);
    }
}
