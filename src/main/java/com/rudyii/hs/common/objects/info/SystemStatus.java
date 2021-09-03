package com.rudyii.hs.common.objects.info;

import com.rudyii.hs.common.objects.type.SystemModeType;
import com.rudyii.hs.common.objects.type.SystemStateType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SystemStatus {
    private SystemModeType systemMode;
    private SystemStateType systemState;
    private long timestamp;
}
