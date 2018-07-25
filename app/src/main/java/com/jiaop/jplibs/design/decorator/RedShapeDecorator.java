package com.jiaop.jplibs.design.decorator;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/7/25
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape shape){
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        shape.draw();
        setRedBorder(shape);
    }

    private void setRedBorder(Shape decoratedShape){
       //Red
    }

}
