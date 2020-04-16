package ru.itis.trainingsservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.trainingsservice.model.Training;
import ru.itis.trainingsservice.repository.TrainingsRepository;

import java.util.List;

@Service
public class TrainingsServiceImpl implements TrainingsService {

    @Autowired
    private TrainingsRepository trainingsRepository;

    @Override
    public List<Training> getAll() {
        return trainingsRepository.findAll();
    }
}
