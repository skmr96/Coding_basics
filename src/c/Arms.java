class Arms{  
  public static void main(String[] args)  {  
    long c=0,a,temp;  
    long n=5555555555555555L;                   
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }  
} 