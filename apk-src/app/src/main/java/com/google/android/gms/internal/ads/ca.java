package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f4119e;

    public /* synthetic */ ca(ByteBuffer byteBuffer, long j10, long j11, long j12, ByteBuffer byteBuffer2) {
        this.f4118d = byteBuffer;
        this.f4115a = j10;
        this.f4116b = j11;
        this.f4117c = j12;
        this.f4119e = byteBuffer2;
    }

    public ca(AudioTrack audioTrack) {
        this.f4118d = audioTrack;
        this.f4119e = new AudioTimestamp();
    }
}
