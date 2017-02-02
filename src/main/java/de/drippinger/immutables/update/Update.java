package de.drippinger.immutables.update;


import de.drippinger.immutables.User;
import org.immutables.value.Value;

@Value.Modifiable
@Value.Style(deepImmutablesDetection = true)
public interface Update {

	User user();

}
