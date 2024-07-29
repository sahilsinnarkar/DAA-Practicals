class MajorityElement{

    private static int majorityelement(int nums[]){

        int maxcount=0;
        int index=-1;

        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > maxcount){
                maxcount=count;
                index=i;
            }
        }

        if(maxcount > (nums.length / 2)){
            return nums[index];
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};

        int key = majorityelement(arr);

        System.out.println("Majority element = " + key);
    }
}