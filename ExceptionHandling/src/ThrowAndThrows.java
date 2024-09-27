public class ThrowAndThrows {   
     
    public static void method() throws Exception {   
        throw new Exception("Exception in program.");     
    }  
    public static void main(String args[]) throws Exception{  
        try  
        {  
            method();  
        }   
        catch (Exception e)   
        {  
            e.printStackTrace();  
        }     
  }    
}    