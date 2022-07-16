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

        System.out.println("\n------------------------");

        nm.delete(2);

        nm.print();

        System.out.println("\n-----------------------");

        nm.update(3 , 666);

        //nm.currentIndex = 0;

        nm.print();

        System.out.println("\n-----------------------");

        nm.insert(3 , 555);

        nm.print();

        System.out.println("\n-------------------");

        int data = nm.get(0);

        System.out.println("查找的索引位置元素为： " + data);
    }
}

/**
 * 增改删查
 */
class NodeManager {

    Node root;

    int currentIndex;
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
     * 根据元素删除节点
     * @param data
     */
    public void delete(int data) {
        if(null != root) {
            if(root.getData() == data){
                root = root.next;
            }else{
                root.deleteNode(data);
            }
        }
    }

    /**
     * 根据索引位置更新元素 - 头节点位置 0
     * @param index
     * @param data
     */
    public void update(int index, int data) {

        if(null != root){
            if(currentIndex == index){//要更新根节点了
                root.setData(data);
            }else {
                root.updateNode(index , data);
            }
        }


    }

    /**
     * 插入节点元素 - 头插法（推荐）、尾插法
     * @param index
     * @param data
     */
    public void insert(int index, int data) {
        currentIndex = 0;
        if(null != root){
            if(currentIndex == index) {
                Node newNode = new Node(data);
                newNode.next = root;
                root = newNode;
            }else {
                root.insert(index , data);
            }
        }


    }

    /**
     * 根据索引位置查找元素
     * @param index
     * @return
     */
    public int get(int index) {
        currentIndex = 0;

        if(null != root){
            if(currentIndex == index) return root.getData();
            else return root.getNode(index);//注意：此处的return
        }
        return -1;//没找到索引位置
    }

    class Node {
        private int data;

        private Node next;//存在是地址，指向的是下一个节点

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
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

        /**
         * 递归查找元素删除
         * @param data
         */
        public void deleteNode(int data) {

            if(null != this.next){
                if(this.next.data == data) this.next = this.next.next;
                else this.next.deleteNode(data);
            }
        }


        /**
         * 递归根据索引查找更新元素
         * @param index
         * @param data
         */
        public void updateNode(int index, int data) {

            if(null != this.next){
                if(++currentIndex == index){
                    this.next.data = data;
                }else {
                    this.next.updateNode(index , data);
                }
            }
        }

        /**
         * 递归查找索引位置并头插法插入元素
         * @param index
         * @param data
         */
        public void insert(int index, int data) {
            if(null != this.next){
                if(++currentIndex == index){
                    Node newNode = new Node(data);
                    newNode.next = this.next;
                    this.next = newNode;
                }else {
                    this.next.insert(index , data);
                }
            }
        }

        public int getNode(int index) {
            if(null != this.next){
                if(++currentIndex == index) return this.next.data;
                else return this.next.getNode(index);
            }

            return -1;
        }
    }
}