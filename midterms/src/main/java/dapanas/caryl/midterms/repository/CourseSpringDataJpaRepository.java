package dapanas.caryl.midterms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dapanas.caryl.midterms.course.Course;

import java.util.List;
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    List<Course> findBySection(String section);
    List<Course> findByName(String name);
    List<Course> findByCourses(String courses);
}

