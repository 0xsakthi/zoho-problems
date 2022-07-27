//21 spiral matrix and XO pattern

import java.util.Collection;
public class Main {
    public static void main(String[] args) {
        int a[][] = { { 1,   2,  3, 4 },
                    { 14, 15, 16, 5 },
                    { 13, 20, 17, 6 },
                    { 12, 19, 18, 7 },
                    { 11, 10, 9,  8 }};
        
        char res[][] = new char[7][6];
        // System.out.print(res[0][2]);
        int colstart = 0;
        int rowstart = 0;
        int colend = res[0].length-1;
        int rowend = res.length-1;
        char c = 'X';
        while(colstart<colend && rowstart<rowend){
            for(int i=rowstart;i<=colend;i++){
                // System.out.print(a[rowstart][i]+" ");
                res[rowstart][i]=c;
            }
            rowstart++;
            for(int i=rowstart;i<=rowend;i++){
                // System.out.print(a[i][rowend-1]+" ");
                res[i][rowend-1]=c;
            }
            colend--;
            for(int i=colend;i>=colstart;i--){
                // System.out.print(a[rowend][i]+" ");
                res[rowend][i]=c;
            }
            rowend--;
            for(int i=rowend;i>=rowstart;i--){
                // System.out.print(a[i][colstart]+" ");
                res[i][colstart]=c;
            }
            colstart++;
            if(c=='X'){
                c = 'O';
            }else{
                c = 'X';
            }
    }
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]);
            }
            System.out.print("\n");
        }
    
}
}
