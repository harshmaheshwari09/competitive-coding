package resources;

import org.junit.jupiter.api.Assertions;

public class ValidationMethods {
    public static void validateMatrices(int[][] expected, int[][] actual) {
        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual[0].length; j++) {
                Assertions.assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }
}
