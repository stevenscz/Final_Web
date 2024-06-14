package co.com.globallogic.certificacion.demoqa.interactions;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

public class ScrollDownTo implements Task {

    private final Target target;

    public ScrollDownTo(Target target) {
        this.target = target;
    }

    public static Performable element(Target target) {
        return Task.where("{0} scrolls down to " + target, new ScrollDownTo(target));
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(target)
        );
    }
}