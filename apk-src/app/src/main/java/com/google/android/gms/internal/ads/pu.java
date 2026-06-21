package com.google.android.gms.internal.ads;

import android.media.AudioManager;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pu implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lw f9187a;

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final /* synthetic */ void onAudioFocusChange(int i) {
        lw lwVar = this.f9187a;
        lwVar.getClass();
        if (i == -3 || i == -2) {
            if (i != -2) {
                lwVar.i(4);
                return;
            } else {
                lwVar.j(0);
                lwVar.i(3);
                return;
            }
        }
        if (i == -1) {
            lwVar.j(-1);
            lwVar.h();
            lwVar.i(1);
        } else if (i != 1) {
            a0.u.t(new StringBuilder(String.valueOf(i).length() + 27), "Unknown focus change type: ", i, "AudioFocusManager");
        } else {
            lwVar.i(2);
            lwVar.j(1);
        }
    }
}
