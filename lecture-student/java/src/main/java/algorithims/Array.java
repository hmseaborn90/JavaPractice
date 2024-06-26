package algorithims;

public class Array {

    private int count;
    private int[] numbers;

    public Array(int size) {
        this.numbers = new int[size];
        this.count = 0;

    }
    public void insert(int num){
        if(numbers.length == count){
            int[] newArray = new int[count*2];

            for(int i = 0; i < count; i++){
                newArray[i] = numbers[i];
            }
            numbers = newArray;
        }
        numbers[count++] = num;

    }

    public void removeAt(int index){
        if(index < 0 || index >= count){
            throw new IllegalArgumentException("Index out of bounds");
        }

        for( int i = index; i < count-1; i++){
            numbers[i] = numbers[i + 1];
        }
        count--;


    }

    public int indexOf(int num){
        for (int i = 0; i< numbers.length; i++){
            if(numbers[i] == num){
                return i;
            }
        }
        return -1;
    }
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(numbers[i]);
        }
    }
}
//    public void insert(int num) {
//        // Check if the array is full
//        if (size == numbers.length) {
//            // If full, create a new array with increased size
//            int[] newArray = new int[numbers.length + 1];
//
//            // Copy elements from the old array to the new array
//            for (int i = 0; i < numbers.length; i++) {
//                newArray[i] = numbers[i];
//            }
//
//            // Insert the new element at the end
//            newArray[size] = num;
//
//            // Update numbers to point to the new array
//            numbers = newArray;
//        } else {
//            // If there's space in the existing array, insert the element
//            numbers[size] = num;
//        }
//
//        // Increment the size counter
//        size++;
//    }
//    public void removeAt(int index) {
//        if (index < 0 || index >= numbers.length) {
//            throw new IllegalArgumentException("Index out of bounds");
//        }
//
//        int[] newArray = new int[numbers.length - 1];
//
//        for (int i = 0, j = 0; i < numbers.length; i++) {
//            if (i == index) {
//                continue; // Skip the element at the specified index
//            }
//            newArray[j++] = numbers[i];
//        }
//
//        numbers = newArray; // Update the numbers array reference to the new array
//    }
//    public void removeAt(int index){
//        // initialize new array with a size of -1 to prepare for deletion
//        int[] newArray = new int[numbers.length - 1];
//
//        for (int i = 0; i < newArray.length; i++){
//            if(i == index){
//                continue;
//            }
//            if(i < index){
//                newArray[i] = numbers[i];
//            }
//            if(i > index){
//                newArray[i] = numbers[i+1];
//            }
//
//        }
//        numbers = newArray;
//
//    }