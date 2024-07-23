class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
         Integer[] indices = new Integer[names.length];
        for (int i = 0; i < names.length; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return Integer.compare(heights[i2], heights[i1]);
            }
        });

        String[] sortedNames = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            sortedNames[i] = names[indices[i]];
        }

        return sortedNames;
    }
}
        
    
