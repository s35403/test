// TODO: musimy dodac brakujace klasy

// OK, ja dodam 'Adder', a s35400 doda 'Subtractor'.

public class Main {
    public static void main(String[] args){
        Adder adder = new Adder();
        System.out.println(adder.add(1, 2));

        Substractor subtractor = new Substractor();

        System.out.println(subtractor.substract(6,3));
    }
}
