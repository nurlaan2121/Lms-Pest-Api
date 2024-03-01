package peaksoft.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.repository.StudentRepo;
import peaksoft.service.StudentService;
@Service
@RequiredArgsConstructor

public class StudentImpl implements StudentService {
    private final StudentRepo studentRepo;
}
