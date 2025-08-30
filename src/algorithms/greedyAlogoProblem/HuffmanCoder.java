package algorithms.greedyAlogoProblem;
import dataStructures.Heap.Heap;

import java.util.*;
public class HuffmanCoder {
    HashMap<Character, String> encoder = new HashMap<>();
    HashMap<String, Character> decoder = new HashMap<>();

    private class Node implements Comparable<Node> {
        Character data;
        Integer cost; //freq
        Node left;
        Node right;

        public Node(Character data, Integer cost){
            this.data = data;
            this.cost = cost;
            this.left = null;
            this.right = null;
        }
        @Override
        public int compareTo(Node other) {
            return this.cost - other.cost;
        }
    }

    public HuffmanCoder(String feeder) throws Exception{
        HashMap<Character, Integer> fmap = new HashMap<>();

        for(int i =0; i < feeder.length(); i++){
            char cc = feeder.charAt(i);
            fmap.put(cc, fmap.getOrDefault(cc, 0) + 1);
        }
        Heap<Node> minHeap = new Heap<>();
        Set<Map.Entry<Character, Integer>> entrySet = fmap.entrySet();

        for(Map.Entry<Character, Integer> entry: entrySet){
            Node node = new Node(entry.getKey(), entry.getValue());
            minHeap.insert(node);
        }
        while(minHeap.size() != 1) {
            Node first = minHeap.remove();
            Node second = minHeap.remove();

            Node newNode = new Node('\0', first.cost + second.cost);
            newNode.left = first;
            newNode.right = second;

            minHeap.insert(newNode);
        }
        Node ft = minHeap.remove();

        this.encoder = new HashMap<>();
        this.decoder = new HashMap<>();
        this.initEncoderDecoder(ft, "");
    }

    private void initEncoderDecoder(Node node, String output){
          if(node == null) return;

          if(node.left == null && node.right == null){
              this.encoder.put(node.data, output);
              this.decoder.put(output, node.data);
          }
          initEncoderDecoder(node.left, output+"0");
          initEncoderDecoder(node.right, output+"1");
    }

    public String encode(String source){
        String ans = "";

        for(int i = 0; i < source.length(); i++){
            ans += encoder.get(source.charAt(i));
        }
        return ans;
    }
    public String decode(String codedString){
        String key = "";
        String ans = "";
        for(int i = 0; i < codedString.length(); i++){
            key += codedString.charAt(i);
            if(decoder.containsKey(key)){
                ans += decoder.get(key);
                key = "";
            }
        }
        return ans;
    }
}
