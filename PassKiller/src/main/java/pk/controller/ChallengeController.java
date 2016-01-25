package pk.controller;

import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pk.model.Credential;
import pk.service.CredentialService;
import pk.thymeleaf.Challenge;

@Controller
public class ChallengeController {
	@Inject
	private CredentialService credentialService;
	
	@RequestMapping(value="/challenge", method=RequestMethod.GET)
    public String greetingForm(Model model) {
		Challenge challenge = new Challenge();
		challenge.setShow(false);
        model.addAttribute("challenge", challenge);
        return "challenges";
    }

    @RequestMapping(value="/challenge", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Challenge challenge, Model model) {
    	Credential credential = credentialService.getCredential(challenge.getName());
    	if(credential != null) {
    		challenge.setShow(true);
    		challenge.setErrorShow(false);
    		return "challenges :: #content(result="+credential.getPassword()+")";
    	} else {
    		challenge.setShow(false);
    		challenge.setErrorShow(true);
    		return "challenges :: #content(errorResult="+"'Invalid Request'"+")";
    	}
    }
}
