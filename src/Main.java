import java.util.Arrays;
import java.util.Locale;

/*
For Loop 03
Exercise: For Loop 3

you have an array of string called arr that is initialised with the names of the days of the week
iterate the array and change in uppercase the array item values every 2 items, starting from Monday (e.g. Monday, Wednesday)
print the modified array
 */
public class Main {
    public static void main(String[] args) {
        String[] arr = {"Monday ", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = 0; i< arr.length;i+=2){
            arr[i] = arr[i].toUpperCase();
        }

        for (String array:arr) System.out.println(array);


    }
}
