package com.jiaop.jplibs.design.decorator;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/25
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class Main {

    private void main(){
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();
        redCircle.draw();
        redRectangle.draw();

        Shape blueRec = new BlueShapeDecorator(new Rectangle());
        blueRec.draw();

    }

}
