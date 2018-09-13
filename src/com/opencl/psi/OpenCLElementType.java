package com.opencl.psi;

import com.intellij.psi.tree.IElementType;
import com.opencl.OpenCL;
import org.jetbrains.annotations.*;

public class OpenCLElementType extends IElementType {
    public OpenCLElementType(@NotNull @NonNls String debugName) {
        super(debugName, OpenCL.INSTANCE);
    }
}

