package peaksoft.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peaksoft.service.InstructorService;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class InstructorApi {
    private final InstructorService instructorService;
}
