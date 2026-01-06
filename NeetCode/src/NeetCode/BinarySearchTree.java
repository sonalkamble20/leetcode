package NeetCode;

public class BinarySearchTree {
    private BinaryNode root;

    public BinarySearchTree(BinaryNode root) {
        this.root = root;
    }

    /**
     * Internal method to find an item in a subtree
     * @param x is item to search for.
     * @param target the node that roots the subtree
     * @return true if item is found; false otherwise.
     */

    private boolean contains(int x, BinaryNode target)
    {
        if(target == null)
            return false;

        else if(x < target.data)
            contains(x, target.left);
        else if(x > target.data)
            contains(x, target.right);

        return true;
    }

    /**
     * Internal method to find the smallest item in a subtree
     * @param target the node that roots the subtree.
     * @return node containing the smallest item.
     */

    private BinaryNode findMin(BinaryNode target)
    {
        if(target == null)
            return null;

        else if(target.left == null)
            return target;

        return findMin(target.left);
    }

    /**
     * Internal method to find the largest item in a subtree
     * @param target the node that roots the subtree.
     * @return node containing the smallest item.
     */

    private BinaryNode findMax(BinaryNode target)
    {
        if(target == null)
            return null;

        else if(target.right == null)
            return target;

        return findMax(target.right);
    }

    /**
     * Internal method to insert into a subtree
     * @param x the item to insert.
     * @param target the node that roots the subtree.
     * @return the new root of the subtree.
     */

    private BinaryNode insert(int x, BinaryNode target)
    {
        if(target == null)
            root = new BinaryNode(x, null, null);

        else if(x < target.data)
            target.left = insert(x, target.left);
        else if(x > target.data)
            target.right = insert(x, target.right);

        return root;
    }

    /**
     * Internal method to remove from a subtree.
     * @param x the item to remove.
     * @param target the node that roots the subtree.
     * @return the new root of the subtree.
     */

    private BinaryNode remove(int x, BinaryNode target)
    {
        if(target == null)
            return null;

        else if(x > target.data)
            target.right = remove(x, target.right);
        else if(x < target.data)
            target.left = remove(x, target.left);

        else
        {
            if(target.left == null && target.right == null)
                return null;

            else if(target.left == null)
                return target.right;
            else if(target.right == null)
                return target.left;

            else {
                target.data = findMax(target.left).data;
                target.left = remove(target.data, target.left);
            }
        }

        return target;
    }
}
