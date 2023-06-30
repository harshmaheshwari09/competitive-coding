package leetcode.java.problems.problem0841;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution solution = new Solution();
        List<List<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(1)));
        input.add(new ArrayList<>(List.of(2)));
        input.add(new ArrayList<>(List.of(3)));
        input.add(new ArrayList<>());
        Assertions.assertTrue(solution.canVisitAllRooms(input));
    }

    @Test
    public void testSolution2() {
        Solution solution = new Solution();
        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(new ArrayList<>(List.of(10, 35, 25, 33)));
        listOfLists.add(new ArrayList<>());
        listOfLists.add(new ArrayList<>(List.of(47, 27)));
        listOfLists.add(new ArrayList<>(List.of(23, 3, 28, 39)));
        listOfLists.add(new ArrayList<>(List.of(36, 41, 10, 24)));
        listOfLists.add(new ArrayList<>(List.of(14, 40, 42, 44)));
        listOfLists.add(new ArrayList<>(List.of(41, 35)));
        listOfLists.add(new ArrayList<>(List.of(48)));
        listOfLists.add(new ArrayList<>(List.of(24, 26, 44, 23, 11, 17)));
        listOfLists.add(new ArrayList<>(List.of(1, 17, 20, 30)));
        listOfLists.add(new ArrayList<>());
        listOfLists.add(new ArrayList<>(List.of(38, 39, 44)));
        listOfLists.add(new ArrayList<>());
        listOfLists.add(new ArrayList<>(List.of(11, 21, 45, 13)));
        listOfLists.add(new ArrayList<>(List.of(1, 27, 14, 19)));
        listOfLists.add(new ArrayList<>(List.of(23)));
        listOfLists.add(new ArrayList<>(List.of(30, 21, 8, 22, 40)));
        listOfLists.add(new ArrayList<>(List.of(14, 48)));
        listOfLists.add(new ArrayList<>(List.of(32, 6)));
        listOfLists.add(new ArrayList<>(List.of(5, 15, 26, 34, 38)));
        listOfLists.add(new ArrayList<>(List.of(43, 25)));
        listOfLists.add(new ArrayList<>(List.of(18, 10, 33)));
        listOfLists.add(new ArrayList<>(List.of(15, 34, 9)));
        listOfLists.add(new ArrayList<>(List.of(18, 46, 48, 7, 13)));
        listOfLists.add(new ArrayList<>(List.of(5, 29, 4)));
        listOfLists.add(new ArrayList<>(List.of(42, 34)));
        listOfLists.add(new ArrayList<>(List.of(7, 13, 37, 8, 15, 21)));
        listOfLists.add(new ArrayList<>(List.of(4, 5)));
        listOfLists.add(new ArrayList<>(List.of(38, 20, 42)));
        listOfLists.add(new ArrayList<>(List.of(16, 19, 47)));
        listOfLists.add(new ArrayList<>(List.of(8, 29)));
        listOfLists.add(new ArrayList<>(List.of(28, 33, 37, 49)));
        listOfLists.add(new ArrayList<>(List.of(9, 39, 49, 41)));
        listOfLists.add(new ArrayList<>(List.of(31, 12, 26, 32)));
        listOfLists.add(new ArrayList<>(List.of(2, 40, 32, 46)));
        listOfLists.add(new ArrayList<>(List.of(27, 22)));
        listOfLists.add(new ArrayList<>(List.of(12, 37, 2)));
        listOfLists.add(new ArrayList<>(List.of(31, 1)));
        listOfLists.add(new ArrayList<>(List.of(46, 19, 16, 18, 30)));
        listOfLists.add(new ArrayList<>(List.of(35)));
        listOfLists.add(new ArrayList<>(List.of(6, 3, 7, 28, 43)));
        listOfLists.add(new ArrayList<>(List.of(4, 25, 2, 29)));
        listOfLists.add(new ArrayList<>());
        listOfLists.add(new ArrayList<>(List.of(22, 24, 45, 12)));
        listOfLists.add(new ArrayList<>(List.of(36, 31)));
        listOfLists.add(new ArrayList<>(List.of(3, 36, 45)));
        listOfLists.add(new ArrayList<>(List.of(20, 43, 49)));
        listOfLists.add(new ArrayList<>(List.of(11)));
        listOfLists.add(new ArrayList<>(List.of(16, 6)));
        listOfLists.add(new ArrayList<>(List.of(17, 47)));
        Assertions.assertTrue(solution.canVisitAllRooms(listOfLists));
    }

    /*
    *
    * [[],[],[47,27],[23,3,28,39],[36,41,10,24],[14,40,42,44],[41,35],[48],[24,26,44,23,11,17],[1,17,20,30],[],[38,39,44],[],[11,21,45,13],[1,27,14,19],[23],[30,21,8,22,40],[14,48],[32,6],[5,15,26,34,38],[43,25],[18,10,33],[15,34,9],[18,46,48,7,13],[5,29,4],[42,34],[7,13,37,8,15,21],[4,5],[38,20,42],[16,19,47],[8,29],[28,33,37,49],[9,39,49,41],[31,12,26,32],[2,40,32,46],[27,22],[12,37,2],[31,1],[46,19,16,18,30],[35],[6,3,7,28,43],[4,25,2,29],[],[22,24,45,12],[36,31],[3,36,45],[20,43,49],[11],[16,6],[17,47]]
    * */
}
