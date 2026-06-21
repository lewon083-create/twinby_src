package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ba implements aa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3690d;

    public ba(long j10) {
        this.f3689c = Long.MIN_VALUE;
        this.f3690d = new Object();
        this.f3688b = j10;
    }

    public int a() {
        if (!((t.b0) this.f3690d).c()) {
            return 700;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f3689c == -1) {
            this.f3689c = jUptimeMillis;
        }
        long j10 = jUptimeMillis - this.f3689c;
        if (j10 <= 120000) {
            return 1000;
        }
        return j10 <= 300000 ? 2000 : 4000;
    }

    @Override // com.google.android.gms.internal.ads.aa
    public void b(MessageDigest[] messageDigestArr, long j10, int i) throws IOException {
        MappedByteBuffer map = ((FileChannel) this.f3690d).map(FileChannel.MapMode.READ_ONLY, this.f3688b + j10, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    public int c() {
        long j10 = this.f3688b;
        if (((t.b0) this.f3690d).c()) {
            if (j10 > 0) {
                return Math.min((int) j10, 1800000);
            }
            return 1800000;
        }
        if (j10 > 0) {
            return Math.min((int) j10, 10000);
        }
        return 10000;
    }

    @Override // com.google.android.gms.internal.ads.aa
    public long h() {
        return this.f3689c;
    }

    public ba(FileChannel fileChannel, long j10, long j11) {
        this.f3690d = fileChannel;
        this.f3688b = j10;
        this.f3689c = j11;
    }

    public ba(t.b0 b0Var, long j10) {
        this.f3690d = b0Var;
        this.f3689c = -1L;
        this.f3688b = j10;
    }
}
