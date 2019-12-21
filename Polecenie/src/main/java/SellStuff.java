

public class SellStuff implements Control {
    private Stuff abcStuff;

    public SellStuff(Stuff abcStuff) {
        this.abcStuff = abcStuff;
    }

    public void execute() {
        abcStuff.sell();
    }
}


