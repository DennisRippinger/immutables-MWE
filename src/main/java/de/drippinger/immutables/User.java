package de.drippinger.immutables;


import com.sun.istack.internal.Nullable;
import org.immutables.value.Value;

import java.time.LocalDate;
import java.util.List;

@Value.Immutable
@Value.Modifiable
public interface User {

	String name();

	@Nullable
	List<String> middlenames();

}
