package com.example.p_task_model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.p_task_model.Task.RookieActivityData;
import com.example.p_task_model.Task.RookieActivityEvent;
import com.example.p_task_model.Task.RookieManager;
import com.example.p_task_model.Task.SecondActivity;
import com.google.gson.Gson;

import de.greenrobot.event.EventBus;
import de.greenrobot.event.Subscribe;
import de.greenrobot.event.ThreadMode;

public class MainActivity extends AppCompatActivity {
    private RookieActivityData rookieActivityData;
    private RookieActivityData.Part1InfoBean part1InfoBean;
    private RookieActivityData.Part2InfoBean part2InfoBean;
    private RookieActivityData.Part3InfoBean part3InfoBean;
    private RookieActivityData.Part4InfoBean part4InfoBean;

    private boolean isBankAccountStatus;
    private boolean isCellPhoneStatus;
    private boolean isEmailStatus;
    private boolean isNotDuplicateIP;

    private boolean isWithdrawDepositStatus;
    private boolean isWithdrawStatus;

    private boolean isBetStatus;
    private boolean isDepositStatus;

    private boolean isCumulativeBetStatus;
    private boolean isCumulativeDepositStatus;


    RookieManager rookieManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         rookieManager = new RookieManager(MainActivity.this);
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public void toPage2(View view) {
        startActivity(new Intent(MainActivity.this, SecondActivity.class));
    }

    @Subscribe(threadMode = ThreadMode.MainThread,sticky = true)
    public void getRookieActivityEvent(RookieActivityEvent rookieActivityEvent){
        rookieActivityData = rookieActivityEvent.getRookieActivityData();
        Gson gson = new Gson();
        String jsonData = gson.toJson(rookieActivityEvent.getRookieActivityData());
        Log.v("hank","getRookieActivityEvent-> " + jsonData);

        part1InfoBean = rookieActivityData.getPart1Info();
        part2InfoBean = rookieActivityData.getPart2Info();
        part3InfoBean = rookieActivityData.getPart3Info();
        part4InfoBean = rookieActivityData.getPart4Info();

        isBankAccountStatus = part1InfoBean.isBankAccountStatus();
        isCellPhoneStatus = part1InfoBean.isCellPhoneStatus();
        isEmailStatus = part1InfoBean.isEmailStatus();
        isNotDuplicateIP = part1InfoBean.isNotDuplicateIP();

        isWithdrawDepositStatus =  part2InfoBean.isDepositStatus();
        isWithdrawStatus = part2InfoBean.isWithdrawStatus();

        isBetStatus = part3InfoBean.isBetStatus();
        isDepositStatus = part3InfoBean.isDepositStatus();

        isCumulativeBetStatus = part4InfoBean.isCumulativeBetStatus();
        isCumulativeDepositStatus = part4InfoBean.isCumulativeDepositStatus();


        if(part1InfoBean.isBankAccountStatus()){

        }else {

        }
        if(part1InfoBean.isEmailStatus()){

        }else {

        }
        if(part1InfoBean.isCellPhoneStatus()){

        }else {

        }
        if(part1InfoBean.isNotDuplicateIP()){

        }else {

        }


        if(part2InfoBean.isWithdrawStatus()){

        }else {

        }
        if(part2InfoBean.isDepositStatus()){

        }else {

        }


        if(part3InfoBean.isDepositStatus()){

        }else {

        }
        if(part3InfoBean.isBetStatus()){

        }else {

        }

        if(part4InfoBean.isCumulativeDepositStatus()){

        }else {

        }
        if(part4InfoBean.isCumulativeBetStatus()){

        }else {

        }

        Log.v("hank","getRookieActivityEvent-> isBankCard" + part1InfoBean.isBankAccountStatus());

    }


    //    activityNewcomerTaskBinding.conBindTopBar.setOnClickListener(onClickListener);
//        activityNewcomerTaskBinding.conWithdrawalTopBar.setOnClickListener(onClickListener);
//        activityNewcomerTaskBinding.conDepositTopBar.setOnClickListener(onClickListener);
//        activityNewcomerTaskBinding.conGiftPackContainer.setOnClickListener(onClickListener);
//
//        activityNewcomerTaskBinding.btnBindStep1.setOnClickListener(onClickListener);
//        activityNewcomerTaskBinding.btnBindStep2.setOnClickListener(onClickListener);
//        activityNewcomerTaskBinding.btnBindStep3.setOnClickListener(onClickListener);
//        activityNewcomerTaskBinding.btnWithdrawalStep1.setOnClickListener(onClickListener);
//        activityNewcomerTaskBinding.btnWithdrawalStep2.setOnClickListener(onClickListener);
//        activityNewcomerTaskBinding.btnWithdrawalStep3.setOnClickListener(onClickListener);
//        activityNewcomerTaskBinding.btnDepositStepStep1.setOnClickListener(onClickListener);
//        activityNewcomerTaskBinding.btnDepositStepStep2.setOnClickListener(onClickListener);
//        activityNewcomerTaskBinding.btnDepositStepStep3.setOnClickListener(onClickListener);
//        activityNewcomerTaskBinding.btnGiftPackStepStep1.setOnClickListener(onClickListener);
//        activityNewcomerTaskBinding.btnGiftPackStepStep2.setOnClickListener(onClickListener);
//        activityNewcomerTaskBinding.btnGiftPackStepStep3.setOnClickListener(onClickListener);
}