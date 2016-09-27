package test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**   
 * @Title GeneratorTest.java 
 * @Package test 
 * @Description:mybatis-generator
 * @author dfx  
 * @date 2015-11-13 11:54:22 
 * @version V1.0   
 */
public class GeneratorTest {

	@Test
	public void generatorTest() throws Exception{
	   List<String> warnings = new ArrayList<String>();
	   boolean overwrite = true;
	   File configFile = new File("config/generatorConfig.xml");
	   ConfigurationParser cp = new ConfigurationParser(warnings);
	   Configuration config = cp.parseConfiguration(configFile);
	   DefaultShellCallback callback = new DefaultShellCallback(overwrite);
	   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
	   myBatisGenerator.generate(null);
	}
}
