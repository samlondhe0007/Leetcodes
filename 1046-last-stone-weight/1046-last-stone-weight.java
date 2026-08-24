class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer>queue=new PriorityQueue<>(Collections.reverseOrder());

       for (int i=0;i<stones.length;i++){
        queue.add(stones[i]);
       }

       while(queue.size()>1){
        int first = queue.poll();
        int second = queue.poll();

        if (first!=second){
            queue.add(first-second);

        }
       }

       if (queue.isEmpty()){
        return 0;
       }
        return queue.poll();
    }
}