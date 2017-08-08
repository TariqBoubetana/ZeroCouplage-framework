package org.zerocouplage.component.mobile.component;

import org.zerocouplage.component.impl.component.ZCAbstractComponent;
import org.zerocouplage.component.impl.component.ZCAbstractPassword;
import org.zerocouplage.component.mobile.page.ZCPageMobile;
import org.zerocouplage.component.mobile.page.ZCSharedMobilePage;

import android.content.Context;
import android.text.InputType;
import android.widget.EditText;
/**
 * <p>
 * ZCPasswordMobile is the ZCPassword component in Mobile
 * </p>
 * 
 * @author ZCTeam 2014
 * 
 */
public class ZCPasswordMobile extends ZCAbstractPassword{
	private EditText zcpass;
	@Override
	public Object display() throws Exception {
		Context parent = ZCSharedMobilePage.getINSTANCE().getMainActivityForCurrentApp();


		zcpass = new EditText((Context) parent);
		zcpass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
		return zcpass;
	}

}
