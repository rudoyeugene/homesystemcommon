package com.rudyii.hs.common.objects;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PairingData {
    private String serverAlias;
    private String serverKey;
    private String serverIp;
    private Integer serverPort;
}
