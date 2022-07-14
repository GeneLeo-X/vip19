package com.lovecoding.day08;

public class Example06 {

    public static void main(String[] args) {

        NodeManager nm = new NodeManager();

        nm.add(10);
        nm.add(8);
        nm.add(6);
        nm.add(4);
        nm.add(2);

        nm.print();
    }
}

/**
 * 增删改查
 */
class NodeManager {

    Node root;
    /**
     * 添加节点
     * @param data
     */
    public void add(int data) {
        if(null == root) root = new Node(data);
        else root.addNode(data);
    }

    /**
     * 输出节点元素
     */
    public void print() {

        if(null != root){
            System.out.print(root.getData() + "->");
            root.printNode();
        }


    }

    class Node {
        private int data;

        private Node next;//存在是地址，指向的是下一个节点

        public Node(int data) {
            this.data = data;
        }

        /**
         * 每一个节点操作
         *
         * 递归调用 - 自己调用自己
         * @param data
         */
        public void addNode(int data) {
            if(null == this.next) this.next = new Node(data);
            else this.next.addNode(data);
        }

        /**
         * 递归打印下面的每一个节点
         */
        public void printNode() {
            if(null != this.next){
                System.out.print(this.next.data + "->");
                this.next.printNode();
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