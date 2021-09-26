package com.rudyii.hs.common.objects.message;

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
public class MotionDetectedMessage extends MessageBase{
    private String imageUrl;
    private String cameraName;
    private int motionArea;
}
