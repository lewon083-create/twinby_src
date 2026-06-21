package yads;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sv1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f43094a;

    public sv1(iw1 iw1Var) {
        this.f43094a = iw1Var;
    }

    public final void a(String str) {
        this.f43094a.loadUrl("javascript: " + str);
    }

    public final void b(String str) {
        String str2 = String.format("window.mraidbridge.%s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        a(str2);
    }

    public final void a(fe1... fe1VarArr) {
        int i = 0;
        if (fe1VarArr.length == 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("fireChangeEvent({");
        int length = fe1VarArr.length;
        String str = "";
        while (i < length) {
            fe1 fe1Var = fe1VarArr[i];
            sb2.append(str);
            sb2.append(fe1Var.a());
            i++;
            str = ", ";
        }
        sb2.append("})");
        b(sb2.toString());
    }

    public final void a(dw1 dw1Var, String str) {
        b(t.z.f("notifyErrorEvent(", JSONObject.quote(dw1Var.a()), ", ", JSONObject.quote(str), ")"));
    }

    public final void a(dw1 dw1Var) {
        b("nativeCallComplete(" + JSONObject.quote(dw1Var.a()) + ")");
    }
}
