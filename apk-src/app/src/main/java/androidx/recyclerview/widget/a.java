package androidx.recyclerview.widget;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f1682d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2.c f1679a = new f2.c(30);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1680b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1681c = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1684f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a7.l f1683e = new a7.l(29, this);

    public a(f fVar) {
        this.f1682d = fVar;
    }

    public final boolean a(int i) {
        ArrayList arrayList = this.f1681c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k6.a aVar = (k6.a) arrayList.get(i10);
            int i11 = aVar.f27019a;
            if (i11 != 8) {
                if (i11 == 1) {
                    int i12 = aVar.f27020b;
                    int i13 = aVar.f27022d + i12;
                    while (i12 < i13) {
                        if (f(i12, i10 + 1) == i) {
                            return true;
                        }
                        i12++;
                    }
                } else {
                    continue;
                }
            } else {
                if (f(aVar.f27022d, i10 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.f1681c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f1682d.a((k6.a) arrayList.get(i));
        }
        k(arrayList);
        this.f1684f = 0;
    }

    public final void c() {
        b();
        ArrayList arrayList = this.f1680b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            k6.a aVar = (k6.a) arrayList.get(i);
            int i10 = aVar.f27019a;
            f fVar = this.f1682d;
            if (i10 == 1) {
                fVar.a(aVar);
                int i11 = aVar.f27020b;
                int i12 = aVar.f27022d;
                RecyclerView recyclerView = fVar.f1702a;
                recyclerView.offsetPositionRecordsForInsert(i11, i12);
                recyclerView.mItemsAddedOrRemoved = true;
            } else if (i10 == 2) {
                fVar.a(aVar);
                int i13 = aVar.f27020b;
                int i14 = aVar.f27022d;
                RecyclerView recyclerView2 = fVar.f1702a;
                recyclerView2.offsetPositionRecordsForRemove(i13, i14, true);
                recyclerView2.mItemsAddedOrRemoved = true;
                recyclerView2.mState.f27066c += i14;
            } else if (i10 == 4) {
                fVar.a(aVar);
                int i15 = aVar.f27020b;
                int i16 = aVar.f27022d;
                Object obj = aVar.f27021c;
                RecyclerView recyclerView3 = fVar.f1702a;
                recyclerView3.viewRangeUpdate(i15, i16, obj);
                recyclerView3.mItemsChanged = true;
            } else if (i10 == 8) {
                fVar.a(aVar);
                int i17 = aVar.f27020b;
                int i18 = aVar.f27022d;
                RecyclerView recyclerView4 = fVar.f1702a;
                recyclerView4.offsetPositionRecordsForMove(i17, i18);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        k(arrayList);
        this.f1684f = 0;
    }

    public final void d(k6.a aVar) {
        int i;
        f2.c cVar;
        int i10 = aVar.f27019a;
        if (i10 == 1 || i10 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iL = l(aVar.f27020b, i10);
        int i11 = aVar.f27020b;
        int i12 = aVar.f27019a;
        if (i12 == 2) {
            i = 0;
        } else {
            if (i12 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + aVar);
            }
            i = 1;
        }
        int i13 = 1;
        int i14 = 1;
        while (true) {
            int i15 = aVar.f27022d;
            cVar = this.f1679a;
            if (i13 >= i15) {
                break;
            }
            int iL2 = l((i * i13) + aVar.f27020b, aVar.f27019a);
            int i16 = aVar.f27019a;
            if (i16 == 2 ? iL2 != iL : !(i16 == 4 && iL2 == iL + 1)) {
                k6.a aVarH = h(aVar.f27021c, i16, iL, i14);
                e(aVarH, i11);
                aVarH.f27021c = null;
                cVar.c(aVarH);
                if (aVar.f27019a == 4) {
                    i11 += i14;
                }
                i14 = 1;
                iL = iL2;
            } else {
                i14++;
            }
            i13++;
        }
        Object obj = aVar.f27021c;
        aVar.f27021c = null;
        cVar.c(aVar);
        if (i14 > 0) {
            k6.a aVarH2 = h(obj, aVar.f27019a, iL, i14);
            e(aVarH2, i11);
            aVarH2.f27021c = null;
            cVar.c(aVarH2);
        }
    }

    public final void e(k6.a aVar, int i) {
        f fVar = this.f1682d;
        fVar.a(aVar);
        RecyclerView recyclerView = fVar.f1702a;
        int i10 = aVar.f27019a;
        if (i10 != 2) {
            if (i10 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            recyclerView.viewRangeUpdate(i, aVar.f27022d, aVar.f27021c);
            recyclerView.mItemsChanged = true;
            return;
        }
        int i11 = aVar.f27022d;
        recyclerView.offsetPositionRecordsForRemove(i, i11, true);
        recyclerView.mItemsAddedOrRemoved = true;
        recyclerView.mState.f27066c += i11;
    }

    public final int f(int i, int i10) {
        ArrayList arrayList = this.f1681c;
        int size = arrayList.size();
        while (i10 < size) {
            k6.a aVar = (k6.a) arrayList.get(i10);
            int i11 = aVar.f27019a;
            if (i11 == 8) {
                int i12 = aVar.f27020b;
                if (i12 == i) {
                    i = aVar.f27022d;
                } else {
                    if (i12 < i) {
                        i--;
                    }
                    if (aVar.f27022d <= i) {
                        i++;
                    }
                }
            } else {
                int i13 = aVar.f27020b;
                if (i13 > i) {
                    continue;
                } else if (i11 == 2) {
                    int i14 = aVar.f27022d;
                    if (i < i13 + i14) {
                        return -1;
                    }
                    i -= i14;
                } else if (i11 == 1) {
                    i += aVar.f27022d;
                }
            }
            i10++;
        }
        return i;
    }

    public final boolean g() {
        return this.f1680b.size() > 0;
    }

    public final k6.a h(Object obj, int i, int i10, int i11) {
        k6.a aVar = (k6.a) this.f1679a.a();
        if (aVar != null) {
            aVar.f27019a = i;
            aVar.f27020b = i10;
            aVar.f27022d = i11;
            aVar.f27021c = obj;
            return aVar;
        }
        k6.a aVar2 = new k6.a();
        aVar2.f27019a = i;
        aVar2.f27020b = i10;
        aVar2.f27022d = i11;
        aVar2.f27021c = obj;
        return aVar2;
    }

    public final void i(k6.a aVar) {
        this.f1681c.add(aVar);
        int i = aVar.f27019a;
        f fVar = this.f1682d;
        if (i == 1) {
            int i10 = aVar.f27020b;
            int i11 = aVar.f27022d;
            RecyclerView recyclerView = fVar.f1702a;
            recyclerView.offsetPositionRecordsForInsert(i10, i11);
            recyclerView.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 2) {
            int i12 = aVar.f27020b;
            int i13 = aVar.f27022d;
            RecyclerView recyclerView2 = fVar.f1702a;
            recyclerView2.offsetPositionRecordsForRemove(i12, i13, false);
            recyclerView2.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 4) {
            int i14 = aVar.f27020b;
            int i15 = aVar.f27022d;
            Object obj = aVar.f27021c;
            RecyclerView recyclerView3 = fVar.f1702a;
            recyclerView3.viewRangeUpdate(i14, i15, obj);
            recyclerView3.mItemsChanged = true;
            return;
        }
        if (i != 8) {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
        int i16 = aVar.f27020b;
        int i17 = aVar.f27022d;
        RecyclerView recyclerView4 = fVar.f1702a;
        recyclerView4.offsetPositionRecordsForMove(i16, i17);
        recyclerView4.mItemsAddedOrRemoved = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.j():void");
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            k6.a aVar = (k6.a) arrayList.get(i);
            aVar.f27021c = null;
            this.f1679a.c(aVar);
        }
        arrayList.clear();
    }

    public final int l(int i, int i10) {
        int i11;
        int i12;
        ArrayList arrayList = this.f1681c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            k6.a aVar = (k6.a) arrayList.get(size);
            int i13 = aVar.f27019a;
            if (i13 == 8) {
                int i14 = aVar.f27020b;
                int i15 = aVar.f27022d;
                if (i14 < i15) {
                    i12 = i14;
                    i11 = i15;
                } else {
                    i11 = i14;
                    i12 = i15;
                }
                if (i < i12 || i > i11) {
                    if (i < i14) {
                        if (i10 == 1) {
                            aVar.f27020b = i14 + 1;
                            aVar.f27022d = i15 + 1;
                        } else if (i10 == 2) {
                            aVar.f27020b = i14 - 1;
                            aVar.f27022d = i15 - 1;
                        }
                    }
                } else if (i12 == i14) {
                    if (i10 == 1) {
                        aVar.f27022d = i15 + 1;
                    } else if (i10 == 2) {
                        aVar.f27022d = i15 - 1;
                    }
                    i++;
                } else {
                    if (i10 == 1) {
                        aVar.f27020b = i14 + 1;
                    } else if (i10 == 2) {
                        aVar.f27020b = i14 - 1;
                    }
                    i--;
                }
            } else {
                int i16 = aVar.f27020b;
                if (i16 <= i) {
                    if (i13 == 1) {
                        i -= aVar.f27022d;
                    } else if (i13 == 2) {
                        i += aVar.f27022d;
                    }
                } else if (i10 == 1) {
                    aVar.f27020b = i16 + 1;
                } else if (i10 == 2) {
                    aVar.f27020b = i16 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            k6.a aVar2 = (k6.a) arrayList.get(size2);
            int i17 = aVar2.f27019a;
            f2.c cVar = this.f1679a;
            if (i17 == 8) {
                int i18 = aVar2.f27022d;
                if (i18 == aVar2.f27020b || i18 < 0) {
                    arrayList.remove(size2);
                    aVar2.f27021c = null;
                    cVar.c(aVar2);
                }
            } else if (aVar2.f27022d <= 0) {
                arrayList.remove(size2);
                aVar2.f27021c = null;
                cVar.c(aVar2);
            }
        }
        return i;
    }
}
