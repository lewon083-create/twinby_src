package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.af, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0030af implements InterfaceC0039ao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23434a;

    public C0030af(@NotNull C0082cf c0082cf) {
        boolean z5;
        List<C0056bf> list = c0082cf.f23613b;
        if ((list instanceof Collection) && list.isEmpty()) {
            z5 = true;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C0056bf) it.next()).f23504c == T7.f23005c) {
                    z5 = false;
                    break;
                }
            }
            z5 = true;
        }
        this.f23434a = z5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0039ao, kotlin.jvm.functions.Function2
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0056bf> invoke(@NotNull List<? extends C0056bf> list, @NotNull C0412pf c0412pf) {
        C0056bf c0056bf = new C0056bf(c0412pf.f24581a, c0412pf.f24582b, c0412pf.f24585e);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C0056bf) it.next()).f23504c == c0412pf.f24585e) {
                    if (c0056bf.f23504c == T7.f23005c && this.f23434a) {
                        return CollectionsKt.M(list, c0056bf);
                    }
                    return null;
                }
            }
        }
        return CollectionsKt.M(list, c0056bf);
    }
}
