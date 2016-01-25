package pk.repositories;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.assertj.core.api.Assertions.*;
import pk.ApplicationMain;
import pk.model.Credential;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(ApplicationMain.class)
@WebIntegrationTest
public class CredentialRepositoryTest {
	@Autowired
	private ChallengeRepository credentialRepository;
	
	@Test
	public void findByName() {
		List<Credential> credentials = credentialRepository.findByName("ION");
		assertThat(credentials).hasSize(0);
	}
}
