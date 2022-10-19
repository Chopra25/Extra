class Chef{
    public void makeChicken(){
        System.out.println("The chef makes chicken");
    }

    public void makeSalad(){
        System.out.println("The chef makes salad");
    }

    public void makeSpecialDish(){
        System.out.println("The chef makes a special dish");
    }
}

class ItalianChef extends Chef{
    public void makePasta(){
        System.out.println("The chef makes pasta");
    }

    @Override
    public void makeSpecialDish(){
        System.out.println("The chef makes spaghetti");
    }
}

public class ChefDemo{
    public static void main(String [] args){
        Chef myChef = new Chef();
        myChef.makeSpecialDish();

        ItalianChef myItalianChef = new ItalianChef();
        myItalianChef.makeSpecialDish();
    }
}
