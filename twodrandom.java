public class twodrandom {
    public static void main(String[] args){
        int two[][] = new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                two[i][j]=(int)(Math.random() * 100);
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(two[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
    
}
