package Spring_01_DI_4_Annotation.src.com.ssafy.di;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
	// 필드명 작성
	// CPU, 그래픽카드, 키보드 등등 사양
	public String getInfo() {
		return "데스크톱";
	}
}
