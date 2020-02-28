
public abstract class Duck {

    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public void PerformFly() {
        flyBehavior.Fly();
    }

    public void PerformQuack() {
        quackBehavior.Quack();
    }

    public void Swim() {
        System.out.print("Swim~");
    }

    //
    public void setFlyBehavior(IFlyBehavior behavior)
    {
        flyBehavior = behavior;
    }

    public void setQuackBehavior(IQuackBehavior behavior)
    {
        quackBehavior = behavior;
    }
}

interface IFlyBehavior {
    public void Fly();
}

interface IQuackBehavior {
    public void Quack();
}
