public class RemoveDuplicate {

    public static String removeDuplicateUsingRecursion(String str){

        if(str.length()<=1){
            return str;
        } else if(str.charAt(0)==str.charAt(1)) {
            return removeDuplicateUsingRecursion(str.substring(1));
        } else
            return str.charAt(0)  + removeDuplicateUsingRecursion(str.substring(1));
    }
}
