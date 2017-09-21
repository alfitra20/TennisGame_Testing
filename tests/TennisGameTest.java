import static org.junit.Assert.*;

import org.junit.Test;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class TennisGameTest {
	
// Here is the format of the scores: "player1Score - player2Score"
// "love - love"
// "15 - 15"
// "30 - 30"
// "deuce"
// "15 - love", "love - 15"
// "30 - love", "love - 30"
// "40 - love", "love - 40"
// "30 - 15", "15 - 30"
// "40 - 15", "15 - 40"
// "player1 has advantage"
// "player2 has advantage"
// "player1 wins"
// "player2 wins"
	@Ignore
	public void testTennisGame_Start() {
		//Arrange
		TennisGame game = new TennisGame();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Initial score incorrect", "love - love", score);		
	}
	//15_15
	@Test
	public void score_15_15_test() throws TennisGameException{
		//Arrange
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("player1Score - player2Score", "15 - 15", score);		
	}
	
	//30_30
	@Test
	public void score_30_30_test() throws TennisGameException{
		//Arrange
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("player1Score - player2Score", "30 - 30", score);		
	}

	//Deuce
	@Test
	public void score_deuce_test() throws TennisGameException{
		//Arrange
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("player1Score - player2Score", "deuce", score);		
	}

	//15_love
	@Test
	public void score_15_love_test() throws TennisGameException{
		//Arrange
		TennisGame game = new TennisGame();
		game.player1Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("player1Score - player2Score", "15 - love", score);		
	}

	//love_15
	@Test
	public void score_love_15_test() throws TennisGameException{
		//Arrange
		TennisGame game = new TennisGame();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("player1Score - player2Score", "love - 15", score);		
	}

	//30_love
	@Test
	public void score_30_love_test() throws TennisGameException{
		//Arrange
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("player1Score - player2Score", "30 - love", score);		
	}
	
	//love_30
	@Test
	public void score_love_30_test() throws TennisGameException{
		//Arrange
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("player1Score - player2Score", "love - 30", score);		
	}

	//40_love
	@Test
	public void score_40_love_test() throws TennisGameException{
		//Arrange
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("player1Score - player2Score", "40 - love", score);		
	}

	//love_40
	@Test
	public void score_love_40_test() throws TennisGameException{
		//Arrange
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("player1Score - player2Score", "love - 40", score);		
	}
	
	//30_15
	@Test
	public void score_30_15_test() throws TennisGameException{
		//Arrange
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("player1Score - player2Score", "30 - 15", score);		
	}
	
	//15_30
	@Test
	public void score_15_30_test() throws TennisGameException{
		//Arrange
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("player1Score - player2Score", "15 - 30", score);		
	}
	
	//40_15
	@Test
	public void score_40_15_test() throws TennisGameException{
		//Arrange
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("player1Score - player2Score", "40 - 15", score);		
	}
		
	//15_40
	@Test
	public void score_15_40_test() throws TennisGameException{
		//Arrange
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("player1Score - player2Score", "15 - 40", score);		
	}
	
	//player1 has advantage
	@Test
	public void score_player1_advantage_test() throws TennisGameException{
		//Arrange
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("player1Score - player2Score", "player1 has advantage", score);		
	}
	
	//player2 has advantage
	@Test
	public void score_player2_advantage_test() throws TennisGameException{
		//Arrange
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("player1Score - player2Score", "player2 has advantage", score);		
	}
	
	//player1 wins
	@Test
	public void score_player1_wins_test() throws TennisGameException{
		//Arrange
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("player1Score - player2Score", "player1 wins", score);		
	}
	
	//player2 wins
	@Test
	public void score_player2_wins_test() throws TennisGameException{
		//Arrange
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("player1Score - player2Score", "player2 wins", score);		
	}
	
	@Test
	public void testTennisGame_EahcPlayerWin4Points_Score_Deuce() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "deuce", score);		
	}
	
	@Test (expected = TennisGameException.class)
	public void testTennisGame_Player1WinsPointAfterGameEnded_ResultsException() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		//Act
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		//Act
		// This statement should cause an exception
		game.player1Scored();			
	}		
}
