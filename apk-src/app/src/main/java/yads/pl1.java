package yads;

import android.content.Context;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nl1 f41948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jq f41949b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ pl1(Context context) {
        nl1 nl1VarA = new pm2(context).a();
        this(nl1VarA, new jq(nl1VarA));
    }

    public final ml1 a(List list) {
        Iterator it = list.iterator();
        double d10 = -1.0d;
        ml1 ml1Var = null;
        while (it.hasNext()) {
            ml1 ml1Var2 = (ml1) it.next();
            double d11 = "video/mp4".equals(ml1Var2.f40947d) ? 1.5d : 1.0d;
            jq jqVar = this.f41949b;
            jqVar.getClass();
            int i = ml1Var2.i;
            if (i == 0) {
                int i10 = ml1Var2.f40951h * ml1Var2.f40950g;
                nl1 nl1Var = jqVar.f39929a;
                i = (int) ((i10 / (nl1Var.f41285a * nl1Var.f41286b)) * nl1Var.f41287c);
            }
            int i11 = this.f41948a.f41287c;
            double dAbs = d11 / ((((int) Math.max(ConfigValue.DOUBLE_DEFAULT_VALUE, i)) < 100 ? 10.0d : ((double) ((int) Math.abs(i11 - r9))) / ((double) i11)) + 1.0d);
            if (dAbs > d10) {
                ml1Var = ml1Var2;
                d10 = dAbs;
            }
        }
        return ml1Var;
    }

    public pl1(nl1 nl1Var, jq jqVar) {
        this.f41948a = nl1Var;
        this.f41949b = jqVar;
    }
}
