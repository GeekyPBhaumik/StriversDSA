package StriverDSASheet.BasicHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LowMaxFreq {
    //https://www.naukri.com/code360/problems/k-most-occurrent-numbers_625382?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    public static int[] getFrequencies(int v[]) {
        // Main Reason of using TreeMap here is there maybe 2 Elements with
        //same frequency i.e.maxFreq but in such case as stated in the problem
        //we want the smallest element, so the best thing is to here use TreeMap
        //as it will sort the keys of the map in ascending sorted order
        int arr[] = new int[2];
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<v.length;i++){
            map.put(v[i],map.getOrDefault(v[i],0)+1);//1->3 , 2->1, 4->1
        }
        int maxFreq = 0, minFreq = v.length;
        int maxEle = 0, minEle = Integer.MAX_VALUE;
        for(Integer key:map.keySet()){
            if(map.get(key)>maxFreq){
                maxFreq=map.get(key);
                maxEle = key;
            }
            if(map.get(key)<minFreq){
                minFreq = map.get(key);
                minEle = key;
            }
        }
        arr[0]=maxEle;
        arr[1]=minEle;
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={11, 13, 3, 14, 17, 3, 7, 9, 1, 11, 9, 15, 5, 2, 2, 3};
        int lowMaxArr[] = getFrequencies(arr);
        System.out.println("Highest Frequency Element:"+lowMaxArr[0]);
        System.out.println("Lowest Frequency Element:"+lowMaxArr[1]);
    }
}