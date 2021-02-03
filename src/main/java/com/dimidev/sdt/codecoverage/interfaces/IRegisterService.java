package com.dimidev.sdt.codecoverage.interfaces;

import com.dimidev.sdt.codecoverage.User;
import com.dimidev.sdt.codecoverage.exceptions.PasswordException;
import com.dimidev.sdt.codecoverage.exceptions.ServiceException;
import com.dimidev.sdt.codecoverage.exceptions.UserException;

public interface IRegisterService {
    int register(String gebruikersnaam, String naam, String paswoord) throws UserException, PasswordException;
    User retrieve(int userID) throws ServiceException;
}
