package peaksoft.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peaksoft.service.GroupService;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class GroupApi {
    private final GroupService groupService;
}
