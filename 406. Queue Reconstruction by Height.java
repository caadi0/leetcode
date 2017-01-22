public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        
        if(people.length == 0 || people[0].length == 0)
            return people;
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] a1, int[] a2) {
                if(a1[0] < a2[0])
                    return 1;
                else if(a1[0] > a2[0])
                    return -1;
                else {
                    if(a1[1] < a2[1])
                        return -1;
                    else if(a1[1] > a2[1])
                        return 1;
                    else
                        return 0;
                }
            }    
        });
        List<Integer[]> list = new ArrayList<Integer[]>();
        
        for(int i = 0; i < people.length; i++) {
            list.add(null);
        }
        
        for(int i = 0; i < people.length; i++) {
            int position = people[i][1];
            Integer[] temp = new Integer[2];
            temp[0] = Integer.valueOf(people[i][0]);
            temp[1] = Integer.valueOf(position);
            list.add(temp[1], temp);
        }
        
        Iterator<Integer[]> iter = list.iterator(); int k = 0;
        while(iter.hasNext()) {
            Integer[] temp = iter.next();
            if(temp == null)
                continue;
            people[k][0] = temp[0];
            people[k][1] = temp[1];
            k++;
        }
        return people;
    }
}