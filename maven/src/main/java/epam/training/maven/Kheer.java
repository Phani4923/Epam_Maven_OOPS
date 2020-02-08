package epam.training.maven;

public class Kheer implements sweet{
	double cost;
	public void setRating(int r) {
		if(r<=5)
		{
			cost+=90;
		}
		else
		{
			cost+=150;
		}
	}
	public double getRating() {
		return cost;
	}
}
