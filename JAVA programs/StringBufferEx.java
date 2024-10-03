public class StringBufferEx {
    public static void main(String[] args){
    StringBuffer x= new StringBuffer("navin");
    StringBuffer y= new StringBuffer("nlimal");
   
    System.out.println(x.reverse());
    System.out.println(x.indexOf("a"));
    System.out.println(y.substring(2,4));
    System.out.println(y.replace(0,2, "j"));
    System.out.println(y.lastIndexOf("a"));
    System.out.println(x.delete(2, 4));

       
    }
    
}
