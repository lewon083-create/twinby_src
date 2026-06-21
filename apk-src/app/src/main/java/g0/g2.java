package g0;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 extends c2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fd.b f19566j = new fd.b(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f19567k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final StringBuilder f19568l = new StringBuilder();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f19569m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f19570n = new ArrayList();

    public final void a(h2 h2Var) {
        s0 s0Var = h2Var.f19589g;
        int i = s0Var.f19747c;
        r0 r0Var = this.f19527b;
        if (i != -1) {
            this.f19569m = true;
            int i10 = r0Var.f19728c;
            List list = h2.f19582j;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i10))) {
                i = i10;
            }
            r0Var.f19728c = i;
        }
        Range rangeA = s0Var.a();
        Range range = n.f19676h;
        boolean zEquals = rangeA.equals(range);
        StringBuilder sb2 = this.f19568l;
        if (!zEquals) {
            if (r0Var.g().equals(range)) {
                ((q1) r0Var.f19730e).y(s0.f19744k, rangeA);
            } else if (!r0Var.g().equals(rangeA)) {
                this.f19567k = false;
                String str = "Different ExpectedFrameRateRange values; current = " + r0Var.g() + ", new = " + rangeA;
                com.google.android.gms.internal.auth.g.k("ValidatingBuilder", str);
                sb2.append(str);
            }
        }
        int iC = s0Var.c();
        if (iC != 0) {
            r0Var.getClass();
            if (iC != 0) {
                ((q1) r0Var.f19730e).y(x2.D, Integer.valueOf(iC));
            }
        }
        int iD = s0Var.d();
        if (iD != 0) {
            r0Var.getClass();
            if (iD != 0) {
                ((q1) r0Var.f19730e).y(x2.E, Integer.valueOf(iD));
            }
        }
        r2 r2Var = s0Var.f19751g;
        r1 r1Var = (r1) r0Var.f19732g;
        HashSet hashSet = (HashSet) r0Var.f19729d;
        r1Var.f19735a.putAll((Map) r2Var.f19735a);
        this.f19528c.addAll(h2Var.f19585c);
        this.f19529d.addAll(h2Var.f19586d);
        r0Var.a(s0Var.f19749e);
        this.f19530e.addAll(h2Var.f19587e);
        f2 f2Var = h2Var.f19588f;
        if (f2Var != null) {
            this.f19570n.add(f2Var);
        }
        InputConfiguration inputConfiguration = h2Var.i;
        if (inputConfiguration != null) {
            this.f19532g = inputConfiguration;
        }
        ArrayList arrayList = h2Var.f19583a;
        LinkedHashSet<l> linkedHashSet = this.f19526a;
        linkedHashSet.addAll(arrayList);
        hashSet.addAll(Collections.unmodifiableList(s0Var.f19745a));
        ArrayList arrayList2 = new ArrayList();
        for (l lVar : linkedHashSet) {
            arrayList2.add(lVar.f19641a);
            Iterator it = lVar.f19642b.iterator();
            while (it.hasNext()) {
                arrayList2.add((a1) it.next());
            }
        }
        if (!arrayList2.containsAll(hashSet)) {
            com.google.android.gms.internal.auth.g.e("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
            this.f19567k = false;
            sb2.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
        }
        int i11 = h2Var.f19590h;
        int i12 = this.f19533h;
        if (i11 != i12 && i11 != 0 && i12 != 0) {
            com.google.android.gms.internal.auth.g.e("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
            this.f19567k = false;
            sb2.append("Invalid configuration due to that two non-default session types are set");
        } else if (i11 != 0) {
            this.f19533h = i11;
        }
        l lVar2 = h2Var.f19584b;
        if (lVar2 != null) {
            l lVar3 = this.i;
            if (lVar3 == lVar2 || lVar3 == null) {
                this.i = lVar2;
            } else {
                com.google.android.gms.internal.auth.g.e("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                this.f19567k = false;
                sb2.append("Invalid configuration due to that two different postview output configs are set");
            }
        }
        r0Var.c(s0Var.f19746b);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final g0.h2 b() {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.g2.b():g0.h2");
    }

    public final boolean c() {
        return this.f19569m && this.f19567k;
    }
}
