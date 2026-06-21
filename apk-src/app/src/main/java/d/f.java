package d;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.j0;
import kotlin.jvm.internal.Intrinsics;
import z2.h0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements o6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15445b;

    public /* synthetic */ f(int i, Object obj) {
        this.f15444a = i;
        this.f15445b = obj;
    }

    @Override // o6.d
    public final Bundle a() {
        Pair[] pairArr;
        h0 h0VarI;
        int i = this.f15444a;
        Object obj = this.f15445b;
        switch (i) {
            case 0:
                return n.a((n) obj);
            case 1:
                a1.m mVar = (a1.m) obj;
                for (Map.Entry entry : j0.l((LinkedHashMap) mVar.f365e).entrySet()) {
                    mVar.s((String) entry.getKey(), ((kk.t) ((kk.p) entry.getValue())).F());
                }
                for (Map.Entry entry2 : j0.l((LinkedHashMap) mVar.f363c).entrySet()) {
                    mVar.s((String) entry2.getKey(), ((o6.d) entry2.getValue()).a());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) mVar.f362b;
                if (linkedHashMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        arrayList.add(new Pair((String) entry3.getKey(), entry3.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                Bundle source = i0.o.h((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                Intrinsics.checkNotNullParameter(source, "source");
                return source;
            case 2:
                z2.w wVar = (z2.w) obj;
                do {
                    h0VarI = wVar.i();
                    androidx.lifecycle.o oVar = androidx.lifecycle.o.f1573b;
                } while (z2.w.j(h0VarI));
                wVar.f46001d.e(androidx.lifecycle.n.ON_STOP);
                return new Bundle();
            default:
                return ((h0) obj).X();
        }
    }
}
