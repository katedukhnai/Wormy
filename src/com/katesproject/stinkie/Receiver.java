package com.katesproject.stinkie;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/**�����, ����������� ��������� ������ � ��������, ����������� ����������������� ��������, ������ � �������� ���������� ����������.*/
public class Receiver extends BroadcastReceiver {
/**������ ������� � �������� � ������ ������*/
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent serviceIntent = new Intent(context, TimerService.class);
        context.startService(serviceIntent);
    }

}