package de.dennisguse.opentracks.sensors.sensorData;

import androidx.annotation.NonNull;

import de.dennisguse.opentracks.data.models.HeartRate;

public class AggregatorHeartRate extends Aggregator<HeartRate, HeartRate> {

    public AggregatorHeartRate(String address) {
        super(address);
    }

    public AggregatorHeartRate(String name, String address) {
        super(name, address);
    }

    @Override
    protected void computeValue(Raw<HeartRate> current) {
        this.value = current.value();
    }

    @NonNull
    @Override
    protected HeartRate getNoneValue() {
        return HeartRate.of(0);
    }
}
