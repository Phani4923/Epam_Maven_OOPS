package epam.training.maven;

public class Jalebi implements sweet{
		double cost;
		public void setRating(int r) {
			if(r<=5)
			{
				cost+=130;
			}
			else
			{
				cost+=180;
			}
		}
		public double getRating() {
			return cost;
		}
}
