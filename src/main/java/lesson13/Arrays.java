package lesson13;

public class Arrays {
    public int[] reverseArray(int[] array) {
        ArrayUtil.printArray(array);
        int[]arr2 = new int[array.length];
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = array[array.length - 1 - i];
        }
        ArrayUtil.printArray(arr2);
        return arr2;
    }

    public float average(int[] array) {
        ArrayUtil.printArray(array);
        // TODO реализуйте код для расчета среднего значения
        float sum = 0;
        float avg = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
            avg = sum/array.length;
        }
        System.out.println(avg);
        return avg;
    }
}
