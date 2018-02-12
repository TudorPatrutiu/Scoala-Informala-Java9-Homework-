package ro.sci;

import ro.sci.controller.LoginController;
import ro.sci.domain.LoginRequest;
import ro.sci.domain.User;
import ro.sci.controller.CauciucController;
import ro.sci.domain.Cauciuc;
import ro.sci.domain.SearchRequest;

public class Main {

    public static void main(String[] args) {

        LoginController loginController = new LoginController();

        LoginRequest loginRequest = new LoginRequest("gigi", "alegeoaia");

        User result = loginController.handleLoginRequest(loginRequest);

        if (result != null) {
            System.out.println("autentificare cu succes");
        } else {
            System.out.println("mai incearca " + loginRequest.loginName);

        }
        CauciucController cauciucController = new CauciucController();
        SearchRequest searchRequest = new SearchRequest("summer", "225/55");
        Cauciuc result2 = cauciucController.handleSearchRequest(searchRequest);

        if (result2 != null) {
            System.out.println("a fost gasit cauciucul");
        } else {
            System.out.println("mai incearca  " + searchRequest.typeOfCauciuc);


        }
    }
}