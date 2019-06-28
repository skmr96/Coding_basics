import java.util.*;
class Hu{
public String reverseVowels(String s) {
    ArrayList<Character> vowList = new ArrayList<Character>();
    vowList.add('a');
    vowList.add('e');
    vowList.add('i');
    vowList.add('o');
    vowList.add('u');
    vowList.add('A');
    vowList.add('E');
    vowList.add('I');
    vowList.add('O');
    vowList.add('U');
 
    char[] arr = s.toCharArray();
 
    int i=0; 
    int j=s.length()-1;
    System.out.println(j);
 
    while(i<j){
        if(!vowList.contains(arr[i])){
            i++;
            System.out.println(i);
            continue;
        }
 
        if(!vowList.contains(arr[j])){
            j--;
            System.out.println(j);
            continue;
        }
 
        char t = arr[i];
        arr[i]=arr[j];
        arr[j]=t;
        System.out.println(arr[i]);
        System.out.println(t);
        System.out.println(arr[j]);
 
        i++;
        j--; 
    }
 
    return new String(arr);
}
}
class StringReversal{
    public static void main(String[] args) {
        Hu h1 = new Hu();
        String a = h1.reverseVowels("Hi hello how are you");
        System.out.println(a);
    }
}