package com.yandex.varioqub.config.impl;

import android.util.Log;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements AdapterIdentifiersCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f15376a;

    public f(g gVar) {
        this.f15376a = gVar;
    }

    @Override // com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
    public final void onError(String str) {
        this.f15376a.f15378b.countDown();
        this.f15376a.getClass();
        boolean z5 = C.f15354a;
        if (z5 && z5) {
            Log.e("Varioqub/Varioqub/IdentifierProvider", str, null);
        }
    }

    @Override // com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
    public final void onSuccess(String str) {
        this.f15376a.getClass();
        String str2 = "received userId from adapter - " + str;
        if (C.f15354a) {
            Log.d("Varioqub/IdentifierProvider", str2);
        }
        g gVar = this.f15376a;
        gVar.f15379c = str;
        gVar.f15378b.countDown();
    }
}
