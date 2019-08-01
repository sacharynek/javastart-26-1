package javastart.javastart261.controller;

import javastart.javastart261.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TaskController {


    public TaskController() {
    }

    @GetMapping("/")
    public String displayWithPaginationController(Model model) {
        List<Task> tasks = new ArrayList<>();
        model.addAttribute("tasks", tasks);

        return "index";
    }
}
