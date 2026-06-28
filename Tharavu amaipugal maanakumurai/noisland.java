import java.util.*;
class solution{
          public int noofisland(int[][] arr){
                    int m=arr.length;
                    int n=arr[0].length;
                    int s=0;
                    for(int i=0;i<m;i++){
                              for(int j=0;j<n;j++){
                                        if(arr[i][j]==1){
                                                  s++;
                                                  dfs(arr,i,j);
                                        }
                              }
                    }
                    return s;

          }
          private static void dfs(int[][] arr,int i,int j){
                    int m=arr.length;
                    int n=arr[0].length;
                    if(i<0 || i>=m || j<0 || j>=n || arr[i][j]==0){
                              return;
                    }
                    arr[i][j]=0;
                    dfs(arr,i+1,j);
                    dfs(arr,i-1,j);
                    dfs(arr,i,j+1);
                    dfs(arr,i,j-1);

          }
}

class noisland{
          public static void main(String[] args){
                    Scanner scan = new Scanner(System.in);
                    int m=scan.nextInt();
                    int n=scan.nextInt();
                    int arr[][]=new int[m][n];
                    System.out.print("enter the values");
                    for(int i=0;i<m;i++){
                              for(int j=0;j<n;j++){
                                        arr[i][j]=scan.nextInt();                              
                              }
                    }
                    solution s=new solution();
                    int no=s.noofisland(arr);
                    System.out.println("no of island is:"+no);
          }
}