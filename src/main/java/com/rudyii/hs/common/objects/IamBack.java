package com.rudyii.hs.common.objects;

import lombok.*;

@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class IamBack {
    private String serverKey;
    private String email;
}
