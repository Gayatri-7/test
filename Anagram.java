mport java.util.Arrays;

public class Anagram{
  public boolean isAnag(String s,String t){
    char S[]=s.toCharArray();
    char T[]=t.toCharArray();

    Arrays.sort(S);
    Arrays.sort(T);
    return Arrays.equals(S,T);
    
  }
  public static void main(String[] args){
    Anagram a=new Anagram();
    System.out.println(a.isAnag("abc","cab"));
    //should be returning true as they are anagrams
    
  }
}
