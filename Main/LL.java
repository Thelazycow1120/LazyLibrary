
package Main;

import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.main.SimpleAudio.Audio;

public class LL {
	
	/*
	 * Welcome to this Library. Adding Some basic Methods. Feel Free to use
	 * them. 'DEV_MODE' set to true will output more USEFUL Errors instead of
	 * sidestepping them
	 * 
	 * TO USE: just do LL. to get all these functions, AFTER making sure to
	 * setup your workspace
	 */
	
	// ====================================================================//
	// Basic Variables Needed Supplied for Library //
	public static String	AUTHOR		= "Ironically.MP4";
	public static String	LibName		= "LazyLibrary";
	public static String	VERSION		= "1.8.0";
	public static String	Desc		= "A Simple Lazy Library.";
	public static boolean	DEV_MODE	= false;
	private static Scanner	ReadConsole	= new Scanner(System.in);
	
	private static NumberFormat NF = NumberFormat.getInstance();
	
	private static LLD date = new LLD(); // Dates Extension
	
	private static LLN net = new LLN(); // Networking Extension
	
	private static LLIO io = new LLIO(); // I/O Extension
	
	private static LLE en = new LLE(); // Encryption Extension
	
	private static LLM math = new LLM(); // Math Extension
	
	private static LLS snd = new LLS(); // Sound Extension
	
	// =====================================================================//
	// Averages
	/**
	 * Takes an Integer Array and Makes an Average out of all the values
	 * 
	 * @param in
	 *            The input
	 */
	public static int AverageInt(int[] in) {
		return math.averageInt(in);
	}
	
	/**
	 * Takes an Integer List and Makes an Average out of all the values
	 * 
	 * @param in
	 *            The input
	 */
	public static int AverageInt(ArrayList<Integer> in) {
		return math.averageInt(in);
	}
	
	// ==========================
	/**
	 * Takes a Long Array and Makes an Average out of all the values
	 * 
	 * @param in
	 *            The input
	 */
	public static long AverageLong(long[] in) {
		return math.averageLong(in);
	}
	
	/**
	 * Takes a Long List and Makes an Average out of all the values
	 * 
	 * @param in
	 *            The input
	 */
	public static long AverageLong(ArrayList<Long> in) {
		return math.averageLong(in);
	}
	
	// ==================
	/**
	 * Takes a Float Array and Makes an Average out of all the values
	 * 
	 * @param in
	 *            The input
	 */
	public static float AverageFLOAT(float[] in) {
		return math.averageFloat(in);
	}
	
	/**
	 * Takes a Float List and Makes an Average out of all the values
	 * 
	 * @param in
	 *            The input
	 */
	public static float AverageFloat(ArrayList<Float> in) {
		return math.averageFloat(in);
	}
	
	// ==================
	/**
	 * Takes a Double Array and Makes an Average out of all the values
	 * 
	 * @param in
	 *            The input
	 */
	public static double AverageDouble(double[] in) {
		return math.averageDouble(in);
	}
	
	/**
	 * Takes a Double List and Makes an Average out of all the values
	 * 
	 * @param in
	 *            The input
	 */
	public static double AverageDouble(ArrayList<Double> in) {
		return math.averageDouble(in);
	}
	
	// =====================================
	// Highest Values
	/**
	 * Takes an Integer Array and finds the highest value within it.
	 * 
	 * @param in
	 *            The input
	 */
	public static int highestINTFromArray(int[] in) {
		return math.findLargestValueINT(in);
	}
	
	/**
	 * Takes an Integer List and finds the highest value within it.
	 * 
	 * @param in
	 *            The input
	 */
	public static int highestINTFromList(ArrayList<Integer> in) {
		return math.findLargestValueINT(in);
	}
	
	// ==================
	/**
	 * Takes a Long Array and finds the highest value within it.
	 * 
	 * @param in
	 *            The input
	 */
	public static long highestLONGFromArray(long[] in) {
		return math.findLargestValueLONG(in);
	}
	
	/**
	 * Takes a Long List and finds the highest value within it.
	 * 
	 * @param in
	 *            The input
	 */
	public static long highestLONGFromArray(ArrayList<Long> in) {
		return math.findLargestValueLONG(in);
	}
	
	// ==================
	/**
	 * Takes a Float Array and finds the highest value within it.
	 * 
	 * @param in
	 *            The input
	 */
	public static float highestFLOATFromArray(float[] in) {
		return math.findLargestValueFLOAT(in);
	}
	
	/**
	 * Takes a Float List and finds the highest value within it.
	 * 
	 * @param in
	 *            The input
	 */
	public static float highestFLOATFromArray(ArrayList<Float> in) {
		return math.findLargestValueFLOAT(in);
	}
	
	// ==================
	/**
	 * Takes a Double Array and finds the highest value within it.
	 * 
	 * @param in
	 *            The input
	 */
	public static double highestDOUBLEFromArray(double[] in) {
		return math.findLargestValueDOUBLE(in);
	}
	
