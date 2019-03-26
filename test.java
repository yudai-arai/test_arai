public class test{
    public static void main(String[] args){
        int n = 0;
        String num[] = new String[]{};

    if(num.length != 1){
      System.out.println("引数1つのみ指定してください");
        System.exit(1);
}
    try{
      n = Integer.parseInt(num[0]);
    }catch(NumberFormatException e){
      System.out.println("数値を入力してください。");
       System.exit(1);
}
    if(n < 0){
      System.out.println("負の数は指定できません。");
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