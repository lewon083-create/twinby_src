package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f22857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CounterConfigurationReporterType f22859e;

    public Q3(String str, String str2, Integer num, String str3, CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f22855a = str;
        this.f22856b = str2;
        this.f22857c = num;
        this.f22858d = str3;
        this.f22859e = counterConfigurationReporterType;
    }

    public static Q3 a(I3 i32) {
        return new Q3(i32.f22439b.getApiKey(), i32.f22438a.f22072a.getAsString("PROCESS_CFG_PACKAGE_NAME"), i32.f22438a.f22072a.getAsInteger("PROCESS_CFG_PROCESS_ID"), i32.f22438a.f22072a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), i32.f22439b.getReporterType());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Q3.class == obj.getClass()) {
            Q3 q32 = (Q3) obj;
            String str = this.f22855a;
            if (str == null ? q32.f22855a != null : !str.equals(q32.f22855a)) {
                return false;
            }
            if (!this.f22856b.equals(q32.f22856b)) {
                return false;
            }
            Integer num = this.f22857c;
            if (num == null ? q32.f22857c != null : !num.equals(q32.f22857c)) {
                return false;
            }
            String str2 = this.f22858d;
            if (str2 == null ? q32.f22858d != null : !str2.equals(q32.f22858d)) {
                return false;
            }
            if (this.f22859e == q32.f22859e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f22855a;
        int iE = gf.a.e((str != null ? str.hashCode() : 0) * 31, 31, this.f22856b);
        Integer num = this.f22857c;
        int iHashCode = (iE + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f22858d;
        return this.f22859e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClientDescription{mApiKey='" + this.f22855a + "', mPackageName='" + this.f22856b + "', mProcessID=" + this.f22857c + ", mProcessSessionID='" + this.f22858d + "', mReporterType=" + this.f22859e + '}';
    }
}
