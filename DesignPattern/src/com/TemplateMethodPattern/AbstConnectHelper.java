package com.TemplateMethodPattern;

// 추상 클래스

public abstract class AbstConnectHelper {

    // 알고리즘의 단계인 경우 외부에 노출이 되면 안된다. 때문에 protected로 선언
    // 외부에서는 호출하면 안되는데, 하위 클래스에서는 사용해야하는 경우
    abstract protected String doSecurity(String info);

    abstract protected String authentication(String id, String password);

    abstract protected int authorization(String userName);

    abstract protected String connection(String info);

    public String requestConnection(String info) {

        String id, password, userName, decodedInfo, userInfo;

        // 암호화된 정보를 복호화 합니다.
        // 암호화된 문자열을 디코드한다.
        decodedInfo = doSecurity(info);

        // 반환된 것을 가지고 아이디, 암호를 할당한다.
        // decodedInfo에서 id 와 password를 추출
        id = "abc";
        password = "abc";

        userInfo = authentication(id, password);

        // userInfo에서 userName을 찾아 냅니다.
        userName = "abc";

        int result = authorization(userName);

        switch (result) {

            case 0:// 무료회원
                break;
            case 1:// 유료회원
                break;
            case 2:// 게임 마스터
                break;
            case 3:// 접속 권한 없음
                break;
            default:
                break;
        }

        return connection(userInfo);
    }
}