package uk.nhs.gpitf.purchasing.utils;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.ArrayUtils;

import lombok.Data;
import uk.nhs.gpitf.purchasing.entities.Role;

@Data
public class SecurityInfo implements Serializable {
	private static final long serialVersionUID = -7352347396487896171L;
	boolean isAuthenticated;
	boolean isKnown;
	String email;
	String forename;
	String surname;
	long orgContactId;
	long organisationId;
	String organisationName;
	long organisationTypeId;
	long[] roles;
	String rolesDescription;
	
	public static final String SECURITY_ERROR_REDIRECT = "redirect:/";
	public static final String SECURITY_ERROR_TARGET = "/";
	
	public static boolean isAuthenticated(HttpServletRequest request) {
		SecurityInfo secinfo = getSecurityInfo(request);
		return secinfo.isAuthenticated;
	}
	
	public boolean isPurchaser() {
		return hasRole(Role.PURCHASER, true);
	}
	
	public boolean isAdministrator() {
		return hasRole(Role.ADMINISTRATOR, false);
	}
	
	public boolean isLocalAdmin() {
		return hasRole(Role.LOCAL_ADMIN, false);
	}
	
	public boolean isLocalAdminOrAdmin() {
		return hasRole(Role.LOCAL_ADMIN, true);
	}
	
	public boolean hasRole(long role, boolean administratorCanDoRole) {
		return roles != null && (ArrayUtils.contains(roles, role) || administratorCanDoRole && ArrayUtils.contains(roles, Role.ADMINISTRATOR));
	}
	
	public static SecurityInfo getSecurityInfo(HttpServletRequest request) {
		SecurityInfo secinfo = (SecurityInfo) request.getSession().getAttribute("SecurityInfo");
		if (secinfo == null) {
			secinfo = new SecurityInfo();
			request.getSession().setAttribute("SecurityInfo", secinfo);
		}
		return secinfo;
	}
	
	public String loggerSecurityMessage(String issue) {
		return "SECURITY: " + issue + " but user not authorised. User: " + toString();
	}
	
	@Override
	public String toString() {
		return email + " [" + forename + " " + surname + "]";
	}
}
