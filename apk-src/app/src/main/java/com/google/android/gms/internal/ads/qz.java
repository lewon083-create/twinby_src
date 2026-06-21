package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qz implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JsResult f9642c;

    public /* synthetic */ qz(JsResult jsResult, int i) {
        this.f9641b = i;
        this.f9642c = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f9641b) {
            case 0:
                this.f9642c.cancel();
                break;
            default:
                this.f9642c.confirm();
                break;
        }
    }
}
