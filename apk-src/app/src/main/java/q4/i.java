package q4;

import ad.b1;
import ad.h0;
import ad.j0;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f31743g = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l6.i f31744h = new l6.i(new pf.a(7));
    public static final l6.i i = new l6.i(new pf.a(8));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b1 f31745b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f31749f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l7.i f31747d = new l7.i(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31746c = true;

    public final void a(int i10, ArrayList arrayList) {
        switch (i10) {
            case 0:
                arrayList.add(new x5.a());
                break;
            case 1:
                arrayList.add(new x5.c());
                break;
            case 2:
                arrayList.add(new x5.d(0));
                break;
            case 3:
                arrayList.add(new r4.a());
                break;
            case 4:
                k kVarE = f31744h.e(0);
                if (kVarE == null) {
                    arrayList.add(new v4.c());
                } else {
                    arrayList.add(kVarE);
                }
                break;
            case 5:
                arrayList.add(new w4.b());
                break;
            case 6:
                arrayList.add(new i5.e(this.f31747d, this.f31746c ? 0 : 2));
                break;
            case 7:
                arrayList.add(new j5.d(0));
                break;
            case 8:
                l7.i iVar = this.f31747d;
                int i11 = this.f31746c ? 0 : 32;
                h0 h0Var = j0.f818c;
                arrayList.add(new k5.h(iVar, i11, null, null, b1.f768f, null));
                arrayList.add(new k5.l(this.f31747d, this.f31746c ? 0 : 16));
                break;
            case 9:
                arrayList.add(new l5.c());
                break;
            case 10:
                arrayList.add(new x5.q());
                break;
            case 11:
                if (this.f31745b == null) {
                    h0 h0Var2 = j0.f818c;
                    this.f31745b = b1.f768f;
                }
                arrayList.add(new x5.t(1, !this.f31746c ? 1 : 0, this.f31747d, new m3.w(0L), new d2.h(0, this.f31745b)));
                break;
            case 12:
                arrayList.add(new y5.c());
                break;
            case 14:
                arrayList.add(new m5.a(this.f31748e));
                break;
            case 15:
                k kVarE2 = i.e(new Object[0]);
                if (kVarE2 != null) {
                    arrayList.add(kVarE2);
                }
                break;
            case 16:
                arrayList.add(new s4.b(1 ^ (this.f31746c ? 1 : 0), this.f31747d));
                break;
            case 17:
                arrayList.add(new m5.a(0, (byte) 0));
                break;
            case 18:
                arrayList.add(new t4.a(1));
                break;
            case 19:
                arrayList.add(new m5.a(1, (byte) 0));
                break;
            case 20:
                arrayList.add(new x4.b(this.f31749f));
                break;
            case 21:
                arrayList.add(new t4.a(0));
                break;
        }
    }

    @Override // q4.n
    public final synchronized k[] createExtractors() {
        return createExtractors(Uri.EMPTY, new HashMap());
    }

    @Override // q4.n
    public final synchronized k[] createExtractors(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = f31743g;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            int iL = rl.b.l((list == null || list.isEmpty()) ? null : (String) list.get(0));
            if (iL != -1) {
                a(iL, arrayList);
            }
            int iM = rl.b.m(uri);
            if (iM != -1 && iM != iL) {
                a(iM, arrayList);
            }
            for (int i10 = 0; i10 < 21; i10++) {
                int i11 = iArr[i10];
                if (i11 != iL && i11 != iM) {
                    a(i11, arrayList);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (k[]) arrayList.toArray(new k[0]);
    }
}
