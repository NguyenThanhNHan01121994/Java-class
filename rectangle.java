package javaclass1;

public class rectangle {
	private float w,h;
	public rectangle()
		{
			w = 0.0f;
			h = 0.0f;
		}
		public void setEdges(float W, float H)
		{
			w = W;
			h = H;
		}
		public float calSquare()
		{
			return w*h;
		}

	

	
		public static void main(String[] args) {
		
			rectangle r;
			r = new rectangle();
			//r.w = 10.0f;
			//r.h= 20.0f;
			r.setEdges(10.0f, 20.0f);
			float dt = r.calSquare();
			System.out.println("dien tich hinh cn la: "+ dt);
		}
	}
	
	
	
	

