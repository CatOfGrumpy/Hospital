package Laboratory;
import Analysis.Analysis;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Laboratory<T extends Analysis> {
    private String name;
    private List<T> analyses;

    public Laboratory(String name) {
        this.name = name;
        this.analyses = new ArrayList<>();
    }
    public void setName(){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public List<T> getAnalyses() {
        return analyses;
    }

    public void addAnalysis(T analysis) {
        analyses.add(analysis);
    }

    public void removeAnalysis(T analysis) {
        analyses.remove(analysis);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Laboratory Name: ").append(name).append("\n");
        for (T analysis : analyses) {
            sb.append(analysis.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laboratory)) return false;
        Laboratory<?> that = (Laboratory<?>) o;
        return Objects.equals(name, that.name) && Objects.equals(analyses, that.analyses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, analyses);
    }
}