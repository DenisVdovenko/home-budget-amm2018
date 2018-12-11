package dsr.amm.homebudget.service;

import dsr.amm.homebudget.data.dto.LoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Service;


@Service
public class AuthService {

    @Autowired
    private AuthenticationManager authenticationManager;
    public void login(LoginDTO loginDTO) {
        // FIXME: implement authentication logic
        throw new RuntimeException("Not implemented");
    }
}