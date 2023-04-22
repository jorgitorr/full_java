package ejercicios.creacion;

public class MyMagicExceptionTest {
    public static void magic(int number) throws MyMagicException{
        if(number==8)
            throw new MyMagicException("you hit the magic number");
        
        System.out.println("Hello");
        
    }

    public static void main(String[] args) {
        try{
            magic(9);
            magic(8);
        }catch(MyMagicException ex){
            ex.printStackTrace();
        }
    }
}
