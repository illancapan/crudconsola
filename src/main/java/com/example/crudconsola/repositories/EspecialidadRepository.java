package com.example.crudconsola.repositories;

import com.example.crudconsola.entities.Especialidad;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface EspecialidadRepository extends
        CrudRepository<Especialidad, Integer> {

    @Query("select e from Especialidad e")
    List<Especialidad> getEspecialidades();

    // Consulta para obtener una especialidad por su ID
    //@Query("select esp from Especialidad esp where esp.id_especialidad = :id")
    @Query("select esp from Especialidad esp where esp.id_especialidad in ?1 ")
    Optional<Especialidad> getEspecialidadPorId(@Param("id") Integer id);

}
