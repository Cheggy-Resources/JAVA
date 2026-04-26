public class static_field{
    int x; 
    public static static_field obj = new static_field();
    private static_field(){
        x = 10;
    }
};
