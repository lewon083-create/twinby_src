package j4;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.e2;
import com.google.android.gms.internal.measurement.h5;
import q4.a0;
import q4.t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements q4.m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e2 f26459l = new e2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q4.k f26460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j3.o f26462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f26463e = new SparseArray();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f26464f = d.f26458a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f26465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h3.e f26466h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t f26467j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j3.o[] f26468k;

    public e(q4.k kVar, int i, j3.o oVar) {
        this.f26460b = kVar;
        this.f26461c = i;
        this.f26462d = oVar;
    }

    @Override // q4.m
    public final void G() {
        SparseArray sparseArray = this.f26463e;
        j3.o[] oVarArr = new j3.o[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            j3.o oVar = ((c) sparseArray.valueAt(i)).f26455e;
            oVar.getClass();
            oVarArr[i] = oVar;
        }
        this.f26468k = oVarArr;
    }

    @Override // q4.m
    public final a0 P(int i, int i10) {
        SparseArray sparseArray = this.f26463e;
        c cVar = (c) sparseArray.get(i);
        if (cVar == null) {
            h5.r(this.f26468k == null);
            cVar = new c(i, i10, i10 == this.f26461c ? this.f26462d : null, this.f26464f);
            h3.e eVar = this.f26466h;
            long j10 = this.i;
            if (eVar == null) {
                cVar.f26456f = cVar.f26453c;
            } else {
                cVar.f26457g = j10;
                a0 a0VarE = eVar.E(i10);
                cVar.f26456f = a0VarE;
                j3.o oVar = cVar.f26455e;
                if (oVar != null) {
                    a0VarE.a(oVar);
                }
            }
            sparseArray.put(i, cVar);
        }
        return cVar;
    }

    public final q4.g a() {
        t tVar = this.f26467j;
        if (tVar instanceof q4.g) {
            return (q4.g) tVar;
        }
        if (tVar instanceof i5.c) {
            return ((i5.c) tVar).f21086a;
        }
        return null;
    }

    public final void b(h3.e eVar, long j10, long j11) {
        this.f26466h = eVar;
        this.i = j11;
        boolean z5 = this.f26465g;
        q4.k kVar = this.f26460b;
        if (!z5) {
            kVar.b(this);
            if (j10 != -9223372036854775807L) {
                kVar.seek(0L, j10);
            }
            this.f26465g = true;
            return;
        }
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        kVar.seek(0L, j10);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f26463e;
            if (i >= sparseArray.size()) {
                return;
            }
            c cVar = (c) sparseArray.valueAt(i);
            if (eVar == null) {
                cVar.f26456f = cVar.f26453c;
            } else {
                cVar.f26457g = j11;
                a0 a0VarE = eVar.E(cVar.f26451a);
                cVar.f26456f = a0VarE;
                j3.o oVar = cVar.f26455e;
                if (oVar != null) {
                    a0VarE.a(oVar);
                }
            }
            i++;
        }
    }

    @Override // q4.m
    public final void j(t tVar) {
        this.f26467j = tVar;
    }
}
