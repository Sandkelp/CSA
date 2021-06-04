public class MagicSquare {

    public MagicSquare(){
    }

    public static void main(String[] args){
        int [][] array = {{16,3,2,13},{5, 10, 11, 8},{9,6,7,12},{4,15,14,1}};
        MagicSquare magicSQ = new MagicSquare();
        System.out.println("Row Sum: " + magicSQ.rowSum(array, 0));
        System.out.println("Col Sum: " + magicSQ.colSum(array, 0));
        System.out.println("Once: " + magicSQ.exactlyOnce(array));
        System.out.println("Is magic: " + magicSQ.isMagic(array));
    }

    public int rowSum(int [][] array, int row){
        int sum = 0;
        for (int col = 0; col < array[0].length; col++){
            sum = sum + array[row][col];
        }
        return sum;
    }

    public int colSum(int [][] array, int col){
        int sum = 0;
        for (int row = 0; row < array.length; row++){
            sum = sum + array[row][col];
        }
        return sum;
    }
    public int diagSums(int [][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i][i];
        }
        return sum;
        }

    public boolean exactlyOnce(int [][] array){
        boolean once = true;
        int [][] temp = array;
        
        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[0].length; col++){
                int target = array[row][col];
                for (int i = 0; i < array.length; i++){
                    for (int j = 0; j < array[0].length; j++){
                        if ( temp[i][j] == target && temp[i][j] !=0){
                            temp[i][j] = 0;
                        }
                        else if(temp[i][j] == target && temp[i][j] == 0){
                            temp[i][j]++;
                        }
                    }
                }
            }
        }

        int sum = 0;
        for (int row = 0; row < temp.length; row++){
            for (int col = 0; col < temp[0].length; col++){
                sum = sum + temp[row][col];
            }
        }
        if (sum == 0 ){
           once = true;
        }
        


        return once;
    }

    public boolean isMagic(int [][] array){
        int checks = 0;
        boolean isMagic = false;
        int rowSumCheck = rowSum(array, 0);
        for (int i = 0; i < array.length; i++){
              if (rowSumCheck == rowSum(array, i)){
                  checks++;
              }
        }
        for (int j = 0; j < array.length; j++){
            if (rowSumCheck == colSum(array, j)){
                checks++;
            }
      }
      if (diagSums(array) == rowSumCheck){
        checks++;
      }
      if (exactlyOnce(array) == true){
        checks++;
      }

      int checksCnt = array.length * 2 + 2;
      if (checks == checksCnt){
          isMagic = true;
      }
      return isMagic;
    }
}
