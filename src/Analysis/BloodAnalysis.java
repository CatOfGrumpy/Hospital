package Analysis;

public class BloodAnalysis extends Analysis {
    private String bloodType;

    public BloodAnalysis(String name, String description, String bloodType) {
        super(name, description);
        this.bloodType = bloodType;
    }
    public void setBloodType(String bloodType){
        this.bloodType = bloodType;
    }
    public String getBloodType() {
        return bloodType;
    }

    public void performAnalysis() {
        System.out.println("Performing blood analysis...");
    }

    @Override
    public String toString() {
        return super.toString() + ", Blood Type: " + bloodType;
    }
}