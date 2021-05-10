package ua.gulov.test.SpareParts;

public class Tires {

    public Tires(String part_number, String manufacturer, String season, String spikes, String width, String height, String diameter, boolean runFlat, String load_index, String speed_index, String wear) {
        this.part_number = part_number;
        this.manufacturer = manufacturer;
        this.season = season;
        this.spikes = spikes;
        this.width = width;
        this.height = height;
        this.diameter = diameter;
        this.runFlat = runFlat;
        this.load_index = load_index;
        this.speed_index = speed_index;
        this.wear = wear;
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

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getSpikes() {
        return spikes;
    }

    public void setSpikes(String spikes) {
        this.spikes = spikes;
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

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public boolean isRunFlat() {
        return runFlat;
    }

    public void setRunFlat(boolean runFlat) {
        this.runFlat = runFlat;
    }

    public String getLoad_index() {
        return load_index;
    }

    public void setLoad_index(String load_index) {
        this.load_index = load_index;
    }

    public String getSpeed_index() {
        return speed_index;
    }

    public void setSpeed_index(String speed_index) {
        this.speed_index = speed_index;
    }

    public String getWear() {
        return wear;
    }

    public void setWear(String wear) {
        this.wear = wear;
    }

    String part_number;
    String manufacturer;
    String season;
    String spikes;
    String width;
    String height;
    String diameter;
    boolean runFlat;
    String load_index;
    String speed_index;
    String wear;
}
