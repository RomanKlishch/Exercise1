
import java.util.Arrays;

class Task11{
public static void main(String... args){
char[] arr = {'a','b','c'};
showArrays(arr);
}
/*
public static void showArrays(char[] arr){
for(char s:arr){
System.out.print(s+", ");
}
}
*/
public static void showArrays(char[] arr){
System.out.print(Arrays.toString(arr));
}

}
