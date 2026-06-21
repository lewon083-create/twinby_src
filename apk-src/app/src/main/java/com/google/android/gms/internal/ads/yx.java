package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yx implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f12788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pu f12789b;

    public yx(pu puVar, Handler handler) {
        this.f12789b = puVar;
        Looper looper = handler.getLooper();
        String str = cq0.f4293a;
        this.f12788a = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        pf pfVar = new pf(this, i, 2);
        String str = cq0.f4293a;
        Handler handler = this.f12788a;
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                pfVar.run();
            } else {
                handler.post(pfVar);
            }
        }
    }
}
