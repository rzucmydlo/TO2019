

public class BuyStuff implements Control {
    private Stuff abcStuff;

    public BuyStuff(Stuff abcStuff){
        this.abcStuff = abcStuff;
    }

    public void execute() {
        abcStuff.buy();
    }

}


