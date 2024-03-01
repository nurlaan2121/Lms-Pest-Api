package peaksoft.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peaksoft.service.StudentService;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class StudentApi {
    private final StudentService studentService;
}
