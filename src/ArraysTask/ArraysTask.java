package ArraysTask;

public class ArraysTask {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2 = {5, 6, 7, 8, 9};
        int[] array3 = {5, 5, 6, 6, 6, 7, 7, 1, 1, 1, 6, 7, 8, 1, 1, 1, 9,9,9,6,7};
        printArray(deleteSuborderRepeatValue(array3));
    }


    public static int[] arrayIntoTwoArrays(int[] array1, int[] array2) {
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    index++;
                }
            }

        }
        int[] newArray = new int[index];
        index = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    newArray[index++] = array1[i];
                }
            }

        }
        return newArray;
    }

    public static int[] copyToLargerArray(int[] array) {
        int[] newArray = new int[array.length + (array.length / 2)];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static int[] arrayUniqValue(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length + array2.length];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            newArray[index++] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            newArray[index++] = array2[i];
        }
        int[] dublicateArray = arrayIntoTwoArrays(array1, array2);
        int[] finalArray = new int[newArray.length - (dublicateArray.length * 2)];
        index = 0;
        boolean entr = false;
        for (int i = 0; i < newArray.length; i++) {
            entr = true;
            for (int j = 0; j < dublicateArray.length; j++) {
                if (newArray[i] == dublicateArray[j]) {
                    entr = false;
                }
            }
            if (entr) {
                finalArray[index++] = newArray[i];
            }
        }

        return finalArray;
    }

    public static void printArray(int[] array) {
        System.out.print("Array : ");
        for (int i : array) {
            System.out.print("[" + i + "]");
        }
    }

    public static int[] deleteMoreThenTwoValueInArray(int[] array) {
        int saveInt = 0;
        int index = 0;
        int indexArrayLength = 0;
        for (int i = 0; i < array.length; i++) {
            saveInt = array[i];
            index = 0;
            for (int j = 0; j < array.length; j++) {
                if (saveInt == array[j]) {
                    index++;
                }
            }
            if (index < 3) {
                indexArrayLength++;
            }
        }
        int[] newArray = new int[indexArrayLength];

        indexArrayLength = 0;
        for (int i = 0; i < array.length; i++) {
            saveInt = array[i];
            index = 0;
            for (int j = 0; j < array.length; j++) {
                if (saveInt == array[j]) {
                    index++;
                }
            }
            if (index < 3) {
                newArray[indexArrayLength++] = array[i];
            }
        }
        return newArray;
    }

    public static int[] deleteSuborderRepeatValue(int[] array) {
        int saveInt = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                saveInt = array[i];
                index++;
                continue;
            }
            if (saveInt == array[i]) {
            } else {
                index++;
            }
            saveInt = array[i];
        }
        int[] numbers = new int[index];
        index=0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                saveInt = array[i];
                continue;
            }
            if (saveInt == array[i]) {

            } else {
                numbers[index++] = saveInt;
            }
            saveInt = array[i];

            if(i+1 == array.length){
                numbers[index] = array[i];
            }
        }
        return  numbers;
    }
}
