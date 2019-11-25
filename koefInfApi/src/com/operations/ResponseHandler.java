

package com.operations;

import java.util.Map;

public class ResponseHandler {
    public static String getJSON(Map<String, String> answer) {
        String result = "{";
        for (Map.Entry tmp : answer.entrySet()) {
            String val = tmp.getValue().toString();

            result += "\"" + tmp.getKey() + "\": \"" + val + "\", ";
        }
        result = result.substring(0, result.length() - 2) + "}";
        return result;
    }
}

