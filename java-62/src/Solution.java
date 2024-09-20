import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    
    private static final Singleton instance = new Singleton();
    
    private Singleton() {
    }
    
    public static Singleton getSingleInstance() {
        return instance;
    }
    
    public String str;
}