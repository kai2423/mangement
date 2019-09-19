package studentstatns.mangement.mapper;

import org.springframework.stereotype.Repository;
import studentstatns.mangement.entity.ManagementUser;

@Repository
public interface ManagerUserMapper {

    ManagementUser getManagementUserByIDAndPassword(String id, String password);

}
