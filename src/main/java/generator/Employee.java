package generator;

import java.io.Serializable;
import java.util.Date;

/**
 * employee
 * @author 
 */
public class Employee implements Serializable {
    private Long id;

    private String username;

    private Date inputtime;

    private String phone;

    private String email;

    private Boolean state;

    private Boolean admin;

    private Long depId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getInputtime() {
        return inputtime;
    }

    public void setInputtime(Date inputtime) {
        this.inputtime = inputtime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Long getDepId() {
        return depId;
    }

    public void setDepId(Long depId) {
        this.depId = depId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Employee other = (Employee) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getInputtime() == null ? other.getInputtime() == null : this.getInputtime().equals(other.getInputtime()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getAdmin() == null ? other.getAdmin() == null : this.getAdmin().equals(other.getAdmin()))
            && (this.getDepId() == null ? other.getDepId() == null : this.getDepId().equals(other.getDepId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getInputtime() == null) ? 0 : getInputtime().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getAdmin() == null) ? 0 : getAdmin().hashCode());
        result = prime * result + ((getDepId() == null) ? 0 : getDepId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", inputtime=").append(inputtime);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", state=").append(state);
        sb.append(", admin=").append(admin);
        sb.append(", depId=").append(depId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}