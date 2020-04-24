package com.ObserverPattern;

public class Button {

    public void onClick(){
        // 이벤트 처리를 해줘야 한다.
        // 클릭이벤트가 발생하면 자기자신을 업데이트 한다.
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public interface OnClickListener{
        void onClick(Button button);
    }

    OnClickListener onClickListener;

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
