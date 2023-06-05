package DenWorker.ru.bridge.programs;

import DenWorker.ru.bridge.developers.Developer;

public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
