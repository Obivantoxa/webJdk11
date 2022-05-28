package entity;

import java.util.Objects;

public class Mark {

    private int id;
    private int mark;
    private Student student;
    private Tern tern;
    private Discipline discipline;

    public Mark() {
    }

    public Mark(int id, int mark, Student student, Tern tern, Discipline discipline) {
        this.id = id;
        this.mark = mark;
        this.student = student;
        this.tern = tern;
        this.discipline = discipline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Tern getTern() {
        return tern;
    }

    public void setTern(Tern tern) {
        this.tern = tern;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mark mark1 = (Mark) o;
        return id == mark1.id && mark == mark1.mark && Objects.equals(student, mark1.student) && Objects.equals(tern, mark1.tern) && Objects.equals(discipline, mark1.discipline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mark, student, tern, discipline);
    }

    @Override
    public String toString() {
        return "Mark{" +
                "id=" + id +
                ", mark=" + mark +
                ", student=" + student +
                ", tern=" + tern +
                ", discipline=" + discipline +
                '}';
    }
}
