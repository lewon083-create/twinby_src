package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Vm implements Cdo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f23177a;

    public Vm(@NotNull String str, @NotNull List<String> list, int i, @NotNull Kn kn, @NotNull ro roVar, @NotNull K2 k22) {
        List listO = CollectionsKt.O(CollectionsKt.R(CollectionsKt.V(list)), i);
        ArrayList arrayList = new ArrayList(kotlin.collections.t.j(listO, 10));
        int i10 = 0;
        for (Object obj : listO) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.s.i();
                throw null;
            }
            arrayList.add(new Xm(str + '_' + i10, (String) obj, kn, roVar, k22));
            i10 = i11;
        }
        this.f23177a = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Cdo
    public final void a(@NotNull C0091co c0091co) {
        Iterator it = this.f23177a.iterator();
        while (it.hasNext()) {
            ((Xm) it.next()).a(c0091co);
        }
    }

    @Override // io.appmetrica.analytics.impl.Cdo
    public final void a(@NotNull PublicLogger publicLogger) {
        Iterator it = this.f23177a.iterator();
        while (it.hasNext()) {
            ((Xm) it.next()).f22067e = publicLogger;
        }
    }
}
