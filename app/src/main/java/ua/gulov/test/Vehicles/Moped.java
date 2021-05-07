package ua.gulov.test.Vehicles;

public class Moped {
    public Moped(String moped_brand, String moped_year, String moped_engine, String moped_color, String moped_mileage, String moped_engine_volume, String moped_power) {
        this.moped_brand = moped_brand;
        this.moped_year = moped_year;
        this.moped_engine = moped_engine;
        this.moped_color = moped_color;
        this.moped_mileage = moped_mileage;
        this.moped_engine_volume = moped_engine_volume;
        this.moped_power = moped_power;
    }

    public String getMoped_brand() {
        return moped_brand;
    }

    public void setMoped_brand(String moped_brand) {
        this.moped_brand = moped_brand;
    }

    public String getMoped_year() {
        return moped_year;
    }

    public void setMoped_year(String moped_year) {
        this.moped_year = moped_year;
    }

    public String getMoped_engine() {
        return moped_engine;
    }

    public void setMoped_engine(String moped_engine) {
        this.moped_engine = moped_engine;
    }

    public String getMoped_color() {
        return moped_color;
    }

    public void setMoped_color(String moped_color) {
        this.moped_color = moped_color;
    }

    public String getMoped_mileage() {
        return moped_mileage;
    }

    public void setMoped_mileage(String moped_mileage) {
        this.moped_mileage = moped_mileage;
    }

    public String getMoped_engine_volume() {
        return moped_engine_volume;
    }

    public void setMoped_engine_volume(String moped_engine_volume) {
        this.moped_engine_volume = moped_engine_volume;
    }

    public String getMoped_power() {
        return moped_power;
    }

    public void setMoped_power(String moped_power) {
        this.moped_power = moped_power;
    }

    String moped_brand;
    String moped_year;
    String moped_engine;
    String moped_color;
    String moped_mileage;
    String moped_engine_volume;
    String moped_power;

}
