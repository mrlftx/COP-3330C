/**
 * 
 */
/**
 * @author mrlft
 *
 */
module Dev_1 {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.base;
	requires org.junit.jupiter.api;
	
	
	opens Poem to javafx.graphics, javafx.fxml;
	exports Poem;
}