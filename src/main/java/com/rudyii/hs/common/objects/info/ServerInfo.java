package com.rudyii.hs.common.objects.info;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServerInfo {
    private int pid;
    private String serverAlias;
    private String serverVersion;
}
