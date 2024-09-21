import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {

    private int result = 0;

    public int getResult() {
        return result;
    }

    public void visitNode(TreeNode node) {
    }

    public void visitLeaf(TreeLeaf leaf) {
      	result += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {

    private static final long M = (long) (Math.pow(10, 9) + 7);
    private long result = 1;

    public int getResult() {
        return (int) result;
    }

    private void compute(Tree node) {
        if (node.getColor() == Color.RED) {
            result = (result * node.getValue()) % M;
        }
    }

    public void visitNode(TreeNode node) {
      	compute(node);
    }

    public void visitLeaf(TreeLeaf leaf) {
      	compute(leaf);
    }
}

class FancyVisitor extends TreeVis {

    int sumNodes    = 0;
    int sumLeafes   = 0;

    public int getResult() {
        return Math.abs(sumNodes - sumLeafes);
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth() % 2 == 0) {
    	    sumNodes += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
    	if (leaf.getColor() == Color.GREEN) {
            sumLeafes += leaf.getValue();
        }
    }
}

public class Solution {

    private static int [] values;
    private static Color [] colors;
    private static HashMap<Integer, HashSet<Integer>> path;

    private static void expand(TreeNode parent, int index) {
        for (Integer next : path.get(index)) {
            path.get(next).remove(index);
            if (path.get(next) == null || path.get(next).isEmpty()) {
                parent.addChild(new TreeLeaf(values[next-1], colors[next-1], parent.getDepth()+1));
            } else {
                TreeNode node = new TreeNode(values[next-1], colors[next-1], parent.getDepth()+1);
                parent.addChild(node);
                expand(node, next);
            }
        }
    }

    public static Tree solve() {
        Tree root = null;
        try (Scanner scanner = new Scanner(System.in)) {
            int size = scanner.nextInt();

            values  = new int[size];
            colors  = new Color[size];
            path    = new HashMap<>();

            for (int i = 0; i < size; i++) {
                values[i] = scanner.nextInt();
            }
            for (int i = 0; i < size; i++) {
                colors[i] = Color.values()[scanner.nextInt()];
            }
            do {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if (!path.containsKey(a)) {
                    path.put(a, new HashSet<Integer>());
                }
                path.get(a).add(b);
                if (!path.containsKey(b)) {
                    path.put(b, new HashSet<Integer>());
                }
                path.get(b).add(a);
            } while (scanner.hasNext());

            if (size == 1) {
                root = new TreeLeaf(values[0], colors[0], 0);
            } else {
                root = new TreeNode(values[0], colors[0], 0);
                expand((TreeNode) root, 1);
            }
        }
        return root;
    }

    public static void main(String[] args) {
      	Tree root = solve();
		SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
      	ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
      	FancyVisitor vis3 = new FancyVisitor();

      	root.accept(vis1);
      	root.accept(vis2);
      	root.accept(vis3);

      	int res1 = vis1.getResult();
      	int res2 = vis2.getResult();
      	int res3 = vis3.getResult();

      	System.out.println(res1);
     	System.out.println(res2);
    	System.out.println(res3);
	}
}

/*
45136
56618427
14333
 */