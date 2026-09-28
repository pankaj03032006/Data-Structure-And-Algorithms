public class remove {
    public static void main(String[] args){
        String n="1231";
        char d='2';
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n.length(); i++){
            if(n.charAt(i)==d){
                String temp=n.substring(0,i) + n.substring(i+1);
                int val=Integer.parseInt(temp);
                if(val>max){
                    max=val;
                }
            }
        }
        System.out.println(String.valueOf(max));
    }
}
