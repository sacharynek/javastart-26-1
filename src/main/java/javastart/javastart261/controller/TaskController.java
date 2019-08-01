package javastart.javastart261.controller;

import javastart.javastart261.model.Category;
import javastart.javastart261.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TaskController {

    private List<Task> tasks;

    public TaskController() {
        tasks = new ArrayList<>();
        tasks.add(new Task(0, "pierwszy task", Category.HOUSEHOLD, true, false));
        tasks.add(new Task(1, "drugi task", Category.PRIVATE, false, true));
    }

    //wszystkie
    @GetMapping("/")
    public String displayAll(Model model) {

        model.addAttribute("tasks", tasks);

        return "index";
    }

    //todos czyli nie archivet
    @GetMapping("/todos")
    public String displayTodos(Model model) {

        model.addAttribute("tasks", tasks);

        return "index";
    }

    //archived czyli nie todos
    @GetMapping("/archive")
    public String displayArchived(Model model) {

        model.addAttribute("tasks", tasks);

        return "index";
    }

    @GetMapping("/add")
    public String add(Model model) {

        model.addAttribute("task", tasks.get(0));
        return "Add";
    }

    @RequestMapping("/addTask")
    public String addProduct(
            @RequestParam() String description,
            @RequestParam() String category,
            @RequestParam(required = false) String isReady,
            @RequestParam(required = false) String isArchive) {
        Task task = new Task();
        task.setDescription(description);
        task.setCategory(Category.valueOf(category));
        task.setReady(null != isReady);
        task.setArchived(null != isArchive);

        tasks.add(task);

        return "redirect:/";
    }

    @GetMapping("/Details/{id}")
    public String modify(Model model, @PathVariable(value = "id") int id) {

        model.addAttribute("task", tasks.get(id));

        return "modify";
    }


    @RequestMapping("/Update/{id}")
    public String update(
            @PathVariable(value = "id") int id,
            @RequestParam() String category,
            @RequestParam() String description,
            @RequestParam(required = false) String isReady,
            @RequestParam(required = false) String isArchive) {

        Task task = tasks.get(id);

        task.setDescription(description);
        task.setCategory(Category.valueOf(category));
        task.setReady(null != isReady);
        task.setArchived(null != isArchive);

        return "redirect:/";
    }


}
