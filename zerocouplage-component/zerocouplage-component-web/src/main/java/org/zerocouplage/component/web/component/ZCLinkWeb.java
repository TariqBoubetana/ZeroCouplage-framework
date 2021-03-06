package org.zerocouplage.component.web.component;

import java.util.HashMap;

import org.zerocouplage.component.impl.component.ZCAbstractButton;
import org.zerocouplage.component.impl.component.ZCAbstractlink;
import org.zerocouplage.component.impl.enginevm.ZCEngineVelocity;

import org.zerocouplage.api.controller.IZCManager;

/**
 * <p>
 * ZCLinkWeb is the ZCLink component in web
 * </p>
 * 
 * @author ZCTeam 2014
 * 
 */

public class ZCLinkWeb extends ZCAbstractlink {

	@Override
	public String display() throws Exception {
		ZCEngineVelocity zcve = new ZCEngineVelocity();
		HashMap<String, Object> mapOfDataComponent = new HashMap<String, Object>();
		if (getText() == null) {
			mapOfDataComponent.put("text", "");
		} else {
			mapOfDataComponent.put("text", getText());
		}
		if (getAction() == null) {
			mapOfDataComponent.put("action", "");
		} else {
			mapOfDataComponent.put("action", getAction());
		}

		if (getName() == null) {
			mapOfDataComponent.put("name", "");
		} else {
			mapOfDataComponent.put("name", getName());
		}
		if (getStyle().getColor() == null) {
			mapOfDataComponent.put("color", "");
		} else {
			mapOfDataComponent.put("color", getStyle().getColor());
		}

		return zcve.ZCEngine(this, mapOfDataComponent);

	}

	public String getAction() {
		return action;
	}

	public void setAction(String a, Object thisClass) {

		this.action = a + ".zc";
	}

}
