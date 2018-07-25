package com.jiaop.jplibs.design.decorator;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/25
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class BlueShapeDecorator extends ShapeDecorator{

    public BlueShapeDecorator(Shape shape){
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        shape.draw();
        setBlueBorder(shape);
    }

    private void setBlueBorder(Shape decoratedShape){
       //Blue
    }

}
