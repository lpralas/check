package lucija.examples;

public class Example {

    public static void main(String[] args) {
int numberOfArguments= args.length;
for(int i=0; i<numberOfArguments; i++){
   System.out.println("Argumnets" + (i+1)+ ":" +args[i] );
}
    }
}