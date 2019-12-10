/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public class HighQualityPhoneFactory implements Factory1 {

    public Screen createScreen() {
        return new BigScreen();
    }

    public Battery createBattery() {
        return new BigCapacity();
    }

    public Proccesor createProccesor() {
        return new FastProccesor();
    }
}