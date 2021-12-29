package com.rudyii.hs.common.objects.settings;

import com.rudyii.hs.common.type.MonitoringModeType;
import lombok.*;

@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class CameraSettings {
    @Builder.Default
    private MonitoringModeType monitoringMode = MonitoringModeType.AUTO;
    @Builder.Default
    private boolean healthCheckEnabled = true;
    private boolean showMotionObject;
    @Builder.Default
    private int intervalMs = 500;
    @Builder.Default
    private int motionAreaPercent = 20;
    @Builder.Default
    private int rebootTimeoutSec = 60;
    private int noiseLevel;
    @Builder.Default
    private int recordLengthSec = 5;
}
