package com.opencl;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.*;
import org.jetbrains.annotations.*;

import javax.swing.*;
import java.util.Map;

public class OpenCLColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Key", OpenCLSyntaxHighlighter.KEY),
            new AttributesDescriptor("Separator", OpenCLSyntaxHighlighter.SEPARATOR),
            new AttributesDescriptor("Value", OpenCLSyntaxHighlighter.VALUE),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return OpenCLIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new OpenCLSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "__kernel void VectorAdd(__global const float* a, __global const float* b, __global float* c, int iNumElements)\n" +
                "{\n" +
                "  // get index into global data array\n" +
                "  int iGID = get_global_id(0);\n" +
                "\n" +
                "  // bound check (equivalent to the limit on a 'for' loop for standard/serial C code\n" +
                "  if (iGID >= iNumElements)\n" +
                "  {  \n" +
                "    return; \n" +
                "  }\n" +
                "  \n" +
                "  // add the vector elements\n" +
                "  c[iGID] = a[iGID] + b[iGID];\n" +
                "}\n";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "OpenCL";
    }
}