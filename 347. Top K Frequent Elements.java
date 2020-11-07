class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> valueToFreq = new HashMap<>();
        for (int num : nums) {
            valueToFreq.put(num, valueToFreq.getOrDefault(num, 0) + 1);
        }

        Map<Integer, List<Integer>> freqToValues = new HashMap<>();

        for (int value : valueToFreq.keySet()) {
            Integer freq = valueToFreq.get(value);
            if (!freqToValues.containsKey(freq)) {
                freqToValues.put(freq, new ArrayList<>());
            }
            freqToValues.get(freq).add(value);
        }

        int[] result = new int[k];
        for (int freq = nums.length, index = 0; freq >= 0 && index < k; freq--) {
            if (freqToValues.containsKey(freq)) {
                List<Integer> values = freqToValues.get(freq);
                for (Integer value : values) {
                    result[index++] = value;
                    if (index == k) {
                        break;
                    }
                }
            }
        }
        return result;
    }
}
