package algorithms.greedyAlogoProblem;

public class HuffmanMain {
    public static void main(String[] args) throws Exception {
        String str = "abbccda";
        HuffmanCoder hf = new HuffmanCoder(str);
        String cs = hf.encode(str);
        System.out.println(cs);
        String dc = hf.decode(cs);
        System.out.println(dc);
    }
}
