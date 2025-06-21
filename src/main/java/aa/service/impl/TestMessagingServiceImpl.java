package aa.service.impl;

import aa.dto.TestDTO;
import aa.service.TestMessagingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@Service
public class TestMessagingServiceImpl implements TestMessagingService {

    private final JmsTemplate jmsTemplate;

    @Override
    public void sendMessage(final TestDTO testDTO) {
        testDTO.setRandomId(UUID.randomUUID().toString());
        log.info("sendMessage----->{}", testDTO);
//        jmsTemplate.send("test.test", session -> session.createObjectMessage(testDTO)); //to destination by name
//        jmsTemplate.send(session -> session.createObjectMessage(testDTO)); //to default destination: spring.jms.template.default-destination
        jmsTemplate.convertAndSend(testDTO);
    }
}
