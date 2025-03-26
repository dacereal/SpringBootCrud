package dapanas.caryl.midterms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import dapanas.caryl.midterms.course.Course;
import dapanas.caryl.midterms.service.CourseService;

import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService service;

    @GetMapping
    public String listCourse(Model model) {
        List<Course> courses = service.getAllCourses();
        model.addAttribute("course", employees);
        return "index";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("course", new Course());
        return "create";
    }

    @PostMapping
    public String saveEmployee(@ModelAttribute Course course) {
        service.saveCourse(course);
        return "redirect:/course";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("course", service.getCourseId(id));
        return "edit";
    }

    @PostMapping("/{id}")
    public String updateEmployee(@PathVariable Long id, @ModelAttribute Course course) {
    	course.setId(id);
        service.saveCourse(course);
        return "redirect:/course";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        service.deleteCourse(id);
        return "redirect:/course";
    }
}

