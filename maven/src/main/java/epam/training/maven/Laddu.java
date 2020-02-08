package epam.training.maven;

public class Laddu implements sweet{
	double cost;
	public void setRating(int r) {
		if(r<=5)
		{
			cost+=50;
		}
		else
		{	
			cost+=120;
		}
	}
	public double getRating() {
		return cost;
	}
}
