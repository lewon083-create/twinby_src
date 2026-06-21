package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rs1 implements ms1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f10057c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f10059b;

    static {
        ns1.a(Collections.EMPTY_SET);
    }

    public /* synthetic */ rs1(List list, List list2) {
        this.f10058a = list;
        this.f10059b = list2;
    }

    public static n90 a(int i, int i10) {
        return new n90(i, i10);
    }

    @Override // com.google.android.gms.internal.ads.qs1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set j() {
        List list = this.f10058a;
        int size = list.size();
        List list2 = this.f10059b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((qs1) list2.get(i)).j();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i10 = 0; i10 < size3; i10++) {
            Object objJ = ((qs1) list.get(i10)).j();
            objJ.getClass();
            hashSet.add(objJ);
        }
        int size4 = arrayList.size();
        for (int i11 = 0; i11 < size4; i11++) {
            for (Object obj : (Collection) arrayList.get(i11)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
