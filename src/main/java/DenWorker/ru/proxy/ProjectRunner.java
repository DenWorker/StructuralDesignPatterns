package DenWorker.ru.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/DenWorker/StructuralDesignPatterns");

        // Скачивание и запуск происходит только при запуске.
        // Ленивая загрузка.
        project.run();
    }

}
