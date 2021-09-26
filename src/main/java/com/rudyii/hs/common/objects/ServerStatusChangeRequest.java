package com.rudyii.hs.common.objects;

import com.rudyii.hs.common.type.SystemModeType;
import com.rudyii.hs.common.type.SystemStateType;
import lombok.*;

@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ServerStatusChangeRequest {
    private SystemModeType systemMode;
    private SystemStateType systemState;
    private String by;
}
