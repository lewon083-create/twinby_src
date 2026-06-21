package yads;

import com.yandex.div.core.DivKit;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ot1 extends yt1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41720a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sd3 f41721b;

    public ot1(sd3 sd3Var) {
        this.f41721b = sd3Var;
    }

    public final void a(xt1 xt1Var) {
        try {
            sd3 sd3Var = this.f41721b;
            String versionName = DivKit.Companion.getVersionName();
            sd3Var.getClass();
            rd3 rd3VarA = sd3.a(versionName);
            this.f41721b.getClass();
            rd3 rd3VarA2 = sd3.a("32.18.1");
            Integer numValueOf = rd3VarA2 != null ? Integer.valueOf(rd3VarA2.f42557b) : null;
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                if (rd3VarA == null || !(this.f41720a || rd3VarA.f42557b == iIntValue)) {
                    String str = String.format("Unsupported DivKit major version. Expected: %s. Actual: %s", Arrays.copyOf(new Object[]{numValueOf, rd3VarA != null ? Integer.valueOf(rd3VarA.f42557b) : null}, 2));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    wb1 wb1Var = new wb1(str, str);
                    xt1Var.getClass();
                    throw wb1Var;
                }
            }
        } catch (NoClassDefFoundError unused) {
            String str2 = String.format("DivKit is unavailable. Please check your buildscripts for exclusion rules for 'com.yandex.div:div'", Arrays.copyOf(new Object[0], 0));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            wb1 wb1Var2 = new wb1(str2, str2);
            xt1Var.getClass();
            throw wb1Var2;
        }
    }
}
