package studentstatns.mangement.service;

import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * 处理学生的相关业务
 */
public interface StudentService {

    /**
     * 根据id获取student，并将其转为json字符串
     * @param id 身份证号
     * @return
     */
    String getStudentByid(String id) throws JsonProcessingException;

    /**
     * 修改密码
     * @param id 身份证号
     * @param oldPwd ： 密码
     * @param newpa：新密码
     * @return
     */
    String changePassword(String id, String oldPwd, String newpa) throws JsonProcessingException;
}
