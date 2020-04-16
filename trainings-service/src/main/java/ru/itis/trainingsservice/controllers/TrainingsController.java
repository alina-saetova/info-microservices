package ru.itis.trainingsservice.controllers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.trainingsservice.model.Training;
import ru.itis.trainingsservice.services.TrainingsService;

import java.util.List;

@RestController
@Slf4j
public class TrainingsController {

    @Autowired
    private TrainingsService trainingsService;

    @GetMapping("/trainings")
    public List<Training> getTrainings() {
        log.info("Get request");
        return trainingsService.getAll();
    }
}
