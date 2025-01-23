package MazeGame;

public class Maze {

    public static void printMap(String[][] map) {
        for (String[] row : map) {
            String rowStr = "";
            for (String ele : row) {
                rowStr += ele;
            }
            System.out.println(rowStr);
        }
    }

    public static String[][] makeWallsandTunnel(String[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                // Check if top or bottom row
                if (i == 0 || i == map.length - 1) {
                    map[i][j] = "#";
                } else if (j == 0 || j == map[i].length - 1) {
                    map[i][j] = "#";
                } else {
                    map[i][j] = "*";
                }
            }

        }

        return map;
    }

    public static void main(String[] args) {
        String[][] map = new String[10][10];
        map = makeWallsandTunnel(map);
        printMap(map);
    }
}
