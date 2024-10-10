public class BS_Search_Space {
    public static void main(String[] args) {
        int low =0;
        int high=200;
        int target_time=2;
        int distance=400;
        int ans=-1;
        while(low<=high){
            int mid = high+low/2;
            if(Check(mid, distance, target_time)){ans=mid; high=mid-1;}
            else low=mid+1;
        }
        System.out.println(ans);
    }
    public static boolean Check(int speed, int distance, int target_time){
        int dt=speed*target_time;
        return (dt>=distance);
        
    }
}
