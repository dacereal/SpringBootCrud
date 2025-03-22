package dapanas.caryl.midterms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dapanas.caryl.midterms.course.Course;

import java.util.List;
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);
    List<Course> findByCategory(String category);
}

