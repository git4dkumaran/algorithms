import java.util.HashMap;
import java.util.Map;

public class TwoSumII {

	public int[] twoSum(int[] numbers, int target) {
        if (numbers.length < 2) {
            return new int[2];
        }
        
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                result[0] = map.get(numbers[i]) + 1;
                result[1] = i + 1;
                
                return result;
            } else {
                map.put(target-numbers[i], i);
            }
        }
        
        return result;
    }
}
