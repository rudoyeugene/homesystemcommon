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
public class VideoUploadedMessage extends MessageBase{
    private String videoUrl;
    private String cameraName;
    private String fileName;
}
