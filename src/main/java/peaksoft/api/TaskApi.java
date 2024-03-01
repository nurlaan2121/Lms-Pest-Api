package peaksoft.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peaksoft.service.TaskService;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class TaskApi {
    private final TaskService taskService;
}
