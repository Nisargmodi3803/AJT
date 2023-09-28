package factory_method_designpattern;

public class Factory_Method_DesignPattern {

    abstract class plan
    {
        protected double rate;
        abstract void getRate();
        
        public void calculate_bill(int units)
        {
            System.out.println("Your Bill = "+units*rate);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
