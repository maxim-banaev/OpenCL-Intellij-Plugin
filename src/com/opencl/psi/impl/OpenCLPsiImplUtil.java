package com.opencl.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.*;
import com.opencl.OpenCLIcons;
import com.opencl.psi.*;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class OpenCLPsiImplUtil {
    public static String getKey(OpenCLProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(OpenCLTypes.KEY);
        if (keyNode != null) {
            // IMPORTANT: Convert embedded escaped spaces to simple spaces
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

    public static String getValue(OpenCLProperty element) {
        ASTNode valueNode = element.getNode().findChildByType(OpenCLTypes.VALUE);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }
}