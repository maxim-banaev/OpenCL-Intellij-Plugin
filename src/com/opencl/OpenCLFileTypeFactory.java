package com.opencl;

import com.intellij.openapi.fileTypes.*;
import org.jetbrains.annotations.NotNull;

public class OpenCLFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(OpenCLFileType.INSTANCE);
    }
}
