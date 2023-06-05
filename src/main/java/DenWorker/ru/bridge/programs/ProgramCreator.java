package DenWorker.ru.bridge.programs;

import DenWorker.ru.bridge.developers.CppDeveloper;
import DenWorker.ru.bridge.developers.JavaDeveloper;

public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {
                // Выбирать можно любого разраба.
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for (Program iterator : programs) {
            iterator.developProgram();
        }
    }
}
