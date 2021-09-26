package com.rudyii.hs.common.objects.logs;

import com.rudyii.hs.common.type.LogType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class LogBase {
    private long eventId;
    private LogType logType;
}
