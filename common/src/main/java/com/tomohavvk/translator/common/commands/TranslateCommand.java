package com.tomohavvk.translator.common.commands;

import com.tomohavvk.translator.common.SnakeCase;
import com.tomohavvk.translator.common.models.Split;

import java.util.List;

public record TranslateCommand(String url, String sourceLanguage, String targetLanguage, List<String> filter,
        List<Split> split) implements SnakeCase {

}