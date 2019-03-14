public class test{
	public static void main(String[] args){
		int n = 0;
		String num[] = new String[]{"10"};

	 if(num.length != 1){
	  System.out.println("ˆø”1‚Â‚Ì‚İw’è‚µ‚Ä‚­‚¾‚³‚¢");
      System.exit(1);
  }

    try{
      n = Integer.parseInt(num[0]);
    }catch(NumberFormatException e){
      System.out.println("”’l‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
      System.exit(1);  
    }

  	for(int i = 0 ; i< n; i++){
	   if(i == 1001){
	     break;
	   }
	     System.out.println("Hello World");
}
}
}