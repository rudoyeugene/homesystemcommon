package com.rudyii.hs.common.objects.settings;

import lombok.*;

@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class GlobalSettings {
    private boolean showMotionArea;
    @Builder.Default
    private boolean hourlyReportEnabled = true;
    private boolean hourlyReportForced;
    @Builder.Default
    private boolean monitoringEnabled = true;
    private boolean verboseOutput;
    @Builder.Default
    private boolean gatherStats = true;
    @Builder.Default
    private int historyDays = 14;
    @Builder.Default
    private int delayedArmTimeoutSec = 60;
    @Builder.Default
    private int masterCheckPeriodIfArmedSec = 60;
    @Builder.Default
    private int masterCheckPeriodIfDisarmedSec = 60;
}
