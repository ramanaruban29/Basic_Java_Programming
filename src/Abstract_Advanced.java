abstract class Mobile
{
    void VoiceCall()
    {
        System.out.println("YOu can make a voice call");
    }
    abstract void camera();
    abstract void touchDisplay();
}

class samsung extends Mobile
{

    @Override
    void camera()
    {
        System.out.println("5.5 Mega Pixels");
    }

    @Override
    void touchDisplay()
    {
        System.out.println("10 inch display");
    }
}

class nokia extends Mobile
{

    @Override
    void camera() {
        System.out.println("10.5 Mega Pixels");

    }

    @Override
    void touchDisplay() {
        System.out.println("10 inch OLED display");

    }
    void fingerprint()
    {
        System.out.println("super Strong and clear finger print sensor ");
    }
}
public class Abstract_Advanced
{
    public static void main(String[] args) {
        samsung M20 =new samsung();
        M20.camera();
        M20.touchDisplay();
        M20.VoiceCall();

        nokia N17 =new nokia();
        N17.camera();
        N17.touchDisplay();
        N17.fingerprint();


    }

}
