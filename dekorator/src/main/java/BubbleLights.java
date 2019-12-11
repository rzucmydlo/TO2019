public class BubbleLights extends DekoDecorator {

    public BubbleLights(Deko deko) {
        super(deko);
    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }
}
