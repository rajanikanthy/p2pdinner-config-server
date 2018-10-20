package com.p2pdinner.config;

import org.eclipse.jgit.transport.CredentialsProvider;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class P2PDinnerConfigServerConfiguration {
	@Bean
	public CredentialsProvider credentialsProvider() {
		CredentialsProvider cp = new UsernamePasswordCredentialsProvider("rajani@p2pdinner.com", "1800$heemu");
		return cp;
	}
}
