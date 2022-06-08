
public class fabonancii {
public static int fabonanci(int input){
    if(input ==0|| input==1){
        return input;
    }
    else
    {
        return fabonanci(input-1)+fabonanci(input-2);
    }}
    public static void main(String[] args){
        System.out.println(" fabonanci numbers ;");
        int input =5;
        int j=0;
        for(int i=0;i<=input;i++){
        int result =fabonanci(j);
        System.out.print(result +" ");
        j++;
    }
    }
}    
}
