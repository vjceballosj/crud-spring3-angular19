package com.crudbooks.crud.controller;

import com.crudbooks.crud.entity.Tarea;
import com.crudbooks.crud.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TareaController {

    @Autowired
    private TareaRepository tareaRepository;

    @GetMapping("/api/tareas")
    public Iterable<Tarea> listar(){
        return tareaRepository.findAll();
    }
}
