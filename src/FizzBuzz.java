public class FizzBuzz {
    public static void main(String[] args){
        //for numbers 1-100, if multiple of 3 print Fizz, if multiple of 5 print Buzz,
        // if both print both, if neither print the number

        //Method 1 (Simplest for the above purpose)
        for(int i = 1; i<=100; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            }else if (i%3 == 0){
                System.out.println("Fizz");
            }else if (i%5 ==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }

        //Method 2 (Could be adapted if more conditions were imposed, e.g. print "Whiz" if divisible by 2)
        for(int i = 1; i<=100; i++) {
            if ((i % 3 == 0) | (i % 5 == 0)) {
                if (i % 3 == 0) {
                    System.out.print("Fizz");
                }
                if (i % 5 == 0) {
                    System.out.print("Buzz");
                }
            } else {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
