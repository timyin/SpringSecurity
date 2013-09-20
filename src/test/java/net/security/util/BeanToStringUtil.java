/**
 * 
 */
package net.security.util;

import java.lang.reflect.Field;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * @author bo
 * 
 */
public class BeanToStringUtil {

	private static final Logger log = Logger.getLogger(BeanToStringUtil.class);

	public static String toString(Object o) {
		StringBuffer sb = new StringBuffer();
		if (null != o) {
			Class<?> clz = o.getClass();
			Field[] fields = clz.getDeclaredFields();
			for (Field field : fields) {
				field.setAccessible(true);
				try {
					sb.append(field.getName() + ":" + field.get(o) + ";");
				} catch (IllegalArgumentException e) {

					e.printStackTrace();
				} catch (IllegalAccessException e) {

					e.printStackTrace();
				}
			}

		}
		return sb.toString();
	}

	public static void setValue(Object o) throws IllegalArgumentException, IllegalAccessException {
		// StringBuffer sb = new StringBuffer();
		if (null != o) {
			Class<?> clz = o.getClass();
			Field[] fields = clz.getDeclaredFields();
			for (Field field : fields) {
				field.setAccessible(true);
				if (field.getGenericType().equals(Long.class) && !"id".equals(field.getName()))
					field.set(o, 2l);
				else if (field.getGenericType().equals(String.class))
					field.set(o, "TT");
				else if (field.getGenericType().equals(int.class))
					field.set(o, 2);
				else if (field.getGenericType().equals(Date.class))
					field.set(o, new Date());
				try {

				} catch (IllegalArgumentException e) {

					e.printStackTrace();
				}
			}

		}

		log.warn(BeanToStringUtil.toString(o));

	}
}
