package de.drippinger.immutables;

import org.junit.Test;

public class UserTest {

	@Test
	public void should_handle_nullable(){
		// Middlenames left intentionally null
		ImmutableUser user = ImmutableUser.builder()
				.name("User")
				.build();

		ModifiableUser modifiableUser = ModifiableUser.create().from(user);
	}

}