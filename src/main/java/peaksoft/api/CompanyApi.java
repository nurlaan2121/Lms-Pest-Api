package peaksoft.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peaksoft.service.CompanyService;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class CompanyApi {
    private final CompanyService companyService;
}
