public class kt14 {
    public static void main(String[] args) {
        String numbrimark = numbrimark();
        System.out.println("suvaline numbrimark: " + numbrimark);
}
    public static String numbrimark() {
        String tähed = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder numbrimark = new StringBuilder();

        // teeb kolm suvakat numbrit
        for (int i = 0; i < 3; i++) {
            int number = (int) (Math.random() * 10);
            numbrimark.append(number);
    }       
    // teeb kolm suvakat tahte
        for (int i = 0; i < 3; i++) {
            int index = (int) (Math.random() * tähed.length());
            char täht = tähed.charAt(index);
            numbrimark.append(täht);
    }

        
        return numbrimark.toString();
   
}}
