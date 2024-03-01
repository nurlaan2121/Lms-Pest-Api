package peaksoft.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.repository.LessonRepo;
import peaksoft.service.LessonService;
@Service
@RequiredArgsConstructor

public class LessonImpl implements LessonService {
    private final LessonRepo lessonRepo;
}
