package HuffmanCoding.HuffmanImplementation;

import java.util.PriorityQueue;

public class Node {
    char word;
    int freq;
    Node right;
    Node left;

    public Node(char w, int f, Node l, Node r) {
        word = w;
        freq = f;
        right = r;
        left = l;
    }

    public void printHCodes(char word[], int freq[]) {
        PriorityQueue<Node> name = new PriorityQueue<>((n1, n2) -> n1.freq - n2.freq);
        for (int i = 0; i < word.length; i++) {
            name.add(new Node(word[i], freq[i], null, null));
            while (name.size() > 1) {
                Node l = name.poll();
                Node r = name.poll();
                name.add(new Node('$', l.freq + r.freq, l, r));
            }
            printRec(name.peek(), "");
        }
    }

    public void printRec(Node root, String s) {
        if (root.word != '$') {
            System.out.println(root.word + " " + s);
            return;
        }
        printRec(root.left, s + "0");
        printRec(root.right, s + "1");
    }
}