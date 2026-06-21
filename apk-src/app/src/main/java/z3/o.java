package z3;

import android.net.Uri;
import j3.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final o f46131l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f46132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f46133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f46134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f46135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j3.o f46136h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f46137j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f46138k;

    static {
        List list = Collections.EMPTY_LIST;
        f46131l = new o("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public o(String str, List list, List list2, List list3, List list4, List list5, List list6, j3.o oVar, List list7, boolean z5, Map map, List list8) {
        super(str, list, z5);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((n) list2.get(i)).f46125a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.f46132d = Collections.unmodifiableList(arrayList);
        this.f46133e = Collections.unmodifiableList(list2);
        Collections.unmodifiableList(list3);
        this.f46134f = Collections.unmodifiableList(list4);
        this.f46135g = Collections.unmodifiableList(list5);
        Collections.unmodifiableList(list6);
        this.f46136h = oVar;
        this.i = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f46137j = Collections.unmodifiableMap(map);
        this.f46138k = Collections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((m) list.get(i)).f46122a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(int i, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < list2.size()) {
                    k0 k0Var = (k0) list2.get(i11);
                    if (k0Var.f26267c == i && k0Var.f26268d == i10) {
                        arrayList.add(obj);
                        break;
                    }
                    i11++;
                }
            }
        }
        return arrayList;
    }

    @Override // d4.a
    public final Object a(List list) {
        ArrayList arrayListC = c(0, this.f46133e, list);
        List list2 = Collections.EMPTY_LIST;
        return new o(this.f46139a, this.f46140b, arrayListC, list2, c(1, this.f46134f, list), c(2, this.f46135g, list), list2, this.f46136h, this.i, this.f46141c, this.f46137j, this.f46138k);
    }
}
