package com.example.p_task_model.Task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.p_task_model.R;
import com.google.gson.Gson;

import de.greenrobot.event.EventBus;

public class SecondActivity extends AppCompatActivity {
    private RookieActivityData rookieActivityData;
    private RookieActivityData rookieActivityDatas;
    RookieActivityData.Part1InfoBean part1InfoBean;
    RookieActivityData.Part2InfoBean part2InfoBean;
    RookieActivityData.Part3InfoBean part3InfoBean;
    RookieActivityData.Part4InfoBean part4InfoBean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initData();
    }

    public void back(View view) {
        finish();
        EventBus.getDefault().postSticky(new RookieActivityEvent(rookieActivityDatas));
    }

    private void initData() {
        RookieActivityData rookieActivityData = new RookieActivityData();

        part1InfoBean = new RookieActivityData.Part1InfoBean();
        part1InfoBean.setBankAccountStatus(true);
        part1InfoBean.setBonus(1);
        part1InfoBean.setCellPhoneStatus(true);
        part1InfoBean.setClaimStatus(1);
        part1InfoBean.setEmailStatus(true);
        part1InfoBean.setNotDuplicateIP(true);
        rookieActivityData.setPart1Info(part1InfoBean);

        part2InfoBean = new RookieActivityData.Part2InfoBean();
        part2InfoBean.setDepositStatus(true);
        part2InfoBean.setWithdrawStatus(true);
        part2InfoBean.setBonus(1);
        part2InfoBean.setClaimStatus(1);
        rookieActivityData.setPart2Info(part2InfoBean);

        part3InfoBean = new RookieActivityData.Part3InfoBean();
        part3InfoBean.setDepositStatus(true);
        part3InfoBean.setNeedBet(1);
        part3InfoBean.setBonus(1);
        part3InfoBean.setClaimStatus(1);
        part3InfoBean.setNeedDeposit(1);
//        part3InfoBean.setNeedBetGameTypeName();
        rookieActivityData.setPart3Info(part3InfoBean);

        part4InfoBean = new RookieActivityData.Part4InfoBean();
        part4InfoBean.setCumulativeBetStatus(true);
        part4InfoBean.setNeedCumulativeBet(1);
        part4InfoBean.setBonus(1);
        part4InfoBean.setClaimStatus(1);
        part4InfoBean.setNeedCumulativeDeposit(1);
        part4InfoBean.setCumulativeDepositStatus(true);
        rookieActivityData.setPart4Info(part4InfoBean);

        Gson gson = new Gson();
        String json = gson.toJson(rookieActivityData);
        rookieActivityDatas = gson.fromJson(json,RookieActivityData.class);
        Log.v("hank","jsonData:" + json);
    }
}