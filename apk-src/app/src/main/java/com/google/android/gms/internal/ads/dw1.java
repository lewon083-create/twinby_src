package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dw1 extends AudioTrack$StreamEventCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4699b;

    public /* synthetic */ dw1(int i, Object obj) {
        this.f4698a = i;
        this.f4699b = obj;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        switch (this.f4698a) {
            case 0:
                yf0 yf0Var = ((ew1) ((l91) this.f4699b).f7467e).f5116h;
                yf0Var.i(-1, bw1.f3934d);
                yf0Var.j();
                break;
            default:
                ((u3.r) ((ka.k) this.f4699b).f27326e).i.e(-1, new tf.a(21));
                break;
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        switch (this.f4698a) {
            case 0:
                yf0 yf0Var = ((ew1) ((l91) this.f4699b).f7467e).f5116h;
                yf0Var.i(-1, zu1.f13126e);
                yf0Var.j();
                break;
            default:
                ((u3.r) ((ka.k) this.f4699b).f27326e).i.e(-1, new tf.a(22));
                break;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        switch (this.f4698a) {
            case 0:
                yf0 yf0Var = ((ew1) ((l91) this.f4699b).f7467e).f5116h;
                yf0Var.i(-1, bw1.f3933c);
                yf0Var.j();
                break;
            default:
                ((u3.r) ((ka.k) this.f4699b).f27326e).i.e(-1, new tf.a(21));
                break;
        }
    }
}
