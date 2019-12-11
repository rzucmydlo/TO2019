public abstract class DekoDecorator implements Deko {
    private Deko deko;

    public DekoDecorator(Deko deko) {
        this.deko = deko;
    }


    @Override
    public String decorate() {
        return deko.decorate();
    }
}

