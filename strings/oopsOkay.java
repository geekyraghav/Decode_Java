package strings;
class car{
    int price;
    int avg;
    int speed;
}
class superCar extends car{
    int spoiler;
}
public class oopsOkay {
    public static void main(String[] args) {
        superCar s1 = new superCar();
        s1.avg = 23;

    }
}
