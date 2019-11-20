/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrykaabstrakcyjna;

/**
 *
 * @author Ania
 */
public class CheapFactory implements Factory1 {

    public Screen createScreen() {
        return new SmallScreen();
    }

    public Battery createBattery() {
        return new SmallCapacity();
    }

    public Proccesor createProccesor() {
        return new SlowProccesor();
    }
}
