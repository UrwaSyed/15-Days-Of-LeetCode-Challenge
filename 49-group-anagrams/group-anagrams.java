class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Arrays.sort(strs, new Comparator<String>(){
            public int compare(String str1, String str2){
                char[] arr1 = str1.toCharArray();
                char[] arr2 = str2.toCharArray();
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                return new String(arr1).compareTo(new String(arr2));
            }
        });

        List<List<String>> res = new ArrayList<>();
        int i = 0;
        while(i < strs.length){
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            char[] keyArr = strs[i].toCharArray();
            Arrays.sort(keyArr);
            String key = new String(keyArr);
            i++;

            while(i< strs.length){
                char[] tempArr = strs[i].toCharArray();
                Arrays.sort(tempArr);
                String tempKey = new String(tempArr);
                if(tempKey.equals(key)){
                    group.add(strs[i]);
                    i++;
                }
                else{
                    break;
                }
            }
            res.add(group);
        }
        return res;
    }
}