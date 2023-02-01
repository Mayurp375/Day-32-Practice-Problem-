package org.example.Day32.adressbook;

public class AddressBook  {
    String name , adress,city,state,phoneNumm,email;
    int zip;

    @Override
    public String toString() {
        return "AddressBook{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", phoneNumm='" + phoneNumm + '\'' +
                ", email='" + email + '\'' +
                ", zip=" + zip +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhoneNumm() {
        return phoneNumm;
    }

    public void setPhoneNumm(String phoneNumm) {
        this.phoneNumm = phoneNumm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }


}
