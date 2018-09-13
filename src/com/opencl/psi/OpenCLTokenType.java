package com.opencl.psi;

import com.intellij.psi.tree.IElementType;
import com.opencl.OpenCL;
import org.jetbrains.annotations.*;

public class OpenCLTokenType extends IElementType {
    public OpenCLTokenType(@NotNull @NonNls String debugName) {
        super(debugName, OpenCL.INSTANCE);
    }

    @Override
    public String toString() {
        return "OpenCLTokenType." + super.toString();
    }
}