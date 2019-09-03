package ac.za.cput.adp3.xyzcongolmerate.util;

import java.util.UUID;

public class Helper {

    public static String generateRandomGivenSuffix(String suffix) {
        return suffix + "-" + UUID.randomUUID().toString();
    }

    public static String getClassName(Class<?>  aClass) {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {
        String className = getClassName(aClass);
        String suffixToReturn = "";
        for(int i=0; i<className.length(); i++) {
            if(Character.isUpperCase(className.charAt(i))) suffixToReturn = suffixToReturn + className.charAt(i);
        }

        return suffixToReturn;
    }
}
