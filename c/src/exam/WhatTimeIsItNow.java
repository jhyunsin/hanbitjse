/**
 * 
 */
package exam;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date   : 2016. 6. 17.
 * @author : hb2009
 * @file   : WhatTimeIsItNow.java
 * @story  : 
  */
public class WhatTimeIsItNow {
public static void main(String[] args) {
	long time = System.currentTimeMillis();
/* System.out.println(time);
Date date = new Date(time);
System.out.println(date);
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
sdf.format(date);
System.out.println(sdf.format(date)); */

System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis())));

String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
System.out.println(now);
// String[] arr = new String[3];

String[] arr = now.split("-");

//arr = now.split("-");

for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
String year = arr[0];
System.out.println(year);


}











}}
