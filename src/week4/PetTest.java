package week4;

/**
 *
 * @author Dillon Davis
 */
public class PetTest {

    public static void main(String[] args) {
        C11Pet pc1 = new PetCat();
        C11Pet pd1 = new C11PetDog();
        pc1.setPetName("Mittens");
        pd1.setPetName("Fido");
        System.out.println(pc1.speak());
        System.out.println(pd1.speak());
        System.out.println(pc1);
        System.out.println(pd1);
    }
}
