package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f40051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9 f40053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f12 f40054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v22 f40055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s22 f40056f;

    public /* synthetic */ k22(d4 d4Var, String str, v9 v9Var, f12 f12Var, v22 v22Var) {
        this(d4Var, str, v9Var, f12Var, v22Var, null);
    }

    public final ho2 a() {
        ho2 ho2VarA = this.f40055e.a(this.f40053c, this.f40051a, this.f40054d);
        s22 s22Var = this.f40056f;
        if (s22Var != null) {
            ho2VarA.b(s22Var.f42795b, "bind_type");
        }
        ho2VarA.a(this.f40052b, "native_ad_type");
        d03 d03Var = this.f40051a.f37616d.f37951a;
        if (d03Var != null) {
            ho2VarA.b(d03Var.b().f37246b, "size_type");
            ho2VarA.b(Integer.valueOf(d03Var.getWidth()), "width");
            ho2VarA.b(Integer.valueOf(d03Var.getHeight()), "height");
        }
        ho2VarA.f39287b = this.f40053c.i;
        return ho2VarA;
    }

    public k22(d4 d4Var, String str, v9 v9Var, f12 f12Var, v22 v22Var, s22 s22Var) {
        this.f40051a = d4Var;
        this.f40052b = str;
        this.f40053c = v9Var;
        this.f40054d = f12Var;
        this.f40055e = v22Var;
        this.f40056f = s22Var;
    }
}
