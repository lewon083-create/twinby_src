package n1;

import com.google.android.gms.internal.ads.om1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f28994f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f28995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f28998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28999e;

    public final void a(ArrayList arrayList) {
        int size = this.f28995a.size();
        if (this.f28999e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                m mVar = (m) arrayList.get(i);
                if (this.f28999e == mVar.f28996b) {
                    c(this.f28997c, mVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(k1.c cVar, int i) {
        int iN;
        int iN2;
        ArrayList arrayList = this.f28995a;
        if (arrayList.size() == 0) {
            return 0;
        }
        m1.e eVar = (m1.e) ((m1.d) arrayList.get(0)).T;
        cVar.t();
        eVar.b(cVar, false);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((m1.d) arrayList.get(i10)).b(cVar, false);
        }
        if (i == 0 && eVar.f28498z0 > 0) {
            m1.j.a(eVar, cVar, arrayList, 0);
        }
        if (i == 1 && eVar.A0 > 0) {
            m1.j.a(eVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e3) {
            System.err.println(e3.toString() + "\n" + Arrays.toString(e3.getStackTrace()).replace("[", "   at ").replace(StringUtils.COMMA, "\n   at").replace("]", ""));
        }
        this.f28998d = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            m1.d dVar = (m1.d) arrayList.get(i11);
            l7.i iVar = new l7.i(2);
            new WeakReference(dVar);
            k1.c.n(dVar.I);
            k1.c.n(dVar.J);
            k1.c.n(dVar.K);
            k1.c.n(dVar.L);
            k1.c.n(dVar.M);
            this.f28998d.add(iVar);
        }
        if (i == 0) {
            iN = k1.c.n(eVar.I);
            iN2 = k1.c.n(eVar.K);
            cVar.t();
        } else {
            iN = k1.c.n(eVar.J);
            iN2 = k1.c.n(eVar.L);
            cVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, m mVar) {
        int i10 = mVar.f28996b;
        for (m1.d dVar : this.f28995a) {
            ArrayList arrayList = mVar.f28995a;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            if (i == 0) {
                dVar.f28475n0 = i10;
            } else {
                dVar.o0 = i10;
            }
        }
        this.f28999e = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i = this.f28997c;
        sb2.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb2.append(" [");
        String strD = z.d(this.f28996b, "] <", sb2);
        for (m1.d dVar : this.f28995a) {
            StringBuilder sbK = pe.a.k(strD, " ");
            sbK.append(dVar.h0);
            strD = sbK.toString();
        }
        return om1.x(strD, " >");
    }
}
