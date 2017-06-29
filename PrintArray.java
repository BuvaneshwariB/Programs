import java.util.Arrays;

public class PrintArray {

    public static void main(String[] args) {

		// array
        String[] arrayStr = new String[]{"Java", "Node", "Python", "Ruby"};
        System.out.println(Arrays.toString(arrayStr));
        // Output : [Java, Node, Python, Ruby]

		int[] arrayInt = {1, 3, 5, 7, 9};
        System.out.println(Arrays.toString(arrayInt));
        // Output : [1, 3, 5, 7, 9]

    String[][] deepArrayStr = new String[][]{{"mkyong1", "mkyong2","mkyong3"}, {"mkyong3", "mkyong4"},{"mkyong1"}};
        System.out.println(Arrays.toString(deepArrayStr));
        // Output : [[Ljava.lang.String;@23fc625e, [Ljava.lang.String;@3f99bd52]

        System.out.println(Arrays.deepToString(deepArrayStr));
        // Output : [[mkyong1, mkyong2], [mkyong3, mkyong4]

        int[][] deepArrayInt = new int[][]{{1, 3, 5, 7, 9}, {2, 4, 6, 8, 10}};
        System.out.println(Arrays.toString(deepArrayInt));
        // Output : [[I@3a71f4dd, [I@7adf9f5f]

        System.out.println(Arrays.deepToString(deepArrayInt));
        // Output : [[1, 3, 5, 7, 9], [2, 4, 6, 8, 10]]

    }
}