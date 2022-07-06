package com.codedifferently.problems;

import java.util.ArrayList;

public class Problem02 {
    public static Integer cousinTag(ArrayList<String> cousins, Integer startIndex, String targetName){
        int tagGapRight = 0;
        int tagGapLeft = 0;
        int targetIndex = cousins.indexOf(targetName);

        tagGapLeft = startIndex - targetIndex;
        tagGapRight = ((cousins.size() - 1) - startIndex) + (targetIndex + 1);
        tagGapLeft = Math.abs(tagGapLeft);
        tagGapRight = Math.abs(tagGapRight);

        if (tagGapLeft < tagGapRight) {
            return tagGapLeft;
        }else
            return tagGapRight;
    }
}
