/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
        
        if(intervals.isEmpty())
            return result;
            
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2) {
                if(i1.start < i2.start)
                    return -1;
                else if(i1.start > i2.start)
                    return 1;
                else
                    return 0;
            }
        });
        
        int intervalStart = 0, intervalEnd = 0;
        Stack<Interval> stack = new Stack();
        intervalStart = intervals.get(0).start; intervalEnd = intervals.get(0).end; 
        for(int i = 1; i < intervals.size(); i++) {
            Interval local = intervals.get(i);
            if(local.start <= intervalEnd) {
                stack.push(local);
                if(local.end > intervalEnd)
                    intervalEnd = local.end;
            } else {
                stack.clear();
                result.add(new Interval(intervalStart, intervalEnd));
                intervalStart = local.start;
                intervalEnd = local.end;
                stack.add(local);
            }
        }
        result.add(new Interval(intervalStart, intervalEnd));
        return result;
    }
}