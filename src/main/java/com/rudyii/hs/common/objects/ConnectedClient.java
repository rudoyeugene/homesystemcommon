package com.rudyii.hs.common.objects;

import com.rudyii.hs.common.objects.type.NotificationType;
import lombok.*;

@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ConnectedClient {
    private String appVersion;
    private String device;
    private String email;
    private String token;
    private long lastRegistration;
    private boolean hourlyReportEnabled;
    private NotificationType notificationType;
}
