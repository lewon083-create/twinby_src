package com.yandex.varioqub.config.impl;

import android.util.Log;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements AdapterIdentifiersCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f15375a;

    public e(g gVar) {
        this.f15375a = gVar;
    }

    @Override // com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
    public final void onError(String str) {
        this.f15375a.getClass();
        boolean z5 = C.f15354a;
        if (z5 && z5) {
            Log.e("Varioqub/Varioqub/IdentifierProvider", str, null);
        }
        l.a(3);
    }

    @Override // com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
    public final void onSuccess(String str) {
        this.f15375a.getClass();
        String str2 = "received deviceId from adapter - " + str;
        if (C.f15354a) {
            Log.d("Varioqub/IdentifierProvider", str2);
        }
        this.f15375a.f15380d = str;
        l.a(3);
    }
}
