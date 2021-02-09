import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        for (int i =1; i< list.size(); i++){
            int kroom = list.get(i);
            int x = i - 1;
            while ((x > -1) &&(list.get(x).compareTo(kroom)== 1)){
                list.set(x+ 1, list.get(x));
                x--;
            }
            list.set(x+1, kroom);
        }
        return list;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        int[] lala = new int[arr1.length*2];
        int oH = 0;
        int nO = 0;
        int i = 0;
        while(oH<arr1.length&&nO<arr1.length){
            int ma = Math.min(arr1[oH],arr2[nO]);
            lala[i]=ma;
            if(ma==arr1[oH]){
                oH++;
            }else{
                nO++;
            }
            i++;
        }
        if(oH!=arr1.length){
            for(int j = oH; j<arr1.length; j++){
                lala[i] = arr1[j];
                i++;
            }
        }else{
            for(int j = nO; j<arr2.length; j++){
                lala[i] = arr2[j];
                i++;
            }
        }
        return lala;
    }

    public static void main(String[] args) {
        // You can test your code her
    }
}
