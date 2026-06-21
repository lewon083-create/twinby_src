package yads;

import android.media.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ll f40936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f40938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f40939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f40940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f40941f;

    public ml(AudioTrack audioTrack) {
        if (lb3.f40466a >= 19) {
            this.f40936a = new ll(audioTrack);
            a();
        } else {
            this.f40936a = null;
            a(3);
        }
    }

    public final void a() {
        if (this.f40936a != null) {
            a(0);
        }
    }

    public final void a(int i) {
        this.f40937b = i;
        if (i == 0) {
            this.f40940e = 0L;
            this.f40941f = -1L;
            this.f40938c = System.nanoTime() / 1000;
            this.f40939d = 10000L;
            return;
        }
        if (i == 1) {
            this.f40939d = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f40939d = 10000000L;
        } else {
            if (i == 4) {
                this.f40939d = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }
}
