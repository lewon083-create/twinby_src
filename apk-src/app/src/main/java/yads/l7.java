package yads;

import io.sentry.SpanContext;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l7 f40437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ l7[] f40438d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40439b;

    static {
        l7 l7Var = new l7(0, "AUTOMATIC", "automatic");
        l7 l7Var2 = new l7(1, "MANUAL", SpanContext.DEFAULT_ORIGIN);
        f40437c = l7Var2;
        l7[] l7VarArr = {l7Var, l7Var2};
        f40438d = l7VarArr;
        hl.d.k(l7VarArr);
    }

    public l7(int i, String str, String str2) {
        this.f40439b = str2;
    }

    public static l7 valueOf(String str) {
        return (l7) Enum.valueOf(l7.class, str);
    }

    public static l7[] values() {
        return (l7[]) f40438d.clone();
    }
}
