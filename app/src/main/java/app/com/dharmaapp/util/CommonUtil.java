package app.com.dharmaapp.util;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.Window;
import android.widget.Toast;

import app.com.dharmaapp.R;


public class CommonUtil {
    private static boolean showToast = true;
    private static Dialog proDialog;

    public static String getCurrentVersionName(Context context) {
        String version = "";
        try {
            PackageInfo pInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            version = pInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return version;
    }

    public static boolean showToast() {
        return showToast;
    }

    public static void displayToast(Context context, String msg) {
        if (showToast()) {
            Toast.makeText(context, "" + msg, Toast.LENGTH_SHORT).show();
        }
    }

    public static boolean checkInternetConnection(Context context) {
        ConnectivityManager mgr = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = mgr.getActiveNetworkInfo();
        if (netInfo != null) {
            if (netInfo.isConnected()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
            //No internet
        }
    }

    public static void showProgressDialog(Context context) {
        proDialog = new ProgressDialog(context);
        proDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        proDialog.setTitle(context.getString(R.string.loading));
        proDialog.setCancelable(false);
        proDialog.show();
    }




}
