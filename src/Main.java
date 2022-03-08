import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    private static final String TANK = "Tank";
    private static final String BTR = "BTR";
    private static final String BMP = "BMP";

    public static void main(String[] args) {
        CombatVehicles vehicles1 = new CombatVehicles(TANK, "T-34", false);
        CombatVehicles vehicles2 = new CombatVehicles(BMP, "BMP-80", false);
        CombatVehicles vehicles3 = new CombatVehicles(BTR, "BTR-2", false);
        CombatVehicles vehicles4 = new CombatVehicles(BTR, "BTR-1", false);
        CombatVehicles vehicles5 = new CombatVehicles(BMP, "BMP-80-M", true);
        CombatVehicles vehicles6 = new CombatVehicles(BMP, "BMP-72", false);
        CombatVehicles vehicles7 = new CombatVehicles(BTR, "BTR-3", false);
        CombatVehicles vehicles8 = new CombatVehicles(TANK, "Abrams", true);
        CombatVehicles vehicles9 = new CombatVehicles(TANK, "Tiger", false);
        CombatVehicles vehicles10 = new CombatVehicles(BTR, "BTR-4", false);
        CombatVehicles vehicles11 = new CombatVehicles(BMP, "BMP-72-M", false);

        // Пользоваться массивом неудобно, воспользуемся интерфейсом типа List
        // и его имплементацией ArrayList
        List<CombatVehicles> vehiclesList = new ArrayList<>();
        // Добавим все объекты в ArrayList
        vehiclesList.add(vehicles1);
        vehiclesList.add(vehicles2);
        vehiclesList.add(vehicles3);
        vehiclesList.add(vehicles4);
        vehiclesList.add(vehicles5);
        vehiclesList.add(vehicles6);
        vehiclesList.add(vehicles7);
        vehiclesList.add(vehicles8);
        vehiclesList.add(vehicles9);
        vehiclesList.add(vehicles10);
        vehiclesList.add(vehicles11);

        // Теперь уберем BMP, а TANK переведём в режим "в поле"
        // создав для правильной работы с элементами литса итератор

        Iterator<CombatVehicles> iterator = vehiclesList.iterator();

        while (iterator.hasNext()) {
            CombatVehicles combatVehicles = iterator.next();
            if (combatVehicles.getType().equals(BMP)) {
                iterator.remove();
            } else if (combatVehicles.getType().equals(TANK)) {
                combatVehicles.setInField(true);
            }
        }

        for (CombatVehicles combatVehicles : vehiclesList) {
            System.out.println(combatVehicles);
        }

    }
}
