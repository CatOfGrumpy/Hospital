package Patients;
import Analysis.Analysis;

import java.util.List;

public interface PatientInterface {
    void addAnalysis(Analysis analysis);
    List<Analysis> getAnalyses();
    void removeAnalysis(Analysis analysis);
}
