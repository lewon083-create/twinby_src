package com.monetization.ads.exo.source.dash;

import io.sentry.TransactionOptions;
import java.util.List;
import yads.a30;
import yads.ae0;
import yads.e30;
import yads.fv0;
import yads.hc0;
import yads.hd0;
import yads.hm1;
import yads.kc0;
import yads.mo;
import yads.ni;
import yads.o30;
import yads.zm1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class DashMediaSource$Factory implements zm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a30 f15016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o30 f15017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private hd0 f15018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final hc0 f15019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ae0 f15020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f15021f;

    public DashMediaSource$Factory(o30 o30Var) {
        this(new kc0(o30Var), o30Var);
    }

    @Override // yads.zm1
    public final mo a(hm1 hm1Var) {
        hm1Var.f39245c.getClass();
        e30 e30Var = new e30();
        List list = hm1Var.f39245c.f37095d;
        return new i(hm1Var, this.f15017b, !list.isEmpty() ? new fv0(e30Var, list) : e30Var, this.f15016a, this.f15019d, this.f15018c.a(hm1Var), this.f15020e, this.f15021f);
    }

    public DashMediaSource$Factory(kc0 kc0Var, o30 o30Var) {
        this.f15016a = (a30) ni.a(kc0Var);
        this.f15017b = o30Var;
        this.f15018c = new hd0();
        this.f15020e = new ae0();
        this.f15021f = TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION;
        this.f15019d = new hc0();
    }

    @Override // yads.zm1
    public final zm1 a(hd0 hd0Var) {
        if (hd0Var != null) {
            this.f15018c = hd0Var;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    @Override // yads.zm1
    public final zm1 a(ae0 ae0Var) {
        if (ae0Var != null) {
            this.f15020e = ae0Var;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
    }
}
