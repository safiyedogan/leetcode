package leetcode;

public class ReverseString {

    public static void reverseString(char[] s) {
        int first =0, last=s.length-1;
        while(first<=last){
            char temp=s[first];
            s[first]=s[last];
            s[last]=temp;
            first++; last--;

        }
    }

    public static void main(String[] args) {
        char[] array= {'h','e','y'};

        reverseString(array);
    }
}