	/**
	 * Takes a Double List and finds the highest value within it.
	 * 
	 * @param in
	 *            The input
	 */
	public static double highestDOUBLEFromArray(ArrayList<Double> in) {
		return math.findLargestValueDOUBLE(in);
	}
	
	// =====================================================================//
	//
	public static boolean isPalindrome(String str) {
		String reverse = ""; // Sets up a string
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		if (reverse.equals(str)) return true;
		return false;
	}
	
	//
	// =====================================================================//
	/**
	 * Console wrapped into an easier to access method. ( Saving you from
	 * System.out.println(s) )
	 * 
	 * @param t
	 *            The Object to write to console.
	 */
	public static void console(Object t) {
		System.out.println(t);
	}
	
	/**
	 * Prints out the Available ASCII Palette
	 */
	public static void DrawPalette() {
		// ROWS = ACROSS
		// COLUMS DOWN
		// Foreground (Text Colors)
		for (int i = 0; i < 256; i++) {
			if (i % 16 == 0) {
				LL.console("");
			}
			System.out.print(LL.TxtSequence + i + "m" + i + LL.RESET);
		}
		LL.console("");
		// Backgrounds (Background Colors)
		for (int i = 0; i < 256; i++) {
			if (i % 16 == 0) {
				LL.console("");
			}
			System.out.print(LL.BGSequence + i + "m" + i + LL.RESET);
		}
		System.out.print("\n");
	}
	
	/**
	 * Draws American flag
	 */
	public static void DrawaAmericanFlag() {
		System.out.print(ColorBackground(" * * * * * * * ", 21) + ColorBackground("                         ", 1) + "\n");
		System.out.print(ColorBackground("* * * * * * *  ", 21) + ColorBackground("                         ", 255) + "\n");
		System.out.print(ColorBackground(" * * * * * * * ", 21) + ColorBackground("                         ", 1) + "\n");
		System.out.print(ColorBackground("* * * * * * *  ", 21) + ColorBackground("                         ", 255) + "\n");
		System.out.print(ColorBackground(" * * * * * * * ", 21) + ColorBackground("                         ", 1) + "\n");
		System.out.print(ColorBackground("                                        ", 255) + "\n");
		System.out.print(ColorBackground("                                        ", 1) + "\n");
		System.out.print(ColorBackground("                                        ", 255) + "\n");
		System.out.print(ColorBackground("                                        ", 1) + "\n");
		System.out.print(ColorBackground("                                        ", 255) + "\n");
	}
	
	/**
	 * True/False Method for Windows OS CHECK.
	 * 
	 * @return Returns TRUE if Windows OS
	 */
	public static boolean isWindows() {
		return (getOsName().indexOf("win") > 0);
	}
	
	/**
	 * True/False Method for MacOS CHECK.
	 * 
	 * @return Returns TRUE if MacOS
	 */
	public static boolean isMac() {
		return (getOsName().indexOf("mac") > 0);
	}
	
	/**
	 * True/False Method for Linux OS CHECK.
	 * @apiNote This MAY Miss specific Distros.
	 * @return Returns TRUE if Linux based OS
	 */
	public static boolean isLinux() {
		return (getOsName().indexOf("nux")>0);
	}
	
	public static String getOS() {
		if(isWindows()) return "Windows";
		if(isMac())return "Mac";
		if(isLinux())return "Linux";
		return "Unknown OS";
	}
	
	
	/**
	 * Clears the Console taking into Account OS INDEPENDENT Commands.
	 * 
	 */
	public static void CLEAR_CONSOLE() {
		// If the function runs on Windows
		if (isWindows()) {
			try {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			}
			catch (Exception e) {
				// e.printStackTrace();
			}
			return;
		}
		// If the function runs on Linux
		if (isLinux()) {
			System.out.print("\033[H\033[2J");
			System.out.flush();
			return;
		}
		// If the function runs on Expensive linux (MacOS)
		if (isMac()) {
			System.out.print("\\33c\\e[3J");
			return;
		}
		
	}
	
	/**
	 * Sets the Console Window Title
	 * 
	 * 
	 */
	public static void setConsoleWindowTitle(String newTitle) {
		if (isWindows()) {
			try {
				new ProcessBuilder("cmd", "/c", "title " + newTitle).inheritIO().start().waitFor();
			}
			catch (Exception e) {
				// e.printStackTrace();
			}
			return;
		}
		else {
			try {
				LL.console(ESC + "]1;" + newTitle + BELL);
			}
			catch (Exception e) {
				// LL.console(e.getMessage());
			}
		}
	}
	
