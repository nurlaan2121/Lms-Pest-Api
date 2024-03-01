package peaksoft.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.repository.TaskRepo;
import peaksoft.service.TaskService;
@Service
@RequiredArgsConstructor

public class TaskImpl implements TaskService {
    private final TaskRepo taskRepo;
}
