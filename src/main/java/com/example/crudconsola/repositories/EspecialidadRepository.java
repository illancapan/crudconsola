package com.example.crudconsola.repositories;

import com.example.crudconsola.entities.Especialidad;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EspecialidadRepository extends
        CrudRepository<Especialidad, Integer> {
    @Query("select e from Especialidad e")
    public List<Especialidad> getEspecialidades();


    //select * from especialidad where id_espedialidad =5

    @Query("select esp from Espedialidad esp where esp.id_especialidad in ?1 ")
    public Optional<Especialidad> getEspecialidadPorId(Integer id);

}