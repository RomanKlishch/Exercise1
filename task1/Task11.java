
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.Random;

class Task11{
    public static void main(String... args){
        System.out.println("Hello, I am working...");
    }

/*
task 1
Принимает массив чаров, выводит его на экран
*/

/*
public static void showArrays(char[] arr){
for(char s:arr){
System.out.print(s+", ");
}
}
*/

    public static void showArrays(char[] charArr){
        System.out.print(Arrays.toString(charArr));
    }
/*
task 2
Принимает массив интов, возвращает массив чаров,
каждый символ в позиции массива соответствует коду
символа передаваемого инта

Здесь нужно уточнить в каком формате
мы будем передвавать числа (десб шестн, восмир)
*/

    public static char[] intToChar(int[] intArr){
        char[] charArr = new char[intArr.length];
        for (int i = 0; i <intArr.length ; i++) {
            charArr[i] = (char) intArr[i];
        }
        return charArr;
    }

/*
task 3, task 4, task 5
Приминает 2 инта, а и б, возвращает большее их этих 2х чисел
Принимает 3 инта, возвращает большее из них
Приминает 5 интов, возвращает большее из них
*/

    public static int findMaxInt(int... value){
        return Arrays.stream(value).summaryStatistics().getMax();
    }

    /*
    task 6
    Принимает массив чаров, возвращает строку состоящую из символов массива
    */
    public static String charToString(char[] charArr){
        String stingFromCharArrya = "";
        for (char s:charArr ) {
            stingFromCharArrya +=s;
        }
        return stingFromCharArrya;
    }

/*
task 8
Принимает массив интов, и значение типа инт, возвращает
индекс массива в котором значение совпадает с передаваемым,
начиная с начала массива. Если значения в массиве нет
возвращает -1
*/

    public static int findFirstValue(int[] arr, int value){
        for (int i=0; i<arr.length ;i++ ) {
            if(arr[i]==value){
                return i;
            }
        }
        return -1;
    }

/*
task 9
Принимает массив интов, и значение типа инт, возвращает
 индекс массива в котором значение совпадает с передаваемым,
 начиная с конца массива. Если значения в массиве нет
 возвращает -1
*/

    public static int findLastValue(int[] arr, int value){
        for (int i=arr.length-1; i>=0 ;i-- ) {
            if(arr[i]==value){
                return i;
            }
        }
        return -1;
    }

/*
task 10
Метод принимает инт, и возвращает факториал от заданого инта
*/

    public static int factorial(int value){
        if (value == 1) {
            return 1;
        }
        return value * factorial(value-1);
    }

/*
task 11
Принимает инт год, и возвращает тру если год высокосный
*/

    public static boolean isLeapYear(int year){
        return year%4==0?true:false;
    }

/*
task 12
Приминает массив интов и число, выводит на екран только
елементы массива которые кратны этому числу
*/

    public static void showMultipleNumbers(int[] arr, int value){
        Arrays.stream(arr)
                .filter(x->x%value==0)
                .forEach(System.out::print);
    }

/*
task 13
Метод принимает массив интов сортирует его по возрастанию
*/

    public static void sortIntArray(int[] arr){
        Arrays.stream(arr).sorted().toArray();
    }
/*
public static void quickSort(int[] source, int left, int right) {
    int start = left;
    int end = right;
    int middle = source[(start + end) / 2];
    do {
    while (source[start] < middle) {
    start++;
      }
    while (source[end] > middle) {
    end--;
      }

      if (start <= end) {
        if (start < end) {
        int tmp = source[start];
        source[start] = source[end];
        source[end] = tmp;
        }
      start++;
       end--;
       }
        } while (start <= end);

        if (start < right) {
            quickSort(source, start, right);
        }
        if (left < end) {
            quickSort(source, left, end);
        }
    }
    */

/*
task 14
Принимает массив байт, если в массиве есть повторяющиеся
елементы, возвращает тру
*/

    public static boolean isRepeatElement(byte[] arr){
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++)
            if(arr[i]==arr[i+1]){
                return true;
            }
        return false;
    }

/*
task 15
Принимает два массива интов одинаковых по длинне,
возращает массив интов который состоит из
перемноженных елементов входящих массивов
*/

    public static int[] productTwoArrays(int[] first, int[] second){
        return IntStream
                .range(0,first.length)
                .map(i->first[i]*second[i]).toArray();
    }

/*
task 16
Принимает два массива интов, возвращает массив из
елементов которые не совпадают в массивах
(не понятно елементы
в массивах которые не совпадают могут повторяться?)
*/

    public static int[] arrayUniquValue(int[] first, int[] second){
        return IntStream
                .concat(Arrays.stream(first),Arrays.stream(second)).distinct().toArray();
    }

/*
task 17
Ппринимает масив интов, возвращает его же но в реверсном
порядке
*/

    public static void reverse(int[] arr){
        for (int i=0;i<arr.length/2 ;i++ ) {
            int tmp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = tmp;
        }
    }

    /*
    task 18
    принимает 3 инта:
    - размер выходного массива
    - нижняя граница
    - верхняя границафывф
    возвращает массив интов заданой длинный, который содержит случайные
    числа от нижней границы до верхней границы"
    */
    public static int[] randomArrayInt(int length, int start, int end){
        return new Random().ints(length,start,end).toArray();
    }

/*
task 19
Принимает 2 массива чаров, проверяет есть ли в 1 массиве, такая же
последовательность символов которую представляет собой второй массив.
Возвращает булеан
*/

    public static boolean isPresent(char[] source, char[] search){
        for (int i=0;i<=source.length-search.length ;i++) {
            int index = 0;
            again:
            if (source[i]==search[index]){
                for (int j = i+1; j <i+search.length; j++) {
                    if (source[j]!=search[index+=1]){
                        break again;
                    }
                }
                return true;
            }
        }
        return false;

    }









}

