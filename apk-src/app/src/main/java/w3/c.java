package w3;

import android.net.Uri;
import j3.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f35030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f35032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f35033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f35034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f35035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f35036h;
    public final d8.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j3.s f35037j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f35038k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f35039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f35040m;

    public c(long j10, long j11, long j12, boolean z5, long j13, long j14, long j15, long j16, i iVar, d8.a aVar, j3.s sVar, Uri uri, ArrayList arrayList) {
        this.f35029a = j10;
        this.f35030b = j11;
        this.f35031c = j12;
        this.f35032d = z5;
        this.f35033e = j13;
        this.f35034f = j14;
        this.f35035g = j15;
        this.f35036h = j16;
        this.f35039l = iVar;
        this.i = aVar;
        this.f35038k = uri;
        this.f35037j = sVar;
        this.f35040m = arrayList;
    }

    @Override // d4.a
    public final Object a(List list) {
        long j10;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new k0());
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        int i = 0;
        while (true) {
            if (i >= this.f35040m.size()) {
                break;
            }
            if (((k0) linkedList.peek()).f26266b != i) {
                long jC = c(i);
                if (jC != -9223372036854775807L) {
                    j11 += jC;
                }
            } else {
                h hVarB = b(i);
                List list2 = hVarB.f35062c;
                k0 k0Var = (k0) linkedList.poll();
                int i10 = k0Var.f26266b;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i11 = k0Var.f26267c;
                    a aVar = (a) list2.get(i11);
                    List list3 = aVar.f35021c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(k0Var.f26268d));
                        k0Var = (k0) linkedList.poll();
                        if (k0Var.f26266b != i10) {
                            break;
                        }
                    } while (k0Var.f26267c == i11);
                    j10 = j11;
                    arrayList2.add(new a(aVar.f35019a, aVar.f35020b, arrayList3, aVar.f35022d, aVar.f35023e, aVar.f35024f));
                    if (k0Var.f26266b != i10) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(k0Var);
                arrayList.add(new h(hVarB.f35060a, hVarB.f35061b - j10, arrayList2, hVarB.f35063d));
                j11 = j10;
            }
            i++;
        }
        long j12 = j11;
        long j13 = this.f35030b;
        return new c(this.f35029a, j13 != -9223372036854775807L ? j13 - j12 : -9223372036854775807L, this.f35031c, this.f35032d, this.f35033e, this.f35034f, this.f35035g, this.f35036h, this.f35039l, this.i, this.f35037j, this.f35038k, arrayList);
    }

    public final h b(int i) {
        return (h) this.f35040m.get(i);
    }

    public final long c(int i) {
        long j10;
        long j11;
        List list = this.f35040m;
        if (i == list.size() - 1) {
            j10 = this.f35030b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j11 = ((h) list.get(i)).f35061b;
        } else {
            j10 = ((h) list.get(i + 1)).f35061b;
            j11 = ((h) list.get(i)).f35061b;
        }
        return j10 - j11;
    }

    public final long d(int i) {
        return z.M(c(i));
    }
}
