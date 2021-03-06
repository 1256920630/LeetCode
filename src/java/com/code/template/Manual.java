package com.code.template;

import com.code.LeetCode;

import java.util.Arrays;
import java.util.List;

public class Manual extends LeetCode {
    @Override
    public List<String> char2String(char c) {
        List<String> characters = null;
        switch (c) {
            case '1':
                characters = Arrays.asList("");
                break;
            case '2':
                characters = Arrays.asList("a", "b", "c");
                break;
            case '3':
                characters = Arrays.asList("d", "e", "f");
                break;
            case '4':
                characters = Arrays.asList("g", "h", "i");
                break;
            case '5':
                characters = Arrays.asList("j", "k", "l");
                break;
            case '6':
                characters = Arrays.asList("m", "n", "o");
                break;
            case '7':
                characters = Arrays.asList("p", "q", "r", "s");
                break;
            case '8':
                characters = Arrays.asList("t", "u", "v");
                break;
            case '9':
                characters = Arrays.asList("w", "x", "y", "z");
                break;
        }
        return characters;
    }
}
