package com.rudyii.hs.common.objects.message;

import com.rudyii.hs.common.type.SystemModeType;
import com.rudyii.hs.common.type.SystemStateType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class StateChangedMessage extends MessageBase{
    private SystemModeType systemMode;
    private SystemStateType systemState;
}
