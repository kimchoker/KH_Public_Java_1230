package 명함전송서버;

import java.io.Serializable;

public class NameCard {
    String name;
    String phoneNumber;
    String eMail;
    String address;

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public String getAddress() {
        return address;
    }

    public NameCard(String name, String phoneNumber, String eMail, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
        this.address = address;


    }
}