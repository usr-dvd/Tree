package company;

public class TreeNode {
    private int data;
    private TreeNode lChild;
    private TreeNode rChild;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getlChild() {
        return lChild;
    }

    public void setlChild(TreeNode lChild) {
        this.lChild = lChild;
    }

    public TreeNode getrChild() {
        return rChild;
    }

    public void setrChild(TreeNode rChild) {
        this.rChild = rChild;
    }

    public void insert(int dataToInsert) {
        if (this.data < dataToInsert) {
            if (this.rChild == null) {
                TreeNode newNode = new TreeNode();
                newNode.setData(dataToInsert);
                this.rChild = newNode;
            } else {
                this.rChild.insert(dataToInsert);
            }
        }
        else {

            if (this.data < dataToInsert) {
                if (this.lChild == null) {
                    TreeNode newNode = new TreeNode();
                    newNode.setData(dataToInsert);
                    this.lChild = newNode;
                } else {
                    this.lChild.insert(dataToInsert);
                }
            }

        }
    }
    public boolean isLeaf(){
        boolean isLEaf = false;
        if (rChild == null && lChild == null) {
            isLEaf = true;
        }
        return isLEaf;
    }
//   public int getMinValue(){
        int min;
//        if (lChild == null) {
//            min = this.data;
//        }
//        else {
//            min = this.lChild.getMinValue();
//        }

//        return min;
//    }

    public int getMaxValue(){

        return 0;
    }
    public void printAllLeafs() {
        if (lChild == null && rChild == null) {
            System.out.println(this.data);
        }
        else {
         if (lChild != null) {
                this.lChild.printAllLeafs();
            } else if (rChild != null) {
                this.rChild.printAllLeafs();
            }
        }

    }
}
