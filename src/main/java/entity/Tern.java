package entity;

import java.util.ArrayList;
import java.util.Objects;

public class Tern {

    private int id;
    private String tern;
    private String duration;
    private ArrayList<Discipline> disciplines = new ArrayList<>();

    public Tern() {
    }

    public Tern(int id, String tern, String duration, ArrayList<Discipline> disciplines) {
        this.id = id;
        this.tern = tern;
        this.duration = duration;
        this.disciplines = disciplines;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTern() {
        return tern;
    }

    public void setTern(String tern) {
        this.tern = tern;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public ArrayList<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(ArrayList<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tern tern1 = (Tern) o;
        return id == tern1.id && Objects.equals(tern, tern1.tern) && Objects.equals(duration, tern1.duration) && Objects.equals(disciplines, tern1.disciplines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tern, duration, disciplines);
    }

    @Override
    public String toString() {
        return "Tern{" +
                "id=" + id +
                ", tern='" + tern + '\'' +
                ", duration='" + duration + '\'' +
                ", disciplines=" + disciplines +
                '}';
    }
}
