package aa.web.rest;

import aa.dto.TestDTO;
import aa.service.TestMessagingService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/test")
public class TestResource {

    private final TestMessagingService testMessagingService;

    @PostMapping
    public void sendMessage(final @RequestBody @Valid TestDTO request) {
        testMessagingService.sendMessage(request);
    }
}
