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
	requires java.sql;
	
	
	opens Poem to javafx.graphics, javafx.fxml;
	exports Poem to javafx.graphics;
	opens Example to javafx.graphics, javafx.fxml;
	exports Example to javafx.graphics;

}