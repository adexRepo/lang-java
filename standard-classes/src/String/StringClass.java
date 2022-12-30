package String;
class StringClass {
    // String adalah Object

    /*
     * 1. String toLowerCase() >> jadi huruf kecil
     * 2. String toUpperCase() >> jadi huruf besar
     * 3. int length() >> dapetkan panjang string
     * 4. boolean startWith(value) >> check apakah dimulai dari string value
     * 5. boolean endWith(value) >> check apakah diakhiri dengan string value
     * 6. String[] split(value) >> memoting string dengan string value
     * 
     * lengkapny ada di :
     * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/String
     * .html
     * https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/String
     * .html
     * bagian method summary
     */

    public static void main(String[] args) {
        String name = "Adek Kristiyanto";
        String name2 = "Adek|Kristiyanto";
        System.out.println("name.toLowerCase : " + name.toLowerCase()); // lowercase
        System.out.println("name.toUpperCase : " + name.toUpperCase()); // uppercase
        System.out.println("name.length      : " + name.length()); // length
        System.out.println("name.startsWith  : " + name.startsWith("adek")); // prefix
        System.out.println("name.endsWith    : " + name.endsWith("Kristiyanto")); // suffix
        System.out.println("---------------------------------");
        String[] names = name2.split("|");
        for (String ss : names) {
            System.out.print(ss + "-"); // uppercase
        }
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("name.isBlank    : " + name.isBlank());
        System.out.println("name.isEmpty    : " + name.isEmpty());
        System.out.println("name.equals     : " + name.equals("names"));
        System.out.println("name.charAt     : " + name.charAt(3));
        System.out.println(name.toCharArray());

    }
}