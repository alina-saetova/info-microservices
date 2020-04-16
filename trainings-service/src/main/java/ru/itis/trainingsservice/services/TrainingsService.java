package ru.itis.trainingsservice.services;

import ru.itis.trainingsservice.model.Training;

import java.util.List;

public interface TrainingsService {

    List<Training> getAll();
}
