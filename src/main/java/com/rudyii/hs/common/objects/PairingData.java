package com.rudyii.hs.common.objects;

import lombok.*;

@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PairingData {
    private String serverAlias;
    private String serverKey;
    private String serverIp;
    private Integer serverPort;
}
