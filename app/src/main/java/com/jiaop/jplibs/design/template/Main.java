package com.jiaop.jplibs.design.template;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/26
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class Main {

    private void main() {
        Game game = null;
        game = new Cricket();
        game.play();

        game = new Football();
        game.play();
    }

}
