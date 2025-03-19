package org.setFrame.map;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String document = "this is a sample document. this document contains many words. Some words repeat, some are unique.";

        HashMap<String, Integer> wordCountMap = new HashMap<>();

        String[] words = document.split("[\\s\\p{Punct}]+");

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        // 打印结果
        for (Map.Entry<String ,Integer> entry : wordCountMap.entrySet()) {
            System.out.println("单词 '" + entry.getKey() + "'出现了" + entry.getValue() + "次");
        }
    }
}
