/**
 * 
 */
package gov.uspto.gd;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.text.TextConfigurationRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @author abhakthan
 *
 */
public class TokenConfigurationRealm extends TextConfigurationRealm {

	
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		AuthenticationInfo a = super.doGetAuthenticationInfo(arg0);
		return a;
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		AuthorizationInfo a = (AuthorizationInfo) super.doGetAuthorizationInfo(principals);
		return a;
	}

}
