public class nested_cls {
    int x;
    public static nested_cls obj = new nested_cls(); 
    private nested_cls(){
        x = 40;
    }
    public static nested_cls ret(){
        return obj;
    }
    public inner_cls onm = obj.new inner_cls();;

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
