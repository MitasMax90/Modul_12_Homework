public class CombatVehicles {
    private String type;
    private String name;

    private boolean inField;

    public CombatVehicles(String type, String name, boolean inField) {
        this.type = type;
        this.name = name;
        this.inField = inField;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInField() {
        return inField;
    }

    public void setInField(boolean inField) {
        this.inField = inField;
    }

    @Override
    public String toString() {
        return "combatVehicles{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", inField=" + inField +
                '}';
    }
}
