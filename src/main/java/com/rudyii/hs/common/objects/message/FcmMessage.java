package com.rudyii.hs.common.objects.message;

import com.rudyii.hs.common.type.MessageType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FcmMessage {
    private long publishedAt;
    private String serverAlias;
    private String serverKey;
    private String by;
    private MessageType messageType;
}
