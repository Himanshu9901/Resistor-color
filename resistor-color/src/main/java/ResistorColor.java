import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class ResistorColor {
    String[] color1 = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
    int colorCode(String color){
        for (int i = 0; i < color1.length; i++) {
            if(color.equals(color1[i])){
                return i;
            }
        }
        return 0;
    }

    String[] colors() {

        return color1;
    }
}
