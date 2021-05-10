package ua.gulov.test.SpareParts;

public class Wheels {

    public Wheels(String part_number, String manufacturer, String type, String width, String diameter, String radius, String quantity_capture, String diameter_align_hole, String hub_dia, String color) {
        this.part_number = part_number;
        this.manufacturer = manufacturer;
        this.type = type;
        this.width = width;
        this.diameter = diameter;
        this.radius = radius;
        this.quantity_capture = quantity_capture;
        this.diameter_align_hole = diameter_align_hole;
        this.hub_dia = hub_dia;
        this.color = color;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public String getQuantity_capture() {
        return quantity_capture;
    }

    public void setQuantity_capture(String quantity_capture) {
        this.quantity_capture = quantity_capture;
    }

    public String getDiameter_align_hole() {
        return diameter_align_hole;
    }

    public void setDiameter_align_hole(String diameter_align_hole) {
        this.diameter_align_hole = diameter_align_hole;
    }

    public String getHub_dia() {
        return hub_dia;
    }

    public void setHub_dia(String hub_dia) {
        this.hub_dia = hub_dia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    String part_number;
    String manufacturer;
    String type;
    String width;
    String diameter;
    String radius;
    String quantity_capture;
    String diameter_align_hole;
    String hub_dia;
    String color;


}
