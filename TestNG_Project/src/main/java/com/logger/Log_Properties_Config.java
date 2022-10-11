
package com.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log_Properties_Config {

	public static Logger log = Logger.getLogger(Log_Properties_Config.class);

	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");

		log.debug("debug");

		log.info("info");

		log.warn("warning");

		log.error("error");

		log.fatal("fatal msg");

	}

}
