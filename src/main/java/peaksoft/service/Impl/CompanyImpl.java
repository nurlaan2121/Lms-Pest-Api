package peaksoft.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.repository.CompanyRepo;
import peaksoft.service.CompanyService;
@Service
@RequiredArgsConstructor
public class CompanyImpl implements CompanyService {
    private final CompanyRepo companyRepo;
}
