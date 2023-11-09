class Solution {
    public void gameOfLife(int[][] board) {
        int[][] mat = new int[board.length][board[0].length];
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[0].length; col++){
                if(board[row][col] == 1){
                    if(!liveDead(board, row, col)){
                        mat[row][col] = 1;
                    }
                }else{
                    if(deadLive(board, row, col)){
                        mat[row][col] = 1;
                    }
                }
            }
        }
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[0].length; col++){
                board[row][col] = mat[row][col];
            }
        }
        return;
    }
    private static boolean liveDead(int[][] board, int row, int col){
        int live = 0;
        //top left
        if(row-1 >= 0 && col-1>=0){
            if(board[row-1][col-1] == 1){
                live++;
            }
        }
        //top
        if(row-1 >= 0){
            if(board[row-1][col] == 1){
                live++;
            }
        }
        //top right
        if(row-1>=0 && col+1< board[0].length){
            if(board[row-1][col+1] == 1){
                live++;
            }
        }
        //right
        if(col+1< board[0].length){
            if(board[row][col+1] == 1){
                live++;
            }
        }
        //bottom right 
        if(row+1<board.length && col+1< board[0].length){
            if(board[row+1][col+1] == 1){
                live++;
            }
        }
        //bottom
        if(row+1<board.length){
            if(board[row+1][col] == 1){
                live++;
            }
        }
        //bottom left
        if(row+1<board.length && col-1>=0){
            if(board[row+1][col-1] == 1){
                live++;
            }
        }
        //left
        if(col-1>=0){
            if(board[row][col-1] == 1){
                live++;
            }
        }
        return live>3 || live <2;
    }
    private static boolean deadLive(int[][] board, int row, int col){
        int live = 0;
        //top left
        if(row-1 >= 0 && col-1>=0){
            if(board[row-1][col-1] == 1){
                live++;
            }
        }
        //top
        if(row-1 >= 0){
            if(board[row-1][col] == 1){
                live++;
            }
        }
        //top right
        if(row-1>=0 && col+1< board[0].length){
            if(board[row-1][col+1] == 1){
                live++;
            }
        }
        //right
        if(col+1< board[0].length){
            if(board[row][col+1] == 1){
                live++;
            }
        }
        //bottom right 
        if(row+1<board.length && col+1< board[0].length){
            if(board[row+1][col+1] == 1){
                live++;
            }
        }
        //bottom
        if(row+1<board.length){
            if(board[row+1][col] == 1){
                live++;
            }
        }
        //bottom left
        if(row+1<board.length && col-1>=0){
            if(board[row+1][col-1] == 1){
                live++;
            }
        }
        //left
        if(col-1>=0){
            if(board[row][col-1] == 1){
                live++;
            }
        }
        return live==3;
    }
}