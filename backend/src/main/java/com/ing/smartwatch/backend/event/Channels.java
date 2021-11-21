package com.ing.smartwatch.backend.event;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Channels {
    @Input("inboundHeartRate")
    SubscribableChannel bpms();
}
