 class A{  
 void msg(){System.out.println("Hello java");}  
}  
  
 class DemoThree extends A{  
     void msg(){System.out.println("Hello java");}//C.T.Error  
 public static void main(String args[]){  
   DemoThree obj=new DemoThree();  
   obj.msg();  
   }  
}  