
public class TesterMyString {

    public static void main(String[] args) {
        testLowerCase();
        testContains();
    }

    private static void testLowerCase() {
        int num_tests = 3;
        System.out.println("Testing 'lowerCase':");

        boolean test1 = MyString.lowerCase("").equals("");
        boolean test2 = MyString.lowerCase("EaSy PeAsY LeMoN SqUeEzy").equals("easy peasy lemon squeezy");
        boolean test3 = MyString.lowerCase("i love infi and intro").equals("i love infi and intro");

        int passed = (test1 ? 1 : 0) + (test2 ? 1 : 0) + (test3 ? 1 : 0);
        String verdict = passed == num_tests ? "(Passed)": "Failed";

        System.out.println("Passed " + passed + "/" + num_tests + " tests " + verdict);
    }

    private static void testContains() {
        int num_tests = 5;
        System.out.println("Testing 'contains':");

        boolean test1 = MyString.contains("baba yaga", "baba");
        System.out.println("test "+ test1);

        boolean test2 = MyString.contains("baba yaga", "");
        System.out.println("test "+ test2);

        boolean test3 = !MyString.contains("baba yaga", "John Wick is the baba yaga");
        System.out.println("test "+ test3);

        boolean test4 = !MyString.contains("baba yaga", "Yaga");
        System.out.println("test "+ test4);

        boolean test5 = !MyString.contains("baba yaga", "babayaga");
        System.out.println("test "+ test5);


        int passed = (test1 ? 1 : 0) + (test2 ? 1 : 0) + (test3 ? 1 : 0) + (test4 ? 1 : 0) +
                     (test5 ? 1 : 0);
        String verdict = passed == num_tests ? "(Passed)": "Failed";

        System.out.println("Passed " + passed + "/" + num_tests + " tests " + verdict);
    }
}
