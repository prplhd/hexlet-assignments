package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
    public static String getForwardedVariables(String configStr) {
        var result = configStr.split("\n");
        return Arrays.stream(result)
                        .filter(str -> str.startsWith("environment="))
                        .map(str -> str.replace("environment=\"", "")
                                .replace("\"", ""))
                        .flatMap(str -> Arrays.stream(str.split(",")))
                        .filter(var -> var.startsWith("X_FORWARDED_"))
                        .map(var -> var.replaceAll("X_FORWARDED_", ""))
                        .collect(Collectors.joining(","));
    }
}
//END
