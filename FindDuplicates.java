import java.util.*;

public class FindDuplicates {
    public static List<Integer> duplicates(long[] arr){
        Map<Long, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(long num : arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Long, Integer> entry : freqMap.entrySet()){
            if(entry.getValue() > 1)
                result.add(Math.toIntExact(entry.getKey()));
        }
        if(result.isEmpty())
            result.add(-1);
        Collections.sort(result);
        return result;
    }
    public static void main(String[] args) {
        long[] a = {1, 6, 5, 2, 3, 3, 2};
        List<Integer> duplicatesFound = duplicates(a);

        System.out.print("Duplicate elements: ");
        for (int element : duplicatesFound) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
