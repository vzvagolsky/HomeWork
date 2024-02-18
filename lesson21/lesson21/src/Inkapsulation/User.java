package Inkapsulation;
/*
#### Задача 2: Управление учетными записями пользователей
Создайте класс `User`, который инкапсулирует данные пользователя
: логин, пароль и email.
Обеспечьте безопасное изменение
и доступ к этим полям через геттеры и сеттеры.
Пароль должен изменяться только если старый
определенным требованиям безопасности.


 */
public class User {
    private String Login;
    private String email;
    private String password;

    public String getLogin() {
        return Login;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if((password.length()>10) && (this.password == password)) {
            this.password = password;
        }
    }
}
