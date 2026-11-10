package Object;

public class Tree {
   String name;
   int height;
   String fruit;
   int width;
   Tree(String name){
	   this.name=name;
   }
   
   Tree(String name,int height,String fruit){
	   this(name);
	   this.height=height;
	   this.fruit=fruit;
   }
   Tree(String name,int height,String fruit,int width){
	   this(name,height,fruit);
	   this.width=width;
   }
   public static void main(String[] args) {
//	Tree t1=new Tree("Mango tree",20,"Mango",15);
	   Tree t1=new Tree("Banana Tree",20,"banana") ;
	System.out.println(t1.name);
	System.out.println(t1.height);
	System.out.println(t1.fruit);


	 
	
}                                            
   
}
