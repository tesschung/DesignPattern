## Java Design Pattern



## 컴포짓 패턴 (Composite Pattern)

여러 개의 객체들로 구성된 `복합 객체`와 `단일 객체`를 클라이언트에서 구별 없이 다루게 해주는 패턴

컨테이너/내용물/동일시

전체-부분의 관계(Ex. Directory-File)를 갖는 객체들 사이의 관계를 정의할 때 유용





***File System 구현***

*Component.java*

```java
package com.CompositePattern;

// 추상메소드 
abstract public class Component {

    public Component(String name) { // 생성부
        this.name = name;
    }
    private String name; // 이름필드

    public String getName() { 
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
}
```



*File.java*

```java
package com.CompositePattern;

// Component를 상속
public class File extends Component{
    public File(String name) { // 파일생성부 
        super(name);
    }

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
```



*Folder.java*

```java
package com.CompositePattern;

import java.util.ArrayList;
import java.util.List;

// Component를 상속
public class Folder extends Component{
    public Folder(String name) { // 폴더생성부
        super(name);
    }
    
    List<Component> children = new ArrayList<Component>(); // 폴더는 여러 하위 폴더/파일을 가질 수 있다.

    public boolean addComponent(Component component) {
        return children.add(component); // 리스트에 저장
    }

    public boolean removeComponent(Component component) {
        return children.remove(component); // 리스트에서 삭제 
    }

    public List<Component> getChildren() {
        return children;
    }

}
```



*Main.java*

```java
package com.CompositePattern;

public class Main {

    public static void main(String[] args) {

        Folder // Folder 생성
                root = new Folder("root"),
                home = new Folder("home"),
                garam = new Folder("garam"),
                music = new Folder("music"),
                picture = new Folder("picture"),
                doc = new Folder("doc"),
                usr = new Folder("usr");
        File // File 생성 
                track1 = new File("track1"),
                track2 = new File("track2"),
                pic1 = new File("pic1"),
                doc1 = new File("doc1"),
                java = new File("java");

        // 상위 폴더에서 하위 폴더/파일을 addComponent 메소드를 사용해서 추가한다.
        root.addComponent(home); // root 폴더에 hoom 폴더 추가
            home.addComponent(garam); // home 폴더에 garam 폴더 추가
                garam.addComponent(music); // garam 폴더에 music 폴더 추가
                    music.addComponent(track1); // music 폴더에 track1, track2 파일 추가 
                    music.addComponent(track2);
                garam.addComponent(picture); // garam 폴더에 picture 폴더 추가
                    picture.addComponent(pic1); // picture 폴더에 pic1 파일 추가
                garam.addComponent(doc); // garam 폴더에 doc 폴더 추가
                    doc.addComponent(doc1); // doc 폴더에 doc1 파일 추가

        root.addComponent(usr);
            usr.addComponent(java);

        showFolders(root);

    }

    private static void showFolders(Component component) {
        System.out.println(component.getClass().getName()+"|"+component.getName());
        if (component instanceof Folder) {
            for (Component c : ((Folder)component).getChildren()) {
                showFolders(c);
            }
        }
    }
}
```