import java.util.Scanner;
public class BinaryNumberConsecutive1
{
    public static void main(String[] args) 
    {
        int n, count = 0,count1=0, a;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any decimal number:");
        n = s.nextInt();
        while(n > 0)
        {
            a = n % 2;
            
            x = x + "" + a;
            n = n / 2;
        }
        System.out.println("Binary number:"+x);
        char arr[]=x.toCharArray();
        for(int i=0;i<arr.length;i++){
        	if(arr[i]=='1'){
        		
        		count++;
        	}
        	else if(arr[i]=='0'){
        		count=0;
        	}
        	if(count>count1){
        		count1=count;
        		
        	}
        }
        System.out.println("No. of 1s:"+count1);
        
    }
}