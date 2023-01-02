package com.solvd.cafe.tasks;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    public static void fileUtils() throws IOException {

        String pathAllText = "src\\main\\resources\\allText.txt";
        String pathNewText = "src\\main\\resources\\newText.txt";
        File allText = new File(pathAllText);
        File newText = new File(pathNewText);

        String string = org.apache.commons.io.FileUtils.readFileToString(allText, StandardCharsets.UTF_8);
        String substring = StringUtils.substring(string, 1);
        int wordJava = StringUtils.countMatches(substring, "Java");
        int wordName = StringUtils.countMatches(substring, "name");
        int wordOne = StringUtils.countMatches(substring, "one");

        List<String> listWords = new ArrayList<>();
        listWords.add("Java - " + wordJava + "\n" + "one - " + wordOne + "\n" + "name - " + wordName);
        org.apache.commons.io.FileUtils.writeLines(newText, listWords);
    }
}
