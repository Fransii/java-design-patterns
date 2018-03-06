package patterns.structural.facade.example1;

class Facade {
    private FirstComplicatedClass firstComplicatedClass;
    private SecondComplicatedClass secondComplicatedClass;
    private ThirdComplicatedClass thirdComplicatedClass;

    Facade(FirstComplicatedClass firstComplicatedClass, SecondComplicatedClass secondComplicatedClass, ThirdComplicatedClass thirdComplicatedClass){
        this.firstComplicatedClass = firstComplicatedClass;
        this.secondComplicatedClass = secondComplicatedClass;
        this.thirdComplicatedClass = thirdComplicatedClass;
    }

    public void doSomething(){
        firstComplicatedClass.doFirstComplicatedStuff();
        secondComplicatedClass.doSecondComplicatedStuff();
        thirdComplicatedClass.doThirdComplicatedStuff();
    }
}
