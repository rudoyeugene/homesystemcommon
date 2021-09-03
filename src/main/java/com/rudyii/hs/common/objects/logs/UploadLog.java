package com.rudyii.hs.common.objects.logs;

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
public class UploadLog extends LogBase{
    private String videoUrl;
    private String fileName;
    private String cameraName;
}
