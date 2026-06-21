package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f22407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22410f;

    public H0(String str, String str2, CounterConfigurationReporterType counterConfigurationReporterType, int i, String str3, String str4) {
        this.f22405a = str;
        this.f22406b = str2;
        this.f22407c = counterConfigurationReporterType;
        this.f22408d = i;
        this.f22409e = str3;
        this.f22410f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h0 = (H0) obj;
        return Intrinsics.a(this.f22405a, h0.f22405a) && Intrinsics.a(this.f22406b, h0.f22406b) && this.f22407c == h0.f22407c && this.f22408d == h0.f22408d && Intrinsics.a(this.f22409e, h0.f22409e) && Intrinsics.a(this.f22410f, h0.f22410f);
    }

    public final int hashCode() {
        int iE = gf.a.e(a0.u.g(this.f22408d, (this.f22407c.hashCode() + gf.a.e(this.f22405a.hashCode() * 31, 31, this.f22406b)) * 31, 31), 31, this.f22409e);
        String str = this.f22410f;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppMetricaNativeCrashMetadata(apiKey=");
        sb2.append(this.f22405a);
        sb2.append(", packageName=");
        sb2.append(this.f22406b);
        sb2.append(", reporterType=");
        sb2.append(this.f22407c);
        sb2.append(", processID=");
        sb2.append(this.f22408d);
        sb2.append(", processSessionID=");
        sb2.append(this.f22409e);
        sb2.append(", errorEnvironment=");
        return a0.u.n(sb2, this.f22410f, ')');
    }
}
