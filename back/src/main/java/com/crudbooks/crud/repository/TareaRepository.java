package com.crudbooks.crud.repository;

import com.crudbooks.crud.entity.Tarea;
import org.springframework.data.repository.CrudRepository;

public interface TareaRepository extends CrudRepository<Tarea, Integer> {
}
