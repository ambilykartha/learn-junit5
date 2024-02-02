public class StringReverse {
    public static String reverseString(String name){
        if(name == null)
            return null;
        if(name.length() == 0)
            return "";
        char[] charArray = name.toCharArray();
        int start =0;
        int end = charArray.length - 1;
        while (start < end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }
}
