package com.google.android.gms.internal.ads;

import android.os.AsyncTask;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wu0 extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public oq0 f11898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ut f11899b;

    public wu0(ut utVar) {
        this.f11899b = utVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        oq0 oq0Var = this.f11898a;
        if (oq0Var != null) {
            oq0Var.f8764e = null;
            wu0 wu0Var = (wu0) ((ArrayDeque) oq0Var.f8763d).poll();
            oq0Var.f8764e = wu0Var;
            if (wu0Var != null) {
                wu0Var.executeOnExecutor((ThreadPoolExecutor) oq0Var.f8762c, new Object[0]);
            }
        }
    }
}
