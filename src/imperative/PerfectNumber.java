package imperative;
import java.util.List;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PerfectNumber {

    public static  int devisors(int n){
       // Stream<Integer> stream = IntStream.range(1,n).filter(i -> n % i == 0).boxed();
        //Set<Integer> streamSet = stream.collect(Collectors.toSet());

         int sum =IntStream.range(1,n).filter(i -> n % i == 0).sum();
        //  List<Integer> newlist= IntStream.boxed().collect(Collectors.toList())
return sum;
        }


    public static enum State{
            DEFICIENT,
            ABUNDANT,
            PERFECT

    }
    public static State Process(int x){
         int sum=devisors(x);
        return sum==x? State.PERFECT: ProcessIfNotEqual(sum, x);
    }
    public static State ProcessIfNotEqual(int sum, int x){
        return sum>x? State.ABUNDANT:State.DEFICIENT;
    }
    public static void main(String[] args) {
        int userNumber = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number to check");
        if (sc.hasNextInt()) {
            userNumber = sc.nextInt();
        } else {
            System.out.println("input-output error");
            sc.close();
            return;
        }
        sc.close();
        Process(userNumber);

    }
}

// Comparator<Integer> comparator = (p1, p2) ->;
// comparator.compare(sum,userNumber);

// BiPredicate<Integer, Integer> bi = (xxx, y) -> xxx == y;
// boolean result = bi.test(devisors(userNumber), (userNumber));


//  Function<Boolean,State> half = result1 -> State.ST1;
//     half.apply(result);
//    Converter<Boolean,State> stringConverter1 = (from) -> {
//    return State.ST1;


// State newState=  stringConverter1.convert(result);
