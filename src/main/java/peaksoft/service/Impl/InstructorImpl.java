package peaksoft.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.repository.InstructorRepo;
import peaksoft.service.InstructorService;
@Service
@RequiredArgsConstructor

public class InstructorImpl implements InstructorService {
    private final InstructorRepo instructorRepo;
}
