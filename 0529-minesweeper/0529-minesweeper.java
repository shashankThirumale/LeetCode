class Solution {
    public char[][] updateBoard(char[][] board, int[] click) {
        int x = click[0];
        int y = click[1];
        if(board[x][y] == 'M'){
            board[x][y] = 'X';
        }else if(board[x][y] == 'E'){
            int mines = numMines(board, x, y);
            if(mines == 0){
                board[x][y] = 'B';
                return adjacent(board, x, y);
            }else{
                board[x][y] = Character.forDigit(mines, 10);
            }
        }
        return board;
    }
    private static int numMines(char[][] board, int row, int col){
        int mines = 0;
        //top left
        if(row-1 >= 0 && col-1>=0){
            if(board[row-1][col-1] == 'M'){
                mines++;
            }
        }
        //top
        if(row-1 >= 0){
            if(board[row-1][col] == 'M'){
                mines++;
            }
        }
        //top right
        if(row-1>=0 && col+1< board[0].length){
            if(board[row-1][col+1] == 'M'){
                mines++;
            }
        }
        //right
        if(col+1< board[0].length){
            if(board[row][col+1] == 'M'){
                mines++;
            }
        }
        //bottom right 
        if(row+1<board.length && col+1< board[0].length){
            if(board[row+1][col+1] == 'M'){
                mines++;
            }
        }
        //bottom
        if(row+1<board.length){
            if(board[row+1][col] == 'M'){
                mines++;
            }
        }
        //bottom left
        if(row+1<board.length && col-1>=0){
            if(board[row+1][col-1] == 'M'){
                mines++;
            }
        }
        //left
        if(col-1>=0){
            if(board[row][col-1] == 'M'){
                mines++;
            }
        }
        return mines;
    }
    private char[][] adjacent(char[][] board, int row, int col){
        //top left
        if(row-1 >= 0 && col-1>=0){
            int[] clicks = {row-1, col-1};
            this.updateBoard(board, clicks);
        }
        //top
        if(row-1 >= 0){
            int[] clicks = {row-1, col};
            this.updateBoard(board, clicks);
        }
        //top right
        if(row-1>=0 && col+1< board[0].length){
            int[] clicks = {row-1, col+1};
            this.updateBoard(board, clicks);
        }
        //right
        if(col+1< board[0].length){
            int[] clicks = {row, col+1};
            this.updateBoard(board, clicks);
        }
        //bottom right 
        if(row+1<board.length && col+1< board[0].length){
            int[] clicks = {row+1, col+1};
            this.updateBoard(board, clicks);
        }
        //bottom
        if(row+1<board.length){
            int[] clicks = {row+1, col};
            this.updateBoard(board, clicks);
        }
        //bottom left
        if(row+1<board.length && col-1>=0){
            int[] clicks = {row+1, col-1};
            this.updateBoard(board, clicks);
        }
        //left
        if(col-1>=0){
            int[] clicks = {row, col-1};
            this.updateBoard(board, clicks);
        }
        return board;
    }
}