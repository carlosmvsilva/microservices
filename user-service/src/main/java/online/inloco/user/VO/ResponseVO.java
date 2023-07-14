package online.inloco.user.VO;

import java.util.Date;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseVO {
	
	private Date timeStamp;
	private String statusCode;
	private String status;
	private String errorMessage;
	private String developmentMessage;
	private Map<String, ?> data;
}
