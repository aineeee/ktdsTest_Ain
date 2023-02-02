package com.ktdsuniversity.edu.util;



public class NumberUtil {

	private NumberUtil() {
	} // 생성자 범위

	public static byte toByte(String string) {
		try {
			return Byte.parseByte(string);
		} catch (NumberFormatException nfe) {
			return 0;
		}
	}

	public static byte toByte(String string, byte defaultValue) {
		try {
			return Byte.parseByte(string);
		} catch (NumberFormatException nfe) {
			return defaultValue;
		}
	}

	public static short toShort(String string) {
		try {
			return Short.parseShort(string);
		} catch (NumberFormatException nfe) {
			return 0;

		}

	}

	public static short toShort(String string, short defaultValue) {
		try {
			return Short.parseShort(string);
		} catch (NumberFormatException nfe) {
			return defaultValue;
		}
	}

	public static int toInt(String string) {
		try {
			return Integer.parseInt(string);
		} catch (NumberFormatException nfe) {
			return 0;
		}
	}

	public static int toint(String string, int defaultValue) {
		try {
			return Integer.parseInt(string);
		} catch (NumberFormatException nfe) {
			return defaultValue;
		}
	}

	public static long tolong(String string) {
		try {
			return Long.parseLong(string);
		} catch (NumberFormatException nfe) {
			return 0;
		}
	}

	public static long tolong(String string, long defaultValue) {
		try {
			return Long.parseLong(string);
		} catch (NumberFormatException nfe) {
			return defaultValue;

		}
	}

	public static float tofloat(String string) {
		try {
			return Float.parseFloat(string);
		} catch (NumberFormatException nfe) {
			return 0f;
		}
	}

	public static float tofloat(String string, float defaultValue) {
		try {
			return Float.parseFloat(string);
		} catch (NumberFormatException nfe) {
			return defaultValue;
		}
	}

	public static double todouble(String string) {
		try {
			return Double.parseDouble(string);
		} catch (NumberFormatException nfe) {
			return 0;
		}
	}

	public static double todouble(String string, double defaultValue) {
		try {
			return Double.parseDouble(string);
		} catch (NumberFormatException nfe) {
			return defaultValue;
		}
	}
}
