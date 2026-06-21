package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0201h5 implements Ao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23961a;

    public C0201h5(@NotNull List<? extends Pair<String, ? extends Ao>> list) {
        this.f23961a = list;
    }

    @Override // io.appmetrica.analytics.impl.Ao
    @Nullable
    public final String a() {
        Iterator it = this.f23961a.iterator();
        while (it.hasNext()) {
            String strA = ((Ao) ((Pair) it.next()).f27470c).a();
            if (strA != null && strA.length() > 0) {
                return strA;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Ao
    public final void a(@NotNull String str) {
        Iterator it = this.f23961a.iterator();
        while (it.hasNext()) {
            ((Ao) ((Pair) it.next()).f27470c).a(str);
        }
    }
}
