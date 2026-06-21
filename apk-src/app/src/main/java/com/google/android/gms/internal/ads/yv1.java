package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yv1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f12761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f12763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f12764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f12765h;
    public final Object i;

    public yv1(AudioTrack audioTrack, nu0 nu0Var) {
        this.f12765h = new ca(audioTrack);
        this.f12758a = audioTrack.getSampleRate();
        this.i = nu0Var;
        b(0);
    }

    public void a(int i) {
        this.f12759b = i;
        if (i == 0) {
            this.f12762e = 0L;
            this.f12763f = -1L;
            this.f12764g = -9223372036854775807L;
            this.f12760c = System.nanoTime() / 1000;
            this.f12761d = 10000L;
            return;
        }
        if (i == 1) {
            this.f12761d = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f12761d = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.f12761d = 500000L;
        }
    }

    public void b(int i) {
        this.f12759b = i;
        long j10 = 10000;
        if (i == 0) {
            this.f12762e = 0L;
            this.f12763f = -1L;
            this.f12764g = -9223372036854775807L;
            this.f12760c = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.f12761d = 10000L;
                return;
            }
            j10 = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.f12761d = j10;
    }

    public yv1(AudioTrack audioTrack, m7.a aVar) {
        this.f12765h = new u3.o(audioTrack);
        this.f12758a = audioTrack.getSampleRate();
        this.i = aVar;
        a(0);
    }
}
