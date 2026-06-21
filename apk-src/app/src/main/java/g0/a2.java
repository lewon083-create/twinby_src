package g0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 implements k4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19518a;

    public a2(List list) {
        this.f19518a = new ArrayList(list);
    }

    public static String m(a2 a2Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = a2Var.f19518a.iterator();
        while (it.hasNext()) {
            arrayList.add(((w1) it.next()).getClass().getSimpleName());
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) " | ");
            }
        }
        return sb2.toString();
    }

    @Override // k4.a
    public long a(long j10) {
        ArrayList arrayList = this.f19518a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((n5.a) arrayList.get(0)).f29102b) {
            return ((n5.a) arrayList.get(0)).f29102b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            n5.a aVar = (n5.a) arrayList.get(i);
            long j11 = aVar.f29102b;
            long j12 = aVar.f29102b;
            if (j10 < j11) {
                long j13 = ((n5.a) arrayList.get(i - 1)).f29104d;
                return (j13 == -9223372036854775807L || j13 <= j10 || j13 >= j12) ? j12 : j13;
            }
        }
        long j14 = ((n5.a) ad.q.j(arrayList)).f29104d;
        if (j14 == -9223372036854775807L || j10 >= j14) {
            return Long.MIN_VALUE;
        }
        return j14;
    }

    @Override // k4.a
    public ad.j0 b(long j10) {
        int iK = k(j10);
        if (iK == 0) {
            ad.h0 h0Var = ad.j0.f818c;
            return ad.b1.f768f;
        }
        n5.a aVar = (n5.a) this.f19518a.get(iK - 1);
        long j11 = aVar.f29104d;
        if (j11 == -9223372036854775807L || j10 < j11) {
            return aVar.f29101a;
        }
        ad.h0 h0Var2 = ad.j0.f818c;
        return ad.b1.f768f;
    }

    @Override // k4.a
    public long c(long j10) {
        ArrayList arrayList = this.f19518a;
        if (arrayList.isEmpty() || j10 < ((n5.a) arrayList.get(0)).f29102b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j11 = ((n5.a) arrayList.get(i)).f29102b;
            if (j10 == j11) {
                return j11;
            }
            if (j10 < j11) {
                n5.a aVar = (n5.a) arrayList.get(i - 1);
                long j12 = aVar.f29104d;
                return (j12 == -9223372036854775807L || j12 > j10) ? aVar.f29102b : j12;
            }
        }
        n5.a aVar2 = (n5.a) ad.q.j(arrayList);
        long j13 = aVar2.f29104d;
        return (j13 == -9223372036854775807L || j10 < j13) ? aVar2.f29102b : j13;
    }

    @Override // k4.a
    public void clear() {
        this.f19518a.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    @Override // k4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(n5.a r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f29102b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto Lf
            r4 = r6
            goto L10
        Lf:
            r4 = r5
        L10:
            com.google.android.gms.internal.measurement.h5.h(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L23
            long r7 = r10.f29104d
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L23
        L21:
            r2 = r6
            goto L24
        L23:
            r2 = r5
        L24:
            java.util.ArrayList r3 = r9.f19518a
            int r4 = r3.size()
            int r4 = r4 - r6
        L2b:
            if (r4 < 0) goto L4e
            java.lang.Object r7 = r3.get(r4)
            n5.a r7 = (n5.a) r7
            long r7 = r7.f29102b
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 < 0) goto L3e
            int r4 = r4 + r6
            r3.add(r4, r10)
            return r2
        L3e:
            java.lang.Object r7 = r3.get(r4)
            n5.a r7 = (n5.a) r7
            long r7 = r7.f29102b
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 > 0) goto L4b
            r2 = r5
        L4b:
            int r4 = r4 + (-1)
            goto L2b
        L4e:
            r3.add(r5, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.a2.d(n5.a, long):boolean");
    }

    @Override // k4.a
    public void e(long j10) {
        int iK = k(j10);
        if (iK == 0) {
            return;
        }
        ArrayList arrayList = this.f19518a;
        long j11 = ((n5.a) arrayList.get(iK - 1)).f29104d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            iK--;
        }
        arrayList.subList(0, iK).clear();
    }

    public void f(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = this.f19518a;
        arrayList.add(name);
        arrayList.add(StringsKt.P(value).toString());
    }

    public zk.k g() {
        return new zk.k((String[]) this.f19518a.toArray(new String[0]));
    }

    public boolean h(Class cls) {
        Iterator it = this.f19518a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((w1) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public w1 i(Class cls) {
        for (w1 w1Var : this.f19518a) {
            if (w1Var.getClass() == cls) {
                return w1Var;
            }
        }
        return null;
    }

    public ArrayList j(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (w1 w1Var : this.f19518a) {
            if (cls.isAssignableFrom(w1Var.getClass())) {
                arrayList.add(w1Var);
            }
        }
        return arrayList;
    }

    public int k(long j10) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f19518a;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j10 < ((n5.a) arrayList.get(i)).f29102b) {
                return i;
            }
            i++;
        }
    }

    public void l(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f19518a;
            if (i >= arrayList.size()) {
                return;
            }
            if (name.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public a2(int i) {
        switch (i) {
            case 2:
                this.f19518a = new ArrayList(20);
                break;
            default:
                this.f19518a = new ArrayList();
                break;
        }
    }
}
