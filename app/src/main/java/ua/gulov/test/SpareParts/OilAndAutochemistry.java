package ua.gulov.test.SpareParts;

public class OilAndAutochemistry {

    public OilAndAutochemistry(String part_number, String manufacturer, String volume) {
        this.part_number = part_number;
        this.manufacturer = manufacturer;
        this.volume = volume;
    }

    String part_number;
    String manufacturer;
    String volume;

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

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}
