package e_learning_association.project.security;

import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.server.ResponseStatusException;

public final class AuthUtils {

    private AuthUtils() {}

    public static String extractUserId() {
        Authentication auth = getAuth();

        if (auth instanceof AnonymousAuthenticationToken) {
            throw new ResponseStatusException(HttpStatus.FORBIDDEN, "You have been forbidden");
        }

        JwtAuthenticationToken jwtAuthenticationToken = (JwtAuthenticationToken) auth;

        IO.println("Test: " + jwtAuthenticationToken);

        return jwtAuthenticationToken.getToken().getSubject();
    }

    public static String extractJwt() {
        if (getAuth().getPrincipal() != null)
            return ((Jwt) getAuth().getPrincipal()).getTokenValue();
        throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "You have been unauthorized");
    }

    public static Authentication getAuth() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

}