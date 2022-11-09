# GeekforGeekGreedy
                            Huffman Coding
                Given ['a', 'd', 'b', 'e', 'f'] and [10, 50, 20, 40, 80]

Create leaf nodes and build a min heap h of all the leaves initially.
while h.size() > 1:
    left = h.extractMin()
    right = h.extractMin()
    create a new trues node with
        -character a $
        -Frequency as left.freq + right.freq
        -Left and right children as left and right respectively.
    Insert the new node into h
The only node left in h is our required Binary Tree.

[a|10], [b|20], [e|40], [d|50], [f|80]

   [$|200]
   /    \
[f|80] [$|120]
       /    \
  [b|50]   [$|70]
         /    \
     [$|30]   [e|40]
    /     \
[a|10]  [b|20]
