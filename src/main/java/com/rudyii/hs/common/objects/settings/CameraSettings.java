package com.rudyii.hs.common.objects.settings;

import lombok.*;

@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class CameraSettings {
    private boolean continuousMonitoring;
    private boolean healthCheckEnabled;
    private boolean showMotionObject;
    private int interval;
    private int motionArea;
    private int rebootTimeoutSec;
    private int noiseLevel;
    private int recordLength;
}
