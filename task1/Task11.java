
import java.util.Arrays;

class Task11{
public static void main(String... args){
char[] arr = {'a','b','c'};
showArrays(arr);
}

/*
task 1
*/

/*
public static void showArrays(char[] arr){
for(char s:arr){
System.out.print(s+", ");
}
}
*/
public static void showArrays(char[] charArr){
System.out.print(Arrays.toString(arr));
}

/*
task 2
*/

public static char[] intToChar(int[] intArr){
char[] charArr =Arrays.stream(intArr).map(x->(char)x).toArray(); 
return charArr;
}



}
