package ru.itis.trainingsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.trainingsservice.model.Training;

import java.util.List;

public interface TrainingsRepository extends JpaRepository<Training, Long> {

    List<Training> findAll();
}
