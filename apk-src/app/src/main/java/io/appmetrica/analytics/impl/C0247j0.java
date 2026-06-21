package io.appmetrica.analytics.impl;

import android.util.Pair;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0247j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Gc f24121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f24122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0443ql f24124d;

    public C0247j0(String str, long j10, C0443ql c0443ql) {
        this.f24122b = j10;
        try {
            this.f24121a = new Gc(str);
        } catch (Throwable unused) {
            this.f24121a = new Gc();
        }
        this.f24124d = c0443ql;
    }

    public final synchronized void a(Pair pair) {
        if (this.f24124d.b(this.f24121a, (String) pair.first, (String) pair.second)) {
            this.f24123c = true;
        }
    }

    public final synchronized String toString() {
        return "Map size " + this.f24121a.size() + ". Is changed " + this.f24123c + ". Current revision " + this.f24122b;
    }

    public final synchronized C0222i0 a() {
        try {
            if (this.f24123c) {
                this.f24122b++;
                this.f24123c = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return new C0222i0(AbstractC0207hb.b(this.f24121a), this.f24122b);
    }
}
