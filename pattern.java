package paternquestions;

public class pattern {
    public static void main(String[] args){
        int n;
        pattern1(n=4);
        System.out.println();
        pattern2(n=5);
        System.out.println();
        pattern3(n=5);
        System.out.println();
        pattern4(n=5);
        System.out.println();
        pattern5(n=5);
        System.out.println();
        pattern6(n=6);
        System.out.println();
        pattern7(n=6);
        System.out.println();
        pattern8(n=6);
        System.out.println();
        pattern9(n=6);
        System.out.println();
        pattern10(n=5);
    }

//code for printin pattern 1
    static void pattern1(int n){
        for(int row=0; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
          
        }

    }
//code for printing pattern 2
    static void pattern2(int n){
        for(int row=1;row<=n; row++){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//code for printing pattern 3
    static void pattern3(int n){
        for(int row=1;row<=n; row++){
            for(int col=1; col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//code for printing pattern 4
    static void pattern4(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
//code for printing pattern 5
    static void pattern5(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
//code for printing pattern 6
    static void pattern6(int n){
        for(int row=0;row<=2*n;row++){
            int totalcol=row>n ? 2 * n -row : row; //total number of columns in a row 
            for(int col=0; col<totalcol;col++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
//code for printing pattern 7
    static void pattern7(int n){
        for(int row=0; row<2*n;row++){
            int totalcol=row>n ? 2*n-row: row;
            
            int totalspaces=n - totalcol; //number of spaces required to leave 
            for(int s=0; s<totalspaces;s++){
                System.out.print(" ");
            }
            for(int col=0; col<totalcol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//code of printing pattern 8 
    static void pattern8(int n){
        for(int row=1; row<=n; row++){
            for(int spaces=0; spaces< n-row; spaces++){ //number of space required 
                System.out.print(" ");
            }

            for(int col=row; col>=1; col--){
                System.out.print(col);
            }
            for(int col=2; col<= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
//code for printing patern 9
    static void pattern9(int n){
        for(int row=n; row>=1; row--){
            for(int s=row; s>n; s--){
                System.out.print(" ");
            }
            for(int col=1; col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //code for printing pattern 10
        static void pattern10(int n){
            for(int row=1; row<=n; row++){
                for(int s=1; s<=n-row;s++){
                    System.out.print(" ");
                }
                for(int col=1; col<=row;col++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
}
