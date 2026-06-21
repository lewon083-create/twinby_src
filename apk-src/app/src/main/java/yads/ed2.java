package yads;

import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ed2 implements oo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pt2 f38073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i83 f38074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n83 f38075c;

    public ed2(String str, pt2 pt2Var, i83 i83Var, n83 n83Var) {
        this.f38073a = pt2Var;
        this.f38074b = i83Var;
        this.f38075c = n83Var;
    }

    @Override // yads.vp2
    public final void a(lm3 lm3Var) {
        lm3Var.getClass();
        Pair pair = new Pair("tracking_result", "failure");
        String lowerCase = this.f38075c.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Pair pair2 = new Pair("tracking_url_type", lowerCase);
        String message = lm3Var.getMessage();
        if (message == null) {
            message = "Unknown Volley error";
        }
        LinkedHashMap linkedHashMapH = kotlin.collections.j0.h(pair, pair2, new Pair("error_message", message));
        i83 i83Var = this.f38074b;
        eo2 eo2Var = eo2.f38194c;
        i83Var.a(linkedHashMapH, this.f38073a);
    }

    @Override // yads.wp2
    public final void a(Object obj) {
        int i = ((h82) obj).f39069a;
        Pair pair = new Pair("tracking_result", "success");
        String lowerCase = this.f38075c.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        LinkedHashMap linkedHashMapH = kotlin.collections.j0.h(pair, new Pair("tracking_url_type", lowerCase), new Pair("code", Integer.valueOf(i)));
        i83 i83Var = this.f38074b;
        eo2 eo2Var = eo2.f38194c;
        i83Var.a(linkedHashMapH, this.f38073a);
    }
}
