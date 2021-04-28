import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class lazyRunThis {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter in your desired invader area codes with a space inbetween each");
        ArrayList<String> invadeHere = new ArrayList<>();

        String[] input = kb.nextLine().split(" ");
        for(String desired : input){
            invadeHere.add(desired);
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

            //Gets to the start of the list of codes
            while(myReader.hasNextLine()){
                if(myReader.nextLine().equals("Cemetery of Ash")){
                    break;
                }
            }

            //Add to blocklist if not in invadeHere and not an empty line nor a area title
            while(myReader.hasNextLine()){
                String line = myReader.nextLine();

                //Avoid empty line
                if(line.trim().isEmpty())
                    continue;

                //Avoid title of an area
                if(!line.contains(":")){
                    continue;
                }

                //Parse codes
                String rgex = (String) line.subSequence(0, line.indexOf(':'));
                boolean block = true;
                for(int u = 0; u < invadeHere.size(); u++){
                    if(rgex.equals(invadeHere.get(u)) && block == true){
                        block = false;
                    }
                }
                if(block){
                    configWriter.write(rgex);
                    if(myReader.hasNextLine())
                        configWriter.write(", ");
                    else
                        configWriter.write(String.format("],%n\t\"ask_confirmation\": true%n}"));
                }
            }



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
