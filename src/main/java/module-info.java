module dk.easv.gitfullofdollars {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.gitfullofdollars to javafx.fxml;
    exports dk.easv.gitfullofdollars;
}