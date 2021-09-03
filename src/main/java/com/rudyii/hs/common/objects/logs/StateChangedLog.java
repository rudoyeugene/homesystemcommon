package com.rudyii.hs.common.objects.logs;

import com.rudyii.hs.common.objects.type.SystemModeType;
import com.rudyii.hs.common.objects.type.SystemStateType;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class StateChangedLog extends LogBase {
    private SystemModeType systemMode;
    private SystemStateType systemState;
    private String by;
}
