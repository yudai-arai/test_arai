public class test{
    public static void main(String[] args){
        int n = 0;
        String num[] = new String[]{};

    if(num.length != 1){
      System.out.println("����1�̂ݎw�肵�Ă�������");
        System.exit(1);
}
    try{
      n = Integer.parseInt(num[0]);
    }catch(NumberFormatException e){
      System.out.println("���l����͂��Ă��������B");
       System.exit(1);
}
    if(n < 0){
      System.out.println("���̐��͎w��ł��܂���B");
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