package com.ing.smartwatch.app.event;

import com.ing.smartwatch.app.model.Activity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.stereotype.Component;

@Component
public class PublisherSourceBean {
    private final Source source;
    private static final Logger logger = LoggerFactory.getLogger(PublisherSourceBean.class);

    private PublisherSourceBean(Source source) {
        this.source = source;
    }

    public void publishHeartRate(Activity activity) {
        logger.debug("[Smart Watch APP] Send a message with BPM: " + activity.getBpm());
        source.output().send(MessageBuilder.withPayload(activity).build());
    }
}
