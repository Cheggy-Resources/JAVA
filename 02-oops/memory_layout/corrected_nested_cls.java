public class corrected_nested_cls {
    int x;
    public static corrected_nested_cls obj = new corrected_nested_cls(); 
    private corrected_nested_cls(){
        x = 40;
        onm = this.new inner_cls();
    }
    public static corrected_nested_cls ret(){
        return obj;
    }
    public inner_cls onm;

    public class inner_cls{
        int y;
        private inner_cls(){
            y = 345;
        }
        public void display(){
            System.out.println("This is display method of inner class");
        }
    } 
}
