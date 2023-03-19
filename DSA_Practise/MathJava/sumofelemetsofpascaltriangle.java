package DSA_Practise.MathJava;

public class sumofelemetsofpascaltriangle {
    public static void main(String[] args) {
        System.out.println(sum(6));
    }

    static int sum(int row){
        int sumoftherowelements = (1<<row);
        return sumoftherowelements;
    }
}
