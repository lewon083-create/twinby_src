package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.h5;
import t.r1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements sb.d, j1.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14877c;

    public /* synthetic */ v(Object obj, boolean z5) {
        this.f14877c = obj;
        this.f14876b = z5;
    }

    @Override // j1.i
    public Object m(j1.h hVar) {
        r1 r1Var = (r1) this.f14877c;
        r1Var.f33253b.execute(new u(3, r1Var, hVar, this.f14876b));
        return "enableExternalFlashAeMode";
    }

    @Override // sb.d
    public void onSuccess(Object obj) {
        SharedPreferences.Editor editorEdit = h5.v((Context) this.f14877c).edit();
        editorEdit.putBoolean("proxy_retention", this.f14876b);
        editorEdit.apply();
    }
}
