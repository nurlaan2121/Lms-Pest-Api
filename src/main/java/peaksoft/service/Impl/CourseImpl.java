package peaksoft.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.repository.CourseRepo;
import peaksoft.service.CourseService;
@Service
@RequiredArgsConstructor

public class CourseImpl implements CourseService {
    private final CourseRepo courseRepo;
}
