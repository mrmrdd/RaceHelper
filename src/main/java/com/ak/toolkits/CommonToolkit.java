package com.ak.toolkits;

import com.ak.service.MyUserDetailsService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by arthur on 7/24/17.
 */
public final class CommonToolkit {

    private CommonToolkit() {
    }

    public static CustomUser getCustomUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object customUser = authentication.getPrincipal();
        if(customUser instanceof CustomUser) {
            return (CustomUser) authentication.getPrincipal();
        } else {
            return null;
        }
    }
}
