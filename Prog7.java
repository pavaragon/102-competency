public class Prog7{

    public static void main(String args[]){

        int[] numbers= {3,5,7,6,3,2,9};

        int sum=0;

        for(int i:numbers){
            sum=sum+1;
        }
        System.out.println("Sum of all values =" + sum);

        for(int position=0; position<numbers.length;position++){
            System.out.println("number:" + numbers[position]);

            if(numbers[position] ==7){

                System.out.println("Hi everyone");

            }
        }
        

    }
}