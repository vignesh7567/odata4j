package odata4j.core;

public interface OEntityRef<T> {

	T execute();
	OEntityRef<T> nav(String navProperty,Object... key);
}
