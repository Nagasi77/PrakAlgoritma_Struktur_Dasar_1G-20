package P14;

public class BinaryTree20 {
    Node20 root;

    public BinaryTree20() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        Node20 newNode = new Node20(data);
        if (root == null) {
            root = newNode;
        } else {
            Node20 current = root;
            Node20 parent;
            while (true) {
                parent = current;
                if (data < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(int data) {
        Node20 current = root;
        while (current!= null) {
            if (current.data == data) {
                return true;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    void traversePreOrder(Node20 node) {
    if (node == null) {
        return;
    }
    System.out.print(node.data + " ");
    traversePreOrder(node.left);
    traversePreOrder(node.right);
}

void traversePostOrder(Node20 node) {
    if (node == null) {
        return;
    }
    traversePostOrder(node.left);
    traversePostOrder(node.right);
    System.out.print(node.data + " ");
}

    void traverseInOrder(Node20 node) {
        if (node == null) {
            return;
        }
        traverseInOrder(node.left);
        System.out.print(node.data + " ");
        traverseInOrder(node.right);
    }

    Node20 getSuccessor(Node20 del) {
        Node20 successor = del.right;
        Node20 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node20 parent = root; 
        Node20 current = root;
        boolean isLeftChild = false;
        while (current!= null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current==null) { 
            System.out.println("Couldn't find data!");
            return;
        }else{//no child
            if (current.left == null && current.right == null) {
                if (current==root) {
                    root = null;
                }else{
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }   
            } else if (current.right==null) {//1 child left
                if (current==root) {
                    root = current.left;
                }else{
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            }else{
                //2 childs
                Node20 successor = getSuccessor(current);
                if (current==root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
}