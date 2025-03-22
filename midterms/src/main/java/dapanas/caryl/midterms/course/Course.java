package dapanas.caryl.midterms.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    private Long id;

    private String name;
    private String author;
    private String category;

    public Course() {}

    public Course(Long id, String name, String author, String category) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    
    public String getCategory() { return category; }
    public void setCategory(String category) {this.category = category; }

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", author=" + author + ", category=" + category + "]";
    }

}

