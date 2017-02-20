package org.media.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by shantonu on 2/9/17.
 */
public class AppProperty {
    public static String FILE_SEPERATOR=System.getProperty("file.separator");
    public static String CLASSPATH=System.getProperty("java.class.path");
    public static String JAVA_HOME=System.getProperty("java.home");
    public static String JAVA_VENDOR=System.getProperty("java.vendor");
    public static String JAVA_VENDOR_URL=System.getProperty("java.vendor.url");
    public static String JAVA_VERSION=System.getProperty("java.version");
    public static String LINE_SEPERATOR=System.getProperty("line.separator");
    public static String OS_ARCHITECTURE=System.getProperty("os.arch");
    public static String OS_NAME=System.getProperty("os.name");
    public static String OS_VERSION=System.getProperty("os.version");
    public static String JAVA_PATH_SEPERATOR=System.getProperty("path.separator");
    public static String USER_WORKING_DIR=System.getProperty("user.dir");
    public static String USER_HOME=System.getProperty("user.home");
    public static String USER_NAME=System.getProperty("user.name");
    public static void loadProperties(){
        final String propertyFolder="src/main/resources/";
        load("src/main/resources/app.properties");
        load("src/test/resources/test.properties");
    }

    public static void load(String fileName){
        Properties p = new Properties();
        try {
            p.load(new FileInputStream(new File(fileName)));
            for(String k:p.stringPropertyNames()){
                System.setProperty(k,p.getProperty(k));
            }
        } catch (IOException e) {
            System.out.println("Missing Property file");
        }

    }
    public static void save(String fileName, Properties... properties){

    }
}
