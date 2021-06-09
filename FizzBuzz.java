public class FizzBuzz {
    public static void fizzbuzz(int number) {
        // fizzbuzz logic here
        if(number%15==0){
            System.out.println("FizzBuzz");
        }else if(number%3==0){
            System.out.println("Fizz");
        }else if(number%5==0){
            System.out.println("Buzz");
        }else{
            System.out.println(number);
        }

    }





    public static void main(String[] args){
        System.out.println("testing");
        FizzBuzz.fizzbuzz(15);
        FizzBuzz.fizzbuzz(3);
        FizzBuzz.fizzbuzz(5);
        FizzBuzz.fizzbuzz(2);
    }
}

