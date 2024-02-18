public class Keyboard extends InputDevice {
    private String device="Keyboard";
    public  void connect(){
        setOnoff(true);

    };
    public  void disconnect(){
        setOnoff(false);
    }

    public String getDevice() {
        return device;
    }
}
