public class MyClass {
    public static void main(String[] args){
        IPay rmbPay=new RMBPay();
        Context context=new Context(rmbPay,"ss",22);
        context.pay();
    }
}
