import java.util.Arrays;
import java.util.Scanner;



class Main {
    public static void main(String[] args) {
        String[] array = {
            "15:00 - Hello World",
            "48:00 - Data Types",
            "01:04:00 - Type Conversion & Casting",
            "01:16:35 - Operators",
            "01:27:00 - Relational Operators",
            "01:34:40 - Logical Operators",
            "01:45:47 - Conditional Statements",
            "02:04:10 - Ternary Operator",
            "02:08:35 - Switch Statement",
            "02:17:13 - Loops",
            "02:49:45 - OOPs Basics",
            "03:29:05 - Method Overloading",
            "03:33:20 - JVM",
            "03:45:40 - Arrays",
            "04:04:27 - Random",
            "04:08:35 - Enhanced For Loop",
            "04:10:32 - (Jagged Array  )",
            "04:15:12 - Drawbacks of Array",
            "04:32:19 - String",
            "04:41:33 - (String Constant Pool  )",
            "04:45:40 - StringBuffer",
            "04:51:13 - Encapsulation & this keyword",
            "05:07:15 - Constructors",
            "05:26:33 - Static Keyword",
            "05:39:45 - (Static Block  )",
            "05:43:12 - Class Loading",
            "05:45:15 - Naming Conventions",
            "05:54:40 - Inheritance",
            "06:02:43 - Super",
            "06:38:49 - Method Overriding",
            "06:39:29 - Packages",
            "06:51:50 - Access Modifiers",
            "07:00:10 - Polymorphism",
            "07:12:00 - Final Keyword",
            "07:18:12 - Object Class",
            "07:30:08 - Downcasting & Upcasting",
            "07:36:50 - Wrapper Class (autoboxing & Unboxing)",
            "07:44:50 - Abstract Keyword",
            "08:05:00 - Inner Class",
            "08:10:51 - Interfaces",
            "08:30:30  - enumeration",
            "08:49:03 - Annotations",
            };
        for (String topic : array) {
            System.out.println(topic.split(" - ")[1]);
        }
    }

}
