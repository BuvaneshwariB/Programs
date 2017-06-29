public class SingletonClass {
     
    private static SingletonClass myObj= new SingletonClass();
    /**
     * Create private constructor
     */
    private SingletonClass(){
         
    }
    /**
     * Create a static method to get instance.
     */
    public static SingletonClass getInstance(){
        /*if(myObj == null){
            myObj = new SingletonClass();
            
        }
        */
        return myObj;
        
    }
     
    public void getSomeThing(){
        // do something here
        System.out.println("I am here....");
        System.out.println(myObj);
    }
     
    public static void main(String a[]){
        SingletonClass st = SingletonClass.getInstance();
        st.getSomeThing();
    }
}