public class LeanearSearch {
    //Search key in the Array
    public static int leanearSearch(int[] numbers, int key){
        int n = numbers.length;
        for(int i = 0; i < n; i++){
            if(numbers[i] == key){
                System.out.println("Your key is present at index: "+ i);
                return numbers[i];
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] numbers = {5,9,7,2,4};
        int key = 2;

        int res = leanearSearch(numbers, key);
        if(res == -1){
            System.out.println("Key does not exist!");
        }else {
            System.out.println("Key found, your key is "+ res);
        }

    }
}
