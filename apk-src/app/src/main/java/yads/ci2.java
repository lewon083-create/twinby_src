package yads;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ci2 {

    @NotNull
    public static final bi2 Companion = new bi2();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final qk.a[] f37401d = {fi2.Companion.serializer(), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fi2 f37402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f37404c;

    public /* synthetic */ ci2(int i, fi2 fi2Var, String str, Integer num) {
        if (7 != (i & 7)) {
            uk.o0.e(i, 7, ai2.f36723a.getDescriptor());
            throw null;
        }
        this.f37402a = fi2Var;
        this.f37403b = str;
        this.f37404c = num;
    }

    public ci2(fi2 fi2Var, String str, Integer num) {
        this.f37402a = fi2Var;
        this.f37403b = str;
        this.f37404c = num;
    }
}
