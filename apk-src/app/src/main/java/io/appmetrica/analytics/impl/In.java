package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class In implements Fi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22468c = 0;

    public In(int i, int i10) {
        this.f22466a = i;
        this.f22467b = i10;
    }

    public final int a() {
        return this.f22467b;
    }

    public final boolean b() {
        int i = this.f22468c;
        this.f22468c = i + 1;
        return i < this.f22466a;
    }

    public final void c() {
        this.f22468c = 0;
    }
}
