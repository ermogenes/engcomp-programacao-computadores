public class TesteTTS{
public static void main(String args[]){
try{
Runtime.getRuntime().exec("cscript diga.vbs hello there");
}
catch(Exception e){}
}
}



