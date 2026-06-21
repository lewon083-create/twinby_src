package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.os.Handler;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pp0 implements dp0, e80, OnCompleteListener, hl1, o31, td0, lx1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f9149c;

    public /* synthetic */ pp0(int i, Object obj) {
        this.f9148b = i;
        this.f9149c = obj;
    }

    @Override // com.google.android.gms.internal.ads.lx1
    public int a(Object obj) {
        dx1 dx1Var = (dx1) obj;
        HashMap map = mx1.f8033a;
        jx1 jx1Var = (jx1) this.f9149c;
        String str = dx1Var.f4713b;
        return ((str.equals(jx1Var.f6975m) || str.equals(mx1.c(jx1Var))) && dx1Var.f(jx1Var, false) && dx1Var.g(jx1Var)) ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.hl1
    public Object b(String str) {
        return ((kl1) this.f9149c).e(str, null);
    }

    public JSONObject c(View view) {
        int currentModeType;
        JSONObject jSONObjectA = su0.a(0, 0, 0, 0);
        UiModeManager uiModeManager = gr.f5890c;
        int i = (uiModeManager == null || (currentModeType = uiModeManager.getCurrentModeType()) == 1 || currentModeType != 4) ? 2 : fs1.f5425d;
        int i10 = i - 1;
        if (i == 0) {
            throw null;
        }
        try {
            jSONObjectA.put("noOutputDevice", i10 == 0);
            return jSONObjectA;
        } catch (JSONException e3) {
            vv.m("Error with setting output device status", e3);
            return jSONObjectA;
        }
    }

    @Override // com.google.android.gms.internal.ads.dp0
    public /* synthetic */ p10 d(cp0 cp0Var) {
        return ((rp0) this.f9149c).b(cp0Var);
    }

    public void e(Exception exc) {
        rs.H("MediaCodecAudioRenderer", "Audio sink error", exc);
        g1 g1Var = ((pw1) this.f9149c).B0;
        Handler handler = g1Var.f5590a;
        if (handler != null) {
            handler.post(new tv1(g1Var, exc, 5));
        }
    }

    public void f(int i, Object obj, yo1 yo1Var) {
        hn1 hn1Var = (hn1) this.f9149c;
        pm1 pm1Var = (pm1) obj;
        hn1Var.Q(i, 2);
        hn1Var.f0(pm1Var.d(yo1Var));
        yo1Var.g(pm1Var, this);
    }

    @Override // com.google.android.gms.internal.ads.o31
    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object mo8h() {
        return (ox0) this.f9149c;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        qx0 qx0Var = (qx0) this.f9149c;
        if (task.h()) {
            qx0Var.cancel(false);
            return;
        }
        if (task.isSuccessful()) {
            qx0Var.e(task.getResult());
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            throw new IllegalStateException();
        }
        qx0Var.f(exception);
    }

    public /* synthetic */ pp0(xu1 xu1Var, zx1 zx1Var, ey1 ey1Var, IOException iOException, boolean z5) {
        this.f9148b = 11;
        this.f9149c = iOException;
    }

    public pp0(Matcher matcher) {
        this.f9148b = 5;
        matcher.getClass();
        this.f9149c = matcher;
    }

    public pp0(int i) {
        this.f9148b = i;
        switch (i) {
            case 12:
                break;
            default:
                this.f9149c = d51.w(2, 1, 5);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.e80
    /* JADX INFO: renamed from: a */
    public void mo7a(Object obj) {
        switch (this.f9148b) {
            case 2:
                or0 or0Var = (or0) this.f9149c;
                ((sr0) obj).y((pr0) or0Var.f8765b, or0Var.f8766c);
                break;
            default:
                ((yu1) obj).o((IOException) this.f9149c);
                break;
        }
    }

    public pp0(hn1 hn1Var) {
        this.f9148b = 7;
        Charset charset = ao1.f3341a;
        if (hn1Var == null) {
            throw new NullPointerException("output");
        }
        this.f9149c = hn1Var;
        hn1Var.f6202b = this;
    }
}
