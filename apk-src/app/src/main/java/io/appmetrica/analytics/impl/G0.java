package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeCrashSource f22363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final H0 f22368f;

    public G0(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j10, H0 h0) {
        this.f22363a = nativeCrashSource;
        this.f22364b = str;
        this.f22365c = str2;
        this.f22366d = str3;
        this.f22367e = j10;
        this.f22368f = h0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        G0 g02 = (G0) obj;
        return this.f22363a == g02.f22363a && Intrinsics.a(this.f22364b, g02.f22364b) && Intrinsics.a(this.f22365c, g02.f22365c) && Intrinsics.a(this.f22366d, g02.f22366d) && this.f22367e == g02.f22367e && Intrinsics.a(this.f22368f, g02.f22368f);
    }

    public final int hashCode() {
        return this.f22368f.hashCode() + l7.o.d(this.f22367e, gf.a.e(gf.a.e(gf.a.e(this.f22363a.hashCode() * 31, 31, this.f22364b), 31, this.f22365c), 31, this.f22366d), 31);
    }

    public final String toString() {
        return "AppMetricaNativeCrash(source=" + this.f22363a + ", handlerVersion=" + this.f22364b + ", uuid=" + this.f22365c + ", dumpFile=" + this.f22366d + ", creationTime=" + this.f22367e + ", metadata=" + this.f22368f + ')';
    }
}
