package DenWorker.ru.decorator.developers;

import DenWorker.ru.decorator.DeveloperDecorator;

public class JavaTeamLead extends DeveloperDecorator {
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "Send week report to customer.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
