package org.victor.entities;

import org.victor.entities.enums.Specialities;

import java.util.List;

public class Employee {

    private String name;
    private List<Specialities> specialities;
    private String professionalRegistration;

    public Employee(String name, List<Specialities> specialities, String professionalRegistration) {
        this.name = name;
        this.specialities = specialities;
        this.professionalRegistration = professionalRegistration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Specialities> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(List<Specialities> specialities) {
        this.specialities = specialities;
    }

    public String getProfessionalRegistration() {
        return professionalRegistration;
    }

    public void setProfessionalRegistration(String professionalRegistration) {
        this.professionalRegistration = professionalRegistration;
    }
}
