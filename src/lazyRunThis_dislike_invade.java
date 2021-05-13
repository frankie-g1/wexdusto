import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class lazyRunThis_dislike_invade {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter in the invader area codes you'd not want to invade - with a space inbetween each");
        ArrayList<String> dontInvade = new ArrayList<>();

        String[] input = kb.nextLine().split(" ");
        for(String desired : input){
            dontInvade.add(desired);
        }

        System.out.println("Done");


        /**
         * Old shit that did the same thing but slower. (read next by next by next .... )
         */
        //String input = kb.nextLine();
        //StringBuilder sb = new StringBuilder();
        /*
        int i = 0;

        while(i < input.length()){
            //Space ? Add string to invadeHere
            if(input.charAt(i) == 32){
                invadeHere.add(sb.toString());
                sb.delete(0, i);
            }
            //End of the line ? append final char and add to invadeHere
            else if(i + 1 == input.length()) {
                sb.append(input.charAt(i));
                invadeHere.add(sb.toString());
            }
            //Build string
            else{
                sb.append(input.charAt(i));
            }
            i++;

        }
        */



        try {
            /**
             First lets have it point to the area blocklist in config
             */
            FileWriter configWriter = new FileWriter("wex_dust_config.txt");
            configWriter.write(String.format("{%n\t\"area_blocklist\": ["));

            /**
             Run the the readme, and add all the area codes the user did NOT enter to go into the blocklist CSV
             */
            File readMeCodes = new File("wex_dust_readme.txt");
            Scanner myReader = new Scanner(readMeCodes);

            //Add to blocklist if not in invadeHere and not an empty line nor a area title

            boolean block = false;
            for(int u = 0; u < dontInvade.size() - 1 ; u++) {
                configWriter.write(dontInvade.get(u));
                configWriter.write(", ");
            }
            configWriter.write(dontInvade.get(dontInvade.size() - 1));

            configWriter.write(String.format("],%n\t\"ask_confirmation\": true%n}"));


            myReader.close();
            configWriter.close();
        }
        catch(FileNotFoundException e){
            System.exit(2);
        }
        catch (IOException b){
            System.exit(4);
        }

    }
}
