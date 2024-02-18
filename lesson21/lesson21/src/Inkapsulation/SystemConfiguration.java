package Inkapsulation;
/*
#### Задача 3: Конфигурация системы
Разработайте класс `SystemConfiguration`,
который хранит конфигурационные параметры системы
(например, уровень логирования, путь к файлам логов).
Доступ к изменению этих параметров должен быть
строго контролируемым через методы,
предотвращающие установку некорректных значений.


 */
public class SystemConfiguration {
private String PathLog;
private String levellog="ALL";

    public String getPathLog() {
        return PathLog;
    }

    public void setPathLog(String pathLog) {
        PathLog = pathLog;
    }

    public String getLevellog() {
        return levellog;
    }

    public void setLevellog(String levellog) {
        this.levellog = levellog;
    }
}
