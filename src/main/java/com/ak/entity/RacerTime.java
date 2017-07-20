package com.ak.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

/**
 * Created by arthur on 7/11/17.
 */
@Embeddable
public class RacerTime {
    @Column(insertable = false, updatable = false)
    private LocalTime startTime;
    @Column(insertable = false, updatable = false)
    private LocalTime finishTime;
    @Column(insertable = false, updatable = false)
    private LocalTime result;

    public RacerTime() {
    }

    /**
     * @param startTime
     * @param finishTime
     */
    public RacerTime(LocalTime startTime, LocalTime finishTime) {
        this.startTime = startTime;
        this.finishTime = finishTime;
    }

    public void setResult(LocalTime result) {
        this.result = result;
    }

    public LocalTime getResult() {
        return result;
    }

    public LocalTime getCalculatedResult(){
        long millisBetween = ChronoUnit.MILLIS.between(startTime, finishTime);
        String result = String.format("%02d:%02d:%02d.%02d",
                TimeUnit.MILLISECONDS.toHours(millisBetween),
                TimeUnit.MILLISECONDS.toMinutes(millisBetween) -
                        TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millisBetween)), // The change is in this line
                TimeUnit.MILLISECONDS.toSeconds(millisBetween) -
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisBetween)),
                millisBetween % 1000);
        return LocalTime.parse(result);
    }
}
