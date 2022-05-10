import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {
  public  ArrayList<ArrayList<String>> solveNQ(int n){
    ArrayList<ArrayList<String>> res = new ArrayList<>();
    char[][] board = new char[n][n];
    init(board);
    backtrack(res,board,0);
    return res;

  }
  private void init(char[][] board) {
    for(int i=0;i<board.length;i++) {
      Arrays.fill(board[i],'.');
    }
  }

  private void backtrack(ArrayList<ArrayList<String>> res,char[][] board,int row) {
    if(row==board.length) {
      res.add(generate(board));
      return;
    }
    for(int j=0;j<board.length;j++) {
      if(isvalid(board,row,j)) {
        board[row][j]='Q';
        backtrack(res,board,row+1);
        board[row][j]='.';
      }
    }
  }
  private boolean isvalid(char[][] board,int row,int col) {
    for(int i=0;i<row;i++) {
      if(board[i][col]=='Q')return false;
    }
    for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--) {
      if(board[i][j]=='Q')return false;
    }
    for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++) {
      if(board[i][j]=='Q')return false;
    }
    return true;
  }
  private ArrayList<String> generate(char[][] board){
    ArrayList<String> list = new ArrayList<String>();
    for(char[] row:board) {
      StringBuilder sb=new StringBuilder();
      for(char c:row) {
        sb.append(c);
      }
      list.add(sb.toString());
    }
    return list;
  }
  public static void main(String[] args) {
    test t=new test();
    System.out.println("enter nqueens number：");
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    ArrayList<ArrayList<String>> res= t.solveNQ(n);
    for(int i=0;i<res.size();i++) {
      System.out.println(res.get(i));
    }
    System.out.println("solution numbers："+res.size());
  }

}
