package com.dimidev.sdt.codecoverage.interfaces;

import com.dimidev.sdt.codecoverage.User;
import com.dimidev.sdt.codecoverage.exceptions.PasswordException;
import com.dimidev.sdt.codecoverage.exceptions.RetrievalFailed;
import com.dimidev.sdt.codecoverage.exceptions.UserException;

public interface IUserDAO {
    User storeUser(String gebruikersnaam, String naam, String paswoord) throws UserException, PasswordException;
    User retrieveUser(int userID) throws RetrievalFailed;
}
