package algorithms.searching.linear;

public class SearchInStrings {
    public static void main(String[] args) {
         String name = "Tanish";
         char target = '9';
         char target2 = 'T';
        System.out.println(search(name,target));
        System.out.println(seach2(name,target2));
    }
    static boolean search(String str,char target){
        if(str.length() == 0) return false;

        for(int i = 0; i<str.length() ;i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

    static boolean seach2(String str,char target){
        if(str.length() == 0) return false;

        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
