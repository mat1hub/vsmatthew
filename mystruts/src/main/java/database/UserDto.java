package database;

import java.util.Objects;

public class UserDto {
private String username;
private String password;
private String emailId;
private String phoneNumber;
@Override
public String toString() {
	return "UserDto [username=" + username + ", password=" + password + ", emailId=" + emailId + ", phoneNumber="
			+ phoneNumber + "]";
}
@Override
public int hashCode() {
	return Objects.hash(emailId, password, phoneNumber, username);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	UserDto other = (UserDto) obj;
	return Objects.equals(emailId, other.emailId) && Objects.equals(password, other.password)
			&& Objects.equals(phoneNumber, other.phoneNumber) && Objects.equals(username, other.username);
}

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}


}
