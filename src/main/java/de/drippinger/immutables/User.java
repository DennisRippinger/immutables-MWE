package de.drippinger.immutables;


import org.immutables.value.Value;

import java.time.LocalDate;

@Value.Modifiable
public interface User {

	String name();

}
