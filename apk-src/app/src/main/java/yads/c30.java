package yads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c30 implements ev0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f37255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f37256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f37257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f37258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f37259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f37260h;
    public final kb3 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final cy2 f37261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f37262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fj2 f37263l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f37264m;

    public c30(long j10, long j11, long j12, boolean z5, long j13, long j14, long j15, long j16, fj2 fj2Var, kb3 kb3Var, cy2 cy2Var, Uri uri, ArrayList arrayList) {
        this.f37253a = j10;
        this.f37254b = j11;
        this.f37255c = j12;
        this.f37256d = z5;
        this.f37257e = j13;
        this.f37258f = j14;
        this.f37259g = j15;
        this.f37260h = j16;
        this.f37263l = fj2Var;
        this.i = kb3Var;
        this.f37262k = uri;
        this.f37261j = cy2Var;
        this.f37264m = arrayList;
    }

    public final hc2 a(int i) {
        return (hc2) this.f37264m.get(i);
    }

    public final long b(int i) {
        long j10;
        long j11;
        if (i == this.f37264m.size() - 1) {
            j10 = this.f37254b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j11 = ((hc2) this.f37264m.get(i)).f39126b;
        } else {
            j10 = ((hc2) this.f37264m.get(i + 1)).f39126b;
            j11 = ((hc2) this.f37264m.get(i)).f39126b;
        }
        return j10 - j11;
    }

    public final long c(int i) {
        return lb3.a(b(i));
    }

    public final c30 a(List list) {
        long j10;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new y33(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        int i = 0;
        while (true) {
            if (i >= this.f37264m.size()) {
                break;
            }
            if (((y33) linkedList.peek()).f44912b != i) {
                long jB = b(i);
                if (jB != -9223372036854775807L) {
                    j11 += jB;
                    i++;
                } else {
                    j10 = j11;
                }
            } else {
                hc2 hc2Var = (hc2) this.f37264m.get(i);
                List list2 = hc2Var.f39127c;
                y33 y33Var = (y33) linkedList.poll();
                int i10 = y33Var.f44912b;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i11 = y33Var.f44913c;
                    zb zbVar = (zb) list2.get(i11);
                    List list3 = zbVar.f45307c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((no2) list3.get(y33Var.f44914d));
                        y33Var = (y33) linkedList.poll();
                        if (y33Var.f44912b != i10) {
                            break;
                        }
                    } while (y33Var.f44913c == i11);
                    j10 = j11;
                    arrayList2.add(new zb(zbVar.f45305a, zbVar.f45306b, arrayList3, zbVar.f45308d, zbVar.f45309e, zbVar.f45310f));
                    if (y33Var.f44912b != i10) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(y33Var);
                arrayList.add(new hc2(hc2Var.f39125a, hc2Var.f39126b - j10, arrayList2, hc2Var.f39128d));
            }
            j11 = j10;
            i++;
        }
        long j12 = j11;
        long j13 = this.f37254b;
        return new c30(this.f37253a, j13 != -9223372036854775807L ? j13 - j12 : -9223372036854775807L, this.f37255c, this.f37256d, this.f37257e, this.f37258f, this.f37259g, this.f37260h, this.f37263l, this.i, this.f37261j, this.f37262k, arrayList);
    }
}
