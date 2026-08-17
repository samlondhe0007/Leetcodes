class Solution {
    public double average(int[] salary) {

        int maxSalary=Integer.MIN_VALUE;
        int minSalary=Integer.MAX_VALUE;
        int index=0;

        int totalSalary=0;

        for (int i=0;i<salary.length;i++){
              totalSalary=totalSalary+salary[i];
                

            if (maxSalary<salary[i]){
                maxSalary=salary[i];
                index++;
            }
            if (minSalary>salary[i]){
                minSalary=salary[i];
                index++;

            }
        }
        return ((double)(totalSalary-maxSalary-minSalary)/(salary.length-2));
        
    }
}