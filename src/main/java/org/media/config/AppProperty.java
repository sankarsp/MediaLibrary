package org.media.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by shantonu on 2/9/17.
 */
public class AppProperty {
    public static void loadProperties(){
        final String propertyFolder="src/main/resources/";
        load("src/main/resources/app.properties");
        load("src/test/resources/test.properties");


    }

    private static void load(String fileName){
        Properties p = new Properties();
        try {
            p.load(new FileInputStream(new File(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(String k:p.stringPropertyNames()){
            System.setProperty(k,p.getProperty(k));
        }
    }
}
