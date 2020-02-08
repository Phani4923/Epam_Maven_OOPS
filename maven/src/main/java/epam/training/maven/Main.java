package epam.training.maven;

import java.util.*;

public class Main{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no.of sweets:");
			int n=sc.nextInt();
			double cost=0;
			Map<Integer,String> tm=new TreeMap<Integer,String>();
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter the number of the sweet you want:");
				System.out.println("1.Jalebi");
				System.out.println("2.Kheer");
				System.out.println("3.Srikhand");
				System.out.println("4.Laddu");
				int num=sc.nextInt();
				if(num==1)
				{
					System.out.println("Enter rating of Jalebi:");
					int r=sc.nextInt();
					sweet h=new Jalebi();
					h.setRating(r);
					tm.put(r,"Jalebi");
					double rate=h.getRating();
					cost+=rate;
				}
				else if(num==2)
				{
					System.out.println("Enter rating of Kheer:");
					int r=sc.nextInt();
					sweet h=new Jalebi();
					h.setRating(r);
					tm.put(r,"Kheer");
					double rate=h.getRating();
					cost+=rate;
				}
				else if(num==3)
				{
					System.out.println("Enter rating of Srikhand:");
					int r=sc.nextInt();
					sweet h=new Jalebi();
					h.setRating(r);
					tm.put(r,"Srikhand");
					double rate=h.getRating();
					cost+=rate;
				}
				else if(num==4)
				{
					System.out.println("Enter rating of Laddu:");
					int r=sc.nextInt();
					sweet h=new Jalebi();
					h.setRating(r);
					tm.put(r,"Laddu");
					double rate=h.getRating();
					cost+=rate;
				}
			}
			
			System.out.println("The sorted order of Ratings of the Sweets are:");
			sc.close();
				for (Map.Entry<Integer, String> en : tm.entrySet())
				{ 
					 System.out.println("Rating: " + en.getKey() + ", Sweet: " + en.getValue());
				} 
				System.out.println("Total Cost= "+cost);
		}
}