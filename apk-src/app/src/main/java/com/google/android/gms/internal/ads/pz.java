package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pz implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9224c;

    public /* synthetic */ pz(int i, Object obj) {
        this.f9223b = i;
        this.f9224c = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f9223b) {
            case 0:
                ((JsResult) this.f9224c).cancel();
                break;
            case 1:
                ((JsPromptResult) this.f9224c).cancel();
                break;
            default:
                s9.d dVar = (s9.d) this.f9224c;
                if (dVar != null) {
                    dVar.z();
                }
                break;
        }
    }
}
