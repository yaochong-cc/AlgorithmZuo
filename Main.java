
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int N=100;
        int V=1000;
        int testTime = 500000;
        System.out.println("测试开始");
        for(int i=0;i<testTime;i++){
            int n=(int)(Math.random()*N);
            int []arr =randomArray(n,V);
            Arrays.sort(arr);
            int num =(int)(Math.random()*N);

        }
    }
    public static int[] randomArray(int n,int v){
        int[] arr =new int [n];
        for(int i=0;i<n;i++){
            arr[i]=(int)(Math.random()*v)+1;
        }
        return arr;
    }


    //判断数组中是否存在数num
    public static boolean exist(int []arr,int num){
        if(arr ==null || arr.length == 0){
            return false;
        }
        int left =0;int right =arr.length-1;
        while(left<=right){
            int mid =(left+right)/2;
            if(arr[mid]<num){
                left=mid+1;
            }else if(arr[mid]> num){
                right =mid-1;
            }else{
                return true;
            }
        }
       return false;
    }

    //有序数组中>=num最左的位置
    public static int finalLeft(int []arr,int num){
        int left =0;int right=arr.length-1;
        int ans =-1;
        while(left<=right){
            int mid =(left+right)/2;
            //int mid =left+(right-left)>>1;
            //int mid =left +(right-left)/2;//怕溢出
            if(arr[mid]>num){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }

    // 有序数组找<=num 最右的位置

    public static int finalRight(int []arr,int num){
        int left =0;int right=arr.length-1;
        int ans =-1;
        while(left<=right){
            int mid =(left+right)/2;
            //int mid =left+(right-left)>>1;
            //int mid =left +(right-left)/2;//怕溢出
            if(arr[mid]<=num){
                ans=mid;
               left =mid+1;
            }
            else{
                right =mid-1;
            }
        }
        return ans;
    }


}