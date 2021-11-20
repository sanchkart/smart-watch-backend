package com.ing.smartwatch.event;

import com.ing.smartwatch.model.Activity;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.stereotype.Component;

@Component
public class PublisherSourceBean {
    private final Source source;

    private PublisherSourceBean(Source source) {
        this.source = source;
    }

    public void publishHeartRate(Activity activity) {
        source.output().send(MessageBuilder.withPayload(activity).build());
    }
}
