package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static WeakReference f14799c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a1.m f14800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f14801b;

    public c0(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f14801b = scheduledThreadPoolExecutor;
    }

    public final synchronized b0 a() {
        String str;
        b0 b0Var;
        a1.m mVar = this.f14800a;
        synchronized (((ArrayDeque) mVar.f365e)) {
            str = (String) ((ArrayDeque) mVar.f365e).peek();
        }
        Pattern pattern = b0.f14794d;
        b0Var = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                b0Var = new b0(strArrSplit[0], strArrSplit[1]);
            }
        }
        return b0Var;
    }
}
