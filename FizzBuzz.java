public class FizzBuzz {
    public static void fizzbuzz(int number) {
        // fizzbuzz logic here
        if(number%15==0){
            System.out.println("FizzBuzz");
        }if(number%3==0){
            System.out.println("Fizz");
        }if(number%5==0){
            System.out.println("Buzz");
        }else{
            System.out.println(number);
        }

    }





    public static void main(String[] args){
        System.out.println("testing");
        FizzBuzz.fizzbuzz(30);
    }
}

