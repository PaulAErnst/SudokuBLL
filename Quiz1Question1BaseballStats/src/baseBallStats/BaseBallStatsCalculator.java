package baseBallStats;

import java.util.Scanner;

public class BaseBallStatsCalculator {
	//Instance variables are, in this case, cast as doubles because Integer division later would mess things up
	private double atBats;
	private double hits;
	private double doubles;
	private double triples;
	private double homeRuns;
	private double runs; //This is not used in any of the calculations (cross checked with the given Babe Ruth stats)
	private double walks;
	
	public static void main(String[] args) {
		Scanner statsIn = new Scanner(System.in);
		BaseBallStatsCalculator statStore = new BaseBallStatsCalculator();
		System.out.println("To calculate your derived statistics, please enter initial statistics one at a time and in this order: At Bats, Hits, Doubles, Triples, Home Runs, Runs, Walks.");
		statStore.atBats = statsIn.nextDouble();
		statStore.hits = statsIn.nextDouble();
		statStore.doubles = statsIn.nextDouble();
		statStore.triples = statsIn.nextDouble();
		statStore.homeRuns = statsIn.nextDouble();
		statStore.runs = statsIn.nextDouble();
		statStore.walks = statsIn.nextDouble();
		statsIn.close();
		System.out.print("Here are your derived statistics (without decimal truncation): Batting Average: " + statStore.battingAvg() + ", On Base Percentage: " + statStore.onBasePct() + ", Total Bases: " + statStore.totalBases() + ", Slugging Percentage: " + statStore.sluggingPct() + ", On Base Plus Slugging Percentage: " + statStore.onBaseSluggingPct());
	}
	
	public BaseBallStatsCalculator() {
	
	}
		
	public double battingAvg() {
		return ((this.hits)/(this.atBats));
	}

	public double onBasePct() {
		return ((this.hits + this.walks)/(this.atBats + this.walks));
		//Some required statistics for this calculation are missing, such as Hit by Pitch.
		//As a result, it is slightly off from the given Babe Ruth statistics without additional input.
	}
	
	public double totalBases() {
		return (this.doubles*2+this.triples*3+this.homeRuns*4+(this.hits-(this.doubles+this.triples+this.homeRuns)));
		//Singles are calculated in the 4th term since they are not directly given.
	}

	public double sluggingPct() {
		return ((this.totalBases())/this.atBats);
	}

	public double onBaseSluggingPct() {
		return (this.onBasePct()+this.sluggingPct());
	}


}

