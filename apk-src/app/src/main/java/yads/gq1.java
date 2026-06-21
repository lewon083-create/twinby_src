package yads;

import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sd3 f38851a;

    public gq1(sd3 sd3Var) {
        this.f38851a = sd3Var;
    }

    public final boolean a(String str, String str2) {
        if (str2 == null || StringsKt.D(str2)) {
            return true;
        }
        this.f38851a.getClass();
        rd3 rd3VarA = sd3.a(str);
        if (rd3VarA == null) {
            return true;
        }
        this.f38851a.getClass();
        rd3 rd3VarA2 = sd3.a(str2);
        return rd3VarA2 == null || rd3VarA.compareTo(rd3VarA2) >= 0;
    }
}
