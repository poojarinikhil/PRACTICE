interface Tvremote{
    void volume_button();
    void channel_button();
    void return_button();
}
interface SmartTvremote extends Tvremote {
    int a []= {0};
    void hotkeys_buttons();
    void assisant_button();
    void home_button();
}
class myremote implements SmartTvremote{
    public void hotkeys_buttons(){
        System.out.println("Using Hotkeys");
    }
    public void assisant_button(){
        System.out.println("Using Goggle Assistant");
    }
    public void home_button(){
        System.out.println("Entering to a home screen");
    }
    public void volume_button(){
        System.out.println("Increasing Volume");
    }
    public void channel_button(){
        System.out.println("Changing channels");
    }
    public void return_button(){
        System.out.println("Going back to previous page");
    }
}
public class practice_set {
    public static void main(String[] args) {
        SmartTvremote m = new myremote();
        m.volume_button();
    }

}
