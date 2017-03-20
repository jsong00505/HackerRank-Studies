package strings.tagextractor;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jsong on 15/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Tag Content Extractor
 */
public class Solution {
	public static void main(String[] args) {
		try(
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			// get the number of test cases
			int testCases = Integer.parseInt(in.nextLine());

			// constraints
			assert(testCases < 1 || testCases > 100);

			while(testCases > 0){
				String line = in.nextLine();

				/**
				 * (.+)		>> any characters but it should matches once
				 * ([^<]+)	>> like above but not include <(bracket)
				 * \1		>> capture first group(very first HTML start and end tag here>
				 **/
				String regEx = "<(.+)>([^<]+)</\\1>";
				Pattern p = Pattern.compile(regEx);
				Matcher m = p.matcher(line);

				// just check if not match
				boolean matchFlag = false;

				while(m.find()) {
					// group #2 is the content between HTML start and end tag
					if(m.groupCount() == 2) {
						out.println(m.group(2));
					}

					matchFlag = true;
				}

				if(!matchFlag) {
					out.println("None");
				}

				testCases--;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
