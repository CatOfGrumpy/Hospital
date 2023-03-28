package Analysis;

public class UrineAnalysis extends Analysis {
    private String urineColor;

    public UrineAnalysis(String name, String description, String urineColor) {
        super(name, description);
        this.urineColor = urineColor;
    }
    public void setUrineColor(String urineColor){
        this.urineColor = urineColor;
    }
    public String getUrineColor() {
        return urineColor;
    }

    public void performAnalysis() {
        System.out.println("Performing urine analysis...");
    }

    @Override
    public String toString() {
        return super.toString() + ", Urine Color: " + urineColor;
    }
}