public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int arrayLength = digits.length;

        for(int i = arrayLength-1; i >=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }

            digits[i]=0;
        }

        int[] newDigits = new int[arrayLength+1];
        newDigits[0]=1;
        return newDigits;
    }

    public static void main(String[] args){

        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;

        int[] secondArray = new int[4];
        secondArray[0] = 4;
        secondArray[1] = 3;
        secondArray[2] = 2;
        secondArray[3] = 1;

        int[] thirdArray = new int[1];
        thirdArray[0] = 9;

        int[] newThirdArray = new int[2];







        System.out.print("The array: ");
        for(int i =0; i<firstArray.length;i++){
            System.out.print(firstArray[i] + ",");
        }

        int[] newFirstArray = plusOne(firstArray);

        System.out.print(" after being changed is ");
        for(int i =0; i<firstArray.length;i++){
            System.out.print(newFirstArray[i] + ",");
        }

        System.out.println();


        System.out.print("The array: ");
        for(int i =0; i<secondArray.length;i++){
            System.out.print(secondArray[i] + ",");
        }

        int[] newSecondArray = plusOne(secondArray);

        System.out.print(" after being changed is ");
        for(int i =0; i<secondArray.length;i++){
            System.out.print(newSecondArray[i] + ",");
        }

        System.out.println();

        System.out.print("The array: ");
        for(int i =0; i<thirdArray.length;i++){
            System.out.print(thirdArray[i] + ",");
        }

         newThirdArray = plusOne(thirdArray);

        System.out.print(" after being changed is ");
        for(int i =0; i<newThirdArray.length;i++){
            System.out.print(newThirdArray[i] + ",");
        }





    }

}
