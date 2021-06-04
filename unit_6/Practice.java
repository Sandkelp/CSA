public class Practice {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        System.out.println(shiftRight(array));
    }
    public static boolean atLeastOneOdd(int[] array){
        for(int item:array){
            if(item % 2 != 0)
                return true;
        }
        return false;
    }

    public static int[] shiftRight(int[] array){
        int temp[] = new int[array.length];
        for (int i = 0; i < array.length; i++){
           try{ temp[i] = array[i + 1];}
           catch(java.lang.ArrayIndexOutOfBoundsException){
               temp[0] = array[i];
           }
            
        }
        return temp;
    }
    
}
