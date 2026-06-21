package g0;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List f19582j = Arrays.asList(1, 5, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f19584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f19585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f19586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f19587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f2 f19588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s0 f19589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f19590h;
    public final InputConfiguration i;

    public h2(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, s0 s0Var, f2 f2Var, InputConfiguration inputConfiguration, int i, l lVar) {
        this.f19583a = arrayList;
        this.f19585c = Collections.unmodifiableList(arrayList2);
        this.f19586d = Collections.unmodifiableList(arrayList3);
        this.f19587e = Collections.unmodifiableList(arrayList4);
        this.f19588f = f2Var;
        this.f19589g = s0Var;
        this.i = inputConfiguration;
        this.f19590h = i;
        this.f19584b = lVar;
    }

    public static h2 a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        q1 q1VarV = q1.v();
        ArrayList arrayList5 = new ArrayList();
        r1 r1VarA = r1.a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        u1 u1VarU = u1.u(q1VarV);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        r2 r2Var = r2.f19734b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = r1VarA.f19735a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new h2(arrayList, arrayList2, arrayList3, arrayList4, new s0(arrayList6, u1VarU, -1, false, arrayList7, false, new r2(arrayMap), null), null, null, 0, null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        for (l lVar : this.f19583a) {
            arrayList.add(lVar.f19641a);
            Iterator it = lVar.f19642b.iterator();
            while (it.hasNext()) {
                arrayList.add((a1) it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
