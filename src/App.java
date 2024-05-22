import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Radhe Radhe");
        Scanner sc=new Scanner(System.in);
        int a1[];
        int a2[];
        int a[];
        int carry=0;
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        String s1=Integer.toString(n1);
        String s2=Integer.toString(n2);
        a1=new int[s1.length()];
        a2=new int[s2.length()];
        a=new int[s2.length()+1];
        for(int i=0, j=0;i<s1.length() &&j<s2.length();i++,j++){
            int k=s1.charAt(i)-'0';
            int l=s2.charAt(i)-'0';
            a1[i]=k;
            a2[j]=l;
            
        }
      
        for(int i=s1.length()-1, j=s2.length()-1;i>=0 &&j>=0;i--,j--){
            if (a1[i]==1&&a2[j]==1) {
               
                if(carry==0){
                   // System.out.println("Radhe Radhe1    " +a1[i] + a2[j]);
                a[s1.length()-1-i]=0;
                carry=1;
                }else if (carry==1) {
                   // System.out.println("Radhe Radhe11    " +a1[i] + a2[j]);
                    a[s1.length()-1-i]=1;
                    carry=1;
                    
                }
            }else if (a1[i]==0&&a2[j]==0) {
               // System.out.println("Radhe Radhe    " +a1[i] + a2[j]);
                if(carry==0){
                   // System.out.println("Radhe Radhe2    " +a1[i] + a2[j]);
                    a[s1.length()-1-i]=0;
                    carry=0;
                    }else if (carry==1) {
                        //System.out.println("Radhe Radhe22    " +a1[i] + a2[j]);
                        a[s1.length()-1-i]=1;
                        carry=0;
                        
                    }
            }else if ((a1[i]==0&&a2[j]==1)) {
                //System.out.println("Radhe Radhe    " +a1[i] + a2[j]);
                if(carry==0){
                    //System.out.println("Radhe Radhe3    " +a1[i] + a2[j]);
                    a[s1.length()-1-i]=1;
                    carry=0;
                    }else if (carry==1) {
                        //System.out.println("Radhe Radhe33    " +a1[i] + a2[j]);
                        a[s1.length()-1-i]=0;
                        carry=1;
                        
                    }
            }else if ((a1[i]==1&&a2[j]==0)) {
                //System.out.println("Radhe Radhe    " +a1[i] + a2[j]);
                if(carry==0){
                    //System.out.println("Radhe Radhe4    " +a1[i] + a2[j]);
                    a[s1.length()-1-i]=1;
                    carry=0;
                    }else if (carry==1) {
                        //System.out.println("Radhe Radhe44    " +a1[i] + a2[j]);
                        a[s1.length()-1-i]=0;
                        carry=1;
                        
                    }
            }

        }
        a[s1.length()]=carry;
       /*  System.out.println("Radhe Radhe  " + n1);
        System.out.println("Radhe Radhe  " + n2);
         System.out.println("Radhe Radhe  " +a1); 
         System.out.println("Radhe Radhe  " +a2.length);  */
         //System.out.println("Radhe Radhe  " +a.length); 
         for(int i=a.length-1;i>=0;i--){
         System.out.print("  " +a[i]); 
    }
    System.out.println();
    //System.out.print("Radhe Radhe carry  " +carry); 
}
}
