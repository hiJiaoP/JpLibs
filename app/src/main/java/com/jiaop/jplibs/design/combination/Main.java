package com.jiaop.jplibs.design.combination;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/24
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class Main {

    private void Main() {
        //生成树根，并为其增加两个叶子节点
        Component root = new Composite("Root");
        root.add(new Leaf("Leaf A in Root"));
        root.add(new Leaf("Leaf B in Root"));

        //为根增加两个枝节点
        Component branchX = new Composite("Branch X in Root");
        Component branchY = new Composite("Branch Y in Root");
        root.add(branchX);
        root.add(branchY);

        //为BranchX增加页节点
        branchX.add(new Leaf("Leaf A in Branch X"));

        //为BranchX增加枝节点
        Component branchZ = new Composite("Branch Z in Branch X");
        branchX.add(branchZ);

        //为BranchY增加叶节点
        branchY.add(new Leaf("Leaf in Branch Y"));

        //为BranchZ增加叶节点
        branchZ.add(new Leaf("Leaf in Branch Z"));

        //显示树
        root.dispaly(1);
    }

}
