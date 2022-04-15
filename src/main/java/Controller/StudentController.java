package Controller;

import Model.StudentModel;
import Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//controller le page render garni kam garxa
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/")
    //list ma pathako sab model ma gayera basxa
    public String homePage(Model model){
    List<StudentModel> students = studentService.getStudents();
    model.addAttribute("studentlist", students);
    return "index";
    }

    }
