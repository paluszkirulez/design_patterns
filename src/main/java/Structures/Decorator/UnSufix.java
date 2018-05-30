package Structures.Decorator;

public class UnSufix  extends WordDecorator{
    protected UnSufix(Word word) {
        super(word);
    }

    public String display(){
        //System.out.println(word.display()+"ing");
        return "un"+word.display();
    }
}
