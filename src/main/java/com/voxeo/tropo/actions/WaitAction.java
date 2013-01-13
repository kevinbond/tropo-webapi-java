package com.voxeo.tropo.actions;

import static com.voxeo.tropo.Key.MILLISECONDS;
import net.sf.json.JSONObject;

import com.voxeo.tropo.Key;
import com.voxeo.tropo.annotations.RequiredKeys;
import com.voxeo.tropo.annotations.ValidKeys;

@ValidKeys(keys={"milliseconds", "allowSignals"})
@RequiredKeys(keys={"milliseconds"})
public class WaitAction extends JsonAction {

	public WaitAction(int milliseconds) {
		
		setName("wait");
		JSONObject item = new JSONObject();
		item.put("milliseconds", milliseconds);
		add(item);
	}
	
	public WaitAction(Key... keys) {
	
		super(keys);
		setName("wait");
	}	
	
	public WaitAction wait(int milliseconds) {

		return wait(MILLISECONDS(milliseconds));
	}
	
	public WaitAction wait(Key... keys) {

		add(buildObjectFromKeys(keys));		
		return this;
	}
}