	/**
	 * SLOW PRINT function for the Console output.
	 * 
	 * @param t
	 *            The String to write to console.
	 * @param seconds
	 *            How long it'll take in seconds to write entire message. 
	 */
	public static void slowPrint(Object t, double seconds) {
		char[] test = t.toString().toCharArray();
		double timer = ((seconds * 1000) / test.length);
		for (char f : test) {
			System.out.print(f);
			try {
				Thread.sleep((long) timer);
			}
			catch (InterruptedException e) {/* This Catch Function is mostly Formal. */}
		}
	}
	
	/**
	 * Sends a message only seen when the DEV_MODE flag is TRUE.
	 * 
	 * @param message
	 *            Info to display.
	 * @param time
	 *            Add a time Stamp to the message
	 */
	public static void DebugMsg(Object message, String time) {
		if (DEV_MODE == true) {
			console("<<DEBUG : " + time + ">> " + message);
		}
		return;
	}
	
	/**
	 * Sends a message only seen when the DEV_MODE Flag TRUE
	 * 
	 * @param message
	 *            Info to display.
	 */
	public static void DebugMsg(Object message) {
		if (DEV_MODE == true) {
			console("<<DEBUG>>" + message);
		}
	}
	// =====================================================================//
	
	/**
	 * Converts a given String to another String with the Letters/Numbers converted into their Char values.
	 * 
	 * @param The Input String.
	 * @apiNote Example: 072:105 = 'Hi'
	 * 
	 * */
	public static String StringToCharInts(String input) {
		String output = "";
		for (char F : input.toCharArray()) {
			if (F < 10) {
				output += "00" + (int) F;
			}
			else if (F < 100) {
				output += "0" + (int) F;
			}
			else {
				output += "" + (int) F;
			}
			output += ":";
		}
		return output.substring(0, output.length() - 1);
	}
	
	/**
	 * Prompts a question while return the answer as a string.
	 * 
	 * @param q
	 *            Question to prompt.
	 */
	public static String askQuestion(String q) {
		String ret = "No Answer";
		if (q.equals("[$*]")) {
			System.out.print("Press Enter To Continue...");
			return ReadConsole.nextLine();
		}
		System.out.print(q);
		ret = ReadConsole.nextLine();
		ret.trim();
		return ret;
	}
	
	/**
	 * Prompts a question with predetermined answers. The user inputs the INDEX
	 * of the answer they choose.
	 * 
	 * @param question
	 *            Question to prompt.
	 * 
	 * @param answers
	 *            List of Answers to choose from
	 */
	public static String askQuestionWithAnswers(String question, Object... answers) {
		String ret = "No Answer";
		
		// Pre-Check the Question&Answers
		if (question.length() < 2) return "NOT VALID QUESTION!";
		try {
			answers[0] = answers[0];
		}
		catch (Exception e) {
			return "ANSWER LIST INVALID FOR: " + question;
		}
		// --
		// Runs through Question along with Valid Answers
		boolean isDone = false;
		while (isDone == false) {
			console(question);
			for (int i = 0; i < (answers.length); i++) {
				console(i + " : " + answers[i]);
			}
			System.out.print("Your Answer Choice >> ");
			ret = ReadConsole.nextLine();
			try {
				ret = (String) answers[Integer.parseInt(ret)];
				isDone = true;
			}
			catch (Exception e) {}
		}
		return ret;
	}
	
	// =====================================================================//
	/**
	 * Pauses Thread
	 * 
	 * @param seconds
	 *            Time in SECONDS to pause Thread
	 */
	public static void pauseCurrentThread(float seconds) {
		try {
			Thread.currentThread();
			Thread.sleep(((long) (seconds * 1000)));
		}
		catch (InterruptedException e) {
			if (DEV_MODE == true) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Returns The Letters from a word as an ArrayList of Letters
	 * 
	 * @param s
	 *            String to Break Down.
	 */
	public static ArrayList<Character> lettersAsArray(String s) {
		ArrayList<Character> ret = new ArrayList<Character>();
		ret.clear();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				ret.add(s.charAt(i));
			}
			else {
				ret.add(s.charAt(i));
			}
		}
		return ret;
	}
	
	// =====================================================================//
	/**
	 * Checks if String is a number. DOES NOT RETURN INTEGER VALUE!
	 * 
	 * @param input
	 *            String to check
	 */
	public static boolean isInteger(String input) {
		try {
			Integer.parseInt(input);
			return true;
		}
		catch (Exception e) {
			return false;
			
		}
	}
	
	/**
	 * INT -> HEX
	 * 
	 * @param value
	 *            INT in
	 */
	public static String HexfromInt(int value) {
		return Integer.toHexString(value);
	}
	
	/**
	 * INT -> BINARY
	 * 
	 * @param value
	 *            INT in
	 */
	public static String BinaryfromInt(int value) {
		return Integer.toBinaryString(value);
	}
	
	/**
	 * INT -> Octal
	 * 
	 * @param value
	 *            INT in
	 */
	public static String OctalfromInt(int value) {
		return Integer.toOctalString(value);
	}
	
