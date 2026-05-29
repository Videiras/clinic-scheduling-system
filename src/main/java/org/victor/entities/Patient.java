package org.victor.entities;

public class Patient {

    private String name;
    private String cpf;
    private String cellphone;
    private String email;

    public Patient(String name, String cpf, String cellphone, String email){
        this.name=name;
        this.cpf=cpf;
        this.cellphone=cellphone;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
