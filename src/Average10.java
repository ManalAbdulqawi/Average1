public class Average10 {
    public static void main(String[] args) {
        int  [] nums={ 10,10,10,10,10,10,10,10,10,10};
        int sum=0,total=0;
        for(int i=0;i<nums.length;i++)
        {total=total+nums[i];}
        sum= total/nums.length;
        System.out.println(sum);
    }
}
