package com.g.f.survey.intercepter;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.g.f.survey.controller.QuestionController;

public class LoggingIntercepter implements HandlerInterceptor {

	private static final Logger logger = LoggerFactory.getLogger(QuestionController.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
		
		logger.info("pre Handle");
		
		//FIXME ここがフォーマットを使った方がよい
		StringBuffer message = new StringBuffer();
		message.append("[" + request.getMethod() + "] ");
		//FIXME 下記2つはnullになる
		message.append(request.getPathInfo() + " ");
		message.append(request.getQueryString());
		logger.info(message.toString());
		
//		Map<String, String[]> parameterMap = request.getParameterMap();
//		
//		parameterMap.forEach((key,value) -> {
//			logger.info(key + ":" + value); //FIXME valueの型が配列
//		});

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		
		logger.info("post Handle");
	}

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
		logger.info("after completion");

	}

}
