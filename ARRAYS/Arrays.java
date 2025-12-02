// Arrays Basics
public class Arrays {
    public static void main(String[] args){
        // Initialization & Indexing
        int[] arr = {7, 18, 45};

        int[] arr2 = new int[5];

        //inserting element in index
        arr2[0] = 10;
        arr2[1] = -30;
        arr2[2] = -50;
        arr2[3] = 70;
        arr2[4] = 90;

        //System.out.println(arr); // address
        //System.out.println(arr2.length); //get the length using 'length'

        //accessing element by index
        //System.out.println(arr2[0]);

        //accessing all elements of arr
        for(int i=0; i<arr.length; i++){
            //System.out.print(arr[i]+ " "); //7 18 45
        }

        int[] myNewArr = new int[6];
        // Inserting value using loop runtime input
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter "+myNewArr.length+ " values:");
//        for(int i=0; i<myNewArr.length; i++){
//            myNewArr[i] = sc.nextInt();
//        }


        for(int i=0; i<myNewArr.length; i++){
            //System.out.print(myNewArr[i]+ " ");
        }



//      Concept: Passing Arrays to Method

        int x = 10;
        int y[] = {9, 7, 18, 45};

        System.out.println(y[0]); // original value of [] y at idx 0

        change(x, y); //calling change method

        System.out.println(x); //x won't be affected, no changes
        System.out.println(y[0]);
    }

    public static void change(int x, int[]y) {
        x = 20;
        y[0] = 23;
    }
}
