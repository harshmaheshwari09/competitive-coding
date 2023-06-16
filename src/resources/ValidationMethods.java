package resources;

import org.junit.jupiter.api.Assertions;

import java.util.List;

public class ValidationMethods {
    public static void validateMatrices(int[][] expected, int[][] actual) {
        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual[0].length; j++) {
                Assertions.assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }

    public static void validateList(List<Integer> expected, List<Integer> actual) {
        Assertions.assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            Assertions.assertEquals(expected.get(i), actual.get(i));
        }
    }

    public static void validateListOfList(List<List<Integer>> expected, List<List<Integer>> actual) {
        Assertions.assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            Assertions.assertEquals(expected.get(i).size(), actual.get(i).size());
            for (int j = 0; j < expected.get(i).size(); j++) {
                Assertions.assertEquals(expected.get(i).get(j), actual.get(i).get(j));
            }
        }
    }
}