	// =====================================================================//
	
	/**
	 * Simple Boolean return if a Number is even or not
	 * 
	 * @param num
	 *            Number To Check.
	 */
	public static boolean isNumberEven(Number num) {
		if (num instanceof Integer || num instanceof Float || num instanceof Double) {
			if ((num.doubleValue() % 2) == 0)
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	// =====================================================================//
	/**
	 * Adds a Line (//===//) to split Console Output. Pointless? Maybe
	 */
	public static void newSection() {
		console("//==========================================================//");
	}
	
	// =====================================================================//
	/**
	 * Makes a Clean Numeric String from a Number
	 * 
	 * @param num
	 *            The Number to Clean/Add Commas
	 */
	public static String FormatNumber(Number num) {
		return NF.format(num);
	}
	
	// =====================================================================//
	/**
	 * A Lottery Number Generator!
	 * 
	 * @param AmtOfNumbers
	 *            The 'set' size. Example: 1 winning number? 3 Numbers?
	 * 
	 * @param num_length
	 *            Range a number can have!
	 * @param amtDrawn
	 *            The amount of Numbers to generate
	 * @apiNote 
	 * 			   A Winner can be created by Running the same function, replace Draws with 1.
	 */
	public static ArrayList<int[]> LotteryNumbersGenerator(int AmtOfNumbers, int Range, int Draws) {
		ArrayList<int[]> Numbers = new ArrayList<int[]>();
		Random r = new Random();
		for (int d = Draws; d != 0; d--) {
			int[] nums = new int[AmtOfNumbers];
			for (int x = 0; x < AmtOfNumbers; x++) {
				nums[x] = (r.nextInt(Range) + 1);
			}
			Numbers.add(nums);
		}
		return Numbers;
	}
	
	/**
	 * Converts standard array object to array list object.
	 * 
	 * @param o
	 *            Array[] TO ArrayList<>
	 */
	public static ArrayList<Object> returnArrayListFromArray(Object[] o) {
		ArrayList<Object> ret = new ArrayList<Object>();
		for (int i = 0; i < o.length; i++) {
			ret.add(o[i]);
		}
		return ret;
	}
	
	// ===================================================================//
	/**
	 * Breaks a Sentence into an Array list of words.
	 * 
	 * @param sent
	 *            The Sentence to break up
	 * 
	 */
	public static ArrayList<String> sentenceBreaker(String sent) {
		ArrayList<String> ret = new ArrayList<String>();
		if (!(sent.isEmpty())) {
			String[] temp = sent.split(" ");
			for (int i = 0; i < temp.length; i++) {
				ret.add(temp[i]);
			}
		}
		return ret;
	}
	
	// ==================================================================//
	/**
	 * Returns Current Directory
	 */
	public static String getCurrentDirectory() {
		return System.getProperty("user.dir");
	}
	
	/**
	 * Returns an Array of Directory Contents.
	 */
	public static String[] getCurrentDirectoryContents() {
		return io.getCDContents();
	}
	
	/**
	 * Returns an Array of Files in A Given Directory
	 */
	public static String[] getGivenDirectoryContents(String FolderPath) {
		return io.getFilesInFolder(FolderPath);
	}
	
	// ==================================================================//
	/**
	 * Returns Current Day
	 */
	public static String getCurrentDay() {
		date = new LLD();
		return date.getNameOfDayInDate();
	}
	
	/**
	 * Returns Current Month
	 */
	public static String getCurrentMonth() {
		date = new LLD();
		return date.getNameOfMonthInDate();
	}
	
	/**
	 * Returns Current Year
	 */
	public static String getCurrentYear() {
		date = new LLD();
		return date.getYearInDate();
	}
	
	/**
	 * Returns Current Time
	 */
	public static String getCurrentTime_24Hour() {
		date = new LLD();
		return date.getTimeOfDayInDate_24Hour();
	}
	
	/**
	 * Returns Current Time IN 24 HOUR FORMAT
	 */
	public static String getCurrentTime_12Hour() {
		date = new LLD();
		return date.getTimeOfDayInDate_12Hour();
	}
	
	/**
	 * Returns Current Day of Month
	 */
	public static String getCurrentDayOfTheMonth() {
		date = new LLD();
		return date.getDayOfMonth();
	}
	
	/**
	 * Returns Current Date in a String format
	 */
	public static String getWholeDateAsString() {
		date = new LLD();
		return "Current Date:\n\tMonth\t: " + getCurrentMonth() + "\n\tDay\t: " + getCurrentDay() + "/" + getCurrentDayOfTheMonth() + "\n\tYear\t: "
				+ getCurrentYear();
	}
	
	/**
	 * Returns Days of the week as an array
	 */
	public static String[] getDaysOfTheWeek() {
		return date.days;
	}
	
	/**
	 * Returns Months as Array
	 */
	public static String[] getMonthsOfTheYear() {
		return date.months;
	}
	
	/*
	 * 
	 * */
	public static String ConvertMillisToString(long mills) {
		return date.MillisToTimeString(mills);
	}
	
	// =============================================================//
	/**
	 * Returns Number of Processing Cores Available
	 */
	public static int getAvailibleProcessor() {
		return Runtime.getRuntime().availableProcessors();
	}
	
	/**
	 * Returns Java Version
	 */
	public static String getJavaVersion() {
		return System.getProperty("java.version");
	}
	
	/**
	 * Returns Java MAJOR VERSION Integer.
	 */
	public static int getMajorJavaVersion() {
		String version = System.getProperty("java.version");
		if (version.startsWith("1.")) {
			version = version.substring(2, 3);
		}
		else {
			int dot = version.indexOf(".");
			if (dot != -1) {
				version = version.substring(0, dot);
			}
		}
		return Integer.parseInt(version);
	}
	
	/**
	 * Returns Current OS Name Ex. "windows 7" All Lower case.
	 */
	public static String getOsName() {
		return System.getProperty("os.name").toLowerCase();
	}
	
	/**
	 * Returns Current Language in use.
	 */
	public static String getCurrentLang() {
		switch (System.getProperty("user.language").substring(0, 2)) {
			case "en":
				return "English";
			case "fr":
				return "French";
			case "ko":
				return "Korean";
			case "zh":
				return "Chinese";
			case "de":
				return "German";
			case "es":
				return "Spanish";
			default:
				return System.getProperty("user.language").substring(0, 2);
		}
	}
	
	/**
	 * Returns Current OS Architecture, such as x86, amd64, or ARM.
	 */
	public static String getOsArchitecture() {
		return System.getProperty("os.arch");
	}
	
	/**
	 * Returns Current User name.
	 */
	public static String getCurrentUserName() {
		return System.getProperty("user.name");
	}
	
	/**
	 * Returns Current Country.
	 */
	public static String getCurrentCountry() {
		return System.getProperty("user.country");
	}
	
	// =============================================================//
	/**
	 * Returns amount of repeats in an array.
	 * 
	 * @param l
	 *            Array to Check
	 * @param toCheckFor
	 *            Object to look for in an array
	 */
	public static int countRepeatsInArray(ArrayList<?> l, Object toCheckFor) {
		int ret = -1;
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).equals(toCheckFor)) {
				ret++;
			}
		}
		return ret;
	}
	
	/**
	 * Shuffles a given Arraylist
	 */
	public static void ShuffleArrayList(ArrayList<?> ls) {
		Collections.shuffle(ls);
	}
	
	/**
	 * Shuffles a given list
	 */
	public static void ShuffleList(List<?> list) {
		Collections.shuffle(list);
	}
	
	// =============================================================//
	/**
	 * Creates a txt file with passed name
	 * @return The newly made Text File.
	 */
	public static File newFile(String name) {
		return io.createFile(name);
	}
	/**
	 * Creates a file with passed name and Extension. EX: name.extension
	 * @return The newly made file.
	 */
	public static File newFile(String FileName, String Extension) {
		return io.createFile(FileName, Extension);
	}
	
	/**
	 * Creates a temporary txt file with passed name. 
	 * @apiNote WILL BE DELETED UPON PROGRAM EXIT!
	 * @return The New Temp File.
	 */
	public static File newTempFile(String name) {
		return io.createTempFile(name);
	}
	
	/**
	 * Creates a new Direction Within the Current Directory. (For Windows this would be a Folder.)
	 * 
	 * @return The new Directory.
	 */
	public static File newDirectory(String name) {
		return io.createDirectory(name);
	}
	
	// =====================
	/**
	 * Deletes a text file with passed name
	 */
	public static void deleteFile(String name) {
		File f = new File(name + ".txt");
		io.delFile(f);
	}
	
	/**
	 * Deletes a file with passed name AND Extension. 
	 */
	public static void deleteFile(String name, String ext_WithOut_Period) {
		File f = new File(name + "." + ext_WithOut_Period);
		io.delFile(f);
	}
	
	/**
	 * Deletes a given file.
	 */
	public static void deleteFile(File f) {
		io.delFile(f);
	}
	
	// ======================
	/**
	 * Writes text to text file given filename, data to write, and if it belongs on a
	 * new line
	 */
	public static void writeToFileName(String fileName, String dataToWrite, boolean newLine) {
		File f = new File(fileName + ".txt");
		io.writeTextToFile(f, dataToWrite, newLine);
	}
	
	/**
	 * Writes to a given file.
	 */
	public static void writeToFile(File f, Object dataToWrite, boolean newLine) {
		io.writeTextToFile(f, dataToWrite.toString(), newLine);
	}
	
	// ======================
	/**
	 * Gets Text from a file with given File Name! INCLUDING EXTENSION! [ex:
	 * "readme.txt" is good]
	 * 
	 * @return Any found data.
	 */
	public static String getDataFromFile(String WHOLE_FILE_NAME) {
		File f = new File(WHOLE_FILE_NAME);
		return io.getTextFromFile(f);
	}
	
	/**
	 * Gets Text from a file with given File Object
	 * 
	 * @return Any found data.
	 */
	public static String getDataFromFile(File file) {
		if (!file.exists()) return "NULL";
		return io.getTextFromFile(file);
	}
	
	// ======================
	/**
	 * Gets Words from a file. Could use clarity.
	 */
	public static ArrayList<String> getDataFromFileAsArrayListOfWords(String fileName) {
		ArrayList<String> ret = new ArrayList<String>();
		ret.clear();
		File f = new File(fileName + ".txt");
		String[] t = io.getTextFromFile(f).split(" ");
		for (int i = 0; i < t.length; i++) {
			ret.add(t[i]);
		}
		return ret;
	}
	
	// ======================
	/**
	 * Checks an ArrayList for Duplicate objects
	 * 
	 * @param List
	 *            ArrayList<Object> for ANY duplicates
	 * @return
	 * 		   True if there ANY repeats. False if not.
	 */
	public static boolean CheckArrayListForDuplicates(ArrayList<?> List) {
		boolean ret = false;
		for(Object t : List) {
			if(LL.countRepeatsInArray(List, t)>0)ret = true;
		}
		return ret;
	}
	
	// ======================
	/**
	 * Captures a screenshot on the primary monitor, then saves with given name
	 */
	public static void scrnShot(String sc) {
		io.ScreenShot(sc);
	}
	
	// ======================
	/**
	 * Checks for file. No Extension Required. Assumed .txt file.
	 * @return True if the file exists.
	 */
	public static boolean isFilePresent(String fileName) {
		File f = new File(fileName + ".txt");
		return io.doesFileExist(f);
	}
	
	/**
	 * Checks for File WTIH specified extension?
	 * @return True if the file exists.
	 */
	public static boolean isFilePresentExt(String fileName, String extension) {
		File f = new File(fileName + "." + extension);
		return io.doesFileExist(f);
	}
	
	// ==================================================
	// Net Tools! 
	/**
	 * Debug for host work
	 * @apiNote NOT FINISHED
	 */
	public static void testHost() {
		net.currentHostTest();
	}
	
	/**
	 * Is connected to Internet?
	 * @apiNote NOT FINISHED
	 */
	public static boolean isOnline() {
		return net.connectedToInternet();
	}
	
	/**
	 * Tests if site is up.
	 * @apiNote NOT FINISHED
	 */
	public static boolean isSiteOnline(String url) {
		return net.siteonline(url);
	}
	
	// =================================================
	/**
	 * Returns a float conversion of F TO C
	 * 
	 * @param currentFTemp
	 *            Current Fahrenheit Temperature
	 */
	public static float FahrenheitToCelcius(float currentFTemp) {
		float ret = 0.0f;
		ret = (((currentFTemp - 32) * 5) / 9);
		return ret;
	}
	
	/**
	 * Returns a float conversion of C TO F
	 * 
	 * @param currentCTemp
	 *            The Current Celsius Temperature
	 */
	public static float CelciusToFahrenheit(float currentCTemp) {
		float ret = 0.0f;
		ret = (9 * currentCTemp / 5 + 32);
		return ret;
	}
	
	/**
	 * Runs a Command on the Host Machine
	 * 
	 * @param program
	 *            The Command/Program to run!
	 * 
	 */
	public static void executeExternalProgram(String program) throws IOException {
		Runtime r = Runtime.getRuntime();
		r.exec(program);
	}
	
	public static void runHostCMD(String com) {
		Runtime t = Runtime.getRuntime();
		try {
			t.exec(com);
		}
		catch (IOException e) {
			console("ERROR EXECUTING COMMAND");
		}
	}
	
	// =======================================================
	/**
	 * Converts a currency from one to another.
	 * 
	 * @apiNote The exchange values may not be 100% Accurate.
	 * 
	 * @param ct
	 *            convert TO what currency? [usd,pnd,eur,can]
	 * 
	 * @param cf
	 *            convert FROM what currency? [usd,pnd,eur,can]
	 * 
	 * @param amt
	 *            Starting Amount
	 */
	public static double CurrencyConversion(String ct, String cf, double amt) {
		double ret = 0.0;
		if (ct.equals("eur")) {
			switch (cf) {
				default:
					console("Unknown Currency");
					break;
				case "usd":
					return amt * 0.9;
				case "pnd":
					return amt * 0.87;
				case "can":
					return amt / 1.5;
			}
		}
		else if (ct.equals("usd")) {
			switch (cf) {
				default:
					console("Unknown Currency");
					break;
				case "eur":
					return amt / 1.114;
				case "pnd":
					return amt * 0.77;
				case "can":
					return amt / 1.345;
			}
		}
		else if (ct.equals("pnd")) {
			switch (cf) {
				default:
					console("Unknown Currency");
					break;
				case "usd":
					return amt / 1.3;
				case "eur":
					return amt / 1.157;
				case "can":
					return amt / 1.73;
			}
		}
		else if (ct.equals("can")) {
			switch (cf) {
				default:
					console("Unknown Currency");
					break;
				case "usd":
					return amt * 0.75;
				case "pnd":
					return amt * 0.57;
				case "eur":
					return amt / 0.66;
			}
		}
		else {
			console("Currency Not Recognized");
		}
		return ret;
	}
	
	// ====================================================== Encrytion Section
	/* SECT LL Encryption Handling */
	/**
	 * Generates a Caesar Cipher key with a given seed! This IN THEORY Allows a
	 * little stronger caesar cipher usage.
	 * 
	 * @return Returns an Integer to be used a Shiftkey in caesar cipher.
	 */
	public static int GenerateCaesarKey(long Seed) {
		return en.GenerateCaesarShiftKey(Seed);
	}
	
	/**
	 * Prompts a question while return the answer as a string. CAVEAT: Only
	 * Handles LOWERCASE Letters.
	 * 
	 * @param msg
	 *            The message to encrypt.
	 * 
	 * @param shiftkey
	 *            The amount of letters to shift buy.
	 */
	public static String CaesarCiper_Encrypt(String msg, int shiftKey) {
		return en.encrypt(msg, shiftKey);
	}
	
	/**
	 * Encrypts a string using a Caesar Cipher with a shift.
	 * 
	 * @param msg
	 *            The message to Decrypt.
	 * 
	 * @param shiftkey
	 *            The amount of letters to shift buy for decryption.
	 */
	public static String CaesarCiper_Decrypt(String msg, int shiftKey) {
		return en.decrypt(msg, shiftKey);
	}
	
	// ======================================================
	// Press Enter to continue bit.
	public static void pressEnterToContinue() {
		LL.askQuestion("[$*]");
	}
	
	// ======================================================
	/* SECT LL SOUND Handling */
	/**
	 * Adds An Audio Source that can be Played, Stopped, etc
	 * 
	 * @param FilePath
	 *            The FilePath for the Audio File
	 * @param ReferenceName
	 *            The name to be used for reference to the audio source
	 * 
	 */
	public static void AddSoundSource(String FilePath, String ReferenceName) {
		snd.AddAudioSource(FilePath, ReferenceName);
	}
	
	/**
	 * Adds An Audio Source that can be Played, Stopped, etc
	 * 
	 * @param SoundFile
	 *            The File itself
	 * @param ReferenceName
	 *            The name to be used for reference to the audio source
	 * 
	 */
	public static void AddSoundSource(File SoundFile, String ReferenceName) {
		snd.AddAudioSource(SoundFile, ReferenceName);
	}
	
	/**
	 * Plays a Loaded Sound Source by name
	 * 
	 * @param ReferName
	 *            The Sound Source to play
	 * 
	 */
	public static void PlaySound(String ReferName) {
		snd.PlayAudioSource(ReferName);
	}
	
	/**
	 * Stops a Loaded Sound Source by name
	 * 
	 * @param ReferName
	 *            The Sound Source to Stop
	 * 
	 */
	public static void StopSound(String ReferName) {
		snd.StopAudioSourceBeingPlayed(ReferName);
	}
	
	/**
	 * Sets the Applications UNIVERSAL Volume
	 * 
	 * @param volume
	 *            New Volume SET. Not Adjusted
	 * 
	 */
	public static void setSoundVolume(float volume) {
		snd.setVolume(volume);
	}
	
	/**
	 * Displays in the Console Loaded Sound Sources
	 * 
	 */
	public static void ShowLoadedSoundSources() {
		snd.Debug_ShowOpenAudioSources();
	}
	
	/**
	 * gets the Playing Sound Sources
	 * 
	 */
	public static void PlayingSoundSources() {
		LL.console(snd.getPlayingAudio());
	}
	
	/**
	 * Sets the Loop Boolean for Loaded Sound Sources
	 * 
	 * @param SoundName
	 *            The Sound source to loop
	 * 
	 */
	public static void LoopASound(String SoundName) {
		snd.setAudioSourceToLoop(SoundName);
	}
	
	/**
	 * Toggles the Mute boolean like a switch. Sets the boolean opposite of what
	 * it is.
	 * 
	 */
	public static void MuteToggle() {
		snd.ToggleMute();
	}
	
	public static Audio AudioSourceDirectly(String ReferName) {
		return snd.getAudioSourceDirectly(ReferName);
	}
	
	/**
	 * Unloads a sound file from Memory.
	 */
	public static void UnloadSound(String refername) {
		snd.unloadAudioSource(refername);
	}
	
	/**
	 * Unloads ALL SOUNDS from Memory.
	 * 
	 * @Warning USE CAREFULLY
	 */
	public static void UnloadAllSounds(boolean AreYouSure) {
		snd.UnloadAllSounds(AreYouSure);;
	}
	
	// =======================
	
	public static final int KEY_APOSTROPHE = 39, KEY_COMMA = 44, KEY_MINUS = 45, KEY_PERIOD = 46, KEY_ENTER = 13, KEY_SLASH = 47, KEY_0 = 48,
			KEY_1 = 49, KEY_2 = 50, KEY_3 = 51, KEY_4 = 52, KEY_5 = 53, KEY_6 = 54, KEY_7 = 55, KEY_8 = 56, KEY_9 = 57, KEY_SEMICOLON = 59,
			KEY_EQUAL = 61,
			
			KEY_a = 97, KEY_b = 98, KEY_c = 99, KEY_d = 100, KEY_e = 101, KEY_f = 102, KEY_g = 103, KEY_h = 104, KEY_i = 105, KEY_j = 106,
			KEY_k = 107, KEY_l = 108, KEY_m = 109, KEY_n = 110, KEY_o = 111, KEY_p = 112, KEY_q = 113, KEY_r = 114, KEY_s = 115, KEY_t = 116,
			KEY_u = 117, KEY_v = 118, KEY_w = 119, KEY_x = 120, KEY_y = 121, KEY_z = 122,
			
			KEY_A = 65, KEY_B = 66, KEY_C = 67, KEY_D = 68, KEY_E = 69, KEY_F = 70, KEY_G = 71, KEY_H = 72, KEY_I = 73, KEY_J = 74, KEY_K = 75,
			KEY_L = 76, KEY_M = 77, KEY_N = 78, KEY_O = 79, KEY_P = 80, KEY_Q = 81, KEY_R = 82, KEY_S = 83, KEY_T = 84, KEY_U = 85, KEY_V = 86,
			KEY_W = 87, KEY_X = 88, KEY_Y = 89, KEY_Z = 90,
			
			KEY_LEFT_BRACKET = 91, KEY_BACKSLASH = 92, KEY_RIGHT_BRACKET = 93, KEY_GRAVE_ACCENT = 96, KEY_WORLD_1 = 161, KEY_RIGHT = 262,
			KEY_LEFT = 263, KEY_DOWN = 264, KEY_UP = 265, KEY_WORLD_2 = 162;
	
	// WINDOWS ESCAPE CODES!
	
	// ANSI ESCAPE CODE CONSOLE COLORS
	// Reset
	public static final String	RESET		= (char) 27 + "[0m";	// ResetEscapecode
	public static final char	BELL		= (char) 7;
	public static final char	ESC			= (char) 27;
	public static final String	BGSequence	= ESC + "[48;5;";
	public static final String	TxtSequence	= ESC + "[38;5;";
	// Special Additions
	public static final String	UNDERLINE			= ESC + "[4m";
	public static final String	CANCEL_UNDERLINE	= ESC + "[24m";
	public static final String	REVERSED			= ESC + "[7m";
	public static final String	BOLD				= ESC + "[1m";
	
	/** Function for Generating Colored Text */
	public static final String ColorText(String input, int XtermColorCode) {
		return TxtSequence + XtermColorCode + "m" + input + RESET;
	}
	
	/** Function for Generating Background Color for the passed Text. */
	public static final String ColorBackground(String input, int XtermColorCode) {
		return BGSequence + XtermColorCode + "m" + input + LL.RESET;
	}
	
	/**
	 * Generates Colored Background and Colored Text String.
	 * */
	public static final String ColorForegroundBackground(String message, int XtermColorCodeA, int XtermColorCodeB) {
		return TxtSequence + XtermColorCodeA + "m" + BGSequence + XtermColorCodeB + "m" + message + RESET;
	}
	
	// ======================
	/**
	 * This prints out the Sequence DIRECTLY to the console. 
	 * @apiNote Recommend you use the Color Functions that return a String back. 
	 * @return The Background color sequence.
	 * */
	public static final void setBackgroundColor(int XtermColorCode) {
		System.out.print(BGSequence + XtermColorCode + "m");
	}
	/**
	 * This prints out the Sequence DIRECTLY to the console.
	 * @apiNote Recommend you use the Color Functions that return a String back. 
	 * @return The Text color sequence.
	 * */
	public static final void setTextColor(int XtermColorCode) {
		System.out.print(TxtSequence + XtermColorCode + "m");
	}
	/**
	 * Resets the Color set currently active.
	 * */
	public static final void ResetConsoleColor() {
		System.out.print(RESET);
	}
	// ================================
	
	public static void LL_LINK() {
		/*
		 * I Exist for the Sole Purpose of Linking LL to Extensions
		 * This Prevents Modules being used without the Main LL file.
		 */
	}
}
