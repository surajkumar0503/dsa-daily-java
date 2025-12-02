public class Solutions {
    // Qn1. Print Negative Numbers in the given Array.
    public static void printNegNumbers(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] < 0) {
                System.out.print(arr[i]+ " ");
            }
        }
    }



    // Qn2. Print sum of elements of the Array.
    public static void sumOfElements(int[] arr){
        int n = arr.length;
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += arr[i];// sum = sum + arr[i]
        }
        System.out.println("Elements Sum:"+ sum);

    }

    // Qn3. Print product of elements of the Array.
    public static void printArrProduct(int[] arr){
        int n = arr.length;
        System.out.println("Array's length: "+ n);
        int prod = 1;
        // 2, -5, 9, 5, -7, 8, 3, -12
        for(int i = 1; i < n; i++){
            prod *= arr[i];
        }
        System.out.println("Product is: "+ prod);
    }



    // Qn4. Print sum of elements of the Array.
    public static void printMaxMin(int[] arr){
        int n = arr.length;
        System.out.println("Array's length: "+ n);
        int max = arr[0];
        int min = arr[0];
        // 2, -5, 9, 5, -7, 8, 3, -12
        for(int i = 1; i < n; i++){
            if(arr[i] >=  max) max  = arr[i];
            if(arr[i] <=  min) min  = arr[i];
        }
        System.out.println("Maximum element is: "+ max);
        System.out.println("Minimum element is: "+ min);

    }

    // Qn5. Multiply odd indexes elements by 2 and add 10 to even indexes elements.
    /*
    // 1st way to solve
    public static void operationOnIndexes(int[] num){
        //{2, 3 ,5, 9 ,12, 6, 4};

        int n = num.length;
        int result = 1;
        //odd indexes
        for (int i = 0; i < n; i++){
            if((i % 2) != 0) {
                System.out.print(2 * num[i] + " ");
            }else{
                System.out.print(10 + num[i] + " ");
            }
        }
    } */

    // 2nd way to solve: Modify array in place (the array permanently updated)
    public static void operationOnIndexes(int[] num){
        for (int i = 0; i < num.length; i++){
            if (i % 2 != 0) {
                num[i] *= 2;
            } else {
                num[i] += 10;
            }
        }

        // Print updated array after wards
        for (int x : num) {
            System.out.print(x + " ");
        }
    }


    public static void main(String[] args){
        int[] arr = {2, -5, 9, 5, -7, 8, 3, -12};
        int[] num = {2, 3 ,5, 9 ,12, 6, 4};
        //printNegNumbers(arr);
        //sumOfElements(arr);
        //printArrProduct(arr);
        //printMaxMin(arr);
        operationOnIndexes(num);

    }
}
