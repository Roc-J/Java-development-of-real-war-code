package inteface;

import inteface.Quadrangle;
/**
 * 定义平行四边形，继承四边形，实现绘制接口
 * @author Roc-J
 *
 */
public class Parallelogram extends Quadrangle implements DrawTest {
	
	@Override
	public void draw() {
		System.out.println("平行四边形实现draw");
	}

	@Override
	public void doAnyThing() {
		// TODO Auto-generated method stub
		
	}
	
	
}
