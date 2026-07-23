
class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals.isEmpty()) return true;

        Collections.sort(intervals, (a, b) -> a.start - b.start);

        int endTime = intervals.get(0).end;

        for(int i = 1; i < intervals.size(); i++){
             if(intervals.get(i).start < endTime){
                return false;
            }
            endTime = Math.max(endTime, intervals.get(i).end);
        }
        return true;
            
        }
        
}
    