package sk.borlyd.core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

        public static void(String args[]) throws Exception {

            String path = "penazenka.csv";
            String line = "";

            try {
                BufferedReader br = new BufferedReader(new FileReader(path));
                while ((line = br.readLine()) != null) {
                    String [] values = line.split(",");
                    System.out.println(values [0]);

                }
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

