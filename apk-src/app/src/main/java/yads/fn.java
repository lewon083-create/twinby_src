package yads;

import io.sentry.metrics.MetricsUnit;
import io.sentry.rrweb.RRWebVideoEvent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fn {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final en f38488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fn f38489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fn f38490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ fn[] f38491f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38492b;

    /* JADX WARN: Type inference failed for: r0v2, types: [yads.en] */
    static {
        fn fnVar = new fn(0, "CONSTANT", RRWebVideoEvent.REPLAY_FRAME_RATE_TYPE_CONSTANT);
        fn fnVar2 = new fn(1, "RATIO", MetricsUnit.Fraction.RATIO);
        fn fnVar3 = new fn(2, "SCREEN_BASED", "screen_based");
        fn fnVar4 = new fn(3, "SCREEN_ORIENTATION_BASED", "screen_orientation_based");
        f38489d = fnVar4;
        fn fnVar5 = new fn(4, "MEDIATION", "mediation");
        f38490e = fnVar5;
        fn[] fnVarArr = {fnVar, fnVar2, fnVar3, fnVar4, fnVar5};
        f38491f = fnVarArr;
        hl.d.k(fnVarArr);
        f38488c = new Object() { // from class: yads.en
        };
    }

    public fn(int i, String str, String str2) {
        this.f38492b = str2;
    }

    public static fn valueOf(String str) {
        return (fn) Enum.valueOf(fn.class, str);
    }

    public static fn[] values() {
        return (fn[]) f38491f.clone();
    }
}
