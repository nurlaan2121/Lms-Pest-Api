package peaksoft.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.repository.GroupRepo;
import peaksoft.service.GroupService;
@Service
@RequiredArgsConstructor

public class GroupImpl implements GroupService {
    private final GroupRepo groupRepo;
}
