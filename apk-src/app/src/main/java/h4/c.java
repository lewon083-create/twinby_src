package h4;

import j3.k0;
import j3.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f20399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b[] f20400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f20401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f20402h;

    public c(int i, int i10, long j10, long j11, int i11, boolean z5, a aVar, b[] bVarArr) {
        this.f20395a = i;
        this.f20396b = i10;
        this.f20401g = j10;
        this.f20402h = j11;
        this.f20397c = i11;
        this.f20398d = z5;
        this.f20399e = aVar;
        this.f20400f = bVarArr;
    }

    @Override // d4.a
    public final Object a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i = 0;
        while (i < arrayList.size()) {
            k0 k0Var = (k0) arrayList.get(i);
            b bVar2 = this.f20400f[k0Var.f26267c];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.a((o[]) arrayList3.toArray(new o[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f20388j[k0Var.f26268d]);
            i++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.a((o[]) arrayList3.toArray(new o[0])));
        }
        return new c(this.f20395a, this.f20396b, this.f20401g, this.f20402h, this.f20397c, this.f20398d, this.f20399e, (b[]) arrayList2.toArray(new b[0]));
    }
}
