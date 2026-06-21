package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ik2 implements zm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o30 f39569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ak2 f39570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hd0 f39571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ae0 f39572d;

    public ik2(o30 o30Var, sq0 sq0Var) {
        this(o30Var, new yi.f0(6, sq0Var));
    }

    @Override // yads.zm1
    public final mo a(hm1 hm1Var) {
        hm1Var.f39245c.getClass();
        Object obj = hm1Var.f39245c.f37098g;
        return new jk2(hm1Var, this.f39569a, this.f39570b, this.f39571c.a(hm1Var), this.f39572d, 1048576);
    }

    public ik2(o30 o30Var, ak2 ak2Var) {
        this(o30Var, ak2Var, new hd0(), new ae0());
    }

    public ik2(o30 o30Var, ak2 ak2Var, hd0 hd0Var, ae0 ae0Var) {
        this.f39569a = o30Var;
        this.f39570b = ak2Var;
        this.f39571c = hd0Var;
        this.f39572d = ae0Var;
    }

    @Override // yads.zm1
    public final zm1 a(hd0 hd0Var) {
        if (hd0Var != null) {
            this.f39571c = hd0Var;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    @Override // yads.zm1
    public final zm1 a(ae0 ae0Var) {
        if (ae0Var != null) {
            this.f39572d = ae0Var;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    public static /* synthetic */ cr a(sq0 sq0Var, af2 af2Var) {
        return new cr(sq0Var);
    }
}
