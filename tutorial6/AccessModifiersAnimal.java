package tutorial6;

class Animal
{
   String species;

   public Animal(String species)
   {
       this.species = species;
   }

   void displaySpecies()
   {
       System.out.println("Species: " + species);
   }
}
public class AccessModifiersAnimal {
	  public static void main(String[] args)
	    {
	        Animal a = new Animal("Dog");

	        System.out.println(a.species);
	        a.displaySpecies();
	    }
}