package asjdkwla.chatgpt.domain.security.model.vo;
//Token 的对象信息，你可以设置用户ID、用户密码
import org.apache.shiro.authc.AuthenticationToken;

public class JwtToken implements AuthenticationToken {

    private String jwt;

    public JwtToken(String jwt) {
        this.jwt = jwt;
    }

    /**
     * 等同于账户
     */
    @Override
    public Object getPrincipal() {
        return jwt;
    }

    /**
     * 等同于密码
     */
    @Override
    public Object getCredentials() {
        return jwt;
    }

}

