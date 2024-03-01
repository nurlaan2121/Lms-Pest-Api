package peaksoft.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peaksoft.service.CourseService;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class CourseApi {
    private final CourseService courseService;
}
