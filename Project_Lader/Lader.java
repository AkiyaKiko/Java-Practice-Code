package Project_Lader;

public class Lader {
    double Top, Height;
    static double Bottom;
    void setTop(double length){
        Top = length;
    };
    void setBottom(double length){
        Bottom = length;
    }
    void setHeight(double length) {
        Height = length;

    }

    double getTop() {
        return Top;
    }

    double getBottom() {
        return Bottom;
    }

    double getHeight() {
        return Height;
    }
}
