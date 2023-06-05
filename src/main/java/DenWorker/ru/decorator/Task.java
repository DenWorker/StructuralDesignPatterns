package DenWorker.ru.decorator;

import DenWorker.ru.decorator.developers.Developer;
import DenWorker.ru.decorator.developers.JavaDeveloper;
import DenWorker.ru.decorator.developers.JavaTeamLead;
import DenWorker.ru.decorator.developers.SeniorJavaDeveloper;

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(developer.makeJob());
    }
}
