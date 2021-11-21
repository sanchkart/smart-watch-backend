package com.ing.smartwatch.backend.event.handler;

import com.ing.smartwatch.backend.event.Channels;
import com.ing.smartwatch.backend.event.model.Activity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(Channels.class)
public class HeartRateHandler {

    private static final Logger logger = LoggerFactory.getLogger(HeartRateHandler.class);

    @StreamListener("inboundHeartRate")
    public void loggerSink(Activity activity) {
        logger.debug("[Smart Watch Backend] Received a message with BPM: " + activity.getBpm());
    }
}
