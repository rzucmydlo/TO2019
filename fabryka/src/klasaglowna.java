/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *engine=screen
 * createEngine=createScreen
 * light=battery
 * tire=proccesor
 * cheapFactory=economyFactory
 * petrolEngine=bigScreen
 * halogen=BigCapacity
 * budgetTire=SlowProccesor
 * EconomyCarEquipmentFactory=LowQualityPhoneFactory
 * ComfortCarEquipmentFactory=HighQualityPhoneFactory
 * createEquipment=createPhone
 * carEquipmentFactory=QualityPhoneFactory
 * HybridEngine=BigScreen
 * LedLight=BigCapacity
 * PremiumTire=FastProccesor
 * @author Anna Rzucidło
 */
public class klasaglowna {
   

    public static void main(String[] args) {
        createPhone(new LowQualityPhoneFactory());
        createPhone(new HighQualityPhoneFactory());
    }

    private static void createPhone(Factory1 QualityPhoneFactory) {
        Screen screen = QualityPhoneFactory.createScreen();
        screen.produceScreen();

        Battery battery = QualityPhoneFactory.createBattery();
        battery.produceBattery();

        Proccesor proccesor = QualityPhoneFactory.createProccesor();
        proccesor.produceProccesor();
    }
}

