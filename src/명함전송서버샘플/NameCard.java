package 명함전송서버샘플;

import java.io.Serializable;

public class NameCard implements Serializable {
    private String name;
    private String phone;
    private String company;
    private String eMail;

    public NameCard(String name, String phone, String company, String eMail) {
        this.name = name;
        this.phone = phone;
        this.company = company;
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}

