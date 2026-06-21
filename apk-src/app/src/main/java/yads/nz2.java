package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nz2 implements e92 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f41401c = kotlin.collections.s.f(ty2.f43489b, ty2.f43490c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f41402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41403b;

    public nz2(h83 h83Var, h83 h83Var2) {
        this.f41402a = kotlin.collections.j0.g(new Pair(ty2.f43489b, h83Var), new Pair(ty2.f43490c, h83Var2));
    }

    @Override // yads.e92
    public final void a(ty2 ty2Var, tb3 tb3Var) {
        e92 e92Var = (e92) this.f41402a.get(ty2Var);
        if (e92Var != null) {
            e92Var.a(ty2Var, tb3Var);
        }
    }

    @Override // yads.e92
    public final void invalidate() {
        Iterator it = this.f41402a.values().iterator();
        while (it.hasNext()) {
            ((e92) it.next()).invalidate();
        }
    }

    @Override // yads.e92
    public final void a(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            ty2 ty2Var = ((j92) obj).f39784a.f38402d;
            Object arrayList = linkedHashMap.get(ty2Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(ty2Var, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (Map.Entry entry : kotlin.collections.h0.a(linkedHashMap, mz2.f41111b).entrySet()) {
            ty2 ty2Var2 = (ty2) entry.getKey();
            List list2 = (List) entry.getValue();
            e92 e92Var = (e92) this.f41402a.get(ty2Var2);
            if (e92Var != null) {
                e92Var.a(list2);
            }
        }
    }

    @Override // yads.e92
    public final void a(ty2 ty2Var, List list, ub3 ub3Var) {
        List<ty2> listR;
        if (!this.f41403b) {
            this.f41403b = true;
            ArrayList arrayListM = CollectionsKt.M(list, ty2Var);
            Set elements = CollectionsKt.V(arrayListM);
            List list2 = f41401c;
            Intrinsics.checkNotNullParameter(list2, "<this>");
            Intrinsics.checkNotNullParameter(elements, "elements");
            Collection collectionO = kotlin.collections.x.o(elements);
            if (collectionO.isEmpty()) {
                listR = CollectionsKt.R(list2);
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (!collectionO.contains(obj)) {
                        arrayList.add(obj);
                    }
                }
                listR = arrayList;
            }
            for (ty2 ty2Var2 : listR) {
                a(ty2Var2, ub3Var);
                a(ty2Var2, arrayListM, ub3Var);
            }
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ty2) it.next()) == ty2Var) {
                    return;
                }
            }
        }
        e92 e92Var = (e92) this.f41402a.get(ty2Var);
        if (e92Var != null) {
            e92Var.a(ty2Var, list, ub3Var);
        }
    }

    @Override // yads.e92
    public final void a(ty2 ty2Var, ub3 ub3Var) {
        e92 e92Var = (e92) this.f41402a.get(ty2Var);
        if (e92Var != null) {
            e92Var.a(ty2Var, ub3Var);
        }
    }

    @Override // yads.e92
    public final void a(v9 v9Var) {
        Iterator it = this.f41402a.values().iterator();
        while (it.hasNext()) {
            ((e92) it.next()).a(v9Var);
        }
    }
}
