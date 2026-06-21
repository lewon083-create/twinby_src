package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.JsonWriter;
import io.sentry.protocol.Message;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ae0 implements l9.d, q70, q9.a, i60, r60, t60, z60, l60, sr0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zd0 f2874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2875d;

    public ae0(zd0 zd0Var, n10 n10Var) {
        this.f2874c = zd0Var;
        this.f2873b = Collections.singletonList(n10Var);
    }

    public final void A(Class cls, String str, Object... objArr) {
        String simpleName = cls.getSimpleName();
        List list = this.f2873b;
        String strConcat = "Event-".concat(simpleName);
        zd0 zd0Var = this.f2874c;
        zd0Var.getClass();
        if (((Boolean) dm.f4602a.r()).booleanValue()) {
            zd0Var.f12969a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(jCurrentTimeMillis);
                jsonWriter.name("source").value(strConcat);
                jsonWriter.name("event").value(str);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name(Message.JsonKeys.PARAMS).beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj = objArr[i];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e3) {
                u9.i.f("unable to log", e3);
            }
            u9.i.g("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void E(ku kuVar) {
        p9.k.C.f31304k.getClass();
        this.f2875d = SystemClock.elapsedRealtime();
        A(q70.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void F(ru ruVar, String str, String str2) {
        A(i60.class, "onRewarded", ruVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void H() {
        A(i60.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.l60
    public final void K(q9.x1 x1Var) {
        A(l60.class, "onAdFailedToLoad", Integer.valueOf(x1Var.f31976b), x1Var.f31977c, x1Var.f31978d);
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void N() {
        A(i60.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.t60
    public final void a(Context context) {
        A(t60.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.sr0
    public final void b(String str) {
        A(qr0.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void c() {
        A(i60.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.sr0
    public final void g(pr0 pr0Var, String str, Throwable th2) {
        A(qr0.class, "onTaskFailed", str, th2.getClass().getSimpleName());
    }

    @Override // l9.d
    public final void h(String str, String str2) {
        A(l9.d.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void i() {
        A(i60.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.t60
    public final void j(Context context) {
        A(t60.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final void k() {
        p9.k.C.f31304k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f2875d;
        StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 21);
        sb2.append("Ad Request Latency : ");
        sb2.append(jElapsedRealtime);
        t9.c0.m(sb2.toString());
        A(z60.class, "onAdLoaded", new Object[0]);
    }

    @Override // q9.a
    public final void onAdClicked() {
        A(q9.a.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.t60
    public final void r(Context context) {
        A(t60.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void w() {
        A(i60.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.sr0
    public final void x(pr0 pr0Var, String str) {
        A(qr0.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.sr0
    public final void y(pr0 pr0Var, String str) {
        A(qr0.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void z() {
        A(r60.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void l(eq0 eq0Var) {
    }
}
