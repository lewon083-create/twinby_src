package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ch2 implements za3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lv f37397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r53 f37398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final be0 f37399c;

    public ch2(lv lvVar, r53 r53Var, be0 be0Var) {
        this.f37397a = lvVar;
        this.f37398b = r53Var;
        this.f37399c = be0Var;
    }

    @Override // yads.za3
    public final void a(String str, Map map) {
        String strA = this.f37399c.a(str, map);
        if (strA.length() == 0) {
            return;
        }
        this.f37398b.a(this.f37397a, strA);
    }
}
