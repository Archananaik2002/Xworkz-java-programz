package com.xworkz.accessspecifier.boot;

import com.xworkz.accessspecifier.app.StudioTheatre;
import com.xworkz.accessspecifier.app.Theatre;

public class TheatreRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Theatre theatre=new StudioTheatre();
		theatre.playMovies();
		theatre.playMovies("Alankar");
		theatre.playMovies("Alankar", "Udupi");
		theatre.playMovies("Alankar", "Udupi", "Mulitiplex");
		theatre.playMovies(40);
		theatre.playMovies("Mulitiplex", 40);
		
		System.out.println("****************************");

	}

}
