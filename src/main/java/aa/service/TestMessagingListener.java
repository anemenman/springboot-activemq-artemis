package aa.service;

import aa.dto.TestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestMessagingListener {

    @JmsListener(destination = "aa.test.queue")
    public void receiveOrder(TestDTO testDTO) {
        log.info("Received: {}", testDTO);
    }
}
