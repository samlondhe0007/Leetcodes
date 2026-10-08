class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            int x = arr1[i];
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            int x = arr2[i];
            int count = map.get(x);

            while (count > 0) {
                arr1[index] = x;
                index++;
                count--;
            }
            map.remove(x);
        }

        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list);
        
        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i);
            int count = map.get(x);

            while (count > 0) {
                arr1[index] = x;
                index++;
                count--;
            }
        }

        return arr1;
    }
}