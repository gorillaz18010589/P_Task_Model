package com.example.p_task_model.Task;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.p_task_model.ImageUtils;
import com.example.p_task_model.R;

public class RookieManager {
    private Context mContext;
    private RookieManager mRookieManager;

    public int STEP_SUCCESS_IMAGE = R.drawable.white01;
    public int STEP_SUCCESS_TEXT_COLOR = R.color.betrecord_select_text;
    public int STEP_FAIL_IMAGE = R.drawable.blue01;
    public int STEP_FAIL_TEXT_COLOR = R.color.bpWhite;

    //按鈕
    public int BTN_SUCCESS_COLOR = R.color.pastel_blue_color;
    public String BTN_SUCCESS_COMPLETED = "已完成";
    public int BTN_FAIL_COLOR = R.color.bpWhite;
    public String BTN_FAIL_COMPLETED = "去验证";

    public RookieManager(Context context) {
        this.mContext = context;
    }


    public void setSuccessBarView(ImageView imageView, TextView textView, Button button){
        setSuccessStepIcon(imageView);
        setSuccessTextView(textView);
        setSuccessBtn(button);
    }



    public void setFailBarView(ImageView imageView, TextView textView, Button button){
        setFailStepIcon(imageView);
        setFailTextView(textView);
        setFailBtn(button);
    }

    private void setFailBtn(Button button) {
        button.setBackground(mContext.getResources().getDrawable(R.drawable.ic_launcher_background));
        button.setTextColor(mContext.getResources().getColor(BTN_FAIL_COLOR));
        button.setText(BTN_FAIL_COMPLETED);
    }

    private void setFailTextView(TextView textView1) {
        textView1.setTextColor(mContext.getResources().getColor(R.color.colorAccent));
        textView1.setTextSize(12);
    }


    private void setSuccessBtn(Button button) {
        button.setBackground(mContext.getResources().getDrawable(R.drawable.ic_launcher_background));
        button.setTextColor(mContext.getResources().getColor(BTN_SUCCESS_COLOR));
        button.setText(BTN_SUCCESS_COMPLETED);
    }

    private void setSuccessTextView(TextView textView1) {
        textView1.setTextColor(mContext.getResources().getColor(R.color.betrecord_select_text));
        textView1.setTextSize(12);
    }

    public void setSuccessStepIcon(ImageView imageView){
        Bitmap sourBitmap = BitmapFactory.decodeResource(mContext.getResources(), STEP_SUCCESS_IMAGE);
        Bitmap bitmap = ImageUtils.drawTextToCenter(mContext, sourBitmap, mContext.getResources().getString(R.string.new_task_bind_step1), 11, mContext.getResources().getColor(STEP_SUCCESS_TEXT_COLOR));
        imageView.setImageBitmap(bitmap);
    }

    public void setFailStepIcon(ImageView imageView){
        Bitmap sourBitmap = BitmapFactory.decodeResource(mContext.getResources(),STEP_FAIL_IMAGE);
        Bitmap bitmap = ImageUtils.drawTextToCenter(mContext, sourBitmap, mContext.getResources().getString(R.string.new_task_bind_step1), 11, mContext.getResources().getColor(STEP_FAIL_TEXT_COLOR));
        imageView.setImageBitmap(bitmap);
    }
}