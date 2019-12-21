

public class CommandTest {
    public static void main(String[] args) {
        Stuff abcStuff;
        abcStuff = new Stuff();

        BuyStuff buyStuffControl = new BuyStuff(abcStuff);
        SellStuff sellStuffControl = new SellStuff(abcStuff);

        Broker broker = new Broker();
        broker.takeControl(buyStuffControl);
        broker.takeControl(sellStuffControl);
        broker.placeControls();
    }
}
