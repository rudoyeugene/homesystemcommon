package com.rudyii.hs.common.objects.settings;

import lombok.*;

@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class GlobalSettings {
    private boolean showMotionArea;
    private boolean hourlyReportEnabled;
    private boolean hourlyReportForced;
    private boolean monitoringEnabled;
    private boolean verboseOutput;
    private boolean gatherStats;
    private int historyDays;
    private int delayedArmTimeout;
}
