package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jv1 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentResolver f6945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f6946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6947d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jv1(Object obj, Handler handler, ContentResolver contentResolver, Uri uri, int i) {
        super(handler);
        this.f6944a = i;
        this.f6947d = obj;
        this.f6945b = contentResolver;
        this.f6946c = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z5) {
        switch (this.f6944a) {
            case 0:
                yi0 yi0Var = (yi0) this.f6947d;
                yi0Var.h(hv1.a((Context) yi0Var.f12623c, (s50) yi0Var.f12630k, (AudioDeviceInfo) yi0Var.f12629j));
                break;
            default:
                yi0 yi0Var2 = (yi0) this.f6947d;
                yi0Var2.e(u3.b.c((Context) yi0Var2.f12623c, (j3.d) yi0Var2.f12630k, (AudioDeviceInfo) yi0Var2.f12629j));
                break;
        }
    }
}
