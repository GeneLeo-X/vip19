package com.lovecoding.day08;

public class Example06 {

    public static void main(String[] args) {

        NodeManager nm = new NodeManager();

        nm.add(10);
        nm.add(8);
        nm.add(6);
        nm.add(4);
        nm.add(2);
        nm.delete(10);
        nm.delete(2);
        nm.change(6,7);

        nm.print();

        System.out.println();
        System.out.println("------------------------");

        NodeManager.Node node = nm.search(8);
        System.out.println(node.getData());
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

    /**
     * 删除节点值为data的节点
     * @param data
     */
    public void delete(int data){
        if(null == root) return;
        else{
            if(root.data == data){
                root = root.next;
            }else{
                root.delete(data);
            }

        }
    }

    /**
     * 将节点值为data的节点的节点值该为newData
     * @param data
     * @param newData
     */
    public void change(int data, int newData){
        if(null == root) return;
        else{
            if(root.data == data){
                root.data = newData;
            }else{
                root.change(data,newData);
            }

        }
    }


    public Node search(int data){
        if(null == root) return null;
        else{
            if(root.data == data){
                return root;
            }else{
                return root.search(data);
            }

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


        public void delete(int data) {
            if( this.next != null ){
                if(this.next.data == data)
                    this.next = this.next.next;
                else
                    this.next.delete(data);
            }
        }

        public void change(int data, int newData) {
            if( this.next != null ){
                if(this.next.data == data)
                    this.next.data = newData;
                else
                    this.next.change(data,newData);
            }

        }

        public Node search(int data) {
            if (this.next != null) {
                if (this.next.data == data)
                    return this.next;
                else
                    return this.next.search(data);
            }
            return null;
        }

    }
}