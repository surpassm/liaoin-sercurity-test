/**
 * 
 */
package com.liaoin.code;

import com.liaoin.security.core.validate.bean.ImageCode;
import com.liaoin.security.core.validate.service.ValidateCodeGenerator;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;


//@Component("imageCodeGenerator")
public class DemoImageCodeGenerator implements ValidateCodeGenerator {

	/* (non-Javadoc)
	 * @see com.imooc.security.core.validate.code.ValidateCodeGenerator#generate(org.springframework.web.context.request.ServletWebRequest)
	 */
	@Override
	public ImageCode generate(ServletWebRequest request) {
		System.out.println("更高级的图形验证码生成代码");
		return null;
	}

}
