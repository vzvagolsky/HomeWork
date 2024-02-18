


public class DeviceApp {
    public static void main(String[] args)
    {
        Mouse mouse= new Mouse();
        Keyboard keyboard=new Keyboard();
        mouse.connect();
        keyboard.connect();
        mouse.StatusPribor(mouse.getDevice());
        keyboard.StatusPribor(keyboard.getDevice());
        mouse.disconnect();
        keyboard.disconnect();
        mouse.StatusPribor(mouse.getDevice());
        keyboard.StatusPribor(keyboard.getDevice());
        
    }
}