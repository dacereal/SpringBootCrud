package dapanas.caryl.midterms.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    private Long id;

    private String name;
    private String section;
    private String courses;

    public Course() {}

    public Course(Long id, String name, String section, String courses) {
        this.id = id;
        this.name = name;
        this.section = section;
        this.courses = courses;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSection() { return section; }
    public void setSection(String section) { this.section = section; }
    
    public String getCourses() { return courses; }
    public void setCourses(String courses) {this.courses = courses; }

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", section=" + section + ", courses=" + courses + "]";
    }

}

