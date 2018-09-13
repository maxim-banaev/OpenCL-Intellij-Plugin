package com.opencl.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.opencl.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class OpenCLFile extends PsiFileBase {
    public OpenCLFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, OpenCL.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return OpenCLFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "OpenCL File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
