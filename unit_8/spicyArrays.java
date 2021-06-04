import java.util.Arrays;
public class spicyArrays {

    //private int [][] array;

    public spicyArrays(){
    } 
    public static void main(String[] args){
        int [][] array = {{2,3,5,23},{4,5,14,24},{4,5,67,56}};
        spicyArrays twoArray = new spicyArrays();
        System.out.println("Sum: " + twoArray.sum(array));
        System.out.println("Row Sum: " + twoArray.rowSum(array, 0));
        System.out.println("Col Sum: " + twoArray.colSum(array, 0));
        System.out.println("Sum2: " + twoArray.sum2(array));
        System.out.println("Largest: " + twoArray.largest(array));
        System.out.println("Largest by row: " + twoArray.largestByRow(array, 0));
        System.out.println("Largest2: " + twoArray.largest2(array));
        twoArray.printTranspose(array);
    }

    public int sum(int [][] array){
        int sum = 0;
        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[0].length; col++){
                sum = sum + array[row][col];
            }
        }
        return sum;
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
    
    public int sum2(int [][] array){  
        return this.sum(array);
    }
    public int largest(int [][] array){
        int max = array[0][0];
        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[0].length; col++){
                if (max < array[row][col]){
                    max =  array[row][col];
                }
            }
        }
        return max;
    }

    public int largestByRow(int [][] array, int row){
        int max = array[0][0];
            for (int col = 0; col < array[0].length; col++){
                if (max < array[row][col]){
                    max =  array[row][col];
                }
            }
        return max;
    }

    public int largest2(int [][] array){
        int max = this.largest(array);
        return max;
    }

    public void printTranspose(int [][] array){
        int sum = 0;
        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[0].length; col++){
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }

    
}