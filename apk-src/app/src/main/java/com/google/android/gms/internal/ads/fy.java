package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fy implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f5500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sx f5501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f5505f = 1.0f;

    public fy(Context context, sx sxVar) {
        this.f5500a = (AudioManager) context.getSystemService("audio");
        this.f5501b = sxVar;
    }

    public final void a() {
        boolean z5 = this.f5503d;
        sx sxVar = this.f5501b;
        AudioManager audioManager = this.f5500a;
        if (!z5 || this.f5504e || this.f5505f <= 0.0f) {
            if (this.f5502c) {
                if (audioManager != null) {
                    this.f5502c = audioManager.abandonAudioFocus(this) == 0;
                }
                sxVar.o();
                return;
            }
            return;
        }
        if (this.f5502c) {
            return;
        }
        if (audioManager != null) {
            this.f5502c = audioManager.requestAudioFocus(this, 3, 2) == 1;
        }
        sxVar.o();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.f5502c = i > 0;
        this.f5501b.o();
    }
}
