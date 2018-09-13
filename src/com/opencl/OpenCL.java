package com.opencl;

import com.intellij.lang.Language;

public class OpenCL extends Language {
    public static final OpenCL INSTANCE = new OpenCL();
    private OpenCL() {
        super("OpenCL");
    }
}

