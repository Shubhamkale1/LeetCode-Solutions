package recursion.BackTracking;

import java.util.Arrays;

public class AllPath {
    static void allPath(String p, boolean[][] maze, int r, int c){
        if (r == maze.length -1 && c == maze[0].length -1){
            System.out.println(p);
            return;
        }
        if (maze[r][c] == false){
            return;
        }
        if (r < maze.length -1){
            allPath(p+'D', maze, r+1, c);
        }
        if (c < maze[0].length -1){
            allPath(p+'R', maze, r, c+1);
        }
        if (r > 0){
            allPath(p+'U',maze, r-1, c);
        }
        if (c > 0){
            allPath(p+'U',maze, r, c-1);
        }
    }

    static void allPathBackT(String p, boolean[][] maze, int r, int c){
        if (r == maze.length -1 && c == maze[0].length -1){
            System.out.println(p);
            return;
        }
        if (maze[r][c] == false){
            return;
        }

        maze[r][c] = false;
        if (r < maze.length -1){
            allPathBackT(p+'D', maze, r+1, c);
        }
        if (c < maze[0].length -1){
            allPathBackT(p+'R', maze, r, c+1);
        }
        if (r > 0){
            allPathBackT(p+'U',maze, r-1, c);
        }
        if (c > 0){
            allPathBackT(p+'L',maze, r, c-1);
        }
        maze[r][c] = true;

    }

    static void allPathBackTPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if (r == maze.length -1 && c == maze[0].length -1){
            for (int[] arr : path){
                path[r][c] = step;
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (maze[r][c] == false){
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length -1){
            allPathBackTPrint(p+'D', maze, r+1, c,path, step+1);
        }
        if (c < maze[0].length -1){
            allPathBackTPrint(p+'R', maze, r, c+1,path, step+1);
        }
        if (r > 0){
            allPathBackTPrint(p+'U',maze, r-1, c,path, step+1);
        }
        if (c > 0){
            allPathBackTPrint(p+'L',maze, r, c-1,path, step+1);
        }
        maze[r][c] = true;
        path[r][c] = 0;

    }

    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
//        allPath("",board, 0,0);        // stack overFlow Error

//        allPathBackT("",board, 0,0);

        int[][] path =  new int[board.length][board[0].length];
        allPathBackTPrint("",board, 0,0,path,1);


    }
}
