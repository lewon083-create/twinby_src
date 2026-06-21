package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tj2 implements tf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f43345b;

    public tj2(Context context, me3 me3Var) {
        this.f43344a = context.getApplicationContext();
        this.f43345b = a(me3Var);
    }

    public static List a(me3 me3Var) {
        b20 b20Var = me3Var.f40899a;
        long j10 = b20Var.i;
        List list = b20Var.f36900d;
        ArrayList<a83> arrayList = new ArrayList();
        for (Object obj : list) {
            if ("progress".equals(((a83) obj).f36649a)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (a83 a83Var : arrayList) {
            ad3 ad3Var = a83Var.f36651c;
            sj2 sj2Var = null;
            if (ad3Var != null) {
                zc3 zc3Var = zc3.f45372b;
                zc3 zc3Var2 = ad3Var.f36692b;
                Long lValueOf = zc3Var == zc3Var2 ? Long.valueOf((long) ad3Var.f36693c) : zc3.f45373c == zc3Var2 ? Long.valueOf((long) ((ad3Var.f36693c / 100) * j10)) : null;
                if (lValueOf != null) {
                    sj2Var = new sj2(a83Var.f36650b, lValueOf.longValue());
                }
            }
            if (sj2Var != null) {
                arrayList2.add(sj2Var);
            }
        }
        return CollectionsKt.T(arrayList2);
    }

    @Override // yads.tf3
    public final void a(long j10, long j11) {
        Iterator it = this.f43345b.iterator();
        while (it.hasNext()) {
            sj2 sj2Var = (sj2) it.next();
            if (sj2Var.f42953b <= j11) {
                gi3 gi3VarA = gi3.f38768c.a(this.f43344a);
                gi3VarA.f38771b.a(new dd2(gi3VarA.f38770a, sj2Var.f42952a, new rm3()));
                it.remove();
            }
        }
    }
}
