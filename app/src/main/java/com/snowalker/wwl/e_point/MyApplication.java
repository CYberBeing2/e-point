package com.snowalker.wwl.e_point;

import android.app.Application;

/**
 * Created by Administrator on 2015/6/12 0012.
 * ����Ӧ���еĻ��ʹ�û�ܹ�ֱ���˳���ϵͳ����
 */
public class MyApplication extends Application {
    // �����˳����
    private static boolean isProgramExit = false;

    public void setExit(boolean exit) {
        isProgramExit = exit;
    }

    public boolean isExit() {
        return isProgramExit;
    }
}