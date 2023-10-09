import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//import org.json.simple.JSONObject;
//import org.json.simple.JSONArray;
//import org.json.simple.parser.ParseException;
//import org.json.simple.parser.JSONParser;


public class Main {
    public static void main(String[] args) throws IOException {
        double stStephensGreenLatitude = 53.337839;
        double stStephensGreenLongitude = -6.259520;
        List<String> invitedFriends = new ArrayList<>();
        File file = new File("friends.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;

        while ((st = br.readLine()) != null) {
            invitedFriends.add(st);
            //System.out.println(st);
        }

        br.close();

        for (String friend : invitedFriends) {
            System.out.println(friend);
        }
    }
}
