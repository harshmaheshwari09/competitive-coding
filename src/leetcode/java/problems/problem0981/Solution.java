package leetcode.java.problems.problem0981;

import java.util.*;

/**
 * Ques: https://leetcode.com/problems/time-based-key-value-store/description/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
class TimeMap {

    Map<String, List<TimeValue>> timeMap;

    public TimeMap() {
        timeMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!timeMap.containsKey(key)) {
            timeMap.put(key, new ArrayList<>());
        }
        timeMap.get(key).add(new TimeValue(timestamp, value));
    }

    public String get(String key, int timestamp) {
        if (!timeMap.containsKey(key)) {
            return "";
        }
        List<TimeValue> values = timeMap.get(key);
        int left = 0, right = values.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            int currTimestamp = values.get(mid).timestamp;
            if ( currTimestamp == timestamp) {
                return values.get(mid).value;
            }

            if (currTimestamp < timestamp) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right < 0 ? "" : values.get(right).value;
    }

    public class TimeValue {
        int timestamp;
        String value;

        public TimeValue(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }
}