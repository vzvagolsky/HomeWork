/*
### Задача 1: Устройства ввода

Создайте абстрактный класс InputDevice, который включает абстрактные методы connect
и disconnect, а также может содержать поля или неабстрактные методы,
общие для всех устройств ввода.
От этого абстрактного класса наследуйте классы Keyboard и Mouse,
 реализуя абстрактные методы.
*/

abstract public class InputDevice {
    private boolean onoff;

    abstract public void connect();

    abstract public void disconnect();

    public void StatusPribor(String device) {
        if (onoff == true) {
            System.out.println(device+" включен! ");
        } else {
            System.out.println(device+" выключен! ");
        }

    }

    public boolean isOnoff() {
        return onoff;
    }

    public void setOnoff(boolean onoff) {
        this.onoff = onoff;
    }
}