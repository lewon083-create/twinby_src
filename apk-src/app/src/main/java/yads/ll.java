package yads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioTrack f40569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioTimestamp f40570b = new AudioTimestamp();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f40571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f40572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f40573e;

    public ll(AudioTrack audioTrack) {
        this.f40569a = audioTrack;
    }

    public final long a() {
        return this.f40570b.nanoTime / 1000;
    }

    public final boolean b() {
        boolean timestamp = this.f40569a.getTimestamp(this.f40570b);
        if (timestamp) {
            long j10 = this.f40570b.framePosition;
            if (this.f40572d > j10) {
                this.f40571c++;
            }
            this.f40572d = j10;
            this.f40573e = j10 + (this.f40571c << 32);
        }
        return timestamp;
    }
}
