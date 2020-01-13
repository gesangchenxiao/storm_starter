public class Context implements IPay{
    private IPay pay;
    protected String name;
    protected int price;

    public Context(IPay pay, String name, int price) {
        this.pay = pay;
        this.name = name;
        this.price = price;
    }
    public void pay() {
        pay(this);
    }

    public void pay(Context ctx) {
        pay.pay(ctx);
    }
}
