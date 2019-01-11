package training;

public class MyTree {

    Node root;

    public void add(int i){
        root = addRecursive(root, i);
    }

    public boolean contains(int i){
        return containsRecursive(root, i);
    }

    public void delete(int i){
        root = deleteRecursive(root, i);
    }

    private Node addRecursive(Node current, int value){
        if (current == null){
            return new Node(value);
        }

        if (value < current.value){
            current.left = addRecursive(current.left, value);
        }
        else if(value > current.value){
            current.right = addRecursive(current.right, value);
        }

        return current;
    }

    private Node deleteRecursive(Node current, int value){
        if (current == null){
            return null;
        }

        if (current.value == value){
            if (current.left == null && current.right == null){
                return null;
            }

            if(current.left == null && current.right != null){
                return current.right;
            }

            if (current.left != null && current.right == null){
                return current.left;
            }

            if (current.left != null && current.right != null){

                int smallestValue = findSmallestValue(current);

                current.value = smallestValue;

                current.right = deleteRecursive(current.right, smallestValue);

                return current;
            }
        }

        if (current.value > value){
            current.left = deleteRecursive(current.left, value);
            return current;
        }

        current.right = deleteRecursive(current.right, value);
        return  current;
    }

    private boolean containsRecursive(Node current, int value){
        if (current == null){
            return false;
        }

        if (current.value == value){
            return true;
        }

        if(current.value > value){
            return containsRecursive(current.left, value);
        }

        if(current.value < value){
            return containsRecursive(current.right, value);
        }
        return false;
    }

    private int findSmallestValue(Node root){
        if (root.left == null){
            return root.value;
        }
        return findSmallestValue(root.left);
    }
}
