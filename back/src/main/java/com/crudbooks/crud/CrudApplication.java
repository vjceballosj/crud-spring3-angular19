package com.crudbooks.crud;

import com.crudbooks.crud.entity.Tarea;
import com.crudbooks.crud.repository.TareaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

    @Bean
    public CommandLineRunner commandLineRunner(TareaRepository tareaRepository){
        return args -> {
            List<Tarea> tareasPrueba = Arrays.asList(
                    new Tarea("Aprender Java", true, LocalDateTime.now()),
                    new Tarea("Inscribirme al curso ValentoDev", false, LocalDateTime.now()),
                    new Tarea("Darle like a la página de Facebook", false, LocalDateTime.now()),
                    new Tarea("Suscribirme al canal de Youtube", true, LocalDateTime.now()),
                    new Tarea("Repasar el taller gratuito", false, LocalDateTime.now())
            );
            tareaRepository.saveAll(tareasPrueba);
        };
    }

}
