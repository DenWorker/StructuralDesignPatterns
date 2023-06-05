package DenWorker.ru.decorator.developers;

import DenWorker.ru.decorator.DeveloperDecorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "Make code review. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
