import Analysis.BloodAnalysis;
import Laboratory.Laboratory;
import Patients.Patient;
import Analysis.UrineAnalysis;

public class Main
{
    public static void main(String[] args)
    {
        BloodAnalysis bloodAnalysis = new BloodAnalysis("1", "first", "o");
        UrineAnalysis urineAnalysis = new UrineAnalysis("2", "second", "Green");
        Patient patient = new Patient("Khabib", 33, "Man");
        Laboratory laboratory = new Laboratory("abc");
        System.out.println(bloodAnalysis);
        System.out.println(urineAnalysis);
        System.out.println(patient);
        System.out.println(laboratory);
        laboratory.addAnalysis(bloodAnalysis);
        System.out.println(laboratory);
        patient.addAnalysis(urineAnalysis);
        System.out.println(patient.getAnalyses());
    }
}