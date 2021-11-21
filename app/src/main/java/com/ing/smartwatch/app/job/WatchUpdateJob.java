package com.ing.smartwatch.app.job;

import com.ing.smartwatch.app.event.PublisherSourceBean;
import com.ing.smartwatch.app.model.Activity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class WatchUpdateJob {
    private final Random random;
    private final PublisherSourceBean publisherSourceBean;

    private Integer high = 220;

    private Integer low = 50;

    public WatchUpdateJob(PublisherSourceBean publisherSourceBean) {
        random = new Random();
        this.publisherSourceBean = publisherSourceBean;
    }

    @Scheduled(fixedDelay = 5000)
    public void scheduleWatchUpdate() {
        int result = random.nextInt(high - low) + low;
        publisherSourceBean.publishHeartRate(Activity.builder().bpm(result).build());
    }
}
