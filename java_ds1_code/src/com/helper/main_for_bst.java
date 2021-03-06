package com.helper;

import java.util.Comparator;

import com.bjtu.Tree.BinarySearchTree;
import com.bjtu.Tree.BinaryTree.Visitor;
import com.bjtu.Tree.Printer.BinaryTrees;
import com.bjtu.Tree.Printer.Printer;
import com.bjtu.Tree.Printer.BinaryTrees.PrintStyle;

public class main_for_bst {

    
    public static void main(String[] args) {

        // test1();

        // test2();
        test3();
        // test4();

    }

    public static void test4(){
        BinarySearchTree<Integer> bst1 = new BinarySearchTree<>();

        Integer []arr = new Integer[]{
        // 7,4,9,2,1
        4,2,5,1,3,6
        };

        // Integer[] arr = new Integer[] { 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

        for (Integer integer : arr) {
            bst1.add(integer);
            System.out.println(bst1.size());
        }

        BinaryTrees.println(bst1);

        bst1.remove(5);
        System.out.println(bst1.size());
        BinaryTrees.println(bst1);
        bst1.remove(4);
        System.out.println(bst1.size());
        BinaryTrees.println(bst1);
        bst1.remove(6);
        System.out.println(bst1.size());
        BinaryTrees.println(bst1);
    }

    public static void test3() {
        BinarySearchTree<Integer> bst1 = new BinarySearchTree<>();

        Integer []arr = new Integer[]{
        // 7,4,9,2,1
        4,2,5,1,3,6
        };

        // Integer[] arr = new Integer[] { 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

        for (Integer integer : arr) {
            bst1.add(integer);
        }


        // BinaryTrees.println(bst1);
        bst1.preOrderTraverSal(new Visitor<Integer>(){

            @Override
            public boolean visit(Integer element) {
                System.out.println(" _" + element + "_ " );
                return false;
            }
            
        });

        bst1.preOrderLoop(new Visitor<Integer>(){

            @Override
            public boolean visit(Integer element) {
                System.out.println(" _" + element + "_ " );
                return false;
            }
            
        });

        bst1.preOrderLoop2(new Visitor<Integer>(){

            @Override
            public boolean visit(Integer element) {
                System.out.println(" _" + element + "_ " );
                return false;
            }
            
        });
        // bst1.inOrderTraverSal(new Visitor<Integer>(){

        //     @Override
        //     public boolean visit(Integer element) {
        //         System.out.println(" _" + element + "_ " );
        //         return false;
        //     }
            
        // });
        // bst1.inOrderLoop(new Visitor<Integer>(){

        //     @Override
        //     public boolean visit(Integer element) {
        //         System.out.println(" _" + element + "_ " );
        //         return false;
        //     }
            
        // });
        // bst1.postOrderTraverSal(new Visitor<Integer>(){

        //     @Override
        //     public boolean visit(Integer element) {
        //         System.out.println(" _" + element + "_ " );
        //         return false;
        //     }
            
        // });
        // bst1.postOrderLoop(new Visitor<Integer>(){

        //     @Override
        //     public boolean visit(Integer element) {
        //         System.out.println(" _" + element + "_ " );
        //         return false;
        //     }
            
        // });
        // bst1.levelOrderTraverSal(new Visitor<Integer>(){

        //     @Override
        //     public boolean visit(Integer element) {
        //         System.out.print(" _" + element + "_ " );
        //         return false;

        //     }

        // });
        
        // System.out.println(bst1);

        // System.out.println(bst1.height());
        // System.out.println(bst1.height_loop());

        // System.out.println(bst1.isCompleteBT());

        // bst1.invertBT();
        // BinaryTrees.println(bst1);


    }

    public static void test2(){
        BinarySearchTree<Person> bst1 = new BinarySearchTree<>();

        Integer []arr = new Integer[]{
        7,4,9,2,5,8,11,3,1,12
        };

        // Integer[] arr = new Integer[] { 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

        for (Integer integer : arr) {
            bst1.add(new Person(integer, "name: " + integer ));
        }
        BinaryTrees.println(bst1);
        BinaryTrees.print(bst1);
    }

    public static void test1(){
        BinarySearchTree<Integer> bst1 = new BinarySearchTree<>();

        Integer []arr = new Integer[]{
        7,4,9,2,5,8,11,3,1,12
        };

        // Integer[] arr = new Integer[] { 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

        for (Integer integer : arr) {
            bst1.add(integer);
        }

        


        BinarySearchTree<Integer> bst2 = new BinarySearchTree<Integer>(new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
            
        });

        Integer []arr2 = new Integer[]{
        7,4,9,2,5,8,11,3,1,12
        };

        // Integer[] arr = new Integer[] { 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

        for (Integer integer : arr2) {
            bst2.add(integer);
        }
        BinaryTrees.print(bst1);
        System.out.println("");
        BinaryTrees.print(bst2);

    }

}
