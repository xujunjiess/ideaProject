package com.lanxin.inter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lanxin.util.Result;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created by Administrator on 2019/9/20.
 */
@Component
public class MyFilter extends ZuulFilter {
    /**
     * 拦截类型
     * @return
     */
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    /**
     * 优先级 数字越小优先级别越高
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext context=RequestContext.getCurrentContext();
        HttpServletRequest request=context.getRequest();
        String url=request.getRequestURI();
        System.out.println(url+"URL===============");
        if(url.startsWith("/orders")){
            return true;//true进行拦截
        }
        return false;
    }

    @Override
    public Object run() {
        RequestContext context=RequestContext.getCurrentContext();
        HttpServletRequest request=context.getRequest();
        String token=request.getParameter("token");
        HttpServletResponse response= context.getResponse();
        response.setContentType("application/json;charset=utf-8");
        ObjectMapper mapper=new ObjectMapper();
        System.out.println("开始判断"+token);
        if(token==null){
            try {
                context.setSendZuulResponse(false);
                Result result=Result.filed();
                result.setCode("402");
                result.setMsg("你还没有登录");
                PrintWriter pw=response.getWriter();
                pw.write(mapper.writeValueAsString(result));
                pw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
