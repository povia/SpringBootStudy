package board.common;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

// RestControllerAdvice도 존재함
@ControllerAdvice
public class ExceptionHandler {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	
	
	
	// 항상 마지막에 위치해야 하는 에러 타입
	// XXX RunTimeException 추가
	@org.springframework.web.bind.annotation.ExceptionHandler({Exception.class,RuntimeException.class})
	public ModelAndView defaultExceptionHandler(HttpServletRequest request, Exception exception) {
	
		ModelAndView mv = new ModelAndView("/error/error_default");
		
		// 절대로 여기에 Exception을 그대로 추가하면 안됨
		mv.addObject("exception", exception);
		
		log.error("exception", exception);
		return mv;
	}
	
}
