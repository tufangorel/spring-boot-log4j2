package org.example.config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.ClientAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class MyOncePerRequestFilter extends OncePerRequestFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyOncePerRequestFilter.class);

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

        logger.info(String.format("Inside Once Per Request Filter originated by request %s", request.getRequestURI()) );
        filterChain.doFilter(request, response);
    }

    /*
     Intentionally returned true from the shouldNotFilterAsyncDispatch() method.
     This is to demonstrate that MyOncePerRequestFilter is invoked only once for the container thread and not for subsequent async threads.
     */
    @Override
    protected boolean shouldNotFilterAsyncDispatch() {
        return true;
    }
}