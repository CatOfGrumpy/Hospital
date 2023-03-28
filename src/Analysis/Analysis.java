package Analysis;

import java.util.Objects;

public abstract class Analysis {
    private String name;
    private String description;

    public Analysis(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Description: " + description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Analysis)) return false;
        Analysis analysis = (Analysis) o;
        return Objects.equals(name, analysis.name) && Objects.equals(description, analysis.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}