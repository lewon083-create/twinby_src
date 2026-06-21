package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zz;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends WebView {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f13533e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f13534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zz f13535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13536d;

    public r(s sVar, Handler handler, zz zzVar) {
        super(sVar);
        this.f13536d = false;
        this.f13534b = handler;
        this.f13535c = zzVar;
    }

    public final void a(String str, String str2) {
        this.f13534b.post(new l(1, this, str + "(" + str2 + ");"));
    }
}
