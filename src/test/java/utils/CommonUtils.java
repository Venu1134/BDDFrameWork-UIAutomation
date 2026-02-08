package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommonUtils {

	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

	public static String username = "AutomationUser" + LocalDateTime.now().format(dtf);

	public static String reportName = "AutomationReport" + LocalDateTime.now().format(dtf);
}
