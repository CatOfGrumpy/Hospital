package Patients;

import Analysis.Analysis;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Patient implements PatientInterface {
    private String name;
    private int age;
    private String gender;
    private List<Analysis> analyses;

    public Patient(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.analyses = new ArrayList<>();
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAne(int age){
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public ArrayList<Analysis> getAnalyses(){
        return (ArrayList<Analysis>) analyses;
    }

    @Override
    public void addAnalysis(Analysis analysis) {
        analyses.add(analysis);
    }

    @Override
    public void removeAnalysis(Analysis analysis) {
        analyses.remove(analysis);
    }

    @Override
    public String toString() {
        return "Patient: " + name + ", Age: " + age + ", Gender: " + gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient patient = (Patient) o;
        return age == patient.age &&
                Objects.equals(name, patient.name) &&
                Objects.equals(gender, patient.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}