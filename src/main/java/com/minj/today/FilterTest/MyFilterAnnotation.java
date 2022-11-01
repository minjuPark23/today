package com.minj.today.FilterTest;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Slf4j
@WebFilter(urlPatterns = {"/api/filter/*"})
public class MyFilterAnnotation implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("init MyFilterAnnotation");
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("doFilter MyFilterAnnotation, uri : {}", ((HttpServletRequest)request).getRequestURL());
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        log.info("destroy MyFilterAnnotation");
        Filter.super.destroy();
    }
}
