package parameterized;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class EnumParameters {

	enum VictorHugoWorks {
		LesMiserables,
		NotreDame,
		NinetyThree,
		LucretiaBorgia
		
	}
	@ParameterizedTest
	@EnumSource(VictorHugoWorks.class)
	public void VerifyWorksVictorHugo(VictorHugoWorks work) {
		assertNotNull(work);
	}

}
