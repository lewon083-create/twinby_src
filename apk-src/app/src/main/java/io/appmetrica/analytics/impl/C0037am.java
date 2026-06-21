package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.am, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0037am extends O5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f23451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f23452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f23453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f23454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map f23455h;
    public C0474s3 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f23456j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f23457k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f23458l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f23459m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f23460n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0288kg f23461o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final I7 f23462p;

    public C0037am() {
        this(C0382oa.k().u(), new I7());
    }

    public final long a(long j10) {
        if (this.f23460n == 0) {
            this.f23460n = j10;
        }
        return this.f23460n;
    }

    @NonNull
    public final C0474s3 c() {
        return this.i;
    }

    public final Map<String, String> d() {
        return this.f23455h;
    }

    public final String e() {
        return this.f23459m;
    }

    public final String f() {
        return this.f23453f;
    }

    public final long g() {
        return this.f23460n;
    }

    public final String h() {
        return this.f23454g;
    }

    public final List<String> i() {
        return this.f23456j;
    }

    @NonNull
    public final C0288kg j() {
        return this.f23461o;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> k() {
        /*
            r9 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.List r1 = r9.f23451d
            boolean r1 = io.appmetrica.analytics.impl.ko.a(r1)
            if (r1 != 0) goto L12
            java.util.List r1 = r9.f23451d
            r0.addAll(r1)
        L12:
            java.util.List r1 = r9.f23452e
            boolean r1 = io.appmetrica.analytics.impl.ko.a(r1)
            if (r1 != 0) goto L1f
            java.util.List r1 = r9.f23452e
            r0.addAll(r1)
        L1f:
            io.appmetrica.analytics.impl.I7 r1 = r9.f23462p
            io.appmetrica.analytics.impl.Sm r1 = r1.f22443a
            java.lang.Object r1 = r1.a()
            java.lang.String[] r1 = (java.lang.String[]) r1
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L55
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r1.length
            r6 = r2
        L34:
            if (r6 >= r5) goto L4a
            r7 = r1[r6]
            if (r7 == 0) goto L41
            boolean r8 = kotlin.text.StringsKt.D(r7)
            if (r8 != 0) goto L41
            goto L42
        L41:
            r7 = r3
        L42:
            if (r7 == 0) goto L47
            r4.add(r7)
        L47:
            int r6 = r6 + 1
            goto L34
        L4a:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L51
            goto L52
        L51:
            r4 = r3
        L52:
            if (r4 == 0) goto L55
            goto L73
        L55:
            java.lang.String[] r1 = io.appmetrica.analytics.BuildConfig.DEFAULT_HOSTS
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r1.length
        L5d:
            if (r2 >= r5) goto L73
            r6 = r1[r2]
            if (r6 == 0) goto L6a
            boolean r7 = kotlin.text.StringsKt.D(r6)
            if (r7 != 0) goto L6a
            goto L6b
        L6a:
            r6 = r3
        L6b:
            if (r6 == 0) goto L70
            r4.add(r6)
        L70:
            int r2 = r2 + 1
            goto L5d
        L73:
            r0.addAll(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C0037am.k():java.util.List");
    }

    public final List<String> l() {
        return this.f23452e;
    }

    public final List<String> m() {
        return this.f23451d;
    }

    public final boolean n() {
        return this.f23457k;
    }

    public final boolean o() {
        return this.f23458l;
    }

    @Override // io.appmetrica.analytics.impl.O5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.f23451d + ", mStartupHostsFromClient=" + this.f23452e + ", mDistributionReferrer='" + this.f23453f + "', mInstallReferrerSource='" + this.f23454g + "', mClidsFromClient=" + this.f23455h + ", mNewCustomHosts=" + this.f23456j + ", mHasNewCustomHosts=" + this.f23457k + ", mSuccessfulStartup=" + this.f23458l + ", mCountryInit='" + this.f23459m + "', mFirstStartupTime=" + this.f23460n + "} " + super.toString();
    }

    public C0037am(C0288kg c0288kg, I7 i72) {
        this.i = new C0474s3(null, T7.f23005c);
        this.f23460n = 0L;
        this.f23461o = c0288kg;
        this.f23462p = i72;
    }

    public final void a(List<String> list) {
        this.f23456j = list;
    }

    public final void a(boolean z5) {
        this.f23457k = z5;
    }

    public final void a(String str) {
        this.f23459m = str;
    }
}
