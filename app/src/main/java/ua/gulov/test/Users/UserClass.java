package ua.gulov.test.Users;

import java.util.List;

public class UserClass {


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAvatar_filename() {
        return avatar_filename;
    }

    public void setAvatar_filename(String avatar_filename) {
        this.avatar_filename = avatar_filename;
    }

    public String getCompany_filename() {
        return company_filename;
    }

    public void setCompany_filename(String company_filename) {
        this.company_filename = company_filename;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getTariff() {
        return tariff;
    }

    public void setTariff(long tariff) {
        this.tariff = tariff;
    }

    public long getTariff_item_ending() {
        return tariff_item_ending;
    }

    public void setTariff_item_ending(long tariff_item_ending) {
        this.tariff_item_ending = tariff_item_ending;
    }

    public long getItems_limit() {
        return items_limit;
    }

    public void setItems_limit(long items_limit) {
        this.items_limit = items_limit;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public List<String> getSaved_search() {
        return saved_search;
    }

    public void setSaved_search(List<String> saved_search) {
        this.saved_search = saved_search;
    }

    public String email;
    public String password;
    public String phone;
    public String first_name;
    public String last_name;
    public String avatar_filename;
    public String company_filename;
    public String status;
    public long tariff;
    public long tariff_item_ending;
    public long items_limit;
    public List <Notification> notifications;
    public List <String> saved_search;

    public UserClass(){

    }

    public UserClass(String email, String password, String phone, String first_name, String last_name, String avatar_filename, String company_filename, String status, long tariff, long tariff_item_ending, long items_limit, List<Notification> notifications, List<String> saved_search) {
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.first_name = first_name;
        this.last_name = last_name;
        this.avatar_filename = avatar_filename;
        this.company_filename = company_filename;
        this.status = status;
        this.tariff = tariff;
        this.tariff_item_ending = tariff_item_ending;
        this.items_limit = items_limit;
        this.notifications = notifications;
        this.saved_search = saved_search;
    }



}
