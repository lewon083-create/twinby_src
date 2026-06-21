package zk;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f46415a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f46418d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f46420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f46421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f46422h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f46416b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f46417c = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46419e = -1;

    public l() {
        ArrayList arrayList = new ArrayList();
        this.f46420f = arrayList;
        arrayList.add("");
    }

    public final m a() {
        ArrayList arrayList;
        String str = this.f46415a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strE = i.e(this.f46416b, 0, 0, 7);
        String strE2 = i.e(this.f46417c, 0, 0, 7);
        String str2 = this.f46418d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iB = b();
        ArrayList arrayList2 = this.f46420f;
        ArrayList arrayList3 = new ArrayList(kotlin.collections.t.j(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(i.e((String) it.next(), 0, 0, 7));
        }
        ArrayList<String> arrayList4 = this.f46421g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(kotlin.collections.t.j(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? i.e(str3, 0, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.f46422h;
        return new m(str, strE, strE2, str2, iB, arrayList3, arrayList, str4 != null ? i.e(str4, 0, 0, 7) : null, toString());
    }

    public final int b() {
        int i = this.f46419e;
        if (i != -1) {
            return i;
        }
        String scheme = this.f46415a;
        Intrinsics.b(scheme);
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        if (Intrinsics.a(scheme, "http")) {
            return 80;
        }
        return Intrinsics.a(scheme, "https") ? 443 : -1;
    }

    public final void c(String str) {
        String strB;
        this.f46421g = (str == null || (strB = i.b(0, 0, 211, str, " \"'<>#")) == null) ? null : i.g(strB);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(zk.m r18, java.lang.String r19) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 907
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zk.l.d(zk.m, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zk.l.toString():java.lang.String");
    }
}
