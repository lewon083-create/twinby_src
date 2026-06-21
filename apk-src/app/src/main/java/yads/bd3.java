package yads;

import android.content.Context;
import java.util.Map;
import java.util.Random;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bd3 extends kotlin.jvm.internal.r implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cd3 f36999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uc3 f37000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d4 f37001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f37002e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd3(cd3 cd3Var, uc3 uc3Var, d4 d4Var, Context context) {
        super(1);
        this.f36999b = cd3Var;
        this.f37000c = uc3Var;
        this.f37001d = d4Var;
        this.f37002e = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        pl2 pl2Var = (pl2) obj;
        cd3 cd3Var = this.f36999b;
        uc3 uc3Var = this.f37000c;
        d4 d4Var = this.f37001d;
        Context context = this.f37002e;
        pl2Var.a("charset", "UTF-8");
        cd3Var.f37346a.getClass();
        pl2Var.a("rnd", String.valueOf(new Random().nextInt(89999999) + 10000000));
        Map mapA = uc3Var.a();
        if (mapA != null) {
            for (Map.Entry entry : mapA.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!StringsKt.D(str)) {
                    pl2Var.a(str, str2);
                }
            }
        }
        km0 km0Var = d4Var.f37614b.f42414a;
        cd3Var.f37348c.getClass();
        if (!rx2.a(context)) {
            pl2Var.a("uuid", km0Var.b());
            pl2Var.a("mauid", km0Var.f40248d);
        }
        cd3Var.f37347b.getClass();
        uw uwVar = new uw(pl2Var);
        xw.f44819a.getClass();
        zw zwVar = (zw) ww.a(context);
        uwVar.invoke("gdpr", zwVar.c());
        uwVar.invoke("gdpr_consent", zwVar.b());
        uwVar.invoke("parsed_purpose_consents", zwVar.d());
        uwVar.invoke("parsed_vendor_consents", zwVar.e());
        uwVar.invoke("cmp_present", Integer.valueOf(zwVar.a() ? 1 : 0).toString());
        new pm0(context, d4Var).a(context, new om0(pl2Var));
        return pl2Var;
    }
}
