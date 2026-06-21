package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vw1 implements h92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e92 f44199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p32 f44200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f44201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final va f44202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final za f44203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gw2 f44204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n73 f44205h;
    public final g83 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f61 f44206j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f44207k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f44208l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f44209m = new ArrayList();

    public vw1(Context context, e92 e92Var, p32 p32Var, String str, va vaVar, za zaVar, gw2 gw2Var, n73 n73Var, g83 g83Var) {
        this.f44198a = context;
        this.f44199b = e92Var;
        this.f44200c = p32Var;
        this.f44201d = str;
        this.f44202e = vaVar;
        this.f44203f = zaVar;
        this.f44204g = gw2Var;
        this.f44205h = n73Var;
        this.i = g83Var;
    }

    public final synchronized void a(List list) {
        ty2 ty2Var;
        try {
            this.f44209m.clear();
            g83 g83Var = this.i;
            va vaVar = this.f44202e;
            g83Var.getClass();
            ArrayList arrayList = new ArrayList(kotlin.collections.t.j(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((sy2) it.next()).f43132d);
            }
            Set setV = CollectionsKt.V(arrayList);
            int iOrdinal = vaVar.ordinal();
            if (iOrdinal == 0) {
                if (!(setV instanceof Collection) || !setV.isEmpty()) {
                    Iterator it2 = setV.iterator();
                    while (it2.hasNext()) {
                        if (((ty2) it2.next()) == ty2.f43490c) {
                            ty2Var = null;
                            break;
                        }
                    }
                }
                ty2Var = ty2.f43489b;
            } else if (iOrdinal == 1) {
                ty2Var = ty2.f43490c;
            } else {
                if (iOrdinal != 2) {
                    throw new ij.j();
                }
                ty2Var = ty2.f43489b;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList<sy2> arrayList3 = new ArrayList();
            for (Object obj : list) {
                if (((sy2) obj).f43130b != null) {
                    arrayList3.add(obj);
                }
            }
            for (sy2 sy2Var : arrayList3) {
                String str = sy2Var.f43130b;
                long j10 = sy2Var.f43129a;
                int i = sy2Var.f43131c;
                ty2 ty2Var2 = sy2Var.f43132d;
                ty2 ty2Var3 = (ty2Var2 != ty2.f43491d || ty2Var == null) ? ty2Var2 : ty2Var;
                if (str != null) {
                    arrayList2.add(new f83(i, j10, ty2Var3, str));
                }
            }
            this.f44209m.addAll(arrayList2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        this.f44205h.b();
        Iterator it = this.f44209m.iterator();
        while (it.hasNext()) {
            ((f83) it.next()).f38403e = null;
        }
    }

    public final wb3 b(f83 f83Var) {
        wb3 wb3VarB = this.f44200c.b(f83Var.a());
        Objects.toString(wb3VarB);
        return wb3VarB;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(yads.tc2 r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Objects.toString(r2)     // Catch: java.lang.Throwable -> L15
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L17
            r0 = 1
            if (r2 == r0) goto L11
            r0 = 2
            if (r2 == r0) goto L17
            goto L1c
        L11:
            r1.b()     // Catch: java.lang.Throwable -> L15
            goto L1c
        L15:
            r2 = move-exception
            goto L1e
        L17:
            if (r3 == 0) goto L1c
            r1.a()     // Catch: java.lang.Throwable -> L15
        L1c:
            monitor-exit(r1)
            return
        L1e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.vw1.a(yads.tc2, boolean):void");
    }

    public final synchronized void a() {
        if (yc2.f44998h.a(this.f44198a).a() && !this.f44209m.isEmpty() && !this.f44205h.a()) {
            this.f44205h.a(this);
        }
    }

    public final synchronized void a(f83 f83Var, ub3 ub3Var) {
        try {
            za.a(this.f44203f, f83Var.f38399a, n83.f41196h);
            if (!this.f44207k) {
                this.f44207k = true;
                f61 f61Var = this.f44206j;
                if (f61Var != null) {
                    f61Var.c();
                }
            }
            if (!this.f44208l && this.f44209m.isEmpty()) {
                this.f44208l = true;
                f61 f61Var2 = this.f44206j;
                if (f61Var2 != null) {
                    f61Var2.g();
                }
            }
            this.f44199b.a(f83Var.f38402d, ub3Var);
            e92 e92Var = this.f44199b;
            ty2 ty2Var = f83Var.f38402d;
            ArrayList arrayList = this.f44209m;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.t.j(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((f83) it.next()).f38402d);
            }
            e92Var.a(ty2Var, arrayList2, ub3Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a(v9 v9Var, List list) {
        this.f44199b.a(v9Var);
        this.f44209m.clear();
        this.f44199b.invalidate();
        this.f44208l = false;
        b();
        a(list);
    }

    public final wb3 a(f83 f83Var) {
        wb3 wb3VarA;
        pt2 pt2VarA = this.f44204g.a(this.f44198a);
        if (pt2VarA != null && pt2VarA.g()) {
            wb3VarA = this.f44200c.b(f83Var.a());
        } else {
            wb3VarA = this.f44200c.a(f83Var.a());
        }
        Objects.toString(wb3VarA);
        return wb3VarA;
    }
}
