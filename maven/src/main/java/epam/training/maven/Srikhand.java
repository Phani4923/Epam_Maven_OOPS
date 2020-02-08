package epam.training.maven;

public class Srikhand implements sweet{
	double cost;
	public void setRating(int r) {
		if(r<=5)
		{
			cost+=100;
		}
		else
		{
			cost+=125;
		}
	}
	public double getRating() {
		return cost;
	}
}
