package xyz.kail.demo.spring.context.event.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import xyz.kail.demo.spring.context.event.event.StatusEvent;

/**
 * @since 4.2
 */
@Slf4j
@Component
public class StatusListener {

    @EventListener(condition = "#event.status eq 300")
    public void status300EventHandler(StatusEvent event) {
        log.info("status300EventHandler, source:{}", event.getSource());
    }

    @EventListener(condition = "#event.status eq 400")
    public void status400EventHandler(StatusEvent event) {
        log.info("status400EventHandler, source:{}", event.getSource());
    }

    @EventListener(condition = "#event.status eq 500")
    public void status500EventHandler(StatusEvent event) {
        log.info("status500EventHandler, source:{}", event.getSource());
    }
}
