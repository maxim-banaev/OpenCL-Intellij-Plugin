package com.opencl;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.*;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;
import com.opencl.psi.*;

import java.util.*;

public class OpenCLUtil {
    public static List<OpenCLProperty> findProperties(Project project, String key) {
        List<OpenCLProperty> result = null;
        Collection<VirtualFile> virtualFiles =
                FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, OpenCLFileType.INSTANCE,
                        GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            OpenCLFile simpleFile = (OpenCLFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                OpenCLProperty[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, OpenCLProperty.class);
                if (properties != null) {
                    for (OpenCLProperty property : properties) {
                        if (key.equals(property.getKey())) {
                            if (result == null) {
                                result = new ArrayList<OpenCLProperty>();
                            }
                            result.add(property);
                        }
                    }
                }
            }
        }
        return result != null ? result : Collections.<OpenCLProperty>emptyList();
    }

    public static List<OpenCLProperty> findProperties(Project project) {
        List<OpenCLProperty> result = new ArrayList<OpenCLProperty>();
        Collection<VirtualFile> virtualFiles =
                FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, OpenCLFileType.INSTANCE,
                        GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            OpenCLFile simpleFile = (OpenCLFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                OpenCLProperty[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, OpenCLProperty.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }
}