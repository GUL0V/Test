package ua.gulov.test.SpareParts;

public class Battery {
    public Battery(String part_number, String manufacturer, String capacity, String trigger, String polarity, String voltage, String length, String width, String height, String weight, String terminal, String housing, String mount) {
        this.part_number = part_number;
        this.manufacturer = manufacturer;
        this.capacity = capacity;
        this.trigger = trigger;
        this.polarity = polarity;
        this.voltage = voltage;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.terminal = terminal;
        this.housing = housing;
        this.mount = mount;
    }

    public String getPart_number() {
        return part_number;
    }

    public void setPart_number(String part_number) {
        this.part_number = part_number;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public String getPolarity() {
        return polarity;
    }

    public void setPolarity(String polarity) {
        this.polarity = polarity;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getHousing() {
        return housing;
    }

    public void setHousing(String housing) {
        this.housing = housing;
    }

    public String getMount() {
        return mount;
    }

    public void setMount(String mount) {
        this.mount = mount;
    }

    String part_number;
    String manufacturer;
    String capacity;
    String trigger;
    String polarity;
    String voltage;
    String length;
    String width;
    String height;
    String weight;
    String terminal;
    String housing;
    String mount;
}
