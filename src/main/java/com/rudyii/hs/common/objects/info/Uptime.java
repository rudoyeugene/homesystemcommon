package com.rudyii.hs.common.objects.info;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Uptime {
    private long ping;
    private long uptime;
    private long currentSession;
}
