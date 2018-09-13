package com.opencl;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class OpenCLLexerAdapter extends FlexAdapter {
    public OpenCLLexerAdapter() {
        super(new OpenCLLexer((Reader) null));
    }
}
