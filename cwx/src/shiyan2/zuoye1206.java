package shiyan2;

public class zuoye1206 {

	public static void main(String[] args) {
		Pillar pillar;
		Geometry geometry;
		
		geometry=new Lader(12, 22, 100);
		System.out.println("面积为："+geometry.getArea());
		pillar=new Pillar(geometry, 58);
		System.out.println("体积为："+pillar.getVolume());
		
		geometry=new Circle(10);
		System.out.println("面积为："+geometry.getArea());
		pillar.setBottom(geometry);
		System.out.println("体积为："+pillar.getVolume());
		
		geometry=new Triangle(10,100);
		System.out.println("面积为："+geometry.getArea());
		pillar.setBottom(geometry);
		System.out.println("体积为："+pillar.getVolume());
		// TODO 自动生成的方法存根

	}

}
