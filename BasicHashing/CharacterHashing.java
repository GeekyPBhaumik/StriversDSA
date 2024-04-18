package StriverDSASheet.BasicHashing;

import java.util.HashMap;

public class CharacterHashing {
    public static void main(String[] args) {
        String str = "abcaabfe";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        for(Character key:map.keySet()){
            System.out.println(key + "->" + map.get(key));
        }
    }
}
