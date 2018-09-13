package com.opencl;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;

import javax.swing.*;


public class OpenCLFileType extends LanguageFileType {
    public static final OpenCLFileType INSTANCE = new OpenCLFileType();

    private OpenCLFileType() {
        super(OpenCL.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "OpenCL file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "OpenCL kernel file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "cl";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return OpenCLIcons.FILE;
    }
}
