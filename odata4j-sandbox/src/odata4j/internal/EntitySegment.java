package odata4j.internal;

public class EntitySegment{
	public final String segment;
	public final Object[] key;
	public EntitySegment(String segment, Object[] key){
		this.segment = segment;
		this.key = key;
	}
	
	@Override
	public String toString(){			
		return this.segment + InternalUtil.keyString(this.key);
	}
}
