package com.lovecoding.day09;

public class Example12 {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        //8、3、10、1、6、14、4、7、13
        bt.add(8);
        bt.add(3);
        bt.add(10);
        bt.add(1);
        bt.add(6);
        bt.add(14);
        bt.add(4);
        bt.add(7);
        bt.add(13);

        System.out.println("---------打印----------");

        bt.print();
    }
}

class BinaryTree {

    Node root;

    public void add(int data) {

        if(null == root) root = new Node(data);
        else root.addNode(data);
    }

    public void print() {

        if(null != root) root.printNode();
    }

    private class Node {

        private  int data;

        Node left;

        Node right;

        public Node(int data) {
            this.data = data;
        }

        public void addNode(int data) {

            if(this.data > data){//左侧放
                if(null == this.left) this.left = new Node(data);
                else this.left.addNode(data);
            }

            if(this.data <= data) {
                if(null == this.right) this.right = new Node(data);
                else this.right.addNode(data);
            }
        }

        /**
         * 递归按照左根右（中序）方式打印节点内容
         */
        public void printNode() {

            if(null != this.left) {
                this.left.printNode();
            }
            System.out.print(this.data + "->");

            if(null != this.right){
                this.right.printNode();
            }
        }


        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }



    }
}