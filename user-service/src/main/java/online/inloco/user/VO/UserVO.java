package online.inloco.user.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import online.inloco.user.entity.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {

	private User user;
	private Department department;
	
}
