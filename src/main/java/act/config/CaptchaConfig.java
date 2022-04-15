package act.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;

@Configuration
public class CaptchaConfig {

	@Value("${kaptcha.border}")
	private String border;
	@Value("${kaptcha.border.color}")
	private String borderColor;
	@Value("${kaptcha.image.width}")
	private String imageWidth;
	@Value("${kaptcha.image.height}")
	private String imageHeight;
	@Value("${kaptcha.session.key}")
	private String sessionKey;
	@Value("${kaptcha.textproducer.font.color}")
	private String fontColor;
	@Value("${kaptcha.textproducer.font.size}")
	private String fontSize;
	@Value("${kaptcha.textproducer.char.length}")
	private String charLength;
	@Value("${kaptcha.textproducer.font.names}")
	private String fontNames;

	@Bean(name = "captchaProducer")
	public DefaultKaptcha getKaptchaBean() {
		DefaultKaptcha defaultKaptcha = new DefaultKaptcha();

		Properties properties = new Properties();
		properties.setProperty("kaptcha.border", border);
		properties.setProperty("kaptcha.border.color", borderColor);
		properties.setProperty("kaptcha.image.width", imageWidth);
		properties.setProperty("kaptcha.image.height", imageHeight);
		properties.setProperty("kaptcha.session.key", sessionKey);
		properties.setProperty("kaptcha.textproducer.font.color", fontColor);
		properties.setProperty("kaptcha.textproducer.font.size", fontSize);
		properties.setProperty("kaptcha.textproducer.char.length", charLength);
		properties.setProperty("kaptcha.textproducer.font.names", fontNames);

		defaultKaptcha.setConfig(new Config(properties));
		return defaultKaptcha;
	}

}
