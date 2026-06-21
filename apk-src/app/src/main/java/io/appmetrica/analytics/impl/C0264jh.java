package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0264jh extends O5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24156f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f24158h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f24159j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC0187gh f24160k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC0238ih f24161l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f24162m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f24163n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f24164o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f24165p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f24166q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f24167r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f24168s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f24169t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f24170u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f24171v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f24172w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Set f24173x = new HashSet();

    public C0264jh(Y4 y42) {
        this.f24161l = y42;
    }

    public final void a(int i) {
        this.f24167r = i;
    }

    public final void b(List<String> list) {
        this.f24166q = list;
    }

    public final String c() {
        return this.f24162m;
    }

    public final void d(boolean z5) {
        this.f24154d = z5;
    }

    public final void e(boolean z5) {
        this.f24158h = z5;
    }

    public final void f(boolean z5) {
        this.f24163n = z5;
    }

    public final boolean g() {
        return this.f24170u;
    }

    @NonNull
    public final String h() {
        return (String) WrapUtils.getOrDefault(this.f24165p, "");
    }

    public final boolean i() {
        return this.f24160k.a(this.f24159j);
    }

    public final int j() {
        return this.f24157g;
    }

    public final long k() {
        return this.f24171v;
    }

    public final int l() {
        return this.i;
    }

    public final long m() {
        return this.f24168s;
    }

    public final long n() {
        return this.f24169t;
    }

    public final List<String> o() {
        return this.f24166q;
    }

    public final int p() {
        return this.f24156f;
    }

    public final boolean q() {
        return this.f24164o;
    }

    public final boolean r() {
        return this.f24155e;
    }

    public final boolean s() {
        return this.f24154d;
    }

    public final boolean t() {
        return this.f24163n;
    }

    @Override // io.appmetrica.analytics.impl.O5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "ReportRequestConfig{mLocationTracking=" + this.f24154d + ", mFirstActivationAsUpdate=" + this.f24155e + ", mSessionTimeout=" + this.f24156f + ", mDispatchPeriod=" + this.f24157g + ", mLogEnabled=" + this.f24158h + ", mMaxReportsCount=" + this.i + ", dataSendingEnabledFromArguments=" + this.f24159j + ", dataSendingStrategy=" + this.f24160k + ", mPreloadInfoSendingStrategy=" + this.f24161l + ", mApiKey='" + this.f24162m + "', mPermissionsCollectingEnabled=" + this.f24163n + ", mFeaturesCollectingEnabled=" + this.f24164o + ", mClidsFromStartupResponse='" + this.f24165p + "', mReportHosts=" + this.f24166q + ", mAttributionId=" + this.f24167r + ", mPermissionsCollectingIntervalSeconds=" + this.f24168s + ", mPermissionsForceSendIntervalSeconds=" + this.f24169t + ", mClidsFromClientMatchClidsFromStartupRequest=" + this.f24170u + ", mMaxReportsInDbCount=" + this.f24171v + ", mCertificates=" + this.f24172w + "} " + super.toString();
    }

    public final boolean u() {
        return isIdentifiersValid() && !ko.a((Collection) this.f24166q) && this.f24170u;
    }

    public final boolean v() {
        return ((Y4) this.f24161l).B();
    }

    public final void a(long j10) {
        this.f24171v = j10;
    }

    public final void b(long j10) {
        this.f24168s = j10;
    }

    public final void c(long j10) {
        this.f24169t = j10;
    }

    public final void d(int i) {
        this.f24156f = i;
    }

    @NonNull
    public final Set<String> e() {
        return this.f24173x;
    }

    public final List<String> f() {
        return this.f24172w;
    }

    public final void a(@NonNull List<String> list) {
        this.f24172w = list;
    }

    public final void b(boolean z5) {
        this.f24164o = z5;
    }

    public final void c(boolean z5) {
        this.f24155e = z5;
    }

    public final int d() {
        return this.f24167r;
    }

    public final void a(Boolean bool, @NonNull InterfaceC0187gh interfaceC0187gh) {
        this.f24159j = bool;
        this.f24160k = interfaceC0187gh;
    }

    public final void b(int i) {
        this.f24157g = i;
    }

    public final void c(int i) {
        this.i = i;
    }

    public final void a(boolean z5) {
        this.f24170u = z5;
    }

    public final void a(@NonNull Set<String> set) {
        this.f24173x = set;
    }
}
