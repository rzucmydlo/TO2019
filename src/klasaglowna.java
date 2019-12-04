

public class klasaglowna {
    public static void main(String[] args) {
        ChocolateFactory shapeFactory = new ChocolateFactory();
       Chocolate milka = shapeFactory.getChocolate("mleczna");
        milka.make();
        Chocolate wedel = shapeFactory.getChocolate("gorzka");
        wedel.make();
        Chocolate oreo = shapeFactory.getChocolate("z orzechami");
        oreo.make();
    }
}

interface Chocolate {
    void make();
}

class Mleczna implements Chocolate {
    public void make() {
        System.out.println("Tworzenie czekolady mlecznej");
    }
}

class Gorzka implements Chocolate {
    public void make() {
        System.out.println("Tworzenie czekolady gorzkiej");
    }
}


class Zorzechami implements Chocolate {
    public void make() {
        System.out.println("Tworzenie czekolady z orzechami");
    }
}


class ChocolateFactory {
    public Chocolate getChocolate(String chocolateType){
        if(chocolateType == null){
            return null;
        }
        if(chocolateType.equalsIgnoreCase("mleczna")){
            return new Mleczna();

        } else if(chocolateType.equalsIgnoreCase("gorzka")){
            return new Gorzka();

        } else if(chocolateType.equalsIgnoreCase("z orzechami")){
            return new Zorzechami();
        }

        return null;
    }
}