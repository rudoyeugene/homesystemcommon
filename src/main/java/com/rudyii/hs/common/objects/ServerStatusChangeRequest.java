package com.rudyii.hs.common.objects;

import com.rudyii.hs.common.objects.type.SystemModeType;
import com.rudyii.hs.common.objects.type.SystemStateType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ServerStatusChangeRequest {
    private SystemModeType systemMode;
    private SystemStateType systemState;
    private String by;
}
