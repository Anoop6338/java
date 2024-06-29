package String;

public class basic {
    public static void main(String[] args) {
        String s ="SuryaKumar is better than Kolhi";
        int pos1 = s.indexOf(" ");
        int pos2 = s.lastIndexOf(" ");

        String s1 = s.substring(0, pos1);
        String s2 = s.substring(pos1 ,pos2+1);
        String s3 = s.substring(pos2+1);

        System.out.println(s3+s2+s1);
    }
}
