package pk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pk.model.Credential;
import pk.repositories.ChallengeRepository;

@Service
@Transactional
public class CredentialService {
	@Autowired
	private ChallengeRepository credentialRepository;
	
	public Credential getCredential(String name) {
		List<Credential> credentials = credentialRepository.findByName(name);
		if(credentials.isEmpty()) {
			return null;
		} else
			return credentials.get(0);
		
	}
}
