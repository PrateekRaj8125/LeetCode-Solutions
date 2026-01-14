class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> res= new ArrayList<>();
        int ressum= Integer.MAX_VALUE;
        HashMap<String,Integer> check = new HashMap<>();
        for(int i=0;i<list1.length;i++){
            check.put(list1[i],i);
        }
        for(int j=0;j<list2.length;j++){
            if(check.containsKey(list2[j])){
                int i = check.get(list2[j]);
                int sum=i+j;
                if(sum<ressum){
                    res.clear();
                    res.add(list2[j]);
                    ressum=sum;
                }
                else if(sum==ressum){
                    res.add(list2[j]);
                }
            }
        }
        return res.toArray(new String[0]);
    }
}