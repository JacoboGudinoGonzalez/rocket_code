package com.rocket.code.rocketcode.controller;

import com.rocket.code.rocketcode.mapper.TaskMapper;
import com.rocket.code.rocketcode.model.Task;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import static com.rocket.code.rocketcode.constants.Constants.*;

@Controller
@RequiredArgsConstructor
public class TaskController {

    private final TaskMapper taskMapper;

    @GetMapping(TASKS_PATH)
    public String index(Model model) {
        model.addAttribute(TASKS, taskMapper.findAll());
        return INDEX;
    }

    @PostMapping(TASKS_PATH)
    public String create(@Valid Task task, BindingResult result) {
        if(result.hasErrors()){
            return ADD;
        }
        taskMapper.insert(task);
        return REDIRECT_TASKS;
    }

    @GetMapping(TASKS_NEW)
    public String add(Model model) {
        model.addAttribute(TASK, new Task());
        return ADD;
    }

    @GetMapping(TASKS_EDIT+ID)
    public String edit(@PathVariable long id, Model model) {
        model.addAttribute(TASK, taskMapper.findById(id));
        return EDIT;
    }

    @PostMapping(TASKS_UPDATE)
    public String update(@Valid Task task) {
        taskMapper.update(task);
        return REDIRECT_TASKS;
    }

    @GetMapping(TASKS_DELETE+ID)
    public String delete(@PathVariable long id) {
        taskMapper.delete(id);
        return REDIRECT_TASKS;
    }
}
