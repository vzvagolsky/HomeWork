public class Mouse extends InputDevice  {
    private String device="Mouse";
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
