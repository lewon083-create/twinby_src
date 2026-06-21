package yads;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dd2 extends po {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f37731w = (int) TimeUnit.SECONDS.toMillis(10);

    public dd2(Context context, String str, oo ooVar) {
        super(context, str, ooVar);
        a(context);
        l();
        m();
    }

    @Override // yads.ro2
    public final xp2 a(h82 h82Var) {
        return new xp2(h82Var, w11.a(h82Var));
    }

    public final void a(Context context) {
        int iIntValue;
        Integer num;
        Integer num2;
        pt2 pt2VarA = fw2.a().a(context);
        if (pt2VarA != null && (num2 = pt2VarA.f42056u0) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = f37731w;
        }
        pt2 pt2VarA2 = fw2.a().a(context);
        this.f42670o = new qe0(1.0f, iIntValue, (pt2VarA2 == null || (num = pt2VarA2.K) == null) ? 0 : num.intValue());
    }
}
