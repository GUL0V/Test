package ua.gulov.test.Publications;

import java.util.List;

import ua.gulov.test.Vehicles.Automobile;
import ua.gulov.test.Vehicles.Moped;
import ua.gulov.test.Vehicles.Motorcycle;
import ua.gulov.test.Vehicles.Scooter;

public class VehiclePublication {

    public VehiclePublication(int person_type, String region, String vehicle_type, Automobile automobile, Moped moped, Motorcycle motorcycle, Scooter scooter, String equipment, List<ImageUrlModel> images, String price, String paymentMethod, String inspection_place, String comment, String company_name, String name_surname, String phone_number, String ad_type) {
        this.person_type = person_type;
        this.region = region;
        this.vehicle_type = vehicle_type;
        this.automobile = automobile;
        this.moped = moped;
        this.motorcycle = motorcycle;
        this.scooter = scooter;
        this.equipment = equipment;
        this.images = images;
        this.price = price;
        this.paymentMethod = paymentMethod;
        this.inspection_place = inspection_place;
        this.comment = comment;
        this.company_name = company_name;
        this.name_surname = name_surname;
        this.phone_number = phone_number;
        this.ad_type = ad_type;
    }

    int person_type;
    String region;
    String vehicle_type;
    Automobile automobile;
    Moped moped;
    Motorcycle motorcycle;
    Scooter scooter;
    String equipment;
    List<ImageUrlModel> images;
    String price;
    String paymentMethod;
    String inspection_place;
    String comment;
    String company_name;
    String name_surname;
    String phone_number;
    String ad_type;

    public int getPerson_type() {
        return person_type;
    }

    public void setPerson_type(int person_type) {
        this.person_type = person_type;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public Automobile getAutomobile() {
        return automobile;
    }

    public void setAutomobile(Automobile automobile) {
        this.automobile = automobile;
    }

    public Moped getMoped() {
        return moped;
    }

    public void setMoped(Moped moped) {
        this.moped = moped;
    }

    public Motorcycle getMotorcycle() {
        return motorcycle;
    }

    public void setMotorcycle(Motorcycle motorcycle) {
        this.motorcycle = motorcycle;
    }

    public Scooter getScooter() {
        return scooter;
    }

    public void setScooter(Scooter scooter) {
        this.scooter = scooter;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public List<ImageUrlModel> getImages() {
        return images;
    }

    public void setImages(List<ImageUrlModel> images) {
        this.images = images;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getInspection_place() {
        return inspection_place;
    }

    public void setInspection_place(String inspection_place) {
        this.inspection_place = inspection_place;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getName_surname() {
        return name_surname;
    }

    public void setName_surname(String name_surname) {
        this.name_surname = name_surname;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAd_type() {
        return ad_type;
    }

    public void setAd_type(String ad_type) {
        this.ad_type = ad_type;
    }
}
