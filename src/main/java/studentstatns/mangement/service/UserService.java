package studentstatns.mangement.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface UserService {
    Object login(String id, String password) throws JsonProcessingException;
}
