package com.minj.today.FilterTest;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Slf4j
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("init MyFilter");
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("doFilter MyFilter, uri : {}", ((HttpServletRequest)request).getRequestURL());
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        log.info("destroy MyFilter");
        Filter.super.destroy();
    }
}
