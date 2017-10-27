package com.djcps.common.exception;

import com.djcps.common.mode.BaseError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Chengw
 * @since 2017/10/27 14:54.
 */
@ControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, BaseException e) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName("error");
        return mav;
    }

    @ExceptionHandler(value = BaseException.class)
    @ResponseBody
    public BaseError<String> jsonErrorHandler(HttpServletRequest req, BaseException e) throws Exception {
        BaseError<String> r = new BaseError<>();
        r.setMessage(e.getMessage());
        r.setCode(BaseError.FAILE);
        r.setData(null);
        r.setUrl(req.getRequestURL().toString());
        return r;
    }
}
