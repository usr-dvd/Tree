package company;


public class Main {

    public static void main(String[] args) {

        TreeNode root = new TreeNode();
        root.setData(3);
        root.insert(1);
        root.insert(10);
        root.printAllLeafs();
    }
}
