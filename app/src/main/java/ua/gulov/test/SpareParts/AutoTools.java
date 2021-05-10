package ua.gulov.test.SpareParts;

public class AutoTools {


    public AutoTools(String part_number, String manufacturer) {
        this.part_number = part_number;
        this.manufacturer = manufacturer;
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

    String part_number;
    String manufacturer;


}
