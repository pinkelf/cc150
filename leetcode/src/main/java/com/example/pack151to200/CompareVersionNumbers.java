package com.example.pack151to200;

/**
 * Created by majie on 16/3/7.
 */
public class CompareVersionNumbers {
    /**
     * Compare two version numbers version1 and version2.
     * If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
     * <p/>
     * You may assume that the version strings are non-empty and contain only digits and the . character.
     * The . character does not represent a decimal point and is used to separate number sequences.
     * For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.
     * <p/>
     * Here is an example of version numbers ordering:
     * <p/>
     * 0.1 < 1.1 < 1.2 < 13.37
     *
     * @param version1
     * @param version2
     * @return
     */
    public static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        for (int i = 0; i < Math.max(v1.length, v2.length); i++) {
            int a = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int b = i < v2.length ? Integer.parseInt(v2[i]) : 0;
            if (a > b) {
                return 1;
            } else if (a < b) {
                return -1;
            }
        }

        return 0;
    }
}
