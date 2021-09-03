package com.rudyii.hs.common.objects.info;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WanInfo {
    private String isp;
    private String wanIp;
}
