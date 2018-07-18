package com.jiaop.jplibs.tree;

import android.util.Log;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/17
 *     desc   : 二叉树相关操作
 *     version: 1.0.0
 * </pre>
 */
public class TreeUtil {

    private final static String TAG = "TreeUtil";

    /**
     * 判断是否为完全二叉树
     *
     * @param root 根结点
     * @return
     */
    public static boolean checkBTree(Node root) {
        if (root == null) {
            Log.e(TAG, "Empty tree data");
            return true;
        }
        MyQueue<Node> queue = new MyQueue<Node>();
        queue.push(root);
        Node temp;
        int flag = 0;
        while (queue.size() > 0) {
            temp = queue.pop();
            if (null != temp.left) {
                if (1 == flag) {
                    return false;
                }
                queue.push(temp.left);
                if (null != temp.right) {
                    queue.push(temp.right);
                } else {
                    flag = 1;
                }
            } else {
                if (null != temp.right) {
                    return false;
                }
                flag = 1;
            }
        }
        return true;
    }

    /**
     * 将一个arry数组构建成一个完全二叉树
     *
     * @param arr 需要构建的数组
     * @return 二叉树的根节点
     */
    public Node initBinTree(int[] arr) {
        if (arr.length == 1) {
            return new Node(arr[0]);
        }
        List<Node> nodeList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            nodeList.add(new Node(arr[i]));
        }
        int temp = 0;
        while (temp <= (arr.length - 2) / 2) {
            if (2 * temp + 1 < arr.length) {
                nodeList.get(temp).left = nodeList.get(2 * temp + 1);
            }
            if (2 * temp + 2 < arr.length) {
                nodeList.get(temp).right = nodeList.get(2 * temp + 2);
            }
            temp++;
        }
        return nodeList.get(0);
    }

    /**
     * 层序遍历二叉树，，并分层打印
     *
     * @param root 二叉树根节点
     */
    public void trivalBinTree(Node root) {
        Queue<Node> nodeQueue = new ArrayDeque<>();
        nodeQueue.add(root);
        Node temp = null;
        int currentLevel = 1;
        int nextLevel = 0;
        while ((temp = nodeQueue.poll()) != null) {
            if (temp.left != null) {
                nodeQueue.add(temp.left);
                nextLevel++;
            }
            if (temp.right != null) {
                nodeQueue.add(temp.right);
                nextLevel++;
            }
            currentLevel--;
            if (currentLevel == 0) {
                currentLevel = nextLevel;
                nextLevel = 0;
            }
        }
    }

    /**
     * 先序遍历
     *
     * @param root 二叉树根节点
     */
    public void preTrival(Node root) {
        if (root == null)
            return;
        preTrival(root.left);
        preTrival(root.right);
    }

    /**
     * 中序遍历
     *
     * @param root 二叉树根节点
     */
    public void midTrival(Node root) {
        if (root == null)
            return;
        midTrival(root.left);
        midTrival(root.right);
    }

    /**
     * 后序遍历
     *
     * @param root 二叉树根节点
     */
    public void afterTrival(Node root) {
        if (root == null)
            return;
        afterTrival(root.left);
        afterTrival(root.right);
    }

}

/**
 * 结点类
 */
class Node {

    public Node left;
    public Node right;
    public int data;

    public Node(int data) {
        this.data = data;
    }

    public Node(Node left, Node right, int data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node [data=" + data + "]";
    }

}

/**
 * 结点队列
 *
 * @param <Node>
 */
class MyQueue<Node> extends LinkedList<Node> {
    public Node pop() {
        return removeLast();
    }

    public void push(Node node) {
        super.addFirst(node);
    }

    public int size() {
        return super.size();
    }
}

