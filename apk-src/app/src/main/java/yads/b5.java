package yads;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e5 f36925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c5 f36926b;

    public /* synthetic */ b5() {
        this(d5.a(), new c5());
    }

    public final String a(Context context) {
        List listR;
        e5 e5Var = this.f36925a;
        e5Var.getClass();
        synchronized (e5.f38010c) {
            listR = CollectionsKt.R(e5Var.f38013b);
        }
        return a(context, listR);
    }

    public final String b(Context context) {
        List listR;
        e5 e5Var = this.f36925a;
        e5Var.getClass();
        synchronized (e5.f38010c) {
            listR = CollectionsKt.R(e5Var.f38012a);
        }
        return a(context, listR);
    }

    public b5(e5 e5Var, c5 c5Var) {
        this.f36925a = e5Var;
        this.f36926b = c5Var;
    }

    public final String a(Context context, List list) {
        int i;
        this.f36926b.getClass();
        pt2 pt2VarA = fw2.a().a(context);
        if (pt2VarA == null || (i = pt2VarA.f42018a) == 0) {
            i = 5;
        }
        int size = list.size();
        if (i > size) {
            i = size;
        }
        return CollectionsKt.I(list.subList(list.size() - i, list.size()), StringUtils.COMMA, null, null, null, 62);
    }
}
