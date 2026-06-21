package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m42 implements qa2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final za f40795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r53 f40796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lv f40797c;

    public m42(za zaVar, r53 r53Var, lv lvVar) {
        this.f40795a = zaVar;
        this.f40796b = r53Var;
        this.f40797c = lvVar;
    }

    @Override // yads.qa2
    public final void a(String str) {
        za zaVar = this.f40795a;
        r53 r53Var = this.f40796b;
        lv lvVar = this.f40797c;
        zaVar.getClass();
        ch2 ch2Var = new ch2(lvVar, r53Var, new be0());
        kotlin.collections.c0 c0VarD = kotlin.collections.j0.d();
        if (str.length() > 0) {
            za.f45298d.execute(new ya(str, ch2Var, c0VarD));
        }
    }
}
