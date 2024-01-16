/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    // TODO: you could solve it simpler using indexOf method as suggested.
    public static String uniqueChars(String s) {
        String NewWord = "";
        for (int i = 0; i < s.length(); i++) {
            boolean flag = false;
            if (s.charAt(i) == ' '){
                NewWord = NewWord + " ";
            }
            else if ((s.charAt(i) != ' ')){
                for (int j = 0; j < i; j++){
                    if (s.charAt(i) == s.charAt(j)){
                        flag = true;
                    }
                }
                if (!flag){
                   NewWord = NewWord + s.charAt(i);
                }
            }
        }
        return NewWord;
    }
}