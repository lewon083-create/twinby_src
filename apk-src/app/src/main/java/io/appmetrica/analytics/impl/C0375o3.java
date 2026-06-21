package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0375o3 implements InterfaceC0039ao {
    @Override // io.appmetrica.analytics.impl.InterfaceC0039ao, kotlin.jvm.functions.Function2
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0474s3> invoke(@NotNull List<C0474s3> list, @NotNull C0474s3 c0474s3) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                T7 t72 = ((C0474s3) it.next()).f24725b;
                T7 t73 = c0474s3.f24725b;
                if (t72 == t73) {
                    if (t73 != T7.f23005c) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((C0474s3) obj).f24725b != T7.f23005c) {
                            arrayList.add(obj);
                        }
                    }
                    return CollectionsKt.M(arrayList, c0474s3);
                }
            }
        }
        return CollectionsKt.M(list, c0474s3);
    }
}
