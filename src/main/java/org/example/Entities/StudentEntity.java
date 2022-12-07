package org.example.Entities;

import javax.persistence.*;

@Entity
@Table(name = "student", schema = "university", catalog = "")
public class StudentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    public int id;
    @Basic
    @Column(name = "first_name", nullable = false, length = 60)
    private String firstName;
    @Basic
    @Column(name = "last_name", nullable = false, length = 60)
    private String lastName;
    @Basic
    @Column(name = "student_condition", nullable = false, length = 40)
    private String studentCondition;
    @Basic
    @Column(name = "points", nullable = false, precision = 0)
    private double points;
    @Basic
    @Column(name = "birth_at", nullable = false)
    private int birthAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentCondition() {
        return studentCondition;
    }

    public void setStudentCondition(String studentCondition) {
        this.studentCondition = studentCondition;
    }

    public double getPoints() {
        return points;
    }

        public void setPoints(double points) {
        this.points = points;
    }

    public int getBirthAt() {
        return birthAt;
    }

    public void setBirthAt(int birthAt) {
        this.birthAt = birthAt;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentCondition='" + studentCondition + '\'' +
                ", points=" + points +
                ", birthAt=" + birthAt +
                '}';
    }
}
