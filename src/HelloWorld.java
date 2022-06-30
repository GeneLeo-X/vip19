/**
 *
 * 快捷提示：
 *  主函数：psvm + enter
 *  输出语句： sout + enter
 *
 *  ctrl + D : 删除代码行
 *  ctrl + Z ： 撤销上次操作
 *
 *  ctrl + C : 复制
 *  ctrl + V ：粘贴
 *
 *  alt + 方向箭头（上、下）
 *  ctrl + X ： 剪切
 *
 *  alt + 方向箭头（左、右） 回到上次操作的位置，右再回来。
 *
 *  ctrl + o ： 快速定位方法
 *
 *  ctrl + shift + R : 快速找寻文件
 *
 *  ctrl + F : 查询/替换本文件中文本内容
 *
 *  ctrl + H ： 匹配工程、模块、目录下面的某种文件格式（*.* - 全内容匹配）
 *
 *
 *  注释：
 *
 *  Java中三种注释方式：
 *   1、文档注释 ：/**  *杠 结尾
 *       位置不同： 类注释 、方法注释
 *   2、单行注释  // :
 *      场景： 1)某一行代码暂时不需要了，注释掉。2) 解释该行代码作用
 *   3、多行注释 : /*   *杠 结尾    选中多行代码，使用ctrl + shift + /
 */

import org.junit.Test;

/**
 * 描述该类作用，作者信息，创建日期等
 *
 *  通常带作用域的{} 称为结构定义语句 。 以;号结尾的称为 功能性语句
 * @author cc
 * @createTime 2022/6/30
 */
public class HelloWorld {

    //public int i = 19;

    //非static修饰的方法中可以调用static修饰的东西，static修饰的内部，不可以调用非static修饰的变量或者是方法
    //因为static修饰的东西出现的早
    public static int I = 15;
    /**
     * 方法作用
     * @param args
     */
    public static void main(String[] args) {

        int a = 20;
        //System.out.println("test , World");
        System.out.println("Hello ， World");

        /*System.out.println("111111");

        System.out.println("222222");*/

        System.out.println(a);

        testFn();
    }

    public static void testFn(){
        System.out.println(I);

        //System.out.println(a);
    }

    /**
     * 注解：可以将任何一个公有的（public），无返回值(void)的方法变为单元测试方法--可以独立运行
     */
    @Test
    public void testFn1(){
        System.out.println(I);
    }

}
