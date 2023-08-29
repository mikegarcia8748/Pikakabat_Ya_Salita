package org.sticollegeandroidprojects.applicationdriver.Etc.Dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import org.sticollegeandroidprojects.applicationdriver.R;

public class MessageBox {
    private static final String TAG = MessageBox.class.getSimpleName();

    private final Context mContext;

    private AlertDialog poDialogx;
    private MaterialButton btnPositive;
    private MaterialButton btnNegative;
    private TextView lblTitle;
    private TextView lblMsgxx;

    public interface OnDialogButtonClickListener {
        void OnClick(AlertDialog dialog);
    }

    public MessageBox(Context mContext) {
        this.mContext = mContext;
    }

    public void CreateDialog(String Title, String Message){
        AlertDialog.Builder poBuilder = new AlertDialog.Builder(mContext);
        View view = LayoutInflater.from(mContext).inflate(R.layout.message_box, null);
        poBuilder.setCancelable(false)
                .setView(view);
        poDialogx = poBuilder.create();
        poDialogx.setCancelable(false);

        lblTitle = view.findViewById(R.id.lblTitle);
        lblMsgxx = view.findViewById(R.id.lblMessage);
        btnPositive = view.findViewById(R.id.btnPositive);
        btnNegative = view.findViewById(R.id.btnNegative);

        lblTitle.setText(Title);
        lblMsgxx.setText(Message);
    }

    public void setPositiveButton(String label, OnDialogButtonClickListener listener){
        btnPositive.setText(label);
        btnPositive.setVisibility(View.VISIBLE);
        btnPositive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.OnClick(poDialogx);
            }
        });
    }

    public void setNegativeButton(String label, OnDialogButtonClickListener listener){
        btnNegative.setText(label);
        btnNegative.setVisibility(View.VISIBLE);
        btnNegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.OnClick(poDialogx);
            }
        });
    }

    public void show(){
        if(!poDialogx.isShowing()) {
            poDialogx.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            poDialogx.getWindow().getAttributes().windowAnimations = R.style.PopupAnimation;
            try {
                if (!((Activity) mContext).isFinishing()) {
                    poDialogx.show();
//                    isDialogShown = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
