package i4;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.ads.e2;
import com.google.android.gms.internal.measurement.h5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.i0 f20979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p3.g f20980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l7.i f20981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f20985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f20986h;
    public boolean i;

    public q(Context context) {
        this(new l6.i(context, 19));
    }

    public static b0 e(Class cls, p3.g gVar) {
        try {
            return (b0) cls.getConstructor(p3.g.class).newInstance(gVar);
        } catch (Exception e3) {
            throw new IllegalStateException(e3);
        }
    }

    @Override // i4.b0
    public final void a(l7.i iVar) {
        this.f20981c = iVar;
        com.google.android.gms.internal.ads.i0 i0Var = this.f20979a;
        i0Var.f6317g = iVar;
        q4.i iVar2 = (q4.i) i0Var.f6313c;
        synchronized (iVar2) {
            iVar2.f31747d = iVar;
        }
        Iterator it = ((HashMap) i0Var.f6315e).values().iterator();
        while (it.hasNext()) {
            ((b0) it.next()).a(iVar);
        }
    }

    @Override // i4.b0
    public final void b() {
        com.google.android.gms.internal.ads.i0 i0Var = this.f20979a;
        i0Var.getClass();
        synchronized (((q4.i) i0Var.f6313c)) {
        }
    }

    @Override // i4.b0
    public final void c(boolean z5) {
        this.i = z5;
        com.google.android.gms.internal.ads.i0 i0Var = this.f20979a;
        i0Var.f6312b = z5;
        q4.i iVar = (q4.i) i0Var.f6313c;
        synchronized (iVar) {
            iVar.f31746c = z5;
        }
        Iterator it = ((HashMap) i0Var.f6315e).values().iterator();
        while (it.hasNext()) {
            ((b0) it.next()).c(z5);
        }
    }

    @Override // i4.b0
    public final a d(j3.x xVar) {
        j3.x xVar2;
        List list;
        Uri uri;
        String str;
        long j10;
        xVar.f26407b.getClass();
        String scheme = xVar.f26407b.f26396a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(xVar.f26407b.f26397b, "application/x-image-uri")) {
            long j11 = xVar.f26407b.f26400e;
            String str2 = m3.z.f28608a;
            throw null;
        }
        j3.u uVar = xVar.f26407b;
        int iF = m3.z.F(uVar.f26396a, uVar.f26397b);
        if (xVar.f26407b.f26400e != -9223372036854775807L) {
            q4.i iVar = (q4.i) this.f20979a.f6313c;
            synchronized (iVar) {
                iVar.f31748e = 1;
            }
            q4.i iVar2 = (q4.i) this.f20979a.f6313c;
            synchronized (iVar2) {
                iVar2.f31749f = 1;
            }
        }
        try {
            com.google.android.gms.internal.ads.i0 i0Var = this.f20979a;
            HashMap map = (HashMap) i0Var.f6315e;
            b0 b0Var = (b0) map.get(Integer.valueOf(iF));
            if (b0Var == null) {
                b0Var = (b0) i0Var.d(iF).get();
                b0Var.a((l7.i) i0Var.f6317g);
                b0Var.c(i0Var.f6312b);
                b0Var.b();
                map.put(Integer.valueOf(iF), b0Var);
            }
            j3.s sVarA = xVar.f26408c.a();
            j3.t tVar = xVar.f26408c;
            if (tVar.f26386a == -9223372036854775807L) {
                sVarA.f26360a = this.f20982d;
            }
            if (tVar.f26389d == -3.4028235E38f) {
                sVarA.f26363d = this.f20985g;
            }
            if (tVar.f26390e == -3.4028235E38f) {
                sVarA.f26364e = this.f20986h;
            }
            if (tVar.f26387b == -9223372036854775807L) {
                sVarA.f26361b = this.f20983e;
            }
            if (tVar.f26388c == -9223372036854775807L) {
                sVarA.f26362c = this.f20984f;
            }
            j3.t tVar2 = new j3.t(sVarA);
            if (tVar2.equals(xVar.f26408c)) {
                xVar2 = xVar;
            } else {
                new j3.v0();
                List list2 = Collections.EMPTY_LIST;
                ad.j0 j0Var = ad.b1.f768f;
                j3.v vVar = j3.v.f26403a;
                j3.r rVar = xVar.f26410e;
                e2 e2Var = new e2();
                e2Var.f4793b = rVar.f26356a;
                String str3 = xVar.f26406a;
                j3.z zVar = xVar.f26409d;
                xVar.f26408c.a();
                j3.v vVar2 = xVar.f26411f;
                j3.u uVar2 = xVar.f26407b;
                if (uVar2 != null) {
                    String str4 = uVar2.f26397b;
                    Uri uri2 = uVar2.f26396a;
                    List list3 = uVar2.f26398c;
                    j0Var = uVar2.f26399d;
                    new j3.v0();
                    str = str4;
                    uri = uri2;
                    list = list3;
                    j10 = uVar2.f26400e;
                } else {
                    list = list2;
                    uri = null;
                    str = null;
                    j10 = -9223372036854775807L;
                }
                ad.j0 j0Var2 = j0Var;
                j3.s sVarA2 = tVar2.a();
                j3.u uVar3 = uri != null ? new j3.u(uri, str, null, list, j0Var2, j10) : null;
                if (str3 == null) {
                    str3 = "";
                }
                String str5 = str3;
                j3.r rVar2 = new j3.r(e2Var);
                j3.t tVar3 = new j3.t(sVarA2);
                if (zVar == null) {
                    zVar = j3.z.B;
                }
                xVar2 = new j3.x(str5, rVar2, uVar3, tVar3, zVar, vVar2);
            }
            a aVarD = b0Var.d(xVar2);
            ad.j0 j0Var3 = xVar2.f26407b.f26399d;
            if (!j0Var3.isEmpty()) {
                a[] aVarArr = new a[j0Var3.size() + 1];
                aVarArr[0] = aVarD;
                if (j0Var3.size() > 0) {
                    if (!this.i) {
                        this.f20980b.getClass();
                        j3.w wVar = (j3.w) j0Var3.get(0);
                        new ArrayList(1);
                        new HashSet(1);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        ad.h0 h0Var = ad.j0.f818c;
                        ad.b1 b1Var = ad.b1.f768f;
                        List list4 = Collections.EMPTY_LIST;
                        ad.b1 b1Var2 = ad.b1.f768f;
                        j3.v vVar3 = j3.v.f26403a;
                        Uri uri3 = Uri.EMPTY;
                        wVar.getClass();
                        throw null;
                    }
                    j3.n nVar = new j3.n();
                    ((j3.w) j0Var3.get(0)).getClass();
                    ArrayList arrayList = j3.c0.f26222a;
                    nVar.f26292m = null;
                    ((j3.w) j0Var3.get(0)).getClass();
                    nVar.f26284d = null;
                    ((j3.w) j0Var3.get(0)).getClass();
                    nVar.f26285e = 0;
                    ((j3.w) j0Var3.get(0)).getClass();
                    nVar.f26286f = 0;
                    ((j3.w) j0Var3.get(0)).getClass();
                    nVar.f26282b = null;
                    ((j3.w) j0Var3.get(0)).getClass();
                    nVar.f26281a = null;
                    j3.o oVar = new j3.o(nVar);
                    if (this.f20981c.c(oVar)) {
                        j3.n nVarA = oVar.a();
                        nVarA.f26292m = j3.c0.n("application/x-media3-cues");
                        nVarA.f26289j = oVar.f26335n;
                        nVarA.K = this.f20981c.a(oVar);
                        new j3.o(nVarA);
                    }
                    ((j3.w) j0Var3.get(0)).getClass();
                    throw null;
                }
                aVarD = new n0(aVarArr);
            }
            j3.r rVar3 = xVar2.f26410e;
            if (rVar3.f26356a != Long.MIN_VALUE) {
                e eVar = new e(aVarD);
                h5.r(!eVar.f20876d);
                long j12 = rVar3.f26356a;
                h5.r(!eVar.f20876d);
                eVar.f20874b = j12;
                h5.r(!eVar.f20876d);
                eVar.f20875c = true;
                h5.r(!eVar.f20876d);
                h5.r(!eVar.f20876d);
                h5.r(!eVar.f20876d);
                eVar.f20876d = true;
                aVarD = new h(eVar);
            }
            xVar2.f26407b.getClass();
            xVar2.f26407b.getClass();
            return aVarD;
        } catch (ClassNotFoundException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public q(p3.g gVar) {
        this(gVar, new q4.i());
    }

    public q(p3.g gVar, q4.i iVar) {
        this.f20980b = gVar;
        l7.i iVar2 = new l7.i(4);
        this.f20981c = iVar2;
        com.google.android.gms.internal.ads.i0 i0Var = new com.google.android.gms.internal.ads.i0();
        i0Var.f6313c = iVar;
        i0Var.f6317g = iVar2;
        i0Var.f6314d = new HashMap();
        i0Var.f6315e = new HashMap();
        i0Var.f6312b = true;
        this.f20979a = i0Var;
        if (gVar != ((p3.g) i0Var.f6316f)) {
            i0Var.f6316f = gVar;
            ((HashMap) i0Var.f6314d).clear();
            ((HashMap) i0Var.f6315e).clear();
        }
        this.f20982d = -9223372036854775807L;
        this.f20983e = -9223372036854775807L;
        this.f20984f = -9223372036854775807L;
        this.f20985g = -3.4028235E38f;
        this.f20986h = -3.4028235E38f;
        this.i = true;
    }
}
